package com.tenjin.android.store;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.params.platform.IDataSource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public class TenjinDatasource implements IDataSource {
    Context context;
    private final QueueEventDao queueEventDao;
    private final SharedPreferences sharedPreferences;
    Date oneWeekAgo = new Date(System.currentTimeMillis() - 604800000);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public interface TenjinCallback {
        void onEventsLoaded(List<QueueEvent> list);
    }

    public TenjinDatasource(Context context) {
        this.queueEventDao = QueueEventDatabase.getDatabase(context).queueEventDao();
        this.sharedPreferences = context.getSharedPreferences(TenjinConsts.INSTALL_PREFERENCE, 0);
    }

    public static /* synthetic */ void c(TenjinDatasource tenjinDatasource, TenjinCallback tenjinCallback) {
        List<QueueEvent> allEvents = tenjinDatasource.queueEventDao.getAllEvents(tenjinDatasource.oneWeekAgo);
        tenjinDatasource.queueEventDao.deleteOldEvents(tenjinDatasource.oneWeekAgo);
        tenjinCallback.onEventsLoaded(allEvents);
    }

    public static String stringFromMap(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new com.google.gson.e().s(map);
    }

    public void deleteEvent(final QueueEvent queueEvent) {
        this.executorService.execute(new Runnable() { // from class: com.tenjin.android.store.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f42655a.queueEventDao.delete(queueEvent);
            }
        });
    }

    public void deleteOldEvents() {
        this.executorService.execute(new Runnable() { // from class: com.tenjin.android.store.f
            @Override // java.lang.Runnable
            public final void run() {
                TenjinDatasource tenjinDatasource = this.f42663a;
                tenjinDatasource.queueEventDao.deleteOldEvents(tenjinDatasource.oneWeekAgo);
            }
        });
    }

    public void getAllEvents(final TenjinCallback tenjinCallback) {
        this.executorService.execute(new Runnable() { // from class: com.tenjin.android.store.c
            @Override // java.lang.Runnable
            public final void run() {
                TenjinDatasource.c(this.f42657a, tenjinCallback);
            }
        });
    }

    public Boolean getCacheEventSetting() {
        return Boolean.valueOf(this.sharedPreferences.getBoolean(TenjinConsts.TENJIN_EVENT_CACHE_ENABLED, false));
    }

    public Boolean getEncryptRequestsSetting() {
        return Boolean.valueOf(this.sharedPreferences.getBoolean(TenjinConsts.TENJIN_ENCRYPT_REQUESTS_ENABLED, false));
    }

    public void getEventWithParams(final Map<String, String> map, final TenjinCallback tenjinCallback) {
        this.executorService.execute(new Runnable() { // from class: com.tenjin.android.store.a
            @Override // java.lang.Runnable
            public final void run() {
                tenjinCallback.onEventsLoaded(this.f42652a.queueEventDao.getEventsFromParams(TenjinDatasource.stringFromMap(map)));
            }
        });
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public String getInitializedAt() {
        return this.sharedPreferences.getString(TenjinConsts.TENJIN_INITIALIZED_AT_KEY, null);
    }

    @Override // com.tenjin.android.params.platform.IDataSource
    public String getStoredAdvertisingId() {
        return this.sharedPreferences.getString(TenjinConsts.TENJIN_ADVERTISING_ID_STORE_KEY, null);
    }

    @Override // com.tenjin.android.params.platform.IDataSource
    public Boolean getStoredLimitAdTracking() {
        return Boolean.valueOf(this.sharedPreferences.getBoolean(TenjinConsts.TENJIN_AD_TRACKING_STORE_KEY, true));
    }

    public String getUserProfileData() {
        return this.sharedPreferences.getString(TenjinConsts.TENJIN_USER_PROFILE_KEY, null);
    }

    public void insertEvent(final QueueEvent queueEvent) {
        this.executorService.execute(new Runnable() { // from class: com.tenjin.android.store.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f42661a.queueEventDao.insert(queueEvent);
            }
        });
    }

    public Future<Long> insertEventWithFuture(final QueueEvent queueEvent) {
        return this.executorService.submit(new Callable() { // from class: com.tenjin.android.store.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(this.f42659a.queueEventDao.insert(queueEvent));
            }
        });
    }

    @Override // com.tenjin.android.params.platform.IDataSource
    public void setAdvertisingIdInfo(String str, Boolean bool) {
        if (str == null) {
            Log.d("Tenjin", "Attempted to store null advertising ID.");
        } else {
            this.sharedPreferences.edit().putString(TenjinConsts.TENJIN_ADVERTISING_ID_STORE_KEY, str).apply();
            this.sharedPreferences.edit().putBoolean(TenjinConsts.TENJIN_AD_TRACKING_STORE_KEY, bool.booleanValue()).apply();
        }
    }

    public void setCacheEventSetting(Boolean bool) {
        Log.d(TenjinConsts.LOG_TAG, "Set event cache setting " + bool);
        this.sharedPreferences.edit().putBoolean(TenjinConsts.TENJIN_EVENT_CACHE_ENABLED, bool.booleanValue()).apply();
    }

    public void setEncryptRequestsSetting(Boolean bool) {
        Log.d(TenjinConsts.LOG_TAG, "Set encrypt requests setting " + bool);
        this.sharedPreferences.edit().putBoolean(TenjinConsts.TENJIN_ENCRYPT_REQUESTS_ENABLED, bool.booleanValue()).apply();
    }

    public void setInitializedAt(String str) {
        this.sharedPreferences.edit().putString(TenjinConsts.TENJIN_INITIALIZED_AT_KEY, str).apply();
    }

    public void setUserProfileData(String str) {
        this.sharedPreferences.edit().putString(TenjinConsts.TENJIN_USER_PROFILE_KEY, str).apply();
    }
}
