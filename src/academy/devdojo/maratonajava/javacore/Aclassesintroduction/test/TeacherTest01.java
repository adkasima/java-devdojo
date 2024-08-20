package academy.devdojo.maratonajava.javacore.Aclassesintroduction.test;

import academy.devdojo.maratonajava.javacore.Aclassesintroduction.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.name = "Master Kami";
        teacher.age = 140;
        teacher.sex = 'M';

        System.out.println("Name: " + teacher.name + " Age: " + teacher.age + " Sex: " + teacher.sex);
    }

}
