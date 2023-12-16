package program.alive;

import program.thoughts.Thought;

public interface ThinkableMammal {
    void addThought(Thought thought);
    String think();
}
