public class TicketPrinter extends Observer {

    @Override
    public void update(Product currentProduct) {
        System.out.println(String.format("TICKET PRINTER --- Name: %s, Price: %s, UPCCode: %s", currentProduct.name, currentProduct.price, currentProduct.upc));
    }
}
