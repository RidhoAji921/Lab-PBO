package Data;

public class Product{
    private String name;
    private int price;

    public String GetName() {
        return this.name;
    }

    public int GetPrice() {
        return this.price;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetPrice(int price) {
        if(price > 2000){
            this.price = price;
        }
        else{
            this.price = 2000;
            System.out.println("Rendah banget njir, gua ubah jadi 2000 dah :v");
        }
    }
}