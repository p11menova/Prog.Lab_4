package program.Story;

import program.actions.Action;
import program.actions.MoveOnRoute;
import program.exceptions.WinniWontWalkException;

import java.util.ArrayList;

public class Chapter implements Plot{
    public BookTimeManager bookTimeManager = new BookTimeManager(this);
    public ArrayList<Action> actions;
    public String name;
    public int number;
    public Chapter(int number, String name){
        this.number = number;
        this.name = name;
        this.actions = new ArrayList<>();
    }

    @Override
    public void addAction(Action action) {
        this.actions.add(action);
    }
    @Override
    public void go(){
        this.bookTimeManager.go();
    }

    public void makeActionsOnTime(TimeOfDay timeOfDay) {
        for (Action act: this.actions){
            if (act.getTime_of_action() == timeOfDay){
                if (act instanceof MoveOnRoute && timeOfDay == TimeOfDay.EVENING){
                    if (! (((MoveOnRoute) act).movingManager.person.sportinessCharact.is_sportik())){
                        throw new WinniWontWalkException("Винни-Пух не может гулять весь день, потому что неспортивный(");
                    }
                }
                System.out.println(act.go());
            }
        }
    }
    @Override
    public String toString() {
        return this.name;
    }
}
