package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3314e60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f27692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ G60 f27693e;

    public C3314e60(G60 g60, int i10) {
        Objects.requireNonNull(g60);
        this.f27693e = g60;
        this.f27689a = i10;
    }

    public final void a() {
        G60 g60 = this.f27693e;
        int iZzi = g60.d().zzi();
        if (!g60.d().zzk() || g60.d().c() == 1 || g60.d().c() == 4 || iZzi == 0 || iZzi == 1) {
            if (this.f27691c) {
                g60.g().E(4);
            }
            this.f27691c = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f27691c && this.f27690b == iZzi) {
            long j10 = jElapsedRealtime - this.f27692d;
            int i10 = this.f27689a;
            if (j10 >= i10) {
                g60.e().b(new C3568g70(4, i10));
                return;
            }
            return;
        }
        this.f27691c = true;
        this.f27692d = jElapsedRealtime;
        this.f27690b = iZzi;
        g60.g().E(4);
        g60.g().a(4, this.f27689a);
    }
}
