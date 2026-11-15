package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.AbstractActivityC1148t;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
    }

    public final boolean zza() {
        return this.zza instanceof AbstractActivityC1148t;
    }

    public final boolean zzb() {
        return this.zza instanceof Activity;
    }

    @NonNull
    public final Activity zzc() {
        return (Activity) this.zza;
    }

    @NonNull
    public final AbstractActivityC1148t zzd() {
        return (AbstractActivityC1148t) this.zza;
    }

    @KeepForSdk
    @Deprecated
    public LifecycleActivity(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
