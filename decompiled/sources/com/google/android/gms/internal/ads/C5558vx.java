package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5558vx {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C5558vx f34193e = new C5558vx(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34197d;

    public C5558vx(int i10, int i11, int i12) {
        this.f34194a = i10;
        this.f34195b = i11;
        this.f34196c = i12;
        this.f34197d = AbstractC4634ob0.a(i12) ? AbstractC4634ob0.d(i12) * i11 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5558vx)) {
            return false;
        }
        C5558vx c5558vx = (C5558vx) obj;
        return this.f34194a == c5558vx.f34194a && this.f34195b == c5558vx.f34195b && this.f34196c == c5558vx.f34196c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f34194a), Integer.valueOf(this.f34195b), Integer.valueOf(this.f34196c));
    }

    public final String toString() {
        int i10 = this.f34194a;
        int length = String.valueOf(i10).length();
        int i11 = this.f34195b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f34196c;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i12).length() + 1);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i10);
        sb.append(", channelCount=");
        sb.append(i11);
        sb.append(", encoding=");
        sb.append(i12);
        sb.append("]");
        return sb.toString();
    }
}
