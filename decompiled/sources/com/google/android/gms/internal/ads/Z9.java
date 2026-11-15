package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26123a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26124b = 0;

    public Z9(int i10) {
    }

    public final int a(long j10) throws X9 {
        long j11;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + (((((~i10) & i11) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j12 = jArr[0];
        long j13 = jArr[1];
        long j14 = jArr[2];
        long j15 = jArr[3];
        long j16 = jArr[4];
        long j17 = jArr[5];
        long j18 = jArr[6];
        long j19 = jArr[7];
        long j20 = j18 + (((((~j12) & j13) | j14) + ((j12 & j15) | j16)) - j17);
        long j21 = j19 % 438792350;
        if (j10 >= 0) {
            j11 = ((long) (this.f26124b + (i18 ^ i19))) - j10;
        } else {
            j11 = (j20 ^ j21) + (-j10);
        }
        if (j11 < 0 || j11 >= this.f26124b) {
            throw new X9();
        }
        return (int) j11;
    }

    public final void b(C4001ja c4001ja) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = this.f26124b;
        if (i19 >= ((i17 % 937558955) ^ i18)) {
            throw new Y9();
        }
        ArrayList arrayList = this.f26123a;
        if (i19 == arrayList.size()) {
            arrayList.add(c4001ja);
        } else {
            arrayList.set(this.f26124b, c4001ja);
        }
        this.f26124b++;
    }

    public final C4001ja c() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 459541652;
        int i20 = this.f26124b;
        if (i20 <= 0) {
            throw new X9();
        }
        int i21 = i19 ^ i18;
        ArrayList arrayList = this.f26123a;
        C4001ja c4001ja = (C4001ja) arrayList.get(i20 + i21);
        arrayList.set(this.f26124b + i21, null);
        this.f26124b += i21;
        return c4001ja;
    }

    public final C4001ja d(long j10) {
        return (C4001ja) this.f26123a.get(a(j10));
    }

    public final void e(long j10, C4001ja c4001ja) {
        this.f26123a.set(a(j10), c4001ja);
    }
}
