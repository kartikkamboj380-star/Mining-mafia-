package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3302e01 extends AbstractC4000jZ0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3302e01(C3680h01 c3680h01, AbstractC5270tf abstractC5270tf) {
        super(abstractC5270tf);
        Objects.requireNonNull(c3680h01);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000jZ0, com.google.android.gms.internal.ads.AbstractC5270tf
    public final C2337Re b(int i10, C2337Re c2337Re, long j10) {
        this.f30485b.b(i10, c2337Re, j10);
        c2337Re.f22876j = true;
        return c2337Re;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000jZ0, com.google.android.gms.internal.ads.AbstractC5270tf
    public final C4891qe d(int i10, C4891qe c4891qe, boolean z9) {
        this.f30485b.d(i10, c4891qe, z9);
        c4891qe.f32700f = true;
        return c4891qe;
    }
}
