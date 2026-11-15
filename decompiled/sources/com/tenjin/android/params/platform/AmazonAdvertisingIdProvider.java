package com.tenjin.android.params.platform;

import android.content.ContentResolver;
import android.provider.Settings;
import com.tenjin.android.config.TenjinConsts;

/* JADX INFO: loaded from: classes3.dex */
public class AmazonAdvertisingIdProvider implements IAdvertisingIdProvider {
    private final ContentResolver contentResolver;

    public AmazonAdvertisingIdProvider(ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    @Override // com.tenjin.android.params.platform.IAdvertisingIdProvider
    public String getId() {
        return Settings.Secure.getString(this.contentResolver, TenjinConsts.ATTR_PARAM_ADVERTISING_ID);
    }

    @Override // com.tenjin.android.params.platform.IAdvertisingIdProvider
    public boolean isLimitAdTrackingEnabled() {
        return Settings.Secure.getInt(this.contentResolver, "limit_ad_tracking", 2) != 0;
    }
}
