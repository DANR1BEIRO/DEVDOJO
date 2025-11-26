package academy.devdojo.maratonajava.javacore.Z_Generics.test;

import academy.devdojo.maratonajava.javacore.Z_Generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest01 {
    static void main() {
        List<Car> cars = criarListaDeObjetos(new Car("fusca"));
        System.out.println(cars);
        cars.add(new Car("mazda"));
        System.out.println(cars);

        List<Book> books = criarListaDeObjetos(new Book("Eu sou a lenda"));
        System.out.println(books);


    }

    public static <T> List<T> criarListaDeObjetos(T t) {
        return new ArrayList<>(List.of(t));
    }
}

class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
