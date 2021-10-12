public class TestDriver {
    public static void main(String args[]) {
        // Instantiate a cash register
        CashRegister cashRegister = new CashRegister();
        cashRegister.registerObservers();
        // Emulate scanning a product
        cashRegister.setCurrentProductUPC(1001);
        cashRegister.update();

        // Emulate keying in a product
        cashRegister.setCurrentProductUPC(10000000);
        cashRegister.update();

    }
}
