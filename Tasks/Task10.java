package Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);

        int counter = 0;

        while (counter<5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if(b == 0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a/b);
            counter++;
        }
    }
}
