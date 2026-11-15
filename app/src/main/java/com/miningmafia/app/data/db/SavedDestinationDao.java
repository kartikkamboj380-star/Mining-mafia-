package com.miningmafia.app.data.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;

@Dao
public interface SavedDestinationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(SavedWithdrawalDestination destination);

    @Update
    int update(SavedWithdrawalDestination destination);

    @Delete
    int delete(SavedWithdrawalDestination destination);

    @Query("SELECT * FROM saved_withdrawal_destinations ORDER BY is_default DESC, id ASC")
    List<SavedWithdrawalDestination> getAll();

    @Query("SELECT * FROM saved_withdrawal_destinations WHERE is_default = 1 LIMIT 1")
    SavedWithdrawalDestination getDefault();
}
