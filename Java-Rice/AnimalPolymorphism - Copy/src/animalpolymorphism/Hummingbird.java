package animalpolymorphism;

public class Hummingbird extends Animal{
    private String name;

    public Hummingbird(){
        super("Hummingbird");
        this.name = "";
    }

    public Hummingbird(String name){
        super("Hummingbird");
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String eat(){
        return "this hummingbird eats seeds";
    }

    @Override
    public String move(){
        return "this hummingbird moves its wings";
    }

    @Override
    public String sound(){
        return "this hummingbird chirps";
    }
}
