public class ConcreteFactory implements AbstractProductFactory {
    public Product createProduct(String productName) {
        Product product = new ConcreteProduct();
        return product;
    }
}
