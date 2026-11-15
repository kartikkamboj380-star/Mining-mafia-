package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1979Kg0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1979Kg0 f20250b = new C1979Kg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20251a;

    private C1979Kg0() {
    }

    public static C1979Kg0 a() {
        return f20250b;
    }

    public final Context b() {
        return this.f20251a;
    }

    public final void c(Context context) {
        this.f20251a = context != null ? context.getApplicationContext() : null;
    }
}
