package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2157Ns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f21358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2053Ls f21359b;

    C2157Ns(Clock clock, C2053Ls c2053Ls) {
        this.f21358a = clock;
        this.f21359b = c2053Ls;
    }

    public static C2157Ns a(Context context) {
        return AbstractC2573Vs.b(context).a();
    }

    public final void b() {
        this.f21359b.a(-1, this.f21358a.currentTimeMillis());
    }

    public final void c(H4.U1 u10) {
        this.f21359b.a(-1, this.f21358a.currentTimeMillis());
    }

    public final void d(int i10, long j10) {
        this.f21359b.a(i10, j10);
    }
}
