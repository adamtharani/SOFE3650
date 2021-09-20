import java.io.*;

public class ConcreteProduct implements Product {
    public double productPrice(String productName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("product_and_price.csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));

        String stringLine;

        while ((stringLine = br.readLine()) != null) {
            if (stringLine.contains(productName)) {
                String[] splitted = stringLine.split(",");
                Double parsedString = Double.parseDouble(splitted[splitted.length - 1]);
                return parsedString;
            }

        }

        //Close the input stream
        fileInputStream.close();
        return 0.00;
    }

}
