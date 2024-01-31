package Tasks;

import java.util.Random;

public class Task12Array {
    public static void main (String[] args){
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int max = 0;
        int min = 10000;

        for (int element: array){
            if(element >max)
                max = element;
        }

        System.out.println("Максимальное число в массиве: " + max);

        for (int element: array){
            if(element < min)
                min = element;
        }

        System.out.println("Минимальное число в массиве: " + min);

        int counter10 = 0;

        for (int element: array){
            if(element % 10 == 0)
                counter10++;
        }
        System.out.println("Кол-во чисел заканчивающихся на 10: " + counter10);

        int sum = 0;
        for (int element: array){
            if(element % 10 == 0)
                sum += element;
        }
        System.out.println("Сумма чисел заканчивающихся на 10: " + sum);
    }
}
