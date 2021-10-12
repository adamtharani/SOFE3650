public class TicketPrinter implements View {
    public void displayProduct(Product product) {
        System.out.println(String.format("TICKET PRINTER --- Name: %s, Price: %s, UPCCode: %s", product.name, product.price, product.upc));

    }
}
