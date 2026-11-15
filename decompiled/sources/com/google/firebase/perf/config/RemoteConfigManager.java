package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p176r5.InterfaceC7089f;
import p176r5.InterfaceC7090g;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, p008a7.n> allRcConfigMap;
    private final x cache;
    private final Executor executor;
    private com.google.firebase.remoteconfig.a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private G6.b firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final R6.a logger = R6.a.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(x.f(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(RANDOM_CONFIG_FETCH_DELAY_MS)) + 5000);
    }

    public static /* synthetic */ void a(RemoteConfigManager remoteConfigManager, Exception exc) {
        remoteConfigManager.getClass();
        logger.k("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        remoteConfigManager.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private p008a7.n getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        p008a7.n nVar = this.allRcConfigMap.get(str);
        if (nVar.a() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", nVar.asString(), str);
        return nVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        return j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j10) {
        return j10 - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.g().f(this.executor, new InterfaceC7090g() { // from class: com.google.firebase.perf.config.y
            @Override // p176r5.InterfaceC7090g
            public final void onSuccess(Object obj) {
                RemoteConfigManager remoteConfigManager = this.f40405a;
                remoteConfigManager.syncConfigValues(remoteConfigManager.firebaseRemoteConfig.h());
            }
        }).d(this.executor, new InterfaceC7089f() { // from class: com.google.firebase.perf.config.z
            @Override // p176r5.InterfaceC7089f
            public final void onFailure(Exception exc) {
                RemoteConfigManager.a(this.f40406a, exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.h());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public X6.g getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return X6.g.a();
        }
        p008a7.n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return X6.g.e(Boolean.valueOf(remoteConfigValue.asBoolean()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return X6.g.a();
    }

    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public X6.g getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return X6.g.a();
        }
        p008a7.n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return X6.g.e(Double.valueOf(remoteConfigValue.asDouble()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return X6.g.a();
    }

    public X6.g getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return X6.g.a();
        }
        p008a7.n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return X6.g.e(Long.valueOf(remoteConfigValue.b()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return X6.g.a();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t10) {
        p008a7.n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t10 instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.asBoolean());
                }
                if (t10 instanceof Double) {
                    return (T) Double.valueOf(remoteConfigValue.asDouble());
                }
                if (!(t10 instanceof Long) && !(t10 instanceof Integer)) {
                    if (t10 instanceof String) {
                        return (T) remoteConfigValue.asString();
                    }
                    T t11 = (T) remoteConfigValue.asString();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t10);
                        return t11;
                    } catch (IllegalArgumentException unused) {
                        t10 = t11;
                        if (!remoteConfigValue.asString().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                        }
                        return t10;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.b());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t10;
    }

    public X6.g getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return X6.g.a();
        }
        p008a7.n remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? X6.g.e(remoteConfigValue.asString()) : X6.g.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        G6.b bVar;
        com.google.firebase.remoteconfig.c cVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (cVar = (com.google.firebase.remoteconfig.c) bVar.get()) != null) {
            this.firebaseRemoteConfig = cVar.e(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.a aVar = this.firebaseRemoteConfig;
        return aVar == null || aVar.i().a() == 1 || this.firebaseRemoteConfig.i().a() == 2;
    }

    public void setFirebaseRemoteConfigProvider(G6.b bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void syncConfigValues(Map<String, p008a7.n> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        d dVarE = d.e();
        p008a7.n nVar = this.allRcConfigMap.get(dVarE.c());
        if (nVar == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.m(dVarE.a(), nVar.asBoolean());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    RemoteConfigManager(x xVar, Executor executor, com.google.firebase.remoteconfig.a aVar, long j10) {
        ConcurrentHashMap<String, p008a7.n> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = xVar;
        this.executor = executor;
        this.firebaseRemoteConfig = aVar;
        if (aVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>((Map<? extends String, ? extends p008a7.n>) aVar.h());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j10;
    }
}
