package program.Story;

import program.actions.*;
import program.actions.WinniPooOnly.DoSport;
import program.actions.WinniPooOnly.SingSong;
import program.inanimate.MovingManager;
import program.alive.WinniPoo;

import program.inanimate.DopAction;

import program.inanimate.Location;
import program.inanimate.Route;
import program.sounds.*;
import program.thoughts.*;



public class Story{
    public Chapter chapter = new Chapter(2,"Глава вторая, в которой Винни-Пух пошел в гости, а попал в Безвыходное Положение");
    public Chapter badChapter = new Chapter(3, "Глава третья, в которой я демонстрирую вывод исключений. ");
    public void prepare() {

        WinniPoo winni = new WinniPoo("Винни-Пух");

        final Route route = new Route();

        route.addLocation(new Location("лесная тропинка"));
        route.addLocation(new Location("песчаный откос"));
        route.addLocation(new Location("дом Кролика"));

        Song song = new Song(SongEnum.GRUMBLING.getSongText(), SoundVolume.UNDERBREATH, SoundVerb.GRUMBLE, SongEnum.GRUMBLING, DopAction.THINK);
        winni.setSong(song);

        MovingManager movingManager = new MovingManager(route, winni);

        winni.addThought(Thought.WHO_AM_I);
        winni.addThought(Thought.ABOUT_RABBIT);

        chapter.addAction(new Eat(winni, TimeOfDay.MORNING));
        chapter.addAction(new DoSport(winni, TimeOfDay.MORNING));


        chapter.addAction(new MoveOnRoute(movingManager, TimeOfDay.AFTERNOON){
            @Override
            public String go(){
                movingManager.go();
                return this.movingManager.getPreviousLocation() + ". " + this.movingManager.getCurrentLocation() + WinniPoo.Honey.getHoney()+". ";
            }
        });
        chapter.addAction(new Eat(winni, TimeOfDay.AFTERNOON));
        chapter.addAction(new MoveOnRoute(movingManager, TimeOfDay.AFTERNOON));
        chapter.addAction(new SingSong(winni, TimeOfDay.AFTERNOON));
        chapter.addAction(new Think(winni, TimeOfDay.AFTERNOON));

        chapter.addAction(new MoveOnRoute(movingManager, TimeOfDay.EVENING));
        chapter.addAction(new Think(winni, TimeOfDay.EVENING));

        Sound sound =  new Sound("'- Эй! Кто-нибудь дома?'", SoundVolume.LOUD, SoundVerb.CRY);
        chapter.addAction(new Action(TimeOfDay.EVENING) {
            @Override
            public String go(){
                winni.setSound(sound);
                return winni.makeSound();
            }
        });
        chapter.addAction(new Eat(winni, TimeOfDay.EVENING));
        winni.addThought(Thought.IF_BEARS_WERE_BEES);
        chapter.addAction(new Think(winni, TimeOfDay.NIGHT));

    }
    public void prepare_bad_chapter(){

        WinniPoo winni2 = new WinniPoo("Винни-Пух");
        Route route2 = new Route();
        route2.addLocation(new Location("лесная тропинка"));
        badChapter.addAction(new DoSport(winni2, TimeOfDay.MORNING));
        badChapter.addAction(new Eat(winni2, TimeOfDay.MORNING));

        badChapter.addAction(new Action(TimeOfDay.MORNING) {
            @Override
            public String go() {
                return winni2.toString();
            }
        });
        badChapter.addAction(new DoSport(winni2, TimeOfDay.AFTERNOON));
        badChapter.addAction(new DoSport(winni2, TimeOfDay.AFTERNOON));

        Song song = new Song(SongEnum.OPTIMISTIC.getSongText(), SoundVolume.LOUDERTONE, SoundVerb.WHISPER, SongEnum.OPTIMISTIC);
        winni2.setSong(song);
        badChapter.addAction(new SingSong(winni2, TimeOfDay.AFTERNOON));
        badChapter.addAction(new Eat(winni2, TimeOfDay.AFTERNOON));
        badChapter.addAction(new SingSong(winni2, TimeOfDay.AFTERNOON));

        winni2.sportinessCharact.minus_charact();
        badChapter.addAction(new Action(TimeOfDay.EVENING){
            @Override
            public String go() {
                winni2.sportinessCharact.minus_charact();
                return winni2.toString();
            }
        });
        badChapter.addAction(new MoveOnRoute(new MovingManager(route2, winni2), TimeOfDay.EVENING));
    }
    public void go() {
        System.out.println(chapter.toString());
        chapter.go();
        System.out.println();
        System.out.println(badChapter.toString());
        badChapter.go();
        }
}
