package program.thoughts;

import java.util.ArrayList;
import java.util.List;

public class Brain {
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
