package program.alive;

import program.inanimate.Route;
import program.sounds.Sound;
import program.sounds.SoundVerb;
import program.sounds.SoundVolume;
import program.thoughts.Brain;
import program.thoughts.Thought;

public abstract class Creature implements ThinkableMammal, Moveable{
    protected final String name;
    protected Sound sound = new Sound("звук" , SoundVolume.NORMAL, SoundVerb.TALK);
    protected final Brain brain;
    protected Route route;

    public Creature(String name) {
        this.name = name;
        this.brain = new Brain();
    }

    public void addSound(Sound sound){
        this.sound = sound;
    }

    public String makeSound(){
        return this.name + ": " + this.sound.getSound();
    }

//
    public void go(){
        this.route.go();
    }
    public void addThought(Thought thought) {
        this.brain.addThought(thought);
    }
//    public Thought think(){
//        return this.name + " размышлял о " + brain.getThought().getThought_text();
//    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + sound.hashCode() + brain.hashCode();
    }

//    public void addRoute(Route route){
//        this.route = route;
//    }
//
//    public String getCurrentLocation(){
//        return this.name + " идёт по "  + this.route.getCurrentLocation().getLocation();
//    }
//    public String getPreviousLocation(){
//        return this.name + " дошёл до " + this.route.getPreviousLocation().getLocation();
//    }
//    public String getPreviousLocation(Going going){
//        return this.name + " " + going.getGoing() + " дошёл до " + this.route.getPreviousLocation().getLocation();
//    }
}



