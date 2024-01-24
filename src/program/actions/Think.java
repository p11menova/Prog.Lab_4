package program.actions;

import program.Story.TimeOfDay;
import program.alive.Mammal;

import java.sql.Time;

public class Think extends Action{
    public Mammal hero;
    public TimeOfDay time_of_action;
    public Think(Mammal hero, TimeOfDay time_of_action){
        super(time_of_action);
        this.hero = hero;}
    @Override
    public String go() {
        return this.hero.think();
    }
}
