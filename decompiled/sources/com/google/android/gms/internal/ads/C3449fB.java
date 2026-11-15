package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3449fB implements EA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short[] f28204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short[] f28205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short[] f28206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short[] f28207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ GB f28211h;

    C3449fB(GB gb) {
        Objects.requireNonNull(gb);
        this.f28211h = gb;
        this.f28204a = new short[gb.h()];
        this.f28205b = new short[gb.h() * gb.g()];
        this.f28206c = new short[gb.h() * gb.g()];
        this.f28207d = new short[gb.h() * gb.g()];
    }

    private final int m(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = 255;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                int iG = this.f28211h.g() * i10;
                iAbs += Math.abs(sArr[iG + i17] - sArr[(iG + i11) + i17]);
            }
            int i18 = iAbs * i15;
            int i19 = i13 * i11;
            if (i18 < i19) {
                i13 = iAbs;
            }
            if (i18 < i19) {
                i15 = i11;
            }
            int i20 = iAbs * i14;
            int i21 = i16 * i11;
            if (i20 > i21) {
                i16 = iAbs;
            }
            if (i20 > i21) {
                i14 = i11;
            }
            i11++;
        }
        this.f28208e = i13 / i15;
        this.f28209f = i16 / i14;
        return i15;
    }

    private final short[] n(short[] sArr, int i10, int i11) {
        GB gb = this.f28211h;
        int length = sArr.length / gb.g();
        return i10 + i11 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i11) * gb.g());
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void E(int i10) {
        this.f28206c = n(this.f28206c, this.f28211h.j(), i10);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void V(int i10) {
        this.f28205b = n(this.f28205b, this.f28211h.i(), i10);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final /* synthetic */ Object a() {
        return this.f28206c;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void b(int i10, int i11) {
        int iG;
        short[] sArr = this.f28205b;
        int i12 = 0;
        while (true) {
            GB gb = this.f28211h;
            if (i12 >= gb.h() / i11) {
                return;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                iG = gb.g() * i11;
                if (i13 < iG) {
                    i14 += sArr[(gb.g() * i10) + (iG * i12) + i13];
                    i13++;
                }
            }
            this.f28204a[i12] = (short) (i14 / iG);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final int c(int i10, int i11, int i12) {
        return m(this.f28204a, 0, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final int d(int i10, int i11, int i12) {
        return m(this.f28205b, i10, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void e(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            GB gb = this.f28211h;
            if (i11 >= gb.g()) {
                return;
            }
            short[] sArr = this.f28206c;
            int iG = gb.g();
            int iJ = gb.j();
            short[] sArr2 = this.f28207d;
            int iG2 = (gb.g() * i10) + i11;
            short s10 = sArr2[iG2];
            short s11 = sArr2[iG2 + gb.g()];
            long jM = ((long) gb.m()) * j10;
            long jL = ((long) gb.l()) * j11;
            long jL2 = ((long) (gb.l() + 1)) * j11;
            int i12 = i11;
            long j12 = jL2 - jL;
            long j13 = jL2 - jM;
            sArr[(iJ * iG) + i12] = (short) (((j13 * ((long) s10)) + ((j12 - j13) * ((long) s11))) / j12);
            i11 = i12 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void f(int i10) {
        this.f28207d = n(this.f28207d, this.f28211h.k(), i10);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void g(ByteBuffer byteBuffer, int i10) {
        GB gb = this.f28211h;
        byteBuffer.asShortBuffer().put(this.f28206c, 0, gb.g() * i10);
        byteBuffer.position(byteBuffer.position() + ((i10 + i10) * gb.g()));
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final /* synthetic */ Object h() {
        return this.f28207d;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void i(ByteBuffer byteBuffer, int i10) {
        GB gb = this.f28211h;
        byteBuffer.asShortBuffer().get(this.f28205b, gb.i() * gb.g(), i10 / 2);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void j(int i10, int i11, int i12, int i13, int i14) {
        short[] sArr = this.f28206c;
        short[] sArr2 = this.f28205b;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr2[i16] * (i10 - i19)) + (sArr2[i17] * i19)) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void k(int i10, int i11) {
        for (int i12 = 0; i12 < this.f28211h.g() * i11; i12++) {
            this.f28205b[i10 + i12] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final /* synthetic */ Object l() {
        return this.f28205b;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final boolean zzc() {
        int i10 = this.f28208e;
        return i10 != 0 && this.f28211h.n() != 0 && this.f28209f <= i10 * 3 && i10 + i10 > this.f28210g * 3;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void zzg() {
        this.f28210g = 0;
        this.f28208e = 0;
        this.f28209f = 0;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void zzi() {
        this.f28210g = this.f28208e;
    }
}
