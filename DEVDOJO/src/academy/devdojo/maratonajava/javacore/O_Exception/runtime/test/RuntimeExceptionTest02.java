package academy.devdojo.maratonajava.javacore.O_Exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        int divisionResult = division(10, 0);
        System.out.println("Division result: " + divisionResult);
    }

    /**
     * @param a
     * @param b não pode ser zero
     * @return a / b
     * @throws IllegalArgumentException caso b seja zero
     */
    public static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return a / b;
    }
}
