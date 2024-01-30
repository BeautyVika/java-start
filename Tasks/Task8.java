package Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);

        while(true){
            String city = scanner.nextLine();

            if(city.equals("Stop"))
                break;

            switch (city){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Таурин":
                    System.out.println("Италия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
