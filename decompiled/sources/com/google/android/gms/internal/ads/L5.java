package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class L5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f20364a = new P10();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f20365b = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20372i;

    public final KD a() {
        int i10;
        if (this.f20367d == 0 || this.f20368e == 0 || this.f20371h == 0 || this.f20372i == 0) {
            return null;
        }
        P10 p10 = this.f20364a;
        if (p10.D() == 0 || p10.F() != p10.D() || !this.f20366c) {
            return null;
        }
        p10.G(0);
        int i11 = this.f20371h * this.f20372i;
        int[] iArr = new int[i11];
        int i12 = 0;
        while (i12 < i11) {
            int iR = p10.R();
            if (iR != 0) {
                i10 = i12 + 1;
                iArr[i12] = this.f20365b[iR];
            } else {
                int iR2 = p10.R();
                if (iR2 != 0) {
                    int iR3 = iR2 & 63;
                    if ((iR2 & 64) != 0) {
                        iR3 = (iR3 << 8) | p10.R();
                    }
                    i10 = iR3 + i12;
                    Arrays.fill(iArr, i12, i10, (iR2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0 ? this.f20365b[0] : this.f20365b[p10.R()]);
                }
            }
            i12 = i10;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f20371h, this.f20372i, Bitmap.Config.ARGB_8888);
        C3955jD c3955jD = new C3955jD();
        c3955jD.c(bitmapCreateBitmap);
        c3955jD.i(this.f20369f / this.f20367d);
        c3955jD.j(0);
        c3955jD.f(this.f20370g / this.f20368e, 0);
        c3955jD.g(0);
        c3955jD.m(this.f20371h / this.f20367d);
        c3955jD.n(this.f20372i / this.f20368e);
        return c3955jD.r();
    }

    public final void b() {
        this.f20367d = 0;
        this.f20368e = 0;
        this.f20369f = 0;
        this.f20370g = 0;
        this.f20371h = 0;
        this.f20372i = 0;
        this.f20364a.z(0);
        this.f20366c = false;
    }

    final /* synthetic */ void c(P10 p10, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        p10.J(2);
        int[] iArr = this.f20365b;
        Arrays.fill(iArr, 0);
        int i11 = 0;
        for (int i12 = i10 / 5; i11 < i12; i12 = i12) {
            int iR = p10.R();
            int iR2 = p10.R();
            int iR3 = p10.R();
            int iR4 = p10.R();
            double d10 = iR2;
            int iR5 = p10.R() << 24;
            String str = AbstractC4634ob0.f32117a;
            double d11 = iR3 - 128;
            double d12 = iR4 - 128;
            iArr[iR] = (Math.max(0, Math.min((int) (d10 + (1.402d * d11)), 255)) << 16) | iR5 | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255));
            i11++;
        }
        this.f20366c = true;
    }

    final /* synthetic */ void d(P10 p10, int i10) {
        int iW;
        if (i10 < 4) {
            return;
        }
        p10.J(3);
        int i11 = i10 - 4;
        if ((p10.R() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            if (i11 < 7 || (iW = p10.W()) < 4) {
                return;
            }
            this.f20371h = p10.S();
            this.f20372i = p10.S();
            this.f20364a.z(iW - 4);
            i11 = i10 - 11;
        }
        P10 p11 = this.f20364a;
        int iF = p11.F();
        int iD = p11.D();
        if (iF >= iD || i11 <= 0) {
            return;
        }
        int iMin = Math.min(i11, iD - iF);
        p10.L(p11.H(), iF, iMin);
        p11.G(iF + iMin);
    }

    final /* synthetic */ void e(P10 p10, int i10) {
        if (i10 < 19) {
            return;
        }
        this.f20367d = p10.S();
        this.f20368e = p10.S();
        p10.J(11);
        this.f20369f = p10.S();
        this.f20370g = p10.S();
    }
}
