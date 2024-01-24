package program.actions;

import program.Story.TimeOfDay;
import program.inanimate.MovingManager;

public class MoveOnRoute extends Action{
    public TimeOfDay time_of_action;
    public MovingManager movingManager;
    public MoveOnRoute(MovingManager movingManager, TimeOfDay time_of_action){
        super(time_of_action);
        this.movingManager = movingManager;
    }
    @Override
    public String go() {
        this.movingManager.go();
        return this.movingManager.getPreviousLocation() + ". " + this.movingManager.getCurrentLocation() + ". ";
    }
}
