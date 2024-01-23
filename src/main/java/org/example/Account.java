package org.example;

import lombok.Getter;

@Getter
public class Account implements IAccount{
    private static final int AGENCY_DEFAULT = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.AGENCY_DEFAULT;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(double valor) {
        balance -= valor;
    }

    @Override
    public void deposit(double valor) {
        balance += valor;
    }

    @Override
    public void transfer(double valor, Account contaDestino) {
        this.withdraw(valor);
        contaDestino.deposit(valor);
    }

    protected void printCommonInfo() {
        System.out.printf("Owner: %s%n", this.client.getName());
        System.out.printf("Agency: %d%n", this.agency);
        System.out.printf("Number: %d%n", this.number);
        System.out.printf("Balance: %.2f%n", this.balance);
    }

    @Override
    public void printStatement() {
    }
}
