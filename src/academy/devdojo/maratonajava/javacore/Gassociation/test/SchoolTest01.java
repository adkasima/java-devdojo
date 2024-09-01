package academy.devdojo.maratonajava.javacore.Gassociation.test;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.School;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1= new Teacher("Jonas");
        Teacher teacher2 = new Teacher("Doglas");

        Teacher[] teachers = {teacher1, teacher2};
        School school = new School("Brothers school", teachers);

        school.print();

    }
}
