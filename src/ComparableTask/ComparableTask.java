package src.ComparableTask;

import java.util.*;

public class ComparableTask {
    public static void main (String[] args){
        List<Person> personList = new ArrayList<>();
        Set <Person> peopleSet = new TreeSet<>();

        addElements(peopleSet);
        addElements(personList);

        Collections.sort(personList);

        System.out.println(personList);
        System.out.println(peopleSet);
    }
    private static void addElements(Collection collection){
        collection.add(new Person(4, "Vika"));
        collection.add(new Person(3, "Tom"));
        collection.add(new Person(2, "Max"));
        collection.add(new Person(1, "Maria"));
    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;

        if(id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(this.id > o.getId()){
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        }else {
            return 0;
        }
    }
}