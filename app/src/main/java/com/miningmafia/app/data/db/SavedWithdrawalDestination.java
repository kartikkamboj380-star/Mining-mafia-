package com.miningmafia.app.data.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;

/**
 * User's saved withdrawal destination. Protected and visibly editable by the user.
 * Never modified secretly by the app.
 */
@Entity(tableName = "saved_withdrawal_destinations")
public class SavedWithdrawalDestination {
    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "label")
    public String label; // user-visible nickname

    @ColumnInfo(name = "destination_address")
    public String destinationAddress;

    @ColumnInfo(name = "network")
    public String network;

    @ColumnInfo(name = "currency")
    public String currency;

    @ColumnInfo(name = "is_default")
    public boolean isDefault;

    public SavedWithdrawalDestination() {}
}
