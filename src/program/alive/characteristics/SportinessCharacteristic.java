package program.alive.characteristics;

public class SportinessCharacteristic {
    enum Sportiness {
        SPORTIK(true),
        UNSPORTIK(false);
        private final boolean is_sportik;
        Sportiness(boolean is_sportik){
            this.is_sportik = is_sportik;
        }
        public String get_sportiness(){
            if (this.is_sportik) return "спортивный";
            return "неспортивный(";
        }
    }
    private Sportiness sportiness = Sportiness.UNSPORTIK;
    public void plus_charact()  {
        this.sportiness = Sportiness.SPORTIK;
    }
    public void minus_charact() {
        this.sportiness = Sportiness.UNSPORTIK;
    }
    public boolean is_sportik(){return this.sportiness.is_sportik;}
    public String get_charact(){ return this.sportiness.get_sportiness();}
}
