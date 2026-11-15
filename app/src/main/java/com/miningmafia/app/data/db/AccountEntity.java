package com.miningmafia.app.data.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;
import androidx.room.Index;

@Entity(tableName = "accounts",
        indices = {@Index(value = "providerAccountId", unique = true)})
public class AccountEntity {
    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "provider")
    public String provider;

    @ColumnInfo(name = "provider_account_id")
    public String providerAccountId;

    @ColumnInfo(name = "display_name")
    public String displayName;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "balance")
    public double balance;

    @ColumnInfo(name = "currency")
    public String currency;

    @ColumnInfo(name = "connected")
    public boolean connected;

    @ColumnInfo(name = "session_expired")
    public boolean sessionExpired;

    @ColumnInfo(name = "updated_at")
    public long updatedAt;

    public AccountEntity() {}
}
