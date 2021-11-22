import javax.swing.*;

public class ProductScanner extends JFrame {

    public int scanProduct() {
        String stringUPC = JOptionPane.showInputDialog("Please enter a UPC code");
        int UPC = Integer.parseInt(stringUPC);
        return UPC;
    }

    public int scannedUPCCode(int UPCCode) {
        if (UPCCode >= 1003 || UPCCode < 1000) {
            return 0;
        }
        else {
            return UPCCode;
        }
    }




}
