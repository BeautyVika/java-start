package src.ObjectComparison;

public class ObjectComparison {
    public static void main (String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        Animal animal3 = animal1;

//        System.out.println(animal1.equals(animal2));
//        System.out.println(animal1 == animal3);

        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1 == string2);
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal)obj;
        return this.id == otherAnimal.id;
    }
}
