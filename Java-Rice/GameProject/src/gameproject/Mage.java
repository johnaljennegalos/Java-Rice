package gameproject;

public class Mage extends GameCharacter{
    public Mage(){
        super("Mage", "", 100, 200);
    }

    public Mage(String name){
        super("Mage", name, 100, 200);
    }

    @Override
    public void attack(){
        System.out.println("Mana shot!");
    }

    @Override
    public void defend(){
        System.out.println("Mana Shield!");
    }

    @Override
    public void specialSkill(){
        System.out.println("Ice Blast!");
    }
}
