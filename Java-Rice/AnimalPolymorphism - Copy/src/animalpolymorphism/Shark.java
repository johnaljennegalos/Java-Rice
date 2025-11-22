package animalpolymorphism;

public class Shark extends  Animal{
    private String name;

    public Shark(){
        super("Shark");
        this.name = "";
    }

    public Shark(String name){
        super("Shark");
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
        return "this shark eats people";
    }

    @Override
    public String sound(){
        return "this shark makes sound in the water";
    }

    @Override
    public String move(){
        return "this shark moves in the water";
    }
}
