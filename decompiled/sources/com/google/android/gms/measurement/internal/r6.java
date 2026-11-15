package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f38342a;

    public r6(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f38342a = applicationContext;
    }
}
