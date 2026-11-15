package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class LD implements J4.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HG f20415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f20416b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f20417c = new AtomicBoolean(false);

    public LD(HG hg) {
        this.f20415a = hg;
    }

    private final void b() {
        AtomicBoolean atomicBoolean = this.f20417c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f20415a.zza();
    }

    @Override // J4.B
    public final void B2() {
        b();
    }

    @Override // J4.B
    public final void F4() {
    }

    @Override // J4.B
    public final void H1() {
    }

    @Override // J4.B
    public final void N0() {
    }

    @Override // J4.B
    public final void S3(int i10) {
        this.f20416b.set(true);
        b();
    }

    @Override // J4.B
    public final void Z1() {
    }

    @Override // J4.B
    public final void Z2() {
    }

    @Override // J4.B
    public final void Z4() {
    }

    public final boolean a() {
        return this.f20416b.get();
    }

    @Override // J4.B
    public final void b4() {
    }

    @Override // J4.B
    public final void c() {
        this.f20415a.zzc();
    }

    @Override // J4.B
    public final void t4() {
    }
}
