package src.ArrayListTask;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTask {
    public static void main (String[] args){
        List<Integer> arrayList = new ArrayList();

        for (int i =0; i<100; i++){
            arrayList.add(i);
        }

        for(Integer element: arrayList){
            System.out.println(element);
        }
    }
}
