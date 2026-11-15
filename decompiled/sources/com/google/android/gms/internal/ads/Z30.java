package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Z30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f26096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f26099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f26100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f26102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ G60 f26103i;

    public Z30(G60 g60, int i10) {
        Objects.requireNonNull(g60);
        this.f26103i = g60;
        this.f26095a = i10;
    }

    public final void a() {
        G60 g60 = this.f26103i;
        if (g60.d().c() != 2 || !g60.d().zzk() || g60.d().zzi() != 0) {
            if (this.f26101g) {
                g60.g().E(1);
            }
            this.f26101g = false;
            return;
        }
        AbstractC5270tf abstractC5270tfA = g60.d().a();
        Object objF = abstractC5270tfA.g() ? null : abstractC5270tfA.f(g60.d().l());
        InterfaceC4637od interfaceC4637odD = g60.d();
        InterfaceC4637od interfaceC4637odD2 = g60.d();
        InterfaceC4637od interfaceC4637odD3 = g60.d();
        InterfaceC4637od interfaceC4637odD4 = g60.d();
        int iU = interfaceC4637odD.u();
        int iM = interfaceC4637odD2.m();
        long jQ = interfaceC4637odD3.q();
        long jMax = Math.max(0L, g60.d().p() - Math.max(0L, jQ - interfaceC4637odD4.zzu()));
        if (objF != null && iU == -1) {
            abstractC5270tfA.o(objF, g60.f());
            jQ -= AbstractC4634ob0.L(0L);
            iU = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f26101g && Objects.equals(objF, this.f26096b) && iU == this.f26097c && iM == this.f26098d && jQ == this.f26099e && jMax == this.f26100f) {
            long j10 = jElapsedRealtime - this.f26102h;
            int i10 = this.f26095a;
            if (j10 >= i10) {
                g60.e().b(new C3568g70(1, i10));
                return;
            }
            return;
        }
        this.f26101g = true;
        this.f26102h = jElapsedRealtime;
        this.f26096b = objF;
        this.f26097c = iU;
        this.f26098d = iM;
        this.f26099e = jQ;
        this.f26100f = jMax;
        g60.g().E(1);
        g60.g().a(1, this.f26095a);
    }
}
