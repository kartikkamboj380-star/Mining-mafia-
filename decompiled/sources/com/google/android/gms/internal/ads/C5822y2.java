package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5822y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f35228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35231d;

    public C5822y2(byte[] bArr) {
        this.f35228a = bArr;
        this.f35229b = bArr.length;
    }

    public final boolean a() {
        int i10 = (this.f35228a[this.f35230c] & 255) >> this.f35231d;
        c(1);
        return 1 == (i10 & 1);
    }

    public final int b(int i10) {
        int i11 = this.f35230c;
        int i12 = 8 - this.f35231d;
        int i13 = i11 + 1;
        byte[] bArr = this.f35228a;
        int iMin = Math.min(i10, i12);
        int i14 = ((bArr[i11] & 255) >> this.f35231d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i14 |= (bArr[i13] & 255) << iMin;
            iMin += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i10));
        c(i10);
        return i15;
    }

    public final void c(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f35230c + i12;
        this.f35230c = i13;
        int i14 = this.f35231d + (i10 - (i12 * 8));
        this.f35231d = i14;
        if (i14 > 7) {
            i13++;
            this.f35230c = i13;
            i14 -= 8;
            this.f35231d = i14;
        }
        boolean z9 = false;
        if (i13 >= 0 && (i13 < (i11 = this.f35229b) || (i13 == i11 && i14 == 0))) {
            z9 = true;
        }
        AbstractC2418Ss0.i(z9);
    }

    public final int d() {
        return (this.f35230c * 8) + this.f35231d;
    }
}
