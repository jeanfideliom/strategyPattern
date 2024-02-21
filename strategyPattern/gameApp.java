package strategyPattern;
public class gameApp{
    public static void main(String[] args){
        character knight = new character(new Knight());
        character archer = new character(new Archer());
        character wiz = new character(new Wizard());

        System.out.println(knight.attackStrat());
        System.out.println(knight.defenseStrat());
        System.out.println();
        System.out.println(archer.attackStrat());
        System.out.println(archer.defenseStrat());
        System.out.println();
        System.out.println(wiz.attackStrat());
        System.out.println(wiz.defenseStrat());
    }
}