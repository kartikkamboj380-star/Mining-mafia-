package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4436n10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f31642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31645d;

    public C4436n10(byte[] bArr, int i10) {
        this.f31642a = bArr;
        this.f31645d = i10;
    }

    private final void q() {
        int i10;
        int i11 = this.f31643b;
        boolean z9 = false;
        if (i11 >= 0 && (i11 < (i10 = this.f31645d) || (i11 == i10 && this.f31644c == 0))) {
            z9 = true;
        }
        AbstractC2418Ss0.i(z9);
    }

    public final void a(P10 p10) {
        b(p10.H(), p10.D());
        f(p10.F() * 8);
    }

    public final void b(byte[] bArr, int i10) {
        this.f31642a = bArr;
        this.f31643b = 0;
        this.f31644c = 0;
        this.f31645d = i10;
    }

    public final int c() {
        return ((this.f31645d - this.f31643b) * 8) - this.f31644c;
    }

    public final int d() {
        return (this.f31643b * 8) + this.f31644c;
    }

    public final int e() {
        AbstractC2418Ss0.i(this.f31644c == 0);
        return this.f31643b;
    }

    public final void f(int i10) {
        int i11 = i10 / 8;
        this.f31643b = i11;
        this.f31644c = i10 - (i11 * 8);
        q();
    }

    public final void g() {
        int i10 = this.f31644c + 1;
        this.f31644c = i10;
        if (i10 == 8) {
            this.f31644c = 0;
            this.f31643b++;
        }
        q();
    }

    public final void h(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f31643b + i11;
        this.f31643b = i12;
        int i13 = this.f31644c + (i10 - (i11 * 8));
        this.f31644c = i13;
        if (i13 > 7) {
            this.f31643b = i12 + 1;
            this.f31644c = i13 - 8;
        }
        q();
    }

    public final boolean i() {
        int i10 = this.f31642a[this.f31643b] & (IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT >> this.f31644c);
        g();
        return i10 != 0;
    }

    public final int j(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f31644c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f31644c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f31644c = i13;
            byte[] bArr = this.f31642a;
            int i14 = this.f31643b;
            this.f31643b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f31642a;
        int i15 = this.f31643b;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.f31644c = 0;
            this.f31643b = i15 + 1;
        }
        int i18 = ((-1) >>> i17) & i16;
        q();
        return i18;
    }

    public final long k(int i10) {
        if (i10 <= 32) {
            int iJ = j(i10);
            String str = AbstractC4634ob0.f32117a;
            return 4294967295L & ((long) iJ);
        }
        int iJ2 = j(i10 - 32);
        int iJ3 = j(32);
        String str2 = AbstractC4634ob0.f32117a;
        return (4294967295L & ((long) iJ3)) | ((((long) iJ2) & 4294967295L) << 32);
    }

    public final void l(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = 0;
        while (true) {
            i12 = i11 >> 3;
            if (i13 >= i12) {
                break;
            }
            byte[] bArr2 = this.f31642a;
            int i14 = this.f31643b;
            int i15 = i14 + 1;
            this.f31643b = i15;
            byte b10 = bArr2[i14];
            int i16 = this.f31644c;
            byte b11 = (byte) (b10 << i16);
            bArr[i13] = b11;
            bArr[i13] = (byte) (((bArr2[i15] & 255) >> (8 - i16)) | b11);
            i13++;
        }
        int i17 = i11 & 7;
        if (i17 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i17));
        bArr[i12] = b12;
        int i18 = this.f31644c;
        if (i18 + i17 > 8) {
            byte[] bArr3 = this.f31642a;
            int i19 = this.f31643b;
            this.f31643b = i19 + 1;
            b12 = (byte) (b12 | ((bArr3[i19] & 255) << i18));
            bArr[i12] = b12;
            i18 -= 8;
        }
        int i20 = i18 + i17;
        this.f31644c = i20;
        byte[] bArr4 = this.f31642a;
        int i21 = this.f31643b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i17))) | b12);
        if (i20 == 8) {
            this.f31644c = 0;
            this.f31643b = i21 + 1;
        }
        q();
    }

    public final void m() {
        if (this.f31644c == 0) {
            return;
        }
        this.f31644c = 0;
        this.f31643b++;
        q();
    }

    public final void n(byte[] bArr, int i10, int i11) {
        AbstractC2418Ss0.i(this.f31644c == 0);
        System.arraycopy(this.f31642a, this.f31643b, bArr, 0, i11);
        this.f31643b += i11;
        q();
    }

    public final void o(int i10) {
        AbstractC2418Ss0.i(this.f31644c == 0);
        this.f31643b += i10;
        q();
    }

    public final void p(int i10, int i11) {
        int iMin = Math.min(8 - this.f31644c, 14);
        int i12 = this.f31644c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f31642a;
        int i14 = this.f31643b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = 14 - iMin;
        int i16 = i10 & 16383;
        bArr[i14] = (byte) (b10 | ((i16 >>> i15) << i13));
        int i17 = i14 + 1;
        while (i15 > 8) {
            i15 -= 8;
            this.f31642a[i17] = (byte) (i16 >>> i15);
            i17++;
        }
        int i18 = 8 - i15;
        byte[] bArr2 = this.f31642a;
        byte b11 = (byte) (bArr2[i17] & ((1 << i18) - 1));
        bArr2[i17] = b11;
        bArr2[i17] = (byte) (((i16 & ((1 << i15) - 1)) << i18) | b11);
        h(14);
        q();
    }

    public C4436n10() {
        this.f31642a = AbstractC4634ob0.f32118b;
    }
}
