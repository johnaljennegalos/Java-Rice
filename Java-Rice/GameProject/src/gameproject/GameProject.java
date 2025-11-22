
package gameproject;

import java.util.ArrayList;


public class GameProject {

    public static ArrayList<GameCharacter> characters = new ArrayList<>();

    public static GameCharacter createGameCharacter(String type, String name){
        if(type.equals("Marksman")){
            return new Marksman(name);
        } else if(type.equals("Mage")){
            return new Mage(name);
        } else if(type.equals("Fighter")){
            return new Fighter(name);
        } else if(type.equals("Creeps")){
            return new Creeps(name);
        } else if(type.equals("Assasin")){
            return new Assasin(name);
        }

        return new Tank();
    }

    public static void controlCharacter(GameCharacter character){
        character.attack();
        character.defend();
        character.specialSkill();
    }

    public static void main(String[] args) {
        characters.add(createGameCharacter("Tank", "Elder Titan"));
        characters.add(createGameCharacter("Marksman", "Elder Miya"));
        characters.add(createGameCharacter("Mage", "Elder Apparition"));
        characters.add(createGameCharacter("Fighter", "Elder Fighter"));
        characters.add(createGameCharacter("Creeps", "Dwarf Creeps"));
        characters.add(createGameCharacter("Assasin", "Stealth Assasin"));


        for(var character : characters){
            controlCharacter(character);
        }
    }
    
}
