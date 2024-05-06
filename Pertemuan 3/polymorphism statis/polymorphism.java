public class polymorphism {
    static void hitungLuas(double sisi){
        System.out.println("Luas persegi adalah: " + sisi*sisi);
    }    
    
    static void hitungLuas(double sisi1, double sisi2){
        System.out.println("Luas persegi panjang adalah: " + sisi1*sisi2);
    }
    
    static void hitungLuas(double sisi1, double sisi2, String tipe){
        if(tipe == "segitiga"){
            System.out.println("Luas segitiga adalah: " + sisi1*sisi2*0.5);
        }
    }

    public static void main(String[] args) {
        hitungLuas(10);
        hitungLuas(5, 10);
        hitungLuas(3, 2, "segitiga");
    }
}