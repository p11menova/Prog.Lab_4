package program.actions;

import program.Story.TimeOfDay;
import program.alive.Mammal;

public class Eat extends Action {
    public Mammal hero;
    public Eat(Mammal hero) {
        super();
        this.hero = hero;
    }
    public Eat(Mammal hero, TimeOfDay time_of_action){
        super(time_of_action);
        this.hero = hero;
    }

    public String go(){
        this.hero.satietyCharact.plus_charact();
        String result ="";
        switch (time_of_action){
            case MORNING -> result = this.hero.get_name() + " плотно позавтракал. Теперь он " + this.hero.satietyCharact.get_charact() + ".";
            case AFTERNOON -> result = this.hero.get_name() + " подкрепился мёдом. Теперь он " + this.hero.satietyCharact.get_charact() + ".";
            case EVENING -> result = this.hero.get_name() + " поужинал в гостях у Кролика. Теперь он " + this.hero.satietyCharact.get_charact() + ".";
            case NIGHT -> result = this.hero.get_name() + " покушал. Теперь он " + this.hero.satietyCharact.get_charact() + ".";
        }
        return result;
}
}