package src.TestStudent;


public class TestStudent {
    public static void main (String[] args){
        Student student = new Student();

        StringBuilder name = new StringBuilder("Bob");
        student.setName(name);
        student.setGrade(3);
        student.setCourse(2);
        student.showInfo();

    }
}
