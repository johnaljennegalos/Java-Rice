
package animalpolymorphism;

import java.util.ArrayList;

public class AnimalPolymorphism {

    private ArrayList<Animal> animals;

    public AnimalPolymorphism(){
        animals = new ArrayList<>();
    }

    public void processSound(Animal animal){
        System.out.println(animal.sound());
    }

    public void processMovement(Animal animal){
        System.out.println(animal.move());
    }

    public void processEatingBehaviour(Animal animal){
        System.out.println(animal.eat());
    }

    public static void main(String[] args) {
        AnimalPolymorphism newAnimal = new AnimalPolymorphism();

        Lion Simba = new  Lion("Simba");

        newAnimal.processMovement(Simba);
        newAnimal.processEatingBehaviour(Simba);
        newAnimal.processSound(Simba);

        System.out.println("Animal name: " + Simba.getName());

    }
    
}
