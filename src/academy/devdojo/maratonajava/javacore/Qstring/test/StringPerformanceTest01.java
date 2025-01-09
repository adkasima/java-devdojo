package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(50_000);
        long end = System.currentTimeMillis();
        System.out.println("Time spent to String " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time spent to StringBuilder " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time spent to StringBuffer " + (end - start) + "ms");

    }
    //String
    private static void concatString(int size) {
        String text = "";

        for (int i = 0; i < size; i++) {
            text += i;
//            System.out.println(text);

        }
    }
    //StringBuilder
    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            sb.append(i);

        }
    }

    //StringBuffer
    private static void concatStringBuffer(int size) {
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            sb.append(i);

        }
    }
}
