
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadingDemo {
    public static void main(String args[]) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("/Users/mathurankit/Desktop/input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
