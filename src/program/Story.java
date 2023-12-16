package program;

import program.alive.MovingManager;
import program.alive.WinniPoo;

import program.inanimate.DopAction;
import program.inanimate.Going;
import program.inanimate.Location;
import program.inanimate.Route;
import program.sounds.Song;
import program.sounds.SongEnum;
import program.sounds.SoundVerb;
import program.sounds.SoundVolume;
import program.thoughts.*;

public class Story {
    private final WinniPoo winni = new WinniPoo("Винни-Пух");
    private MovingManager move_manager;
    private Route route = new Route();
    public void prepare() {

        route.addLocation(new Location("лесная тропинка"));
        route.addLocation(new Location("песчаный откос"));
        route.addLocation(new Location("большая дыра"));


        move_manager = new MovingManager(route, winni);
        Song song = new Song(SongEnum.GRUMBLING.getSongText(), SoundVolume.UNDERBREATH, SoundVerb.GRUMBLE, SongEnum.GRUMBLING);

        winni.changeSong(song);
        winni.addThought(Thought.WHO_AM_I);
    }
    public void go(){
        move_manager.go();
        System.out.println(move_manager.getCurrentLocation());
        System.out.println(winni.singSong(DopAction.THINK));
        System.out.println(winni.think()+". ");
        move_manager.go();
        move_manager.go();
        System.out.printf(move_manager.getPreviousLocation(Going.UNNOTICED)+ ". ");
        move_manager.go();
        System.out.printf(move_manager.getPreviousLocation()+".");
        System.out.println();

        }

}
