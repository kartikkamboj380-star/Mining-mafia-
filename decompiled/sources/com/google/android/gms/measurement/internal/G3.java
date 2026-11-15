package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f37535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Boolean f37536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f37537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.android.gms.internal.measurement.H0 f37538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f37539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Long f37540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f37541g;

    public G3(Context context, com.google.android.gms.internal.measurement.H0 h10, Long l10) {
        this.f37539e = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f37535a = applicationContext;
        this.f37540f = l10;
        if (h10 != null) {
            this.f37538d = h10;
            this.f37539e = h10.f36284c;
            this.f37537c = h10.f36283b;
            this.f37541g = h10.f36286e;
            Bundle bundle = h10.f36285d;
            if (bundle != null) {
                this.f37536b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
