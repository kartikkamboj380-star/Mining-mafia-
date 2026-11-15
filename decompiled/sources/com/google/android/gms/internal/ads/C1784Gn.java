package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1784Gn extends AbstractC3162cu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19133c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2044Ln f19134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19135e;

    public C1784Gn(C2044Ln c2044Ln) {
        this.f19134d = c2044Ln;
    }

    public final void g() {
        AbstractC0786o0.k("release: Trying to acquire lock");
        synchronized (this.f19133c) {
            try {
                AbstractC0786o0.k("release: Lock acquired");
                if (this.f19135e) {
                    AbstractC0786o0.k("release: Lock already released");
                    return;
                }
                this.f19135e = true;
                a(new C1628Dn(this), new C2731Yt());
                a(new C1680En(this), new C1732Fn(this));
                AbstractC0786o0.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ C2044Ln h() {
        return this.f19134d;
    }
}
