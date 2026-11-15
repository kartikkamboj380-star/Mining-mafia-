package com.miningmafia.app.data.remote.model;

/**
 * A wallet transaction (deposit/reward/withdrawal).
 */
public class Transaction {
    public String id;
    public String accountId;
    public String type; // "reward", "withdrawal", "deposit", "fee"
    public double amount;
    public String currency;
    public String status; // "pending", "confirmed", "failed", "completed"
    public String timestamp; // ISO-8601
    public String description;

    public Transaction() {}
}
