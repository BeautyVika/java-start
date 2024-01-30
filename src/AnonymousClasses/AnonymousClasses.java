package src.AnonymousClasses;

interface AbleToEat {
    public void eat();
}
public class AnonymousClasses {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat(){
            public void eat (){
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat();
    }
}
