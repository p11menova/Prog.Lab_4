package program.alive;

import program.alive.abilities.MakingSoundMammal;
import program.alive.abilities.SingableMammal;
import program.exceptions.WinniIsNotInspiredException;
import program.sounds.Song;
import program.sounds.Sound;
import program.sounds.SoundVerb;
import program.sounds.SoundVolume;

import java.util.Objects;

public class WinniPoo extends Mammal implements MakingSoundMammal, SingableMammal {
    private Song song;

    public WinniPoo(String name) {
        super(name);
        this.sound = new Sound("Хорошо живет на свете \n Винни-Пух!", SoundVolume.LOUD, SoundVerb.GRUMBLE);;
    }

    public static class Honey {
        public static String getHoney(){
            return " с горшочком мёда в руках";
        }
    }
    @Override
    public String singSong() throws WinniIsNotInspiredException {
        if (!this.isInspired())
            throw new WinniIsNotInspiredException("Винни не будет петь( Он не вдохновлён..");
        else return this.getSong().getSong();
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

    public boolean isInspired(){
        return this.sportinessCharact.is_sportik() && !this.satietyCharact.is_hungry();
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sportinessCharact.get_charact() + ", "+ this.satietyCharact.get_charact() + ", вдохновлён ли: " + this.isInspired();
    }
}
