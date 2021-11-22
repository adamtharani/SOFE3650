import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    public void displayProduct(Product product) {
        String productInfo = String.format("Name: %s, Price: %s, UPCCode: %s",
                product.name, product.price, product.upc);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Display display = new Display();
                display.setVisible(true);
                display.add(new JLabel(productInfo));
                display.repaint();
            }
        });
    }

    public Display() {
        super();
        init();
    }

    private void init() {
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
    }

    public void displayText(String s) {
        Frame frame = new Frame();
        frame.setSize(640, 480);

        JOptionPane.showMessageDialog(frame, s);
    }
}
