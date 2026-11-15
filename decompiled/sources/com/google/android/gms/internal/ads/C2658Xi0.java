package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2658Xi0 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25367c;

    public C2658Xi0(long j10, long j11, long j12) {
        this.f25365a = j10;
        this.f25366b = j11;
        this.f25367c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2658Xi0)) {
            return false;
        }
        C2658Xi0 c2658Xi0 = (C2658Xi0) obj;
        return this.f25365a == c2658Xi0.f25365a && this.f25366b == c2658Xi0.f25366b && this.f25367c == c2658Xi0.f25367c;
    }

    public final int hashCode() {
        return ((((Long.hashCode(this.f25365a) + 527) * 31) + Long.hashCode(this.f25366b)) * 31) + Long.hashCode(this.f25367c);
    }

    public final String toString() {
        long j10 = this.f25365a;
        int length = String.valueOf(j10).length();
        long j11 = this.f25366b;
        int length2 = String.valueOf(j11).length();
        long j12 = this.f25367c;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j12).length());
        sb.append("Mp4Timestamp: creation time=");
        sb.append(j10);
        sb.append(", modification time=");
        sb.append(j11);
        sb.append(", timescale=");
        sb.append(j12);
        return sb.toString();
    }
}
