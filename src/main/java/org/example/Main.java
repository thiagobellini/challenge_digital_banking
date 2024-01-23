package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("American");

        Client client = new Client();
        client.setName("Thiago");

        Account ca = new CheckingAccount(client);
        Account sa = new SavingsAccount(client);

        bank.setAccounts(Stream.of(ca, sa).collect(Collectors.toSet()));

        ca.deposit(200);
        bank.printAccounts();

        /*ca.printStatement();
        sa.printStatement();*/

        ca.transfer(100, sa);
        bank.printAccounts();

        /*ca.printStatement();
        sa.printStatement();*/

        // Just for study
        /*bank.getAccounts().stream().forEach(account -> {
            account.printStatement();
        });
        bank.getAccounts().stream().forEach(account -> account.printStatement());*/
    }
}