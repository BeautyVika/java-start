package src.TestAnimal;

public class TestAnimal {
    public static void main (String[] args){
        Dog dog = new Dog("Sharik");
        System.out.println(dog.pow);

        Cat cat = new Cat("Barsik");
        cat.sleep();
    }
}
