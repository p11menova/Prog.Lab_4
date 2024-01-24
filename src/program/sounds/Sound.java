package program.sounds;

public class Sound {
    private final String sound_text;
    private final SoundVolume sound_volume;
    private final SoundVerb sound_verb;

    public Sound(String sound, SoundVolume sound_volume, SoundVerb sound_verb) {
        this.sound_text = sound;
        this.sound_volume = sound_volume;
        this.sound_verb = sound_verb;

    }

    public String getSound_text() {
        return this.sound_text;
    }

    public SoundVolume getSound_volume() {
        return this.sound_volume;
    }

    public SoundVerb getSound_verb() {
        return this.sound_verb;
    }

    public String getSound() {
        return this.getSound_volume().getSoundVolume() +" " + this.getSound_verb().getSoundVerb() + ": " +this.getSound_text();
    }
}
