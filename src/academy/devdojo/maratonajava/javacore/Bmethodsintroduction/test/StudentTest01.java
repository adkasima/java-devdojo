package academy.devdojo.maratonajava.javacore.Bmethodsintroduction.test;

import academy.devdojo.maratonajava.javacore.Bmethodsintroduction.domain.Student;
import academy.devdojo.maratonajava.javacore.Bmethodsintroduction.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student01.name = "David";
        student01.age = 16;
        student01.sex = 'M';

        student02.name = "Lucy";
        student02.age = 16;
        student02.sex = 'F';

        printer.print(student01);
        System.out.println("----------------");
        printer.print(student02);


//        System.out.println(student01.name);
//        System.out.println(student01.age);
//        System.out.println(student01.sex);



//        System.out.println(student02.name);
//        System.out.println(student02.age);
//        System.out.println(student02.sex);






    }
}
