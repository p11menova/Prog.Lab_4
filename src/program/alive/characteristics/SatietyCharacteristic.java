package program.alive.characteristics;

import program.exceptions.WinniIsHungryException;

public class SatietyCharacteristic {
    enum Satiety{
        HUNGRY("голодный"),
        NORMAL("обычный"),
        WELL_FED("сытый");
        private final String name;
        Satiety(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
    }
    private Satiety satiety = Satiety.HUNGRY;

    public void plus_charact(){
        int i = satiety.ordinal();
        i ++;
        if (i == 1) this.satiety = Satiety.NORMAL;
        else if (i >= 2) this.satiety = Satiety.WELL_FED;
    }
    public void minus_charact() throws WinniIsHungryException{
        int i = satiety.ordinal();
        i --;
        if ( i == 1 ) this.satiety = Satiety.NORMAL;
        else if ( i == 0 ) this.satiety = Satiety.HUNGRY;
        else throw new WinniIsHungryException("Винни-Пух слишком голодный! Нельзя совершить действие.");
    }
    public String get_charact(){
        return this.satiety.getName();
    }
    public boolean is_hungry(){
        return this.satiety.ordinal() == 0;
    }
}
