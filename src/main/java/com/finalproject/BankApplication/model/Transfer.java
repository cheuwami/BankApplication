package com.finalproject.BankApplication.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="transfers")
public class Transfer extends TransactionBase {

    private String recipient_bank_account;
    private String recipient_name;

    @Enumerated
    private Status status;
}
