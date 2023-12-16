package program.alive;


import program.inanimate.DopAction;
import program.sounds.Song;

public interface SingableMammal {
    void changeSong(Song song);

    String singSong();

    String singSong(DopAction dop);

}
