package program.alive;

import program.sounds.Sound;
import program.sounds.SoundVerb;
import program.sounds.SoundVolume;
public class MammalSoundable extends Mammal implements MakingSoundMammal{
    protected Sound sound;
    public MammalSoundable(String name){
        super(name);
        this.sound = new Sound("звук", SoundVolume.NORMAL, SoundVerb.TALK);
    }
    @Override
    public void addSound(Sound sound) {
        this.sound = sound;
    }
    @Override
    public String makeSound() {
        return this.sound.getSound();
    }


}
