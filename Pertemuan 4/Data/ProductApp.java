package Data;

public class ProductApp {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.SetName("Indomie");
        product1.SetPrice(5000);
        System.out.println(product1.GetName());
        System.out.println(product1.GetPrice());
    }
}