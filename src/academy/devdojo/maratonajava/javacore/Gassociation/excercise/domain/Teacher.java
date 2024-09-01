package academy.devdojo.maratonajava.javacore.Gassociation.excercise.domain;

public class Teacher {
    private String name;
    private String ability;
    private Seminary[] seminaries;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String ability) {
        this.name = name;
        this.ability = ability;
    }

    public Teacher(String name, String ability, Seminary[] seminaries) {
        this.name = name;
        this.ability = ability;
        this.seminaries = seminaries;
    }

    public void print() {
        System.out.println("--------");
        System.out.println("Teacher: " + this.name);
        if (this.seminaries == null) return;
        System.out.println("### Registered seminaries ###");
        for (Seminary seminary : seminaries) {
            System.out.println(seminary.getTitle());
            System.out.println(seminary.getPlace().getAddress());
            if (seminary.getStudents() ==  null || seminary.getStudents().length == 0) continue;
            System.out.println("*** Students ***");
            for (Student student : seminary.getStudents()) {
                System.out.println("Student: " +student.getName() + " Age: " +student.getAge());

            }

        }

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Seminary[] getSeminaries() {
        return seminaries;
    }

    public void setSeminaries(Seminary[] seminaries) {
        this.seminaries = seminaries;
    }
}
