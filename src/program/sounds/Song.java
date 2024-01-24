package program.sounds;

import program.inanimate.DopAction;

import java.util.Objects;

public class Song extends Sound {
    protected SongEnum song;
    protected DopAction dopAction = DopAction.NOTHING;

    public Song(String sound, SoundVolume sound_volume, SoundVerb sound_verb, SongEnum song) {
        super(sound, sound_volume, sound_verb);
        this.song = song;
    }

    public Song(String sound, SoundVolume sound_volume, SoundVerb sound_verb, SongEnum song, DopAction dop_action) {
        super(sound, sound_volume, sound_verb);
        this.song = song;
        this.dopAction = dop_action;
    }

    public String getSong() {
        String result;
        result = this.song.getSongText() + " " + this.getSound_verb().getSoundVerb() + " " + this.getSound_volume().getSoundVolume() + " " + this.song.getSongName();
        if (!this.dopAction.equals(DopAction.NOTHING)){
            result += " и " + this.dopAction.getAction_name();
        }
        return result;
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
