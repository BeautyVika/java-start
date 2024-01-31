package Tasks;

import java.util.Random;

public class Task14Array {
    public static void main (String[] args){
        int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i=0; i<array.length - 2; i++){
            int sum = 0;
            for (int j =0; j<i + 3; j++){
               sum += array[j];
            }

            if(maxSum < sum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSumIndex);
    }
}
