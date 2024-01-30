package src;

public class Animal {
    private int id;

    public Animal(){
    }
    public Animal (int id){
        this.id= id;
    }

    public String toString() {
        return String.valueOf(id);
    }
}
