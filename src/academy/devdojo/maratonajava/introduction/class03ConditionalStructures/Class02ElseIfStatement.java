package academy.devdojo.maratonajava.introduction.class03ConditionalStructures;

public class Class02ElseIfStatement {
    public static void main(String[] args) {

        int age = 15;
        String ageGroup;

        if(age <15) {
            ageGroup = "child";
        } else if(age >=15 && age <18){
            ageGroup = "teen";
        } else {
            ageGroup = "adult";
        }

        System.out.println(ageGroup);
    }
}
