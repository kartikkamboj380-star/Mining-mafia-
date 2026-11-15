package com.miningmafia.app.data.remote.model;

import java.util.List;

/**
 * Aggregated wallet summary across all connected accounts.
 */
public class WalletSummary {
    public double totalBalance;
    public String currency;
    public double pendingRewards;
    public double confirmedRewards;
    public List<AccountBalance> accounts;
    public String lastUpdated; // ISO-8601

    public WalletSummary() {}
}
