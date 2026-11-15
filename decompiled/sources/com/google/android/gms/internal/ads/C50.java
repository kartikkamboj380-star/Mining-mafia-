package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class C50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f17786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f17790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ G60 f17791g;

    public C50(G60 g60, int i10) {
        Objects.requireNonNull(g60);
        this.f17791g = g60;
        this.f17785a = i10;
    }

    public final void a() {
        long jG;
        G60 g60 = this.f17791g;
        AbstractC5270tf abstractC5270tfA = g60.d().a();
        Object objF = abstractC5270tfA.g() ? null : abstractC5270tfA.f(g60.d().l());
        InterfaceC4637od interfaceC4637odD = g60.d();
        InterfaceC4637od interfaceC4637odD2 = g60.d();
        InterfaceC4637od interfaceC4637odD3 = g60.d();
        int iU = interfaceC4637odD.u();
        int iM = interfaceC4637odD2.m();
        long jZzu = interfaceC4637odD3.zzu();
        if (objF == null || iU != -1) {
            jG = iU != -1 ? g60.d().g() : -9223372036854775807L;
        } else {
            abstractC5270tfA.o(objF, g60.f());
            jZzu -= AbstractC4634ob0.L(0L);
            jG = AbstractC4634ob0.L(g60.f().f32698d);
            iU = -1;
        }
        boolean zZza = g60.d().zza();
        if (!zZza || jG == -9223372036854775807L || jZzu < jG) {
            g60.g().E(3);
            if (zZza && jG != -9223372036854775807L) {
                g60.g().a(3, (int) Math.ceil((jG - jZzu) / g60.d().zzn().f27150a));
            }
            this.f17789e = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f17789e && Objects.equals(objF, this.f17786b) && iU == this.f17787c && iM == this.f17788d) {
            long j10 = jElapsedRealtime - this.f17790f;
            int i10 = this.f17785a;
            if (j10 >= i10) {
                g60.e().b(new C3568g70(3, i10));
                return;
            }
            return;
        }
        this.f17789e = true;
        this.f17790f = jElapsedRealtime;
        this.f17786b = objF;
        this.f17787c = iU;
        this.f17788d = iM;
        g60.g().E(3);
        g60.g().a(3, this.f17785a);
    }
}
