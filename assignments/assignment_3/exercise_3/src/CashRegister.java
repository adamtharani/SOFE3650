import java.util.ArrayList;

// Model!!
public class CashRegister {
    private Product currentProduct;
    private Scanner productScanner = new Scanner();
    private Keyboard inputKeyboard = new Keyboard();
    private Display monitor = new Display();
    private TicketPrinter receipt = new TicketPrinter();
    private ProductDB productDatabase = new ProductDB();

    ArrayList<Observer> ol = new ArrayList<Observer>();

    public Product getCurrentProductInfo(Product product) {
        return product;
    }

    public void setCurrentProductUPC(int UPCCode) {
        if (productScanner.scannedUPCCode(UPCCode) == 0) {
            monitor.displayText("You have scanned an invalid item, please manually enter the UPCCOde");
            currentProduct = productDatabase.getProductInfo(inputKeyboard.setUPCCode());
        }
        else {
            currentProduct = productDatabase.getProductInfo(UPCCode);
        }

    }

    public void update() {
        notifyObservers();
    }

    void notifyObservers() {
        for(Observer o:ol)
            o.update(currentProduct);
    }

    void registerObserver(Observer o) {
        ol.add(o);
    }

    void registerObservers() {
        ol.add(monitor);
        ol.add(receipt);
    }


}




