package program.alive;

import program.inanimate.Route;

public interface Moveable {
    void addRoute(Route route);
    String getCurrentLocation();
    String getPreviousLocation();
    void go();

}
