package com.miningmafia.app.data.remote.model;

/**
 * A single connected account's balance and status.
 */
public class AccountBalance {
    public String id;
    public String provider; // "google", "email", "ctpool", etc.
    public String providerAccountId;
    public String displayName;
    public String email;
    public double balance;
    public String currency; // e.g. "BTC", "USDT", "CTP"
    public boolean connected;
    public boolean sessionExpired;
    public long updatedAt; // epoch millis

    public AccountBalance() {}
}
