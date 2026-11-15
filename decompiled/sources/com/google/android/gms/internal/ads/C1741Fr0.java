package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1741Fr0 extends AbstractC3913is0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18852b;

    C1741Fr0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3913is0
    public final AbstractC3913is0 a(String str) {
        this.f18851a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3913is0
    public final AbstractC3913is0 b(String str) {
        this.f18852b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3913is0
    public final AbstractC4038js0 c() {
        return new C1793Gr0(this.f18851a, this.f18852b, null);
    }
}
