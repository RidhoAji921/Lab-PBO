class Biodata{
    String name;
    int age;

    Biodata(String name, int age){
        this.name = name;
        this.age = age;
    }

    void DisplayBiodata(){
        System.out.println("Nama\t: " + name);
        System.out.println("Umur\t: " + age);
    }
}

class NilauUjian extends Biodata{
    int nilai;
    NilauUjian(String name, int age, int nilai) {
        super(name, age);
        this.nilai = nilai;
    }

    void DisplayNilai(){
        System.out.println("Nilai\t: " + nilai);
    }
}

public class LA {
    public static void main(String[] args) {
        Biodata biodata = new Biodata("Ridho Aji Gumilang", 19);
        biodata.DisplayBiodata();

        System.out.println();

        NilauUjian nilaiujian = new NilauUjian("Ridho Aji Gumilang", 19, 100);
        nilaiujian.DisplayBiodata();
        nilaiujian.DisplayNilai();
    }
}
