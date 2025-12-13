package academy.devdojo.maratonajava.javacore.ZZA_InnerClasses.test;

public class HelloWorldAnonymousClass {

    interface HelloWorld {
        void greet();
        void greetSomeone(String someonesName);
    }

    public void sayHello() {
        class EnglishGreeting implements HelloWorld {
            String name = "world";

            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someonesName) {
                name = someonesName;
                System.out.println("Hello, " + name);
            }
        }
        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le mond";

            @Override
            public void greet() {
                greetSomeone("tout le mond");
            }

            @Override
            public void greetSomeone(String someonesName) {
                name = someonesName;
                System.out.println("salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someonesName) {
                name = someonesName;
                System.out.println("hola, " + name);

            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Daniel");
        spanishGreeting.greet();
    }

    static void main() {
        HelloWorldAnonymousClass helloTest = new HelloWorldAnonymousClass();
        helloTest.sayHello();
    }
}
