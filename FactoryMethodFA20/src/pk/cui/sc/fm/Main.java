import java.util.HashMap;
import java.util.Map;

enum ProductId { MINE, YOURS }

// Defines the interface of objects the factory method creates.
interface Product {
    void print();
}

// Implements the Product interface.
class ConcreteProductMINE implements Product {
    public void print() {
        System.out.println("this=" + this + " print MINE");
    }
}

// Implements the Product interface.
class ConcreteProductYOURS implements Product {
    public void print() {
        System.out.println("this=" + this + " print YOURS");
    }
}

// Declares the factory method, which returns an object of type Product.
class ProductCreator {
    private Map<ProductId, Product> productMap = new HashMap<>();

    ProductCreator() {
        productMap.put(ProductId.MINE, new ConcreteProductMINE());
        productMap.put(ProductId.YOURS, new ConcreteProductYOURS());
        // Add more products if needed
    }

    Product createProduct(ProductId id) {
        return productMap.get(id);
    }
}

public class Main {
    public static void main(String[] args) {
        ProductCreator productCreator = new ProductCreator(); // This line might be causing the issue
        Product product = productCreator.createProduct(ProductId.MINE);
        product.print();

        product = productCreator.createProduct(ProductId.YOURS);
        product.print();
    }
}
