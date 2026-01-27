package academy.devdojo.maratonajava.javacore.ZZA_InnerClasses.test;

public class OuterClassTest03 {
    private String name = "Monkey";

    static class NestedClass {
        private String lastName = "D. Luffy";

        void print() {
            System.out.println(new OuterClassTest03().name + " " + lastName);
        }
    }

    static void main() {
        NestedClass nestedClass = new NestedClass();
        nestedClass.print();
    }
}


