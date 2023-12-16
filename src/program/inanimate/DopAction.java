package program.inanimate;
public enum DopAction {
    WALK("прогуливаясь"),
    THINK("размышляя"),
    SING("распевая"),
    SEE("разглядывая"),
    CRY("плача"),
    NOTHING("");

    private final String action_name;

    DopAction(String action_name){
        this.action_name = action_name;
    }



    public String getAction_name(){
        return this.action_name;
    }
}
