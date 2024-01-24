package program.alive.abilities;


import program.exceptions.WinniIsNotInspiredException;
import program.inanimate.DopAction;
import program.sounds.Song;

public interface SingableMammal {
    void setSong(Song song);

    String singSong() throws WinniIsNotInspiredException;

}
