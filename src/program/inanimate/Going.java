package program.inanimate;

public enum Going {
    UNNOTICED("незаметно"),
    NOTICED("заметно"),
    QUIET("тихонечко");
    private final String going;
    Going(String going){
        this.going = going;
    }

    public String getGoing(){
        return this.going;
    }

}
