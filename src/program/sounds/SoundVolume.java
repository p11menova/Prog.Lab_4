package program.sounds;

public enum SoundVolume {
    BARELYAUDIABLE("еле слышно"),
    UNDERBREATH("себе под нос"),
    UNDERTONE("вполголоса"),
    NORMAL("как обычно"),
    LOUDERTONE("на повышенных тонах"),
    LOUD("громко");
    private final String volume;
    SoundVolume(String volume){
        this.volume = volume;
    }
    public String getSoundVolume(){
        return this.volume;
    }
}
