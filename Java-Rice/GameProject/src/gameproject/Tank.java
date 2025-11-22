package gameproject;

public class Tank extends GameCharacter{
    public Tank() {
        super("Tank", "", 200, 120);
    }

    public Tank(String name){
        super("Tank", name, 200, 120);
    }

    @Override
    public void attack(){
        System.out.println("Swing axe!");
    }

    @Override
    public void defend(){
        System.out.println("Raise Shield!");
    }

    @Override
    public void specialSkill(){
        System.out.println("Culling Blade!");
    }
}
