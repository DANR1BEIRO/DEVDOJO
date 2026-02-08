package academy.devdojo.maratonajava.javacore.ZZJ_CRUD.service;

import academy.devdojo.maratonajava.javacore.ZZJ_CRUD.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZJ_CRUD.repository.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        ProducerRepository.findByname(name)
                .forEach(p -> System.out.printf("%d | %s%n", p.getId(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type the ID of the producer you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }

    private static void update() {
        System.out.println("Type the producer ID to update");
        Optional<Producer> byId = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (byId.isEmpty()) {
            System.out.println("Producer not found");
            return;
        }

        Producer producerFromDb = byId.get();
        System.out.println("Type new name ou enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDb.getName() : name;

        Producer producerToUpdate = Producer.builder()
                .id(producerFromDb.getId())
                .name(name)
                .build();

        ProducerRepository.update(producerToUpdate);
    }
}
