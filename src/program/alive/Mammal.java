package program.alive;

import program.sounds.Sound;
import program.sounds.SoundVerb;
import program.sounds.SoundVolume;
import program.thoughts.Brain;
import program.thoughts.Thought;

public abstract class Mammal implements ThinkableMammal{
    protected String name;
    private final Brain brain;
    protected Sound sound = new Sound("sound", SoundVolume.NORMAL, SoundVerb.TALK);
    public Mammal(String name){
        this.name = name;
        this.brain = new Brain();
    }
    public String get_name(){ return this.name;}

    public void addThought(Thought thought){
        this.brain.addThought(thought);
    }

    public String think(){
        return this.name + " размышляет о " + this.brain.getThought().getThought_text();
    }
    public String makeSound(){
        return this.name + " " + this.sound.getSound();
    }
    public void setSound(Sound sound){
        this.sound = sound;
    }

}
