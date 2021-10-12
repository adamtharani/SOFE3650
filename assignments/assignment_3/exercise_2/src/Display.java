public class Display implements View {
    public void displayProduct(Product product) {
        System.out.println(String.format("MONITOR --- Name: %s, Price: %s, UPCCode: %s", product.name, product.price, product.upc));

    }
    public void displayText(String text) {
        System.out.println(text);
    }
}
