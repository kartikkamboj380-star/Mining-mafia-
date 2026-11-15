package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4882qZ0 extends AbstractC5270tf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4819q4 f32669b;

    public C4882qZ0(C4819q4 c4819q4) {
        this.f32669b = c4819q4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final C2337Re b(int i10, C2337Re c2337Re, long j10) {
        c2337Re.a(C2337Re.f22865o, this.f32669b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        c2337Re.f22876j = true;
        return c2337Re;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final C4891qe d(int i10, C4891qe c4891qe, boolean z9) {
        c4891qe.a(z9 ? 0 : null, z9 ? C4756pZ0.f32425e : null, 0, -9223372036854775807L, 0L, C1480Ar.f17414e, true);
        return c4891qe;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int e(Object obj) {
        return obj == C4756pZ0.f32425e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final Object f(int i10) {
        return C4756pZ0.f32425e;
    }
}
