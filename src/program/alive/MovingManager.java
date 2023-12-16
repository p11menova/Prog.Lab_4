package program.alive;

import program.inanimate.Going;
import program.inanimate.Route;

public class MovingManager implements Moveable{
    public Route route;
    public Mammal person;

    public MovingManager(Route route, Mammal person){
        this.route = route;
        this.person = person;
    }

    public void setRoute(Route route){
        this.route = route;

    }
    public String getCurrentLocation(){
        return this.person.get_name() + " идёт по " + this.route.getCurrentLocation().getLocation();
    }

    public String getPreviousLocation(){
        return this.person.get_name() + " дошёл до "+ this.route.getPreviousLocation().getLocation();
    }
    public String getPreviousLocation(Going going){
        return this.person.get_name() + " "+ going.getGoing() +" "+ " дошёл до "+ this.route.getPreviousLocation().getLocation();
    }


    public void go(){
        this.route.next();
    }
}
