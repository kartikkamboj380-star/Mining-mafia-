package com.miningmafia.app.data.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;
import androidx.room.Index;

@Entity(tableName = "withdrawals",
        indices = {@Index(value = "accountId")})
public class WithdrawalEntity {
    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "remote_id")
    public String remoteId;

    @ColumnInfo(name = "account_id")
    public String accountId;

    @ColumnInfo(name = "destination_address")
    public String destinationAddress;

    @ColumnInfo(name = "network")
    public String network;

    @ColumnInfo(name = "currency")
    public String currency;

    @ColumnInfo(name = "amount")
    public double amount;

    @ColumnInfo(name = "status")
    public String status;

    @ColumnInfo(name = "created_at")
    public String createdAt;

    @ColumnInfo(name = "error_message")
    public String errorMessage;

    public WithdrawalEntity() {}
}
