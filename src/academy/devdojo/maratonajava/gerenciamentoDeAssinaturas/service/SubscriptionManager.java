package academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.service;

import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.entity.Subscription;
import academy.devdojo.maratonajava.gerenciamentoDeAssinaturas.exception.SubscriptionNotFoundException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubscriptionManager {
    private List<Subscription> subscriptionList;

    public SubscriptionManager() {
        this.subscriptionList = new ArrayList<>();
    }

    public void addSubscription(Subscription subscription) {
        this.subscriptionList.add(subscription);
    }

    public List<Subscription> getActiveSubscriptionListWithStream() {
        return subscriptionList.stream()        // coloca todos os elementos em uma esteira rolante
                .filter(Subscription::isActive) // separa elementos baseado em um parâmetro (filtra/pega apenas os ativos)
                .collect(Collectors.toList());  // coleta os elementos filtrados anteriormente
    }

    public List<Subscription> getActiveSubscriptionsListOldSchool() {
        List<Subscription> active = new ArrayList<>();

        for (Subscription subscription : subscriptionList) {
            if (subscription.isActive()) {
                active.add(subscription);
            }
        }
        return active;
    }

    public Subscription findSubscriptionByNameWithStream(String name) throws SubscriptionNotFoundException {
        return subscriptionList.stream() // coloca todos os elementos em uma esteira
                .filter(s -> s.getName().equalsIgnoreCase(name)) // filtra baseado em um parâmetro (se o nome é igual ao passado como argumento)
                .findFirst() // encontra o primeiro elemento que match o filtro
                .orElseThrow(() -> new SubscriptionNotFoundException("Subscription not found " + name));
    }


    public Subscription findSubscriptionByNameOldSchool(String name) throws SubscriptionNotFoundException {
        for (Subscription subscription : subscriptionList) {
            if (subscription.getName().equalsIgnoreCase(name)) {
                return subscription;
            }
        }
        throw new SubscriptionNotFoundException("subscription not found " + name);
    }

    public void generateReport(String filePath) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(filePath))) {

            bufferedWriter.write("Subscription report:");
            bufferedWriter.newLine();
            for (Subscription subscription : subscriptionList) {
                bufferedWriter.write(subscription.toString());
                bufferedWriter.newLine();
            }
            System.out.println("Report generated successfully at: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
