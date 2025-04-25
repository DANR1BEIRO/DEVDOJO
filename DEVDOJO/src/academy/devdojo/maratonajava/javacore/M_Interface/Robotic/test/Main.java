package academy.devdojo.maratonajava.javacore.M_Interface.Robotic.test;

public class Main {
    public static void main(String[] args) {

        Flying flying = new Flying();
        Swimming swimming = new Swimming();
        Test test = new Test();

        test.testRobot(flying);
        test.testRobot(swimming);
    }
}
