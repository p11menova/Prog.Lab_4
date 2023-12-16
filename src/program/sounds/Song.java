package program.sounds;

import java.util.Objects;

public class Song extends Sound {
    protected SongEnum song;

    public Song(String sound, SoundVolume sound_volume, SoundVerb sound_verb, SongEnum song) {
        super(sound, sound_volume, sound_verb);
        this.song = song;

    }

    public String getSong() {
        return this.song.getSongText() + " " + this.getSound_verb().getSoundVerb() + " " + this.getSound_volume().getSoundVolume() + " " + this.song.getSongName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song1 = (Song) o;
        return Objects.equals(song.getSongText(), song1.song.getSongText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(song);
    }
}
