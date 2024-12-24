package creationPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class ProductCache {

    static Map<Integer,Product> productMap=new HashMap<Integer,Product>();

   //clone of product ..
    public static Product getProduct(Integer id) {
        Product cachedProduct = productMap.get(id);
        return (Product) cachedProduct.clone();
    }

    public static void loadCache() {
        //Same dfault value
        ProductAN product = new ProductAN();
        product.setId(1);
        productMap.put(product.getId(),product);

    }
}
