package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5244tS extends AbstractC5748xS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f33413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f33415c;

    C5244tS() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5748xS
    public final AbstractC5748xS a(long j10) {
        this.f33413a = j10;
        this.f33415c = (byte) (this.f33415c | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5748xS
    public final AbstractC5748xS b(int i10) {
        this.f33414b = i10;
        this.f33415c = (byte) (this.f33415c | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5748xS
    public final AbstractC5874yS c() {
        if (this.f33415c == 3) {
            return new C5370uS(this.f33413a, this.f33414b, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f33415c & 1) == 0) {
            sb.append(" id");
        }
        if ((this.f33415c & 2) == 0) {
            sb.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
