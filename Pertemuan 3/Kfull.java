class Weapon{
    String name;
    int bulletMax, bulletCount;
    Weapon(String name, int bulletMax){
        this.name = name;
        this.bulletMax = bulletMax;
        this.bulletCount = this.bulletMax;
        System.out.println("Dibuat senjata");
        System.out.println(this.name + " peluru: " + this.bulletCount);
    }

    void Shoot(){
        System.out.println(this.name + ": DORR");
        this.bulletCount--;
        System.out.println("Sisa peluru: " + this.bulletCount);
    }
    
    void reload(){
        this.bulletCount = this.bulletMax;
        System.out.println("Direload senjata");
        System.out.println(this.name + " peluru: " + this.bulletCount);
    }
}

class SubMachineGun extends Weapon{
    String type = "SubMachineGun";
    SubMachineGun(String name, int bulletMax){
        super(name, bulletMax);
    }

    @Override
    void Shoot(){
        System.out.println(this.name + ": DORR DORR DORR");
        bulletCount-=3;
        System.out.println("Sisa peluru: " + bulletCount);
    }
}

public class Kfull {
    public static void main(String[] args) {
        SubMachineGun mp5 = new SubMachineGun("MP5", 30);
        System.out.println();
        mp5.Shoot();
        System.out.println();
        mp5.Shoot();
        System.out.println();
        mp5.Shoot();
        System.out.println();
        mp5.reload();
        System.out.println();

        Weapon glock17 = new Weapon("glock17", 17);
        glock17.Shoot();
        System.out.println();
        glock17.Shoot();
        System.out.println();
        glock17.Shoot();
        System.out.println();
        glock17.Shoot();
        System.out.println();
        glock17.reload();
    }   
}
