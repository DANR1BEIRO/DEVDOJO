package academy.devdojo.maratonajava.javacore.ZZA_InnerClasses.test;

public class OuterClassesTest02 {

    private String name = "goten";

    void print(String param) {
        class LocalClass {
            public void printLocalClass() {
                System.out.println(name);
                System.out.println(param);
            }
        }
        new LocalClass().printLocalClass();
    }

    static void main() {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print("parametro do metodo da outer");
    }
}

