package program.sounds;

public enum SoundVerb {
    GRUMBLE("ворча"),
    WHISPER("шепча"),
    SING("напевая"),
    PRAY("моля"),
    TALK("говоря");

    private final String how_to_sound;
    SoundVerb(String how_to_sound){
        this.how_to_sound = how_to_sound;
    }
    public String getSoundVerb(){
        return this.how_to_sound;
    }

}
