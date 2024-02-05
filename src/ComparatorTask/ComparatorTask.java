package src.ComparatorTask;

import java.util.*;

public class ComparatorTask {
    public static void main (String[] args){
        List<String> animals = new ArrayList<>();
        animals.add("bird");
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("tiger");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(455);
        numbers.add(56);
        numbers.add(23);

        Collections.sort(numbers, new Comparator<Integer>(){  //анонимный класс
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) {
                    return -1;
                }else if(o1 < o2){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
        o1 > o2 => 1
        o1 = o2 => 0
        o1 < o2 => -1
         */
        if(o1.length() > o2.length()) {
            return 1;
        }else if(o1.length() < o2.length()){
            return -1;
        }else {
            return 0;
        }
    }
}

