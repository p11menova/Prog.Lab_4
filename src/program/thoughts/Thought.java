package program.thoughts;

public enum Thought {
    WHO_AM_I("что было бы, если бы он , Винни, был не Винни-Пухом, а кем-нибудь совсем-совсем другим"),
    IF_BEARS_WERE_BEES("Если б мишки были пчёлами, \nТо они бы нипочём \nНикогда и не подумали \nТак высóко строить дом;"),
    WHAT_IS_THE_BEST_PRESENT("Лучший подарок, по-моему, мёд. \nКаждый осел это сразу поймёт!"),
    NOTHING("ни о чём!"),
    ABOUT_RABBIT("'Если он что-нибудь в чем-нибудь понимает, то дыра – это нора, а нора – это Кролик, \nа Кролик – это подходящая компания," +
            " а подходящая компания – это такая компания, \nгде его чем-нибудь угостят и с удовольствием послушают его ворчалку. И все такое прочее!'");
    private final String thought_text;
    Thought(String thought){
        this.thought_text = thought;
    }
    public String getThought_text(){
        return this.thought_text;
    }
}
