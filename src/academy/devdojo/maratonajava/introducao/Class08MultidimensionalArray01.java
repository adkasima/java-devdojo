package academy.devdojo.maratonajava.introducao;

public class Class08MultidimensionalArray01 {
    public static void main(String[] args) {
        int[][] values = new int[3][3];

        values[0][0] = 1;
        values[0][1] = 2;
        values[0][2] = 3;

        values[1][0] = 11;
        values[1][1] = 12;
        values[1][2] = 13;

        values[2][0] = 21;
        values[2][1] = 22;
        values[2][2] = 23;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                System.out.println(values[i][j]);

            }

        }

        System.out.println("-----------------------");

        for(int[] baseArray: values) {
            for(int value: baseArray) {
                System.out.println(value);

            }

        }



    }
}
