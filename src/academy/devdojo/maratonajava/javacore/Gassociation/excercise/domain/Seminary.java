package academy.devdojo.maratonajava.javacore.Gassociation.excercise.domain;

public class Seminary {
    private String title;
    private Student[] students;
    private Place place;


    public Seminary(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Seminary(String title, Student[] students, Place place) {
        this.title = title;
        this.students = students;
        this.place = place;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
