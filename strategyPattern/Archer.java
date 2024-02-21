package strategyPattern;
public class Archer implements charSelect{
    shootArrow shootArrow = new shootArrow();
    shield shield = new shield();

    @Override
    public String attackStrat(){
        String output = new String();
        output += "Archer" + shootArrow.attackStrat();
        return output;
    }

    @Override
    public String defenseStrat() {
        String output = new String();
        output += "Archer" + shield.defenseStrat();
        return output;
    }
}
