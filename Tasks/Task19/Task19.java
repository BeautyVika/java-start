package Tasks.Task19;

public class Task19 {
    public static void main (String[] args){
        Airplane airplane1 = new Airplane("Boeing", 2010, 45000, 38);
        Airplane airplane2 = new Airplane("Boeing", 2014, 48000, 42);

        Airplane.compareAirplanes(airplane1, airplane2);

    }
}
