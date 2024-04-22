class Induk {
    String jenis;

    void suara(String nama){
        if (jenis == "kucing") {
            System.out.println("Meow");
        }
        else if (jenis == "anjing") {
            System.out.println("Guk");
        }
        else if (jenis == "sapi") {
            System.out.println("Moo");
        }
        else{
            System.out.println("nggak ada bjir :v");
        }
        System.out.println("Nama saya adalah " + nama);
    }
}

class Anak extends Induk {
    void suara(String nama){
        System.out.println("Nama saya adalah " + nama);
        System.out.println("Saya adalah anak");
        if (jenis == "kucing") {
            System.out.println("Meow");
        }
        else if (jenis == "anjing") {
            System.out.println("Guk");
        }
        else if (jenis == "sapi") {
            System.out.println("Moo");
        }
        else{
            System.out.println("nggak ada bjir :v");
        }
    }
}

public class pert2 {
    public static void main(String[] args){
        Anak kucing = new Anak();
        kucing.jenis = "kucing";
        kucing.suara("Ucok");
    }
}