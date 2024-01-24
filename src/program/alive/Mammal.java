package program.alive;

import program.alive.abilities.ThinkableMammal;
import program.alive.characteristics.SatietyCharacteristic;
import program.alive.characteristics.SportinessCharacteristic;
import program.sounds.Sound;
import program.sounds.SoundVerb;
import program.sounds.SoundVolume;
import program.thoughts.Thought;

import java.util.ArrayList;
import java.util.List;

public abstract class Mammal implements ThinkableMammal {
    protected String name;

    private final Brain brain;
    protected Sound sound = new Sound("sound", SoundVolume.NORMAL, SoundVerb.TALK);
    public SatietyCharacteristic satietyCharact;
    public SportinessCharacteristic sportinessCharact;
    private static class Brain{
            protected List<Thought> thoughts;
            protected int thought_index = 0;
            public Brain(){
                this.thoughts = new ArrayList<>();
                this.addThought(Thought.NOTHING);
            }

            public void addThought(Thought thought){
                this.thoughts.add(thought);
            }
            public Thought getThought(){
                this.thought_index += 1;
                if (this.thought_index >= this.thoughts.size())
                {this.thought_index = 0;}
                return this.thoughts.get(this.thought_index);
            }
    }
    public Mammal(String name){
        this.name = name;
        this.brain = new Brain();
        this.satietyCharact = new SatietyCharacteristic();
        this.sportinessCharact = new SportinessCharacteristic();
    }
    public String get_name(){ return this.name;}
    public void addThought(Thought thought){
        this.brain.addThought(thought);
    }
    public String think(){
        return this.name + " размышляет о " + this.brain.getThought().getThought_text() + ". ";
    }
    public String makeSound(){
        return this.name + " " + this.sound.getSound();
    }
    public void setSound(Sound sound){
        this.sound = sound;
    }

}
