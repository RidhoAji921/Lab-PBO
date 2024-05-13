package Act;

public class Monster {
    private String name;
    private int health;
    private int damage;
    
    Monster(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getDamage(){
        return this.damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void receiveDamage(int damage){
        health -= damage;
        if(health < 0){
            health = 0;
            System.out.println(this.name + " TERKALAHKAN!!");
        }
        else{
            System.out.println(this.name + "Menerima HIT!");
            System.out.println("HP tersisa: " + this.health);
        }
    }

    public boolean isDefeated(){
        return this.health < 0;
    }
}