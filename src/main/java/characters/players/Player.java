package characters.players;

import interfaces.IWeapon;

public abstract class Player implements IWeapon {

    private String name;
    private int healthPool;

    public Player(String name, int healthPool){
        this.name = name;
        this.healthPool = healthPool;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPool(){
        return this.healthPool;
    }

    public void takeDamage(int damageTaken){
        this.healthPool -= damageTaken;
    }
}
