package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "John"; //String constant pool
        String name2 = "John";
        name.concat(" Doe");
        System.out.println(name); //out: John
        name = name.concat(" Doe");
        System.out.println(name); //out: John Doe
        System.out.println(name == name2); //out: false
        String name3 = new String("John"); //1 reference var, 2 object string type, 3 string on string pool
        System.out.println(name2 == name3); //out: false
        System.out.println(name2 == name3.intern()); //out: true
    }
}
