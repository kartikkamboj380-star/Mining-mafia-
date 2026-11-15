package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2936b50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f26715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f26718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ G60 f26721h;

    public C2936b50(G60 g60, int i10) {
        Objects.requireNonNull(g60);
        this.f26721h = g60;
        this.f26714a = i10;
    }

    public final void a() {
        G60 g60 = this.f26721h;
        if (!g60.d().zza()) {
            if (this.f26719f) {
                g60.g().E(2);
            }
            this.f26719f = false;
            return;
        }
        AbstractC5270tf abstractC5270tfA = g60.d().a();
        Object objF = abstractC5270tfA.g() ? null : abstractC5270tfA.f(g60.d().l());
        InterfaceC4637od interfaceC4637odD = g60.d();
        InterfaceC4637od interfaceC4637odD2 = g60.d();
        InterfaceC4637od interfaceC4637odD3 = g60.d();
        int iU = interfaceC4637odD.u();
        int iM = interfaceC4637odD2.m();
        long jZzu = interfaceC4637odD3.zzu();
        if (objF != null && iU == -1) {
            abstractC5270tfA.o(objF, g60.f());
            jZzu -= AbstractC4634ob0.L(0L);
            iU = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f26719f && Objects.equals(objF, this.f26715b) && iU == this.f26716c && iM == this.f26717d && jZzu == this.f26718e) {
            long j10 = jElapsedRealtime - this.f26720g;
            int i10 = this.f26714a;
            if (j10 >= i10) {
                g60.e().b(new C3568g70(2, i10));
                return;
            }
            return;
        }
        this.f26719f = true;
        this.f26720g = jElapsedRealtime;
        this.f26715b = objF;
        this.f26716c = iU;
        this.f26717d = iM;
        this.f26718e = jZzu;
        g60.g().E(2);
        g60.g().a(2, this.f26714a);
    }
}
