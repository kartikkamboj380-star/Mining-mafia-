package com.google.android.gms.common.internal;

import android.os.IBinder;
import com.google.android.gms.internal.common.AbstractC6143a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzu extends AbstractC6143a implements ICancelToken {
    zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() {
        zzC(2, zza());
    }
}
