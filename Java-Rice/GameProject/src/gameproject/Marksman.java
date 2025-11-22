package gameproject;

public class Marksman extends GameCharacter{
    public  Marksman(){
        super("Marksman", "", 120, 200);
    }

    public Marksman(String name){
        super("Marksman", name, 120, 200);
    }

    @Override
    public void attack(){
        System.out.println("Shoot Arrow!");
    }

    @Override
    public void defend(){
        System.out.println("Elevation!");
    }

    @Override
    public void specialSkill(){
        System.out.println("Searing Arrow!");
    }
}
