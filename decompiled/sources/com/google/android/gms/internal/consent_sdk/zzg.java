package com.google.android.gms.internal.consent_sdk;

import W5.e;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final e zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new e(this.zza, super.getMessage());
    }

    public zzg(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = i10;
    }
}
