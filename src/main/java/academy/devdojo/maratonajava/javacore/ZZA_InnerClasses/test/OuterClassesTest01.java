package academy.devdojo.maratonajava.javacore.ZZA_InnerClasses.test;

public class OuterClassesTest01 {
    private String atributo = "Atributo da outer class";

    class Inner {
        public void printAtributoDaOuterClass() {
            System.out.println(atributo);
            // o this sempre irá referenciar o contexto ao qual se encontra (nesse caso a Inner Class)
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    static void main() {
        /**
         * Para criar um objeto da classe interna, é necessário que seja
         * criado um objeto da classe exterma, por causa de sua forte ligacão.
         */
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        Inner inner = outerClassesTest01.new Inner();
        inner.printAtributoDaOuterClass();
    }
}
