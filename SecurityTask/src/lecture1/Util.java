package lecture1;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Util {
    public static String getInput(String path) {
        StringBuilder builder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(path), "UTF-8");
            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine());
            }
            return builder.toString().trim();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return builder.toString();
    }
}
