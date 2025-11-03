package animalpolymorphism;

public class Animal {
    private String species;
    private String habitat;

    public Animal(){
        this.species = "";
        this.habitat = "";
    }

    public Animal(String species){
        this.species = species;
        this.habitat = "";
    }

    public String sound(){
        return "this animal make a sound";
    }

    public String move(){
        return "this animal moves";
    }

    public String eat(){
        return "this animal eats";
    }
}
