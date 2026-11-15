package com.tenjin.android.params.platform;

import com.tenjin.android.utils.Reflection;

/* JADX INFO: loaded from: classes3.dex */
public class GoogleAdvertisingIdProvider implements IAdvertisingIdProvider {
    private final Object adInfoObject;

    public GoogleAdvertisingIdProvider(Object obj) {
        this.adInfoObject = obj;
    }

    @Override // com.tenjin.android.params.platform.IAdvertisingIdProvider
    public String getId() {
        return (String) Reflection.runInstanceMethod(this.adInfoObject, "getId", null, new Object[0]);
    }

    @Override // com.tenjin.android.params.platform.IAdvertisingIdProvider
    public boolean isLimitAdTrackingEnabled() {
        return ((Boolean) Reflection.runInstanceMethod(this.adInfoObject, "isLimitAdTrackingEnabled", null, new Object[0])).booleanValue();
    }
}
