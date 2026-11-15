package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i10, @NonNull IBinder iBinder, @NonNull Bundle bundle);

    void zzb(int i10, @NonNull Bundle bundle);

    void zzc(int i10, IBinder iBinder, zzj zzjVar);
}
