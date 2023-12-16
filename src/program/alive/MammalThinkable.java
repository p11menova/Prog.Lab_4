package program.alive;

import program.thoughts.Brain;
import program.thoughts.Thought;

public class MammalThinkable extends Mammal implements ThinkableMammal{
    private final Brain brain;
    public MammalThinkable(Mammal mammal, String name){
        super(name);
        this.brain = new Brain();
    }
    @Override
    public void addThought(Thought thought) {
        this.brain.addThought(thought);
    }

    @Override
    public String think() {
        return this.name + " размышляет о "+ brain.getThought().getThought_text();
    }
}
