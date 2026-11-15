package com.miningmafia.app.data.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;
import androidx.room.Index;

@Entity(tableName = "transactions",
        indices = {@Index(value = "accountId")})
public class TransactionEntity {
    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "remote_id")
    public String remoteId;

    @ColumnInfo(name = "account_id")
    public String accountId;

    @ColumnInfo(name = "type")
    public String type;

    @ColumnInfo(name = "amount")
    public double amount;

    @ColumnInfo(name = "currency")
    public String currency;

    @ColumnInfo(name = "status")
    public String status;

    @ColumnInfo(name = "timestamp")
    public String timestamp;

    @ColumnInfo(name = "description")
    public String description;

    public TransactionEntity() {}
}
