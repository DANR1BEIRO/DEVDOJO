package academy.devdojo.maratonajava.javacore.Y_Collections.test;

import academy.devdojo.maratonajava.javacore.Y_Collections.domain.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("001", "Samsung");
        SmartPhone s2 = new SmartPhone("002", "Xiaomi");
        SmartPhone s3 = new SmartPhone("003", "Apple");

        List<SmartPhone> smartPhones = new ArrayList<>(6);
        smartPhones.add(s1);
        smartPhones.add(s2);
        smartPhones.add(s3);

        for (SmartPhone smartPhone : smartPhones) {
            System.out.println(smartPhone.toString());
        }

        SmartPhone s4 = new SmartPhone("0022", "Xiaomi");
        System.out.println(smartPhones.contains(s4));
        int indexSmartPhoneS4 = smartPhones.indexOf(s4); // retorna o index se existir, ou -1

        if (indexSmartPhoneS4 != -1) {
            System.out.println(smartPhones.get(indexSmartPhoneS4));
        } else {
            System.out.println("Elemento não encontrado na lista.");
        }
    }
}
