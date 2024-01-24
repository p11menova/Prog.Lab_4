package program.Story;

import program.actions.Action;
import program.alive.Mammal;

import java.util.ArrayList;

public interface Plot {
    void addAction(Action action);
    void go();
}
