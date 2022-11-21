package com.taxitime.driver.Model;

import com.taxitime.driver.Models.BankAccount;

public class BankAccountResponse {
    private boolean error;
    private BankAccount bankaccount;

    public boolean isError() {
        return error;
    }

    public BankAccount getBankaccount() {
        return bankaccount;
    }

    public BankAccountResponse(boolean error, BankAccount bankaccount) {
        this.error = error;
        this.bankaccount = bankaccount;
    }
}
