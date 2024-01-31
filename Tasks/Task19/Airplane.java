package Tasks.Task19;

public class Airplane {
    private String producer;
    private int year;
    private int airplaneLength;
    private int weight;
    private int valuePetrol;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAirplaneLength() {
        return airplaneLength;
    }

    public void setAirplaneLength(int airplaneLength) {
        this.airplaneLength = airplaneLength;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValuePetrol() {
        return valuePetrol;
    }

    public void setValuePetrol(int valuePetrol) {
        this.valuePetrol = valuePetrol;
    }

    public Airplane(String producer, int year, int weight, int airplaneLength) {
        this.producer = producer;
        this.year = year;
        this.airplaneLength  = airplaneLength;
        this.weight = weight;
        this.valuePetrol = 0;
    }
    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина:" + airplaneLength + ", вес:" + weight +  ", объем топлива в баке:" + valuePetrol);
    }

    public void fillUp(int value){
        valuePetrol += value;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if(airplane1.getAirplaneLength() > airplane2.getAirplaneLength()){
            System.out.println("The first airplane is longer than the second");
        }else if (airplane1.getAirplaneLength() < airplane2.getAirplaneLength()) {
            System.out.println("The second airplane is longer than the first");
        }else {
            System.out.println("The length of both airplanes the same");
        }
    }
}
