import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesktopApp extends JFrame{

    private CashRegister cashRegister = new CashRegister();
    public DesktopApp() {
        super();
        init();
    }

    private void init() {
        JButton scanItem = new JButton("Scan Item");
        scanItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cashRegister.setCurrentProductUPC(cashRegister.productScanner().scanProduct());
                cashRegister.update();
            }
        });

        setLayout(new GridLayout(2,1));
        add(new JLabel("Welcome to the Cash Register", SwingConstants.CENTER));
        add(scanItem);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopApp().setVisible(true);
            }
        });
    }
}
