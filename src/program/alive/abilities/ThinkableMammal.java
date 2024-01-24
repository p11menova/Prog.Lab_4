package program.alive.abilities;

import program.thoughts.Thought;

public interface ThinkableMammal {
    void addThought(Thought thought);
    String think();
}
