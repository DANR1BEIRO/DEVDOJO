package academy.devdojo.maratonajava.javacore.ZZG_Concurrent.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    static void main() throws InterruptedException {
        // The element capacity is previously determined, that is, impossible to change
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.remainingCapacity()); // 2147483647

        /**
         * Difference between add and offer:
         * - add: return true if its possible to add an element, otherwise
         * throws an IllegalStateException
         * - offer: return true if its possible to add an element or false
         * if no space is currently available
         */

        System.out.println(tq.add("Goku"));
        System.out.println(tq.offer("Gohan"));

        /**
         * throws InterruptedException
         * Inserts the specified element into this queue, waiting up to the
         * specified wait time if necessary for space to become available
         */
        System.out.println(tq.offer("Gohan", 5, TimeUnit.SECONDS));

        // throws InterruptedException
        // Inserts the specified element into this queue, waiting if necessary
        // for space to become available.
        tq.put("Goten");

        if (tq.hasWaitingConsumer()) {
            tq.transfer("Gotrunks");
        }

        System.out.println(tq.tryTransfer("Picollo"));
        System.out.println(tq.tryTransfer("Picollo", 5, TimeUnit.SECONDS));

        // Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception
        // if this queue is empty.
        tq.element();

        // Retrieves, but does not remove, the head of this queue,
        // or returns null if this queue is empty
        tq.peek();

        // Retrieves and removes the head of this queue,
        // or returns null if this queue is empty.
        tq.poll();

        // Retrieves and removes the head of this queue. This method differs from poll()
        // only in that it throws an exception if this queue is empty.
        tq.remove();

        // E take() throws InterruptedException
        //Retrieves and removes the head of this queue, waiting if
        // necessary until an element becomes available.
        tq.take();


    }
}
