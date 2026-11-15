package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1981Kh0 extends AbstractC1825Hh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f20256e;

    /* synthetic */ C1981Kh0(String str, boolean z9, boolean z10, boolean z11, long j10, boolean z12, long j11, byte[] bArr) {
        this.f20252a = str;
        this.f20253b = z9;
        this.f20254c = z10;
        this.f20255d = j10;
        this.f20256e = j11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1825Hh0
    public final String a() {
        return this.f20252a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1825Hh0
    public final boolean b() {
        return this.f20253b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1825Hh0
    public final boolean c() {
        return this.f20254c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1825Hh0
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1825Hh0
    public final long e() {
        return this.f20255d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1825Hh0) {
            AbstractC1825Hh0 abstractC1825Hh0 = (AbstractC1825Hh0) obj;
            if (this.f20252a.equals(abstractC1825Hh0.a()) && this.f20253b == abstractC1825Hh0.b() && this.f20254c == abstractC1825Hh0.c()) {
                abstractC1825Hh0.d();
                if (this.f20255d == abstractC1825Hh0.e()) {
                    abstractC1825Hh0.f();
                    if (this.f20256e == abstractC1825Hh0.g()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1825Hh0
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1825Hh0
    public final long g() {
        return this.f20256e;
    }

    public final int hashCode() {
        return ((((((((((((this.f20252a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f20253b ? 1237 : 1231)) * 1000003) ^ (true != this.f20254c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f20255d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f20256e);
    }

    public final String toString() {
        boolean z9 = this.f20253b;
        int length = String.valueOf(z9).length();
        boolean z10 = this.f20254c;
        int length2 = String.valueOf(z10).length();
        long j10 = this.f20255d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f20256e;
        int length4 = String.valueOf(j11).length();
        String str = this.f20252a;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z9);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z10);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j10);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j11);
        sb.append("}");
        return sb.toString();
    }
}
