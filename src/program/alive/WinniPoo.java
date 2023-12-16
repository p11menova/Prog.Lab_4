package program.alive;

import program.inanimate.DopAction;
import program.sounds.Song;
import program.sounds.Sound;
import program.sounds.SoundVerb;
import program.sounds.SoundVolume;

import java.util.Objects;

public class WinniPoo extends Mammal implements MakingSoundMammal, ThinkableMammal, SingableMammal {
    private Song song;

    public WinniPoo(String name) {
        super(name);
        this.sound = new Sound("Хорошо живет на свете \n Винни-Пух!", SoundVolume.LOUD, SoundVerb.GRUMBLE);;
    }

    @Override
    public void changeSong(Song song) {
        this.setSong(song);
    }

    @Override
    public String singSong() {
        return this.getSong().getSong();
    }
    @Override
    public String singSong(DopAction dopAction) {
        return this.singSong() + " и " + dopAction.getAction_name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WinniPoo winniPoo = (WinniPoo) o;
        return Objects.equals(getSong(), winniPoo.getSong());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSong());
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public void setSound(Sound sound) {

    }
}
