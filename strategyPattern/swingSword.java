package strategyPattern;
public class swingSword implements attackStrategy{
    @Override
    public String attackStrat() {
        String output = new String();
        output += " attacks with a sword!";
        return output;
    }
}

