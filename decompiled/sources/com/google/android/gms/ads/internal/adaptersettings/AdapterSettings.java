package com.google.android.gms.ads.internal.adaptersettings;

import H4.B;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC2343Rh;

/* JADX INFO: loaded from: classes2.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final SharedPreferencesOnSharedPreferenceChangeListenerC2343Rh adapterSettingsInternal = B.d();

    AdapterSettings() {
    }

    @KeepForSdk
    private boolean getBoolean(String str, boolean z9) {
        return this.adapterSettingsInternal.f(str, z9);
    }

    @KeepForSdk
    private float getFloat(String str, float f10) {
        return this.adapterSettingsInternal.e(str, f10);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    @KeepForSdk
    private int getInt(String str, int i10) {
        return this.adapterSettingsInternal.d(str, i10);
    }

    @KeepForSdk
    private long getLong(String str, long j10) {
        return this.adapterSettingsInternal.c(str, j10);
    }

    @KeepForSdk
    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.b(str, str2);
    }
}
