package gameproject;

public class Creeps extends GameCharacter{
    public Creeps(){
        super("Creeps", "", 50, 0);
    }

    public Creeps(String name){
        super("Creeps", name, 50, 0);
    }

    @Override
    public void attack(){
        System.out.println("Throw Stone!");
    }

    @Override
    public void defend(){
        System.out.println("Raise Shield!");
    }

    @Override
    public void specialSkill(){
        System.out.println("Throw Boulder!");
    }
}
