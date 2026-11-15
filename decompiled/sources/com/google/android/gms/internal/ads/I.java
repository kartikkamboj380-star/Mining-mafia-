package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B f19429d = new B(2, -9223372036854775807L, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B f19430e = new B(3, -9223372036854775807L, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f19431a = O.J(AbstractC4634ob0.B("ExoPlayer:Loader:ProgressiveMediaPeriod"), A.f17219a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private D f19432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f19433c;

    public I(String str) {
    }

    public static B a(boolean z9, long j10) {
        return new B(z9 ? 1 : 0, j10, null);
    }

    public final boolean b() {
        return this.f19433c != null;
    }

    public final void c() {
        this.f19433c = null;
    }

    public final long d(E e10, InterfaceC5942z interfaceC5942z, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.f19433c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new D(this, looperMyLooper, e10, interfaceC5942z, i10, jElapsedRealtime).b(0L);
        return jElapsedRealtime;
    }

    public final boolean e() {
        return this.f19432b != null;
    }

    public final void f() {
        D d10 = this.f19432b;
        d10.getClass();
        d10.c(false);
    }

    public final void g(F f10) {
        D d10 = this.f19432b;
        if (d10 != null) {
            d10.c(true);
        }
        O o10 = this.f19431a;
        o10.execute(new G(f10));
        o10.zza();
    }

    public final void h(int i10) throws IOException {
        IOException iOException = this.f19433c;
        if (iOException != null) {
            throw iOException;
        }
        D d10 = this.f19432b;
        if (d10 != null) {
            d10.a(i10);
        }
    }

    final /* synthetic */ O i() {
        return this.f19431a;
    }

    final /* synthetic */ D j() {
        return this.f19432b;
    }

    final /* synthetic */ void k(D d10) {
        this.f19432b = d10;
    }

    final /* synthetic */ void l(IOException iOException) {
        this.f19433c = iOException;
    }
}
