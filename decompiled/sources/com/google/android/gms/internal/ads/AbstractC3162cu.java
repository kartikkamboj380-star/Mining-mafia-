package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3162cu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2575Vt f27239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f27240b;

    public AbstractC3162cu() {
        C2575Vt c2575Vt = new C2575Vt();
        this.f27239a = c2575Vt;
        this.f27240b = new AtomicInteger(0);
        AbstractC5685wx0.r(c2575Vt, new C2911au(this), AbstractC2315Qt.f22479g);
    }

    public final void a(InterfaceC2783Zt interfaceC2783Zt, InterfaceC2679Xt interfaceC2679Xt) {
        AbstractC5685wx0.r(this.f27239a, new C3037bu(this, interfaceC2783Zt, interfaceC2679Xt), AbstractC2315Qt.f22479g);
    }

    public final void b(Object obj) {
        this.f27239a.b(obj);
    }

    public final void c() {
        this.f27239a.c(new Exception());
    }

    public final void d(Throwable th, String str) {
        this.f27239a.c(th);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29608K8)).booleanValue()) {
            G4.t.l().k(th, str);
        }
    }

    public final int e() {
        return this.f27240b.get();
    }

    final /* synthetic */ AtomicInteger f() {
        return this.f27240b;
    }
}
