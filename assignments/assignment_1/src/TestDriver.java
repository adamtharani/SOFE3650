import java.io.IOException;

public class TestDriver {
    public static void main(String[] args) throws IOException {
        AbstractProductFactory factory = new ConcreteFactory();

        Product chips = factory.createProduct("Chips");
        System.out.println("The chips cost: "+ chips.productPrice("Chips"));

        Product juice = factory.createProduct("Juice");
        System.out.println("The juice cost: " + juice.productPrice("Juice"));

        Product steak = factory.createProduct("Steak");
        System.out.println("The steak cost: " + juice.productPrice("Steak"));

    }
}
