import java.util.Scanner;

class Balok {

    int panjang, lebar, tinggi;
    
    int Volume(){
        return panjang*lebar*tinggi;
    }
}

public class act {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Balok balok1 = new Balok();
        System.out.print("Masukkan panjang: ");
        balok1.panjang = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        balok1.lebar = scanner.nextInt();
        System.out.print("Masukkan tinggi: ");
        balok1.tinggi = scanner.nextInt();

        System.out.println("Volume balok: " + balok1.Volume() + "cm^3");
        scanner.close();
    }
}
