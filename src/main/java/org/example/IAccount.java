package org.example;

public interface IAccount {
    void withdraw (double valor);

    void deposit(double valor);

    void transfer(double valor, Account contaDestino);

    void printStatement();
}
