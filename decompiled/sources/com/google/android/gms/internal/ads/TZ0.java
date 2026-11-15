package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class TZ0 extends Y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4686p01 f23559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F1 f23560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f23561d;

    TZ0(C4686p01 c4686p01) {
        super(c4686p01);
        this.f23559b = c4686p01;
        this.f23560c = new F1();
        this.f23561d = new AtomicReference(SZ0.PASS_THROUGH);
    }

    private final InterfaceC5570w2 i() {
        return this.f23561d.get() == SZ0.DISCARDING ? this.f23560c : this.f23559b;
    }

    final boolean a() {
        return this.f23561d.get() == SZ0.PASS_THROUGH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void b(P10 p10, int i10) {
        i().b(p10, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void c(long j10, int i10, int i11, int i12, C5444v2 c5444v2) {
        i().c(j10, i10, i11, i12, c5444v2);
        AtomicReference atomicReference = this.f23561d;
        if (atomicReference.get() == SZ0.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.f23559b.v(false);
            atomicReference.set(SZ0.DISCARDING);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final int d(PQ0 pq0, int i10, boolean z9) {
        return i().d(pq0, i10, z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void e(P10 p10, int i10, int i11) {
        i().e(p10, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final int h(PQ0 pq0, int i10, boolean z9, int i11) {
        return i().h(pq0, i10, z9, 0);
    }
}
