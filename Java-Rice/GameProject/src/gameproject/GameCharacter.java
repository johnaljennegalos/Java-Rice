package gameproject;

public abstract class GameCharacter {
    private String characterType;
    private String characterName;
    private int healthPoints;
    private int manaPoints;

    public GameCharacter(){
        this.characterType = "";
        this.characterName = "";
        this.healthPoints = 100;
        this.manaPoints = 50;
    }

    public GameCharacter(String characterType, String characterName, int healthPoints, int manaPoints) {
        this.characterType = characterType;
        this.characterName = characterName;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
    }

    public abstract void attack();
    public abstract void defend();
    public abstract void specialSkill();

}
