package gameproject;

public class Assasin extends GameCharacter{
    public Assasin(){
        super("Assasin", "", 150, 150);
    }

    public Assasin(String name){
        super("Assasin", name, 150, 150);
    }

    @Override
    public void attack(){
        System.out.println("Throw dagger!");
    }

    @Override
    public void defend(){
        System.out.println("Raise wood!");
    }

    @Override
    public void specialSkill(){
        System.out.println("Clone Attack!");
    }
}
