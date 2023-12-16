package program.alive;

import program.inanimate.Route;
import program.sounds.Sound;

public abstract class Mammal implements Moveable{
    protected String name;
    protected Route route = new Route();
    public Mammal(String name){
        this.name = name;
    }
    public void addRoute(Route route){
        this.route = route;
    }

    public void go(){
        this.route.go();
    }

    public String getPreviousLocation(){
        return this.name + " дошёл до  " + this.getPreviousLocation();
    }

    public String getCurrentLocation(){
        return this.name + " идёт по " + this.getCurrentLocation();

    }
}
