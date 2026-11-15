package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class L3 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20354e;

    public L3(long j10, long j11, long j12, long j13, long j14) {
        this.f20350a = j10;
        this.f20351b = j11;
        this.f20352c = j12;
        this.f20353d = j13;
        this.f20354e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            L3 l10 = (L3) obj;
            if (this.f20350a == l10.f20350a && this.f20351b == l10.f20351b && this.f20352c == l10.f20352c && this.f20353d == l10.f20353d && this.f20354e == l10.f20354e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Long.hashCode(this.f20350a) + 527) * 31) + Long.hashCode(this.f20351b)) * 31) + Long.hashCode(this.f20352c)) * 31) + Long.hashCode(this.f20353d)) * 31) + Long.hashCode(this.f20354e);
    }

    public final String toString() {
        long j10 = this.f20350a;
        int length = String.valueOf(j10).length();
        long j11 = this.f20351b;
        int length2 = String.valueOf(j11).length();
        long j12 = this.f20352c;
        int length3 = String.valueOf(j12).length();
        long j13 = this.f20353d;
        int length4 = String.valueOf(j13).length();
        long j14 = this.f20354e;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j14).length());
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j10);
        sb.append(", photoSize=");
        sb.append(j11);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j12);
        sb.append(", videoStartPosition=");
        sb.append(j13);
        sb.append(", videoSize=");
        sb.append(j14);
        return sb.toString();
    }
}
