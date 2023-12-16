package program.alive;

import program.inanimate.Going;
import program.inanimate.Route;

public interface Moveable {
    void setRoute(Route route);
    String getCurrentLocation();
    String getPreviousLocation();
    String getPreviousLocation(Going going);
    void go();

}
