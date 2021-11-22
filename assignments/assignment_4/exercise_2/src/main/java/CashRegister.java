public class CashRegister {
    private Product currentProduct;
    private ProductScanner productScanner = new ProductScanner();
    private Display monitor = new Display();
    private ProductDB productDatabase = new ProductDB();

    public Product getCurrentProductInfo(Product product) {
        return product;
    }

    public ProductScanner productScanner() {
        return this.productScanner;
    }

    public void setCurrentProductUPC(int UPCCode) {
        if (productScanner.scannedUPCCode(UPCCode) == 0) {
//            monitor.displayText("You have scanned an invalid item, please manually enter the UPCCOde");
            currentProduct = productDatabase.getProductInfo(productScanner.scanProduct());
        }
        else {
            currentProduct = productDatabase.getProductInfo(UPCCode);
        }

    }

    public void update() {
        monitor.displayProduct(currentProduct);
    }
}
