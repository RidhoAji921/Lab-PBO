class Monster{
    String name;
    Monster(String name){
        this.name = name;
    }
    void Attack(){
        System.out.println("Monster " + this.name + "menyerang biasa aja");
    }
}

class Witch extends Monster{
    Witch(String name){
        super(name);
    }
    @Override
    void Attack(){
        System.out.println("Penyihir " + this.name + " melemparkan mantra");
    }
}

class Goblin extends Monster{
    Goblin(String name){
        super(name);
    }
    @Override
    void Attack(){
        System.out.println("Goblin " + this.name + " menyerang dengan tombak");
    }
}

public class act {
    public static void main(String[] args) {
        Witch elizabeth = new Witch("Elizabeth");
        elizabeth.Attack();

        Goblin golbeg = new Goblin("Golbeg");
        golbeg.Attack();
    }
}