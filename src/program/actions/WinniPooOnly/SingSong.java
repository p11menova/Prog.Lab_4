package program.actions.WinniPooOnly;

import program.Story.TimeOfDay;
import program.actions.Action;
import program.alive.Mammal;
import program.alive.WinniPoo;
import program.exceptions.WinniIsNotInspiredException;

import java.sql.Time;

public class SingSong extends Action {
    public WinniPoo hero;
    public TimeOfDay time_of_action= TimeOfDay.AFTERNOON;
    public SingSong(WinniPoo hero){
        this.hero = hero;
    }
    public SingSong(WinniPoo hero, TimeOfDay time_of_action){
        super(time_of_action);
        this.hero = hero;
    }
    public String go(){
            try {
                return this.hero.singSong();
            } catch (WinniIsNotInspiredException e) {
                System.out.println();
                return e.getMessage() + " (Вдохновлён = Неголодный + На спортике. Сейчас он " +
                        this.hero.satietyCharact.get_charact() + " и " + this.hero.sportinessCharact.get_charact()+")";
            }
    }

    public String toString(){
        return this.go();
    }
}

