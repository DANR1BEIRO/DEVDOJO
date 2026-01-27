package academy.devdojo.maratonajava.javacore.ZZF_Threads.test;

import java.util.ArrayList;
import java.util.List;

// a classe é thread-safe porque todos os métodos que vão acessar o objeto
// que pertence a essa classe são synchronized

class ThreadSafeNames {
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized void removeFirst() {
        if (names.size() > 0) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}

public class ThreadSafeTest01 {
    static void main() {

        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("goku");
        Runnable r = threadSafeNames::removeFirst;

        new Thread(r).start();
        new Thread(r).start();
    }
}
