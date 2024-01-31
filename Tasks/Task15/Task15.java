package Tasks.Task15;

public class Task15 {
    public static void main (String[] args){
        Car car = new Car();
        car.setYear(2014);
        car.setColor("black");
        car.setModel("BMV");
        System.out.println("Our car " + car.getYear() + " model " + car.getModel() + " color " + car.getColor());

        Motorbike motorbike = new Motorbike(2000, "Yamaha", "red");
        System.out.println("Our motorbike " + motorbike.getYear() +  " color " + motorbike.getColor() + " model " + motorbike.getModel());
    }
}
