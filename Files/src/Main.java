import java.io.*;
/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;*/

public class Main {
    public static void main(String[] args) throws Exception {

        String filePath ="C:\\Groceries.txt";
        String fileToWrite = "C:\\Users\\user\\ABC.txt";

        String[] array = new String[4];
        String id;
        String itemName;
        String quantity;
        double price;

        String separator = ",";
        double total = 0;

        FileReader fileReader = new FileReader(filePath);
        FileWriter fileWriter = new FileWriter(fileToWrite);

        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String Line;

        while ((Line = reader.readLine()) !=null) {

            array = Line.split(separator);

            price = Double.parseDouble(array[3]);

            total += price;

            System.out.println(Line);
            writer.write(Line);
            writer.newLine();
        }

        System.out.println("\n" + "Total price for groceries" + Math.round(total));
        writer.write("\n" + "Total price of groceries" + Math.round(total));

        reader.close();

        writer.flush();
        writer.close();


    }
}