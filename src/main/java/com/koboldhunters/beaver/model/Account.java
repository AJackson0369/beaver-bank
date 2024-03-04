package com.koboldhunters.beaver.model;

import java.time.LocalDate;

public class Account {
    private long id;
    private String accountName;

    private AccType accType;

    private double balance;

    private LocalDate registrationDate;
}
