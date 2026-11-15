package com.miningmafia.app.data.remote.model;

/**
 * Withdrawal response from the authorized backend.
 * Success is only claimed when the provider confirms.
 */
public class WithdrawalResponse {
    public String id;
    public String status; // "submitted", "processing", "completed", "failed", "rejected"
    public String destinationAddress;
    public double amount;
    public String currency;
    public String createdAt;
    public String errorMessage;

    public WithdrawalResponse() {}
}
