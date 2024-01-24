package program.actions;

import program.Story.TimeOfDay;
import program.alive.Mammal;

import java.sql.Time;

public abstract class Action {
    TimeOfDay time_of_action;
    protected Action(TimeOfDay time_of_action){
        this.time_of_action = time_of_action;
    }
    protected Action(){
        this.time_of_action = TimeOfDay.AFTERNOON;
    }
    public TimeOfDay getTime_of_action(){
        return this.time_of_action;
    }
    public abstract String go();
}
