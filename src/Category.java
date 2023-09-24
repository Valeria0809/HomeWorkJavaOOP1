import java.util.ArrayList;
import java.util.List;

public class Category {
    String name;
    List<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
}


