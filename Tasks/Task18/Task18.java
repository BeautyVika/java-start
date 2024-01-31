package Tasks.Task18;

public class Task18 {
    public static void main (String[] args){
        Teacher teacher = new Teacher("history", "Иванов Иван Петрович");
        Student student = new Student("Петров Александр Игоревич");
        teacher.getMark(student);
    }
}
