package com.miningmafia.app.data.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface AccountDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(AccountEntity account);

    @Update
    int update(AccountEntity account);

    @Delete
    int delete(AccountEntity account);

    @Query("DELETE FROM accounts WHERE id = :id")
    int deleteById(long id);

    @Query("SELECT * FROM accounts ORDER BY updated_at DESC")
    List<AccountEntity> getAll();

    @Query("SELECT * FROM accounts WHERE connected = 1 ORDER BY updated_at DESC")
    List<AccountEntity> getConnected();

    @Query("SELECT * FROM accounts WHERE providerAccountId = :providerAccountId")
    AccountEntity findByProviderAccountId(String providerAccountId);

    @Query("SELECT * FROM accounts WHERE id = :id")
    AccountEntity findById(long id);
}
