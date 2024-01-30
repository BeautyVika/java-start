package src.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main (String[] args){
        try{
            readFile();
        }catch (FileNotFoundException e){
            System.out.println("Обработка исключений в метоже main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("dgsc");
        Scanner scanner = new Scanner(file);
    }
}
