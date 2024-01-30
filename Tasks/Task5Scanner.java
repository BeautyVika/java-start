package Tasks;

import java.util.Scanner;

public class Task5Scanner {
    public static void main (String[] args){
        Scanner floors = new Scanner(System.in);
        int numbersOfFloors = floors.nextInt();
        if(numbersOfFloors >=1 && numbersOfFloors <= 4){
            System.out.println("Малоэтажный дом");
        }else if(numbersOfFloors >=5 && numbersOfFloors <= 8){
            System.out.println("Среднеэтажный дом");
        }else if(numbersOfFloors >=9){
            System.out.println("Многоэтажный дом");
        }else {
            System.out.println("Некорректный ввод");
        }
    }
}
