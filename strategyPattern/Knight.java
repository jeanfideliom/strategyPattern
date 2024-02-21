package strategyPattern;
public class Knight implements charSelect{

    swingSword swingSword = new swingSword();
    shield shield = new shield();
    dodge dodge = new dodge();
    createMagic createMagic = new createMagic();

    @Override
    public String attackStrat() {
        String output = new String();
        output += "Knight " + swingSword.attackStrat();
        return output;
    }

    @Override
    public String defenseStrat() {
        String output = new String();
        output += "Knight " + shield.defenseStrat() + "\n";
        output += "Knight " + dodge.defenseStrat() + "\n";
        output += "Knight " + createMagic.defenseStrat() + "\n";
        return output;
    }
    
}
