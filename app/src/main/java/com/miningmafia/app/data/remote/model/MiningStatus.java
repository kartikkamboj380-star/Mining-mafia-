package com.miningmafia.app.data.remote.model;

/**
 * Real mining status reported by the authorized pool backend.
 * All values are measured/verified by the provider - never fabricated locally.
 */
public class MiningStatus {
    public boolean mining;
    public double hashrate;        // H/s
    public long acceptedShares;
    public long rejectedShares;
    public String workerId;
    public String workerStatus;    // "idle", "mining", "error", "offline"
    public long uptimeSeconds;
    public double verifiedRewards;
    public String poolConnectionStatus; // "connected", "disconnected", "error"
    public String errorMessage;
    public long updatedAt; // epoch millis

    public MiningStatus() {}
}
