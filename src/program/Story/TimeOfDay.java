package program.Story;

import program.alive.WinniPoo;

import java.util.Objects;

public enum TimeOfDay {
    MORNING("УТРО"),
    AFTERNOON("ДЕНЬ"),
    EVENING("ВЕЧЕР"),
    NIGHT("НОЧЬ");

    private final String name;

    TimeOfDay(String name){
        this.name = name;
    }

    public String getTimeOfDay(){
        return this.name;
    }

}
