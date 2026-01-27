package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.test;

import java.util.concurrent.*;

class CallableRandomNumber implements Callable<String> {

    @Override
    public String call() throws Exception {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
        for (int i = 0; i < randomNum; i++) {
            System.out.printf("%s executing a callable task...%n", Thread.currentThread().getName());
        }
        return String.format("%s finished the task. The number is %d", Thread.currentThread().getName(), randomNum);
    }
}

public class CallableTest01 {
    static void main() throws ExecutionException, InterruptedException {

        CallableRandomNumber callableRandomNumber = new CallableRandomNumber();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> future = executor.submit(callableRandomNumber);

        // get faz a main esperar até que a execucao do callable termine, então continua
        String s = future.get();
        System.out.printf("program finished %s", s);
        executor.shutdown();

    }
}
