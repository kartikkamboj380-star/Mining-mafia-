package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4189l4 implements InterfaceC4940r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31171c;

    public C4189l4(int i10, long j10, int i11) {
        this.f31169a = i10;
        this.f31170b = j10;
        this.f31171c = i11;
    }

    public final String toString() {
        String strT = AbstractC4634ob0.T(this.f31169a);
        int length = strT.length();
        long j10 = this.f31170b;
        int length2 = String.valueOf(j10).length();
        int i10 = this.f31171c;
        StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i10).length() + 1);
        sb.append("AtomSizeTooSmall{type=");
        sb.append(strT);
        sb.append(", size=");
        sb.append(j10);
        sb.append(", minHeaderSize=");
        sb.append(i10);
        sb.append("}");
        return sb.toString();
    }
}
