package lk.jiat.ee.ejb.bean;

import jakarta.ejb.Stateless;
import lk.jiat.ee.core.model.Product;
import lk.jiat.ee.ejb.remote.ProductService;

import java.util.List;

@Stateless
public class ProductSessionBean implements ProductService {



    @Override
    public Product getProductById(int id) {
        return new Product(1,"Test Product1","test Description1",1000.00,5);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of(
                new Product(1,"Test Product1","test Description1",1000.00,5),
                new Product(2,"Test Product2","test Description2",2000.00,10),
                new Product(3,"Test Product3","test Description3",3000.00,15)
        );
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }
}
