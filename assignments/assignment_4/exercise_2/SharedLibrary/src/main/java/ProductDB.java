public class ProductDB {
    Product banana = new Product("banana", 0.99, 1000);
    Product cereal = new Product("cereal", 5.99, 1001);
    Product chips = new Product("chips", 2.99, 1002);

    public Product getProductInfo(int UPCCode) {
        if (UPCCode == 1000) {
            return banana;
        }
        else if (UPCCode == 1001) {
            return cereal;

        }
        else if (UPCCode == 1002) {
            return chips;
        }
        else {
            return null;
        }
    }
}
