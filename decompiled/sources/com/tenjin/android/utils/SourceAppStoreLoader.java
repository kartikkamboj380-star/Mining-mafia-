package com.tenjin.android.utils;

import android.content.Context;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.tenjin.android.TenjinSDK;
import com.tenjin.android.config.TenjinConsts;

/* JADX INFO: loaded from: classes3.dex */
public class SourceAppStoreLoader {
    private static final String TAG = "SourceAppStoreGetter";
    private TenjinSDK.AppStoreType sourceAppStore;

    public SourceAppStoreLoader(Context context) {
        this.sourceAppStore = null;
        if (context == null) {
            Log.e("Tenjin", "invalid input param");
            return;
        }
        TenjinSDK.AppStoreType appStore = TenjinSDK.getAppStore();
        this.sourceAppStore = appStore;
        if (appStore == null) {
            loadFromManifest(context);
        }
        if (this.sourceAppStore == null) {
            this.sourceAppStore = TenjinSDK.AppStoreType.unspecified;
        }
        Log.d(TAG, "sourceAppStore = " + this.sourceAppStore.name());
    }

    private static String cleanStoreName(String str) {
        return str == null ? "" : str.toLowerCase().replaceAll("\\s", "");
    }

    private void loadFromManifest(Context context) {
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData.getString(TenjinConsts.TENJIN_APP_STORE_META_NAME);
            Log.d(TAG, "store metadata value = " + string);
            this.sourceAppStore = TenjinSDK.AppStoreType.valueOf(cleanStoreName(string));
        } catch (Exception e10) {
            Log.e(TAG, "Unable to load app store type from manifest: " + e10.getMessage());
            this.sourceAppStore = null;
        }
    }

    public String getSourceAppStore() {
        return this.sourceAppStore.name();
    }
}
