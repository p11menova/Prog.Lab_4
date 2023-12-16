package program.thoughts;

public enum Thought {
    WHO_AM_I("что было бы, если бы он , Винни, был не Винни-Пухом, а кем-нибудь совсем-совсем другим"),
    IF_BEARS_WERE_BEES("Если б мишки были пчёлами, \n То они бы нипочём \n Никогда и не подумали \n Так высóко строить дом;"),
    WHAT_IS_THE_BEST_PRESENT("Лучший подарок, по-моему, мёд. \n Каждый осел это сразу поймёт!"),
    NOTHING("ни о чём!");
    private final String thought_text;
    Thought(String thought){
        this.thought_text = thought;
    }
    public String getThought_text(){
        return this.thought_text;
    }
}
