package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Bank {
    private String name;
    private Set<Account> accounts;

    public Bank(String name) {
        this.name = name;
    }

    public void printAccounts() {
        this.getAccounts().forEach(Account::printStatement);
    }
}
