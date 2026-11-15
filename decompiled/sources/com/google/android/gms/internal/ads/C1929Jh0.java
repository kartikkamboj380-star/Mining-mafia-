package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1929Jh0 extends AbstractC1773Gh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f19974f;

    C1929Jh0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1773Gh0
    public final AbstractC1773Gh0 a(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.f19969a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1773Gh0
    public final AbstractC1773Gh0 b(boolean z9) {
        this.f19970b = z9;
        this.f19974f = (byte) (this.f19974f | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1773Gh0
    public final AbstractC1773Gh0 c(boolean z9) {
        this.f19971c = true;
        this.f19974f = (byte) (this.f19974f | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1773Gh0
    public final AbstractC1773Gh0 d(boolean z9) {
        this.f19974f = (byte) (this.f19974f | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1773Gh0
    public final AbstractC1773Gh0 e(long j10) {
        this.f19972d = 100L;
        this.f19974f = (byte) (this.f19974f | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1773Gh0
    public final AbstractC1773Gh0 f(boolean z9) {
        this.f19974f = (byte) (this.f19974f | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1773Gh0
    public final AbstractC1773Gh0 g(long j10) {
        this.f19973e = 300L;
        this.f19974f = (byte) (this.f19974f | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1773Gh0
    public final AbstractC1825Hh0 h() {
        String str;
        if (this.f19974f == 63 && (str = this.f19969a) != null) {
            return new C1981Kh0(str, this.f19970b, this.f19971c, false, this.f19972d, false, this.f19973e, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19969a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f19974f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f19974f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f19974f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f19974f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f19974f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f19974f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
