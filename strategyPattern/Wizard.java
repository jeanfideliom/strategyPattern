package strategyPattern;
public class Wizard implements charSelect{
    castSpell castSpell = new castSpell();
    createMagic createMagic = new createMagic();

    @Override
    public String attackStrat() {
        String output = new String();
        output += "Wizard " + castSpell.attackStrat();
        return output;
    }

    @Override
    public String defenseStrat() {
        String output = new String();
        output += "Wizard " + createMagic.defenseStrat();
        return output;
    }

    
}