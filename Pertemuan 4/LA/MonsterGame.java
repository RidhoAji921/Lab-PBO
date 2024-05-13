package LA;

public class MonsterGame {
    private String name;
    private int health;    
    private int damage;

    MonsterGame(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void recieveDamage(int damage){
        health -= damage;
        if(health <= 0){
            health = 0;
            System.out.println("King Ghidorah Terkalahkan!!");
        }else{
            System.out.println("King Ghidorah tersisa " + health + " health");
        }
    }

    public boolean isDefeated(){
        return health <= 0;
    }
}