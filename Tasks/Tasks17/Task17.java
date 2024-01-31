package Tasks.Tasks17;

public class Task17 {
    public static void main (String[] args){
        Airplane airplane = new Airplane("Boeing", 2010, 40000, 30);

        airplane.setYear(2020);
        airplane.setAirplaneLength(35);

        airplane.fillUp(10000);
        airplane.fillUp(5000);

        airplane.info();
    }
}
