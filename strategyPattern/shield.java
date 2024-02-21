package strategyPattern;
public class shield implements defenseStrategy{
    @Override
    public String defenseStrat() {
        String output = new String();
        output += " using a shield to defend!";
        return output;
    }
}
