package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1999Kq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f20284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20287d = 0;

    public C1999Kq0(byte[] bArr, int i10, int i11) {
        this.f20284a = bArr;
        this.f20286c = i10;
        this.f20285b = i11;
        k();
    }

    private final int i() {
        int i10 = 0;
        while (!e()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? f(i10) : 0);
    }

    private final boolean j(int i10) {
        if (i10 < 2 || i10 >= this.f20285b) {
            return false;
        }
        byte[] bArr = this.f20284a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }

    private final void k() {
        int i10;
        int i11 = this.f20286c;
        boolean z9 = false;
        if (i11 >= 0 && (i11 < (i10 = this.f20285b) || (i11 == i10 && this.f20287d == 0))) {
            z9 = true;
        }
        AbstractC2418Ss0.i(z9);
    }

    public final void a() {
        int i10 = this.f20287d + 1;
        this.f20287d = i10;
        if (i10 == 8) {
            this.f20287d = 0;
            int i11 = this.f20286c;
            this.f20286c = i11 + (true == j(i11 + 1) ? 2 : 1);
        }
        k();
    }

    public final void b(int i10) {
        int i11 = this.f20286c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f20286c = i13;
        int i14 = this.f20287d + (i10 - (i12 * 8));
        this.f20287d = i14;
        if (i14 > 7) {
            this.f20286c = i13 + 1;
            this.f20287d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f20286c) {
                k();
                return;
            } else if (j(i11)) {
                this.f20286c++;
                i11 += 2;
            }
        }
    }

    public final void c() {
        int i10 = this.f20287d;
        if (i10 > 0) {
            b(8 - i10);
        }
    }

    public final boolean d(int i10) {
        int i11 = this.f20286c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f20287d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f20285b) {
                break;
            }
            if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f20285b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final boolean e() {
        int i10 = this.f20284a[this.f20286c] & (IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT >> this.f20287d);
        a();
        return i10 != 0;
    }

    public final int f(int i10) {
        int i11;
        this.f20287d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f20287d;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f20287d = i14;
            byte[] bArr = this.f20284a;
            int i15 = this.f20286c;
            i12 |= (bArr[i15] & 255) << i14;
            if (true != j(i15 + 1)) {
                i13 = 1;
            }
            this.f20286c = i15 + i13;
        }
        byte[] bArr2 = this.f20284a;
        int i16 = this.f20286c;
        int i17 = i12 | ((bArr2[i16] & 255) >> (8 - i11));
        int i18 = 32 - i10;
        if (i11 == 8) {
            this.f20287d = 0;
            this.f20286c = i16 + (true != j(i16 + 1) ? 1 : 2);
        }
        int i19 = ((-1) >>> i18) & i17;
        k();
        return i19;
    }

    public final int g() {
        return i();
    }

    public final int h() {
        int i10 = i();
        return (i10 % 2 == 0 ? -1 : 1) * ((i10 + 1) / 2);
    }
}
