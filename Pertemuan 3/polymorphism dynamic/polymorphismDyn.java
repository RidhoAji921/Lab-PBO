class Monster {
    String nama;
    
    Monster(String nama){
        this.nama = nama;
    }

    void display(){
        System.out.println("\nNama\t: " + this.nama);
    }

    void attack(Monster enemy){
        System.out.println("Menyerang monster\t: " + enemy.nama);
    }
}

class MonsterAgility extends Monster{
    String type = "Agility";

    MonsterAgility(String nama){
        super(nama);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type\t: " + this.type);
    }
}

class MonsterIntel extends Monster{
    String type = "Inteligance";

    MonsterIntel(String nama){
        super(nama);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type\t: " + this.type);
    }
}

class MonsterStrength extends Monster{
    String type = "Strength";

    MonsterStrength(String nama){
        super(nama);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type\t: " + this.type);
    }
}

public class polymorphismDyn {
    public static void main(String[] args) {
        Monster monster1 = new Monster("Godzilla");
        MonsterAgility monster2 = new MonsterAgility("Tarzan");
        monster1.display();
        monster2.display();

        Monster monster3 = new MonsterIntel("Batra");
        monster3.display();

        MonsterStrength monster4 = new MonsterStrength("Mothra");
        monster4.display();

        monster1.attack(monster2);
    }
}
