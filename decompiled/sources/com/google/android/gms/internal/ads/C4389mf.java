package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import android.app.Activity;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4389mf extends D4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4893qf f31554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f31555b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    B4.j f31557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private B4.o f31558e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BinderC4515nf f31556c = new BinderC4515nf();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f31559f = new AtomicLong();

    public C4389mf(InterfaceC4893qf interfaceC4893qf, String str) {
        this.f31554a = interfaceC4893qf;
        this.f31555b = new AtomicReference(str);
    }

    @Override // D4.a
    public final B4.u a() {
        InterfaceC0582a1 interfaceC0582a1Zzg;
        try {
            interfaceC0582a1Zzg = this.f31554a.zzg();
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
            interfaceC0582a1Zzg = null;
        }
        return B4.u.f(interfaceC0582a1Zzg);
    }

    @Override // D4.a
    public final void c(B4.j jVar) {
        this.f31557d = jVar;
        this.f31556c.y6(jVar);
    }

    @Override // D4.a
    public final void d(boolean z9) {
        try {
            this.f31554a.U(z9);
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // D4.a
    public final void e(B4.o oVar) {
        this.f31558e = oVar;
        try {
            this.f31554a.b3(new H4.R1(oVar));
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // D4.a
    public final void f(Activity activity) {
        try {
            this.f31554a.c6(com.google.android.gms.dynamic.b.N0(activity), this.f31556c);
        } catch (RemoteException e10) {
            L4.p.i("#007 Could not call remote method.", e10);
        }
    }
}
