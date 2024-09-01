package academy.devdojo.maratonajava.javacore.Gassociation.excercise.test;

import academy.devdojo.maratonajava.javacore.Gassociation.excercise.domain.Place;
import academy.devdojo.maratonajava.javacore.Gassociation.excercise.domain.Seminary;
import academy.devdojo.maratonajava.javacore.Gassociation.excercise.domain.Student;
import academy.devdojo.maratonajava.javacore.Gassociation.excercise.domain.Teacher;

public class AssociationExerciseTest01 {
    public static void main(String[] args) {
        Place place = new Place("Afterlife");
        Student student = new Student("David Martinez", 17);
        Teacher teacher = new Teacher("Maine", "Edgerunner");
        Student[] studentsToSeminary = {student};
        Seminary seminary = new Seminary("How to be a Edgerunner", studentsToSeminary, place);

        Seminary[] availableSeminaries = {seminary};

        teacher.setSeminaries(availableSeminaries);
        teacher.print();

    }
}
