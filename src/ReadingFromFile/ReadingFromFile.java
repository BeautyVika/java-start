package src.ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main (String[] args) {
        String separator = File.separator;
        String path = separator+ "Users"+ separator+"user" + separator + "Desktop" + separator + "test.txt"; //"C:\\Users\\user\\Desktop";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[3];
            int counter = 0;

            for(String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);
            }
//            while(scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//      }
            System.out.println(Arrays.toString(numbers));
            scanner.close();
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}
