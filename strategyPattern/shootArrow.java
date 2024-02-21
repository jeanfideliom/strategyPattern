package strategyPattern;
public class shootArrow implements attackStrategy{
    @Override
    public String attackStrat(){
        String output = new String();
        output += " shoots an arrow!";
        return output;
    }
}
