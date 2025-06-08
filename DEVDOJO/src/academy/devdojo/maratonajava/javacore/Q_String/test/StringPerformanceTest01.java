package academy.devdojo.maratonajava.javacore.Q_String.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(100_000);
        long end = System.currentTimeMillis();
        System.out.println("Time normal string: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(10_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time string builder: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(10_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time string buffer: " + (end - start) + "ms");

    }

    private static void concatString(int length) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text += i;
        }
    }

    public static void concatStringBuilder(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int length) {
        StringBuffer sb = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }
}
