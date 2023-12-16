package program.sounds;

public enum SongEnum {
    GRUMBLING("эту Ворчалку", "'Трам-пам-пам-тиририм-пим-пи!'"),
    OPTIMISTIC("эту Песню о тучках", "Я тучка, тучка, тучка, Я вовсе не медведь, А как приятно тучке По небу лететь!"),
    PESSIMISTIC("эту песню Мишки - Пчёлы", "Если б мишки были пчёлами, То они бы нипочем Никогда бы не подумали Так высоко строить дом!");

    private final String song_name;
    private final String song_text;
    SongEnum(String song_name, String song_text){
        this.song_name = song_name;
        this.song_text = song_text;
    }

    public String getSongText(){
        return this.song_text;
    }
    public String getSongName(){
        return this.song_name;
    }
}
