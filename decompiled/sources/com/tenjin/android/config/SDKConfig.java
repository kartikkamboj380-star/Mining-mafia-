package com.tenjin.android.config;

import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.tenjin.android.utils.TenjinUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SDKConfig {
    private static final Boolean ILRD_ENABLED;
    private static final Boolean SUBSCRIPTION_ENABLED;
    private final HashMap<String, Object> _store = new HashMap<>();

    static {
        Boolean bool = Boolean.TRUE;
        ILRD_ENABLED = bool;
        SUBSCRIPTION_ENABLED = bool;
    }

    public SDKConfig() {
        loadDefaults();
        loadOverrides();
    }

    private void loadDefaults() {
        HashMap<String, Object> map = this._store;
        String str = SDKConfigKeys.TenjinConfigKeyILRDEnabled;
        Boolean bool = Boolean.FALSE;
        map.put(str, bool);
        this._store.put(SDKConfigKeys.TenjinConfigKeySubscriptionEnabled, bool);
        this._store.put(SDKConfigKeys.TenjinConfigKeySubscriptionHost, "https://subscription-server.staging.tenjin.com");
        this._store.put(SDKConfigKeys.TenjinConfigKeySubscriptionEndpoint, BillingClient.FeatureType.SUBSCRIPTIONS);
        this._store.put(SDKConfigKeys.TenjinConfigKeyBaseHost, "https://track.tenjin.com");
    }

    private void loadOverrides() {
        Boolean bool = ILRD_ENABLED;
        if (bool.booleanValue() || !TenjinUtils.isNullOrEmpty(System.getenv(SDKConfigKeys.TenjinConfigKeyILRDEnabled)).booleanValue()) {
            this._store.put(SDKConfigKeys.TenjinConfigKeyILRDEnabled, bool);
        }
        Boolean bool2 = SUBSCRIPTION_ENABLED;
        if (bool2.booleanValue() || !TenjinUtils.isNullOrEmpty(System.getenv(SDKConfigKeys.TenjinConfigKeySubscriptionEnabled)).booleanValue()) {
            this._store.put(SDKConfigKeys.TenjinConfigKeySubscriptionEnabled, bool2);
        }
    }

    public Boolean boolForKey(String str) {
        Object obj = this._store.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public void set(String str, Object obj) {
        this._store.put(str, obj);
        Log.d(TenjinConsts.LOG_TAG, "Set " + str + " = " + obj.toString());
    }

    public String stringForKey(String str) {
        Object obj = this._store.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
