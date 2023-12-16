package program.inanimate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Route {
    private final List<Location> route = new ArrayList<Location>();

    private int currentLocationIndex = 0;

    public Route() {
        this.addLocation(new Location("начало пути"));
    }

    public void addLocation(Location point) {
        this.route.add(point);
    }


    public Location getPreviousLocation() {
        if (this.currentLocationIndex == 0) {
            return this.route.get(0);
        }
        ;
        return this.route.get(this.currentLocationIndex - 1);
    }
    public Location getCurrentLocation() {
        if (this.currentLocationIndex >= this.route.size())
            {return this.route.get(this.route.size()-1);}
        return this.route.get(this.currentLocationIndex);
    }
    public void next(){
        this.currentLocationIndex += 1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Location location : this.route) {
            result.append(location.getLocation()).append(" ");
        }
        return "Route:" + result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route1 = (Route) o;
        return currentLocationIndex == route1.currentLocationIndex && Objects.equals(route, route1.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(route, currentLocationIndex);
    }
}
