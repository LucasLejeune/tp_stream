package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Trader abdallah = new Trader("Abdallah", "Cambridge");
        Trader audrey = new Trader("Audrey", "Milan");
        Trader corentin = new Trader("Corentin", "Cambridge");
        Trader tristan = new Trader("Tristan", "Cambridge");
        List<Transaction> transactions = Arrays.asList(new Transaction(abdallah, 2011, 400),
                new Transaction(abdallah, 2012, 300),
                new Transaction(audrey, 2012, 1000),
                new Transaction(audrey, 2011, 400),
                new Transaction(corentin, 2012, 710),
                new Transaction(corentin, 2012, 700),
                new Transaction(tristan, 2012, 950),
                new Transaction(tristan, 2022, 900));

    }
}