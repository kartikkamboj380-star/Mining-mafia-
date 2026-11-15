package com.miningmafia.app.data.remote.model;

/**
 * Withdrawal request sent to the authorized backend.
 * Destination is protected and editable by the user.
 */
public class WithdrawalRequest {
    public String destinationAddress;
    public String network;   // e.g. "BTC", "ERC20", "TRC20"
    public String currency;
    public double amount;
    public String accountId;

    public WithdrawalRequest() {}
}
