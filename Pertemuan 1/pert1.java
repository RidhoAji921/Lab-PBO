class Hewan {

    String nama, jenis;
    int umur;

    void JenisHewan(){
        System.out.println(jenis + " Lagi makan");
    }

    void NamaHewan(){
        System.out.println(nama + " Datang ke sini");
    }

    void UsiaHewan(){
        System.out.println("Umurnya " + umur + " tahun");
    }
}

public class pert1 {
    public static void main(String[] args) {
        Hewan kucing = new Hewan();
        
        kucing.nama = "Cemong";
        kucing.jenis = "Kucing";
        kucing.umur = 2;
        kucing.JenisHewan();
        kucing.NamaHewan();
        kucing.UsiaHewan();
    }
}