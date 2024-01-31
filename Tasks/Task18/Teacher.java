package Tasks.Task18;

import java.util.Random;

public class Teacher {
    private String subject;
    private String fio;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Teacher(String subject, String fio) {
        this.subject = subject;
        this.fio = fio;
    }

    public void getMark (Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        String mark = "";
        switch (randomValue){
            case 2: mark = "неудовлетворительно";
                    break;
            case 3: mark = "удовлетворительно";
                    break;
            case 4: mark = "хорошо";
                    break;
            case 5: mark = "отлично";
                    break;
        }
        System.out.println("Преподаватель " + this.fio + " оценил студента "
                + student.getFio() + " по предмету " + this.subject + " на оценку " + mark);
    }

}
