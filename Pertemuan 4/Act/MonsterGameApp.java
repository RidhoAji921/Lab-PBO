package Act;
import java.util.Scanner;

public class MonsterGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama player: ");
        String playerName = scanner.nextLine();
        int playerHealth = 1000;

        Monster enemy = new Monster("Gwyn, The Lord of Cinder", 1000, 50);
        boolean enemyDefeated = enemy.isDefeated();
        while(!enemyDefeated){
            System.out.println();
            System.out.println(playerName + ": " + playerHealth);
            System.out.println(enemy.getName() + ": " + enemy.getHealth());
            System.out.println("Attack!");
            System.out.println("1. Basic Attack (50 dmg; 80%)");
            System.out.println("2. Heavy Attack (80 dmg; 50%)");
            System.out.println("3. Super Attack (140 dmg; 20%)");
            System.out.print("Choose your attack: ");
            int attack = scanner.nextInt();

            switch (attack) {
                case 1:
                    enemy.receiveDamage(50);
                    break;
                case 2:
                    enemy.receiveDamage(80);
                    break;
                case 3:
                    enemy.receiveDamage(140);
                    break;
                default:
                    System.out.println("KESALAHAN!");
                    System.out.println(enemy.getName() + "Mendapatkan HP 50!");
                    enemy.setHealth(enemy.getHealth() + 50);
                    if(Math.random() < 0.4){
                        System.out.println("Musuh menyerang!");
                    }
                    break;
            }
            enemyDefeated = enemy.getHealth() <= 0;
        }
        System.out.println("VICTORY ACHIEVED");
    }
}
