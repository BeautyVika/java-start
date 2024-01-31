package Tasks.Tasks17;

public class Airplane {
    private String producer;
    private int year;
    private int airplaneLength;
    private int weight;
    private int valuePetrol;

    public void setYear(int year) {
        this.year = year;
    }

    public void setAirplaneLength(int airplaneLength) {
        this.airplaneLength = airplaneLength;
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
}
