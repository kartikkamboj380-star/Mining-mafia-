package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4526nk0 extends AbstractC1907Iw0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f31880h;

    C4526nk0(Object obj, Runnable runnable) {
        this.f31880h = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    public final boolean k(Object obj) {
        return super.k(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    public final boolean l(Throwable th) {
        return super.l(th);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final void m() {
        this.f31880h = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    public final String n() {
        Object obj = this.f31880h;
        return obj == null ? "" : obj.toString();
    }
}
