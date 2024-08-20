package academy.devdojo.maratonajava.javacore.Bmethodsintroduction.test;

import academy.devdojo.maratonajava.javacore.Bmethodsintroduction.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Satoro Gojo");
        person.setAge(23);
        person.print(person);

    }
}
