package academy.devdojo.maratonajava.javacore.Aclassesintroduction.test;

import academy.devdojo.maratonajava.javacore.Aclassesintroduction.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Jonas";
        student.age = 22;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student);
    }

}
