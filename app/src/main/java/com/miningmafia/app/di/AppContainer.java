package com.miningmafia.app.di;

import android.content.Context;
import com.miningmafia.app.data.AppDatabase;
import com.miningmafia.app.data.repo.AccountRepository;
import com.miningmafia.app.data.repo.WalletRepository;
import com.miningmafia.app.data.repo.WithdrawalRepository;
import com.miningmafia.app.data.remote.BackendConfig;
import com.miningmafia.app.data.remote.BackendApi;
import com.miningmafia.app.auth.AuthRepository;
import com.miningmafia.app.mining.MiningManager;
import com.miningmafia.app.util.EncryptedPrefs;
import com.miningmafia.app.util.BatteryTempMonitor;
import com.miningmafia.app.util.NetworkMonitor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Lightweight dependency container. Avoids heavy DI frameworks to keep the APK small
 * and builds fast on low-memory/CI environments.
 */
public class AppContainer {

    private final Context context;
    private final EncryptedPrefs encryptedPrefs;
    private final BackendConfig backendConfig;
    private final BackendApi backendApi;
    private final AppDatabase database;
    private final AuthRepository authRepository;
    private final AccountRepository accountRepository;
    private final WalletRepository walletRepository;
    private final WithdrawalRepository withdrawalRepository;
    private final MiningManager miningManager;
    private final BatteryTempMonitor batteryTempMonitor;
    private final NetworkMonitor networkMonitor;

    public AppContainer(Context context) {
        this.context = context.getApplicationContext();

        this.encryptedPrefs = new EncryptedPrefs(this.context);
        this.backendConfig = new BackendConfig(this.encryptedPrefs);

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor()
                        .setLevel(HttpLoggingInterceptor.Level.NONE)) // NONE in release; BASIC in debug
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(backendConfig.getBaseUrl())
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.backendApi = retrofit.create(BackendApi.class);
        this.database = AppDatabase.getInstance(this.context);
        this.authRepository = new AuthRepository(this.context, this.encryptedPrefs);
        this.accountRepository = new AccountRepository(this.database.accountDao(), this.backendApi, this.encryptedPrefs);
        this.walletRepository = new WalletRepository(this.database.transactionDao(), this.backendApi, this.encryptedPrefs);
        this.withdrawalRepository = new WithdrawalRepository(this.database.withdrawalDao(), this.backendApi, this.encryptedPrefs);
        this.miningManager = new MiningManager(this.context, this.backendApi, this.accountRepository, this.walletRepository, this.encryptedPrefs);
        this.batteryTempMonitor = new BatteryTempMonitor(this.context);
        this.networkMonitor = new NetworkMonitor(this.context);
    }

    public EncryptedPrefs getEncryptedPrefs() { return encryptedPrefs; }
    public BackendConfig getBackendConfig() { return backendConfig; }
    public BackendApi getBackendApi() { return backendApi; }
    public AppDatabase getDatabase() { return database; }
    public AuthRepository getAuthRepository() { return authRepository; }
    public AccountRepository getAccountRepository() { return accountRepository; }
    public WalletRepository getWalletRepository() { return walletRepository; }
    public WithdrawalRepository getWithdrawalRepository() { return withdrawalRepository; }
    public MiningManager getMiningManager() { return miningManager; }
    public BatteryTempMonitor getBatteryTempMonitor() { return batteryTempMonitor; }
    public NetworkMonitor getNetworkMonitor() { return networkMonitor; }
}
