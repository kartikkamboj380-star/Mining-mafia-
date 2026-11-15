package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4437n2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4437n2 f31650c = new C4437n2(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31652b;

    public C4437n2(long j10, long j11) {
        this.f31651a = j10;
        this.f31652b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4437n2.class == obj.getClass()) {
            C4437n2 c4437n2 = (C4437n2) obj;
            if (this.f31651a == c4437n2.f31651a && this.f31652b == c4437n2.f31652b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f31651a) * 31) + ((int) this.f31652b);
    }

    public final String toString() {
        long j10 = this.f31651a;
        int length = String.valueOf(j10).length();
        long j11 = this.f31652b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j11).length() + 1);
        sb.append("[timeUs=");
        sb.append(j10);
        sb.append(", position=");
        sb.append(j11);
        sb.append("]");
        return sb.toString();
    }
}
