package com.miningmafia.app.data.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/**
 * Room database for local non-sensitive data: accounts, transactions, withdrawals,
 * saved destinations. Sensitive session data goes into EncryptedSharedPreferences,
 * NOT into Room.
 */
@Database(entities = {
        AccountEntity.class,
        TransactionEntity.class,
        WithdrawalEntity.class,
        SavedWithdrawalDestination.class
}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AccountDao accountDao();
    public abstract TransactionDao transactionDao();
    public abstract WithdrawalDao withdrawalDao();
    public abstract SavedDestinationDao savedDestinationDao();

    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            AppDatabase.class,
                            "mining_mafia.db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
