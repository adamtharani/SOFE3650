public class Display extends Observer {

    public void displayText(String text) {
        System.out.println(text);
    }


    @Override
    public void update(Product currentProduct) {
        System.out.println(String.format("MONITOR --- Name: %s, Price: %s, UPCCode: %s", currentProduct.name, currentProduct.price, currentProduct.upc));
    }

}
