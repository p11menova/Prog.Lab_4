package program;

import program.Story.Chapter;
import program.Story.TimeOfDay;
import program.actions.WinniPooOnly.DoSport;
import program.actions.Eat;
import program.alive.WinniPoo;

public class Test {
    public String test() throws Exception {
        WinniPoo hero = new WinniPoo("Винни-Пух");
        Chapter chapter = new Chapter(2,"Глава вторая,\n" +
                "в которой Винни-Пух пошел в гости, а попал в Безвыходное Положение");
        chapter.addAction(new Eat(hero, TimeOfDay.MORNING));
        chapter.addAction(new DoSport(hero, TimeOfDay.MORNING));
        chapter.go();

        return null;
    }

}

