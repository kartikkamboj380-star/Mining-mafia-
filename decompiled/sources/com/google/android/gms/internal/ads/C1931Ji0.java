package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ji0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1931Ji0 extends AbstractC2242Pi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f19976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19978d;

    C1931Ji0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2242Pi0
    public final AbstractC2242Pi0 a(boolean z9) {
        this.f19976b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2242Pi0
    public final AbstractC2294Qi0 b() {
        if (this.f19976b == 1 && this.f19975a != null && this.f19977c != 0 && this.f19978d != 0) {
            return new C1983Ki0(this.f19975a, false, this.f19977c, null, this.f19978d, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19975a == null) {
            sb.append(" fileOwner");
        }
        if (this.f19976b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f19977c == 0) {
            sb.append(" fileChecks");
        }
        if (this.f19978d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2242Pi0
    final AbstractC2242Pi0 c(int i10) {
        this.f19977c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2242Pi0
    public final AbstractC2242Pi0 d(int i10) {
        this.f19978d = 1;
        return this;
    }

    public final AbstractC2242Pi0 e(String str) {
        this.f19975a = "";
        return this;
    }
}
