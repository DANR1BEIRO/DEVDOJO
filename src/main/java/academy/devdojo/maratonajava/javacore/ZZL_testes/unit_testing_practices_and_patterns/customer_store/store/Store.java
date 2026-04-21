package academy.devdojo.maratonajava.javacore.ZZL_testes.unit_testing_practices_and_patterns.customer_store.store;

public interface Store<T> {

    void addInventory(T product, int amount);

    int getInventory(T product);

    boolean hasEnoughInventory(T product, int amount);

    void removeInventory(T product, int amount);

}
