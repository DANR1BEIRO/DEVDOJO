package academy.devdojo.maratonajava.understanding_main_method_parameter;

public class ArgPrinter {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Number of arguments: " + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
        } else {
            System.out.println("There isn't any arguments yet");
        }
    }
}
