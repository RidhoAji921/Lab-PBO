class Hewan{
    String nama;
    int umur;
    Hewan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    void Bersuara(){
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan{
    String warna;
    Kucing(String warna, String nama, int umur){
        super(nama, umur);
        this.warna = warna;
    }

    void Bersuara(){
        super.Bersuara();
        System.out.println("Kucing Mengeong");
    }
}

class Anjing extends Hewan{
    String ras;
    Anjing(String ras, String nama, int umur){
        super(nama, umur);
        this.ras = ras;
    }

    void Bersuara(){
        System.out.println("Anjing menggonggong");
    }
}

public class Kfull {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Oren", "Mamat", 56);
        Anjing anjing = new Anjing("Pitbull", "Cupcake", 56);
        
        System.out.println(kucing.nama);
        System.out.println(kucing.warna);
        System.out.println(kucing.umur);
        
        System.out.println();
        
        System.out.println(anjing.nama);
        System.out.println(anjing.ras);
        System.out.println(anjing.umur);
        
        System.out.println();

        kucing.Bersuara();
        anjing.Bersuara();
    }
}
