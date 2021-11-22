public class TestDriver {
    public static void main(String args[]) {
        // Instantiate a cash register
        CashRegister cashRegister = new CashRegister();
        // Emulate scanning a product
        cashRegister.setCurrentProductUPC(cashRegister.productScanner().scanProduct());
        cashRegister.update();

    }
}
