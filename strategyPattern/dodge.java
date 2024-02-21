package strategyPattern;
public class dodge implements defenseStrategy {
    @Override
    public String defenseStrat() {
        String output = new String();
        output += " Dodgin to avoid attack!";
        return output;
    }
}
