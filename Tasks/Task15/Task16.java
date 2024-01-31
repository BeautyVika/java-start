package Tasks.Task15;

public class Task16 {
    public static void main (String[] args){
        Car car = new Car();
        car.setYear(2014);
        car.setColor("black");
        car.setModel("BMV");

        Motorbike motorbike = new Motorbike(2000, "Yamaha", "red");
        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2024));
        System.out.println(motorbike.yearDifference(2024));
    }
}
