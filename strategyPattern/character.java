package strategyPattern;
public class character{
    private charSelect charSelect;

    public character(charSelect charSelect){
        this.charSelect = charSelect;
    }
    public String attackStrat(){
        return charSelect.attackStrat();
    }
    public String defenseStrat(){
        return charSelect.defenseStrat();
    }
}