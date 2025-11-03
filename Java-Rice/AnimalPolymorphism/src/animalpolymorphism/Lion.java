package animalpolymorphism;

public class Lion extends Animal{
    private String name;

    public Lion(){
        super("Lion");
        this.name = "";
    }

    public Lion(String name){
        super("Lion");
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String sound(){
        return "this lion roars";
    }

    @Override
    public String move(){
        return "this lion moves in Africa";
    }

    @Override
    public String eat(){
        return "this lion eats";
    }
}
