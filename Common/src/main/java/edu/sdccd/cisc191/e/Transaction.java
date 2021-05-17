package edu.sdccd.cisc191.e;

import java.util.Date;

public class Transaction {

    private Account account;
    private double amount;
    private Date timestamp;
    private String memo;
    private String category;

    private Transaction() {
        this(null, 0.0, null, "", "");
    }

    public Transaction(Account account, double amount, Date timestamp, String memo, String category) {
        this.account = account;
        this.amount = amount;
        this.timestamp = timestamp;
        this.memo = memo;
        this.category = category;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
