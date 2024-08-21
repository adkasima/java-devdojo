package academy.devdojo.maratonajava.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        //Default values for an array

        //byte, short, long, int, double and float 0
        // char '/u0000' ' '
        //boolean false
        //String null

        String[] nomes = new String[3];
        nomes[0] = "Lucy";
        nomes[1] = "David";
        nomes[2] = "Rebecca";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }

    }
}
