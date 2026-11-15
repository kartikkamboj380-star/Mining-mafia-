package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.in0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3903in0 implements InterfaceCallableC1629Dn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1966Ka f30065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4792pr0 f30066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30067d;

    C3903in0(C1966Ka c1966Ka, Map map, C1571Ck0 c1571Ck0, C5043rr0 c5043rr0) {
        this.f30064a = map;
        this.f30065b = c1966Ka;
        this.f30066c = c5043rr0.a(112);
        this.f30067d = c1571Ck0.r0();
    }

    public final Void a() {
        C4255lb c4255lb;
        try {
            try {
                this.f30066c.a();
                com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) this.f30064a.get("gs");
                if (pVar != null && (c4255lb = (C4255lb) pVar.get(this.f30067d, TimeUnit.MILLISECONDS)) != null) {
                    C1966Ka c1966Ka = this.f30065b;
                    synchronized (c1966Ka) {
                        c1966Ka.j0(c4255lb.e1());
                        c1966Ka.P(c4255lb.b1());
                    }
                }
            } catch (Throwable th) {
                this.f30066c.c();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e10) {
            this.f30066c.b(e10);
        }
        this.f30066c.c();
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return null;
    }
}
