package strategyPattern;
public class createMagic implements defenseStrategy{
    @Override
    public String defenseStrat() {
        String output = new String();
        output += " Creating a magic barrier for defense!";
        return output;
    }
}
