package gameproject;

public class Fighter extends GameCharacter{
    public Fighter(){
        super("Fighter", "", 150, 200);
    }

    public Fighter(String name){
        super("Fighter", name, 150, 200);
    }

    @Override
    public void attack(){
        System.out.println("Dagger Throw!");
    }

    @Override
    public void defend(){
        System.out.println("Sprint!");
    }

    @Override
    public void specialSkill(){
        System.out.println("Double Sword!");
    }
}
