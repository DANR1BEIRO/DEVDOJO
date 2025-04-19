package academy.devdojo.maratonajava.javacore.H_Inheritance.domain;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Street: " + this.address.getStreet());
        System.out.println("Zip code: " + this.address.getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
