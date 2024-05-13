package LA;

import java.util.Scanner;

public class MonsterGameApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Player Setup
        System.out.print("Masukkan nama player: ");
        String playerName = scanner.nextLine();
        System.out.println("\nSelamat datang, " + playerName + " di Game Monster!");

        // Monster Setup (using descriptive variable)
        MonsterGame monster = new MonsterGame("King Ghidorah", 150, 30);
        System.out.println("Kini kamu akan berhadapan dengan " + monster.getName() + "!");

        // Game Loop
        while (!monster.isDefeated()) {
            // Attack Selection
            System.out.println("\nPilih jenis serangan:");
            System.out.println("1. Atomic Breath (Damage: 20)");
            System.out.println("2. Tail Whip (Damage: 30)");
            System.out.println("3. Nuclear Pulse (Damage: 40)");
            System.out.print("Masukkan pilihan: ");

            int attackChoice = scanner.nextInt();
            int damage = 0;
            String attackName;

            switch (attackChoice) {
                case 1:
                    damage = 20;
                    attackName = "Atomic Breath";
                    break;
                case 2:
                    damage = 30;
                    attackName = "Tail Whip";
                    break;
                case 3:
                    damage = 40;
                    attackName = "Nuclear Pulse";
                    break;
                default:
                    System.out.println("Pilihan serangan tidak valid. Menggunakan serangan default (Damage: 20)");
                    damage = 20;
                    attackName = "Atomic Breath";
            }

            // Perform Attack
            System.out.println("\n===============");
            System.out.println(playerName + " memilih " + attackName + " dengan damage: " + damage);
            monster.receiveDamage(damage);

            // Display Monster Status
            System.out.println("=====================");
        }

        // Victory Message
        System.out.println("\nSelamat, " + playerName + "! " + monster.getName() + " telah terkalahkan!");

        scanner.close();
    }
}