package strategyPattern;
public class castSpell implements attackStrategy{
    @Override
    public String attackStrat() {
        String output = new String();
        output += " casts a spell!";
        return output;
    }
}