package Tasks;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11Array {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++)
            array[i] = random.nextInt(10);

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);

        int counter8 = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > 8){
                counter8++;
            }
        }
        System.out.println("Количество чисел больше 8: " + counter8);

        int counter1 = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 1){
                counter1++;
            }
        }
        System.out.println("Количество чисел = 1: " + counter1);

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum+=array[i];
        }

        System.out.println("Сумма чисел в массиве: " + sum);

    }
}
