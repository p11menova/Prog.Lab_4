package program.actions.WinniPooOnly;

import program.Story.TimeOfDay;
import program.actions.Action;
import program.alive.Mammal;
import program.alive.WinniPoo;
import program.exceptions.WinniIsHungryException;

public class DoSport extends Action {
    public WinniPoo hero;
    public DoSport(WinniPoo hero){
        super();
        this.hero = hero;
    }
    public DoSport(WinniPoo hero, TimeOfDay time_of_action){
        super(time_of_action);
        this.hero = hero;
    }
    public String go(){
        try{ this.hero.satietyCharact.minus_charact();}
        catch (WinniIsHungryException e) {
            return e.getMessage();
        }
        this.hero.sportinessCharact.plus_charact();

        return this.hero.get_name() + " старательно занимался гимнастикой перед зеркалом. " +
                "Он поднимался на носки, вытягивался изо всех сил. Теперь он " + this.hero.sportinessCharact.get_charact() + ".";

    }

}
