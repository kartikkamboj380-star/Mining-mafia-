package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
abstract class B3 extends A3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37401b;

    B3(X2 x10) {
        super(x10);
        this.f37374a.k();
    }

    protected abstract boolean i();

    protected void j() {
    }

    final boolean k() {
        return this.f37401b;
    }

    protected final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f37401b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        this.f37374a.l();
        this.f37401b = true;
    }

    public final void n() {
        if (this.f37401b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f37374a.l();
        this.f37401b = true;
    }
}
