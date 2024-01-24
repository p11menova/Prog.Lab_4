package program;


import program.Story.Story;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args){
        Story story = new Story();

        story.prepare();
        story.prepare_bad_chapter();

        story.go();
    }
}