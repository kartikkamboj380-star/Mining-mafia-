package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3196dA implements EA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f27345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f27346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f27347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f27348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f27349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f27350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f27351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ GB f27352h;

    C3196dA(GB gb) {
        Objects.requireNonNull(gb);
        this.f27352h = gb;
        this.f27345a = new float[gb.h()];
        this.f27346b = new float[gb.h() * gb.g()];
        this.f27347c = new float[gb.h() * gb.g()];
        this.f27348d = new float[gb.h() * gb.g()];
    }

    private final int m(float[] fArr, int i10, int i11, int i12) {
        int i13 = 255;
        int i14 = 0;
        double d10 = 0.0d;
        double d11 = 1.0d;
        int i15 = i11;
        while (true) {
            double d12 = i13;
            double d13 = i14;
            if (i15 > i12) {
                this.f27349e = d11 / d13;
                this.f27350f = d10 / d12;
                return i14;
            }
            int i16 = 0;
            double dAbs = 0.0d;
            while (i16 < i15) {
                int iG = this.f27352h.g() * i10;
                dAbs += (double) Math.abs(fArr[iG + i16] - fArr[(iG + i15) + i16]);
                i16++;
                i13 = i13;
            }
            int i17 = i13;
            double d14 = d13 * dAbs;
            double d15 = i15;
            double d16 = d11 * d15;
            if (d14 < d16) {
                d11 = dAbs;
            }
            if (d14 < d16) {
                i14 = i15;
            }
            double d17 = d12 * dAbs;
            double d18 = d15 * d10;
            if (d17 > d18) {
                d10 = dAbs;
            }
            i13 = d17 > d18 ? i15 : i17;
            i15++;
        }
    }

    private final float[] n(float[] fArr, int i10, int i11) {
        GB gb = this.f27352h;
        int length = fArr.length / gb.g();
        return i10 + i11 <= length ? fArr : Arrays.copyOf(fArr, (((length * 3) / 2) + i11) * gb.g());
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void E(int i10) {
        this.f27347c = n(this.f27347c, this.f27352h.j(), i10);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void V(int i10) {
        this.f27346b = n(this.f27346b, this.f27352h.i(), i10);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final /* synthetic */ Object a() {
        return this.f27347c;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void b(int i10, int i11) {
        int iG;
        int i12 = 0;
        while (true) {
            GB gb = this.f27352h;
            if (i12 >= gb.h() / i11) {
                return;
            }
            double d10 = 0.0d;
            int i13 = 0;
            while (true) {
                iG = gb.g() * i11;
                if (i13 < iG) {
                    d10 += (double) this.f27346b[(gb.g() * i10) + (iG * i12) + i13];
                    i13++;
                }
            }
            this.f27345a[i12] = (float) (d10 / ((double) iG));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final int c(int i10, int i11, int i12) {
        return m(this.f27345a, 0, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final int d(int i10, int i11, int i12) {
        return m(this.f27346b, i10, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void e(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            GB gb = this.f27352h;
            if (i11 >= gb.g()) {
                return;
            }
            float[] fArr = this.f27347c;
            int iG = gb.g();
            int iJ = gb.j();
            float[] fArr2 = this.f27348d;
            int iG2 = (gb.g() * i10) + i11;
            float f10 = fArr2[iG2];
            float f11 = fArr2[iG2 + gb.g()];
            long jM = ((long) gb.m()) * j10;
            long jL = ((long) gb.l()) * j11;
            long jL2 = ((long) (gb.l() + 1)) * j11;
            long j12 = jL2 - jM;
            long j13 = jL2 - jL;
            fArr[(iJ * iG) + i11] = ((j12 * f10) + ((j13 - j12) * f11)) / j13;
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void f(int i10) {
        this.f27348d = n(this.f27348d, this.f27352h.k(), i10);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void g(ByteBuffer byteBuffer, int i10) {
        GB gb = this.f27352h;
        byteBuffer.asFloatBuffer().put(this.f27347c, 0, gb.g() * i10);
        byteBuffer.position(byteBuffer.position() + (i10 * 4 * gb.g()));
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final /* synthetic */ Object h() {
        return this.f27348d;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void i(ByteBuffer byteBuffer, int i10) {
        GB gb = this.f27352h;
        byteBuffer.asFloatBuffer().get(this.f27346b, gb.i() * gb.g(), i10 / 4);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void j(int i10, int i11, int i12, int i13, int i14) {
        float[] fArr = this.f27347c;
        float[] fArr2 = this.f27346b;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                fArr[i18] = ((fArr2[i16] * (i10 - i19)) + (fArr2[i17] * i19)) / i10;
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void k(int i10, int i11) {
        for (int i12 = 0; i12 < this.f27352h.g() * i11; i12++) {
            this.f27346b[i10 + i12] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final /* synthetic */ Object l() {
        return this.f27346b;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final boolean zzc() {
        double d10 = this.f27349e;
        return d10 != 0.0d && this.f27352h.n() != 0 && this.f27350f <= d10 * 3.0d && d10 + d10 > this.f27351g * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void zzg() {
        this.f27351g = 0.0d;
        this.f27349e = 0.0d;
        this.f27350f = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.EA
    public final void zzi() {
        this.f27351g = this.f27349e;
    }
}
