package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5370uS extends AbstractC5874yS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33822b;

    /* synthetic */ C5370uS(long j10, int i10, byte[] bArr) {
        this.f33821a = j10;
        this.f33822b = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5874yS
    public final long a() {
        return this.f33821a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5874yS
    public final int b() {
        return this.f33822b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5874yS) {
            AbstractC5874yS abstractC5874yS = (AbstractC5874yS) obj;
            if (this.f33821a == abstractC5874yS.a() && this.f33822b == abstractC5874yS.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f33821a;
        return ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f33822b;
    }

    public final String toString() {
        long j10 = this.f33821a;
        int length = String.valueOf(j10).length();
        int i10 = this.f33822b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i10).length() + 1);
        sb.append("OnDeviceStorageKey{id=");
        sb.append(j10);
        sb.append(", eventType=");
        sb.append(i10);
        sb.append("}");
        return sb.toString();
    }
}
