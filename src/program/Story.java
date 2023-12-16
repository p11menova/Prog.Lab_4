package program;

import program.alive.Moveable;
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

    private Route route = new Route();
    public void prepare() {

        route.addLocation(new Location("лесная тропинка"));
        route.addLocation(new Location("песчаный откос"));
        route.addLocation(new Location("большая дыра"));

        Song song = new Song(SongEnum.GRUMBLING.getSongText(), SoundVolume.UNDERBREATH, SoundVerb.GRUMBLE, SongEnum.GRUMBLING);

        winni.changeSong(song);
        winni.addRoute(route);
        winni.addThought(Thought.WHO_AM_I);
    }
    public void go(){
        winni.go();
        // System.out.println(winni.getCurrentLocation());
        System.out.println(winni.singSong(DopAction.THINK));
        System.out.println(winni.think()+". ");
        winni.go();
        winni.go();
//        System.out.printf(winni.getPreviousLocation(Going.UNNOTICED)+ ". ");
        winni.go();
        System.out.printf(winni.getPreviousLocation()+".");
        System.out.println();

        }

}
