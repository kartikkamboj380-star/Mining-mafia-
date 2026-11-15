package com.miningmafia.app.data.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;

@Dao
public interface WithdrawalDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(WithdrawalEntity withdrawal);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<WithdrawalEntity> withdrawals);

    @Query("SELECT * FROM withdrawals ORDER BY created_at DESC")
    List<WithdrawalEntity> getAll();

    @Query("SELECT * FROM withdrawals WHERE account_id = :accountId ORDER BY created_at DESC")
    List<WithdrawalEntity> getByAccount(String accountId);
}
