package com.tenjin.android.params;

import android.content.Context;
import android.util.Log;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.params.base.AParamProvider;
import com.tenjin.android.params.referral.HuaweiInstallReferrer;
import com.tenjin.android.params.referral.PlayStoreInstallReferrer;
import com.tenjin.android.store.DataStore;
import com.tenjin.android.utils.StoreAttribution;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class AttributionParams extends AParamProvider {
    private static final int REFERRAL_THREADS_NUMBER = 2;
    private static final String TAG = "TenjinAttributionParams";
    private static final ExecutorService executorService = Executors.newCachedThreadPool();
    private final Context context;
    private final DataStore dataStore;
    private StoreAttribution huaweiAttribution;
    private StoreAttribution playStoreAttribution;

    public AttributionParams(Context context, DataStore dataStore) {
        this.context = context;
        this.dataStore = dataStore;
    }

    public static /* synthetic */ void a(CountDownLatch countDownLatch) {
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            Log.e(TAG, "Interrupted while waiting for referral data", e10);
        }
        Log.d(TAG, "Referral data retrieval complete.");
    }

    private Boolean alreadyRetrievedReferral() {
        return Boolean.valueOf(this.dataStore.contains(TenjinConsts.GOOGLE_INSTALL_REFERRAL_KEY) || this.dataStore.contains(TenjinConsts.HUAWEI_INSTALL_REFERRAL_KEY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHuaweiReferralDataAsync(final CountDownLatch countDownLatch) {
        Log.d(TAG, "Request Huawei App Gallery install referrer");
        if (new HuaweiInstallReferrer(this.context).getInstallReferrer(new HuaweiInstallReferrer.HuaweiAttributionCallback() { // from class: com.tenjin.android.params.AttributionParams.2
            @Override // com.tenjin.android.params.referral.HuaweiInstallReferrer.HuaweiAttributionCallback
            public void onComplete(String str, long j10, long j11) {
                Log.d(AttributionParams.TAG, "Retrieved referral from Huawei App Gallery - " + str);
                AttributionParams.this.huaweiAttributionCallback(str, j10, j11);
                countDownLatch.countDown();
            }

            @Override // com.tenjin.android.params.referral.HuaweiInstallReferrer.HuaweiAttributionCallback
            public void onFail() {
                countDownLatch.countDown();
            }
        })) {
            return;
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getReferralDataAsync(final CountDownLatch countDownLatch) {
        Log.d(TAG, "Request PlayStore install referrer");
        if (new PlayStoreInstallReferrer(this.context).getInstallReferrer(new PlayStoreInstallReferrer.PlayStoreAttributionCallback() { // from class: com.tenjin.android.params.AttributionParams.1
            @Override // com.tenjin.android.params.referral.PlayStoreInstallReferrer.PlayStoreAttributionCallback
            public void onComplete(String str, long j10, long j11) {
                Log.d(AttributionParams.TAG, "Retrieved referral from Play Store - " + str);
                AttributionParams.this.playStoreAttributionCallback(str, j10, j11);
                countDownLatch.countDown();
            }

            @Override // com.tenjin.android.params.referral.PlayStoreInstallReferrer.PlayStoreAttributionCallback
            public void onFail() {
                Log.d(AttributionParams.TAG, "No play store referral");
                countDownLatch.countDown();
            }
        })) {
            return;
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void huaweiAttributionCallback(String str, long j10, long j11) {
        StoreAttribution storeAttribution = new StoreAttribution(StoreAttribution.Store.Huawei, str, Long.valueOf(j10), Long.valueOf(j11));
        this.huaweiAttribution = storeAttribution;
        storeAttribution.save(this.dataStore);
    }

    private void loadReferralData() {
        this.playStoreAttribution = StoreAttribution.load(this.dataStore, StoreAttribution.Store.PlayStore);
        this.huaweiAttribution = StoreAttribution.load(this.dataStore, StoreAttribution.Store.Huawei);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playStoreAttributionCallback(String str, long j10, long j11) {
        StoreAttribution storeAttribution = new StoreAttribution(StoreAttribution.Store.PlayStore, str, Long.valueOf(j10), Long.valueOf(j11));
        this.playStoreAttribution = storeAttribution;
        storeAttribution.save(this.dataStore);
    }

    @Override // com.tenjin.android.params.base.ParamProvider
    public Map<String, String> apply(Map<String, String> map) {
        if (!hasReferralBeenApplied()) {
            StoreAttribution storeAttribution = this.playStoreAttribution;
            if (storeAttribution != null) {
                storeAttribution.apply(map);
            }
            StoreAttribution storeAttribution2 = this.huaweiAttribution;
            if (storeAttribution2 != null) {
                storeAttribution2.apply(map);
            }
        }
        return map;
    }

    public void getAttribution() {
        if (alreadyRetrievedReferral().booleanValue()) {
            loadReferralData();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        ExecutorService executorService2 = executorService;
        executorService2.submit(new Runnable() { // from class: com.tenjin.android.params.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f42643a.getReferralDataAsync(countDownLatch);
            }
        });
        executorService2.submit(new Runnable() { // from class: com.tenjin.android.params.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f42645a.getHuaweiReferralDataAsync(countDownLatch);
            }
        });
        executorService2.submit(new Runnable() { // from class: com.tenjin.android.params.c
            @Override // java.lang.Runnable
            public final void run() {
                AttributionParams.a(countDownLatch);
            }
        });
    }

    public boolean hasReferralBeenApplied() {
        return this.dataStore.getBoolean(TenjinConsts.REFERRAL_SENT_KEY, false);
    }
}
