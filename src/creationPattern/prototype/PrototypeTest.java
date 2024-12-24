package creationPattern.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        ProductCache.loadCache();

        Product clonedProduct = (Product) ProductCache.getProduct(1);
        System.out.println(clonedProduct);
    }
}
