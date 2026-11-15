package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3437f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3563g5 f28167a = new C3563g5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f28168b = new P10(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28169c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28171e;

    C3437f5() {
    }

    private final int f(int i10) {
        int i11;
        int i12 = 0;
        this.f28170d = 0;
        do {
            int i13 = this.f28170d;
            int i14 = i10 + i13;
            C3563g5 c3563g5 = this.f28167a;
            if (i14 >= c3563g5.f28561c) {
                break;
            }
            this.f28170d = i13 + 1;
            i11 = c3563g5.f28564f[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final void a() {
        this.f28167a.a();
        this.f28168b.z(0);
        this.f28169c = -1;
        this.f28171e = false;
    }

    public final boolean b(J1 j10) {
        if (this.f28171e) {
            this.f28171e = false;
            this.f28168b.z(0);
        }
        while (true) {
            if (this.f28171e) {
                return true;
            }
            int i10 = this.f28169c;
            if (i10 < 0) {
                C3563g5 c3563g5 = this.f28167a;
                if (!c3563g5.b(j10, -1L) || !c3563g5.c(j10, true)) {
                    return false;
                }
                int iF = c3563g5.f28562d;
                if ((c3563g5.f28559a & 1) == 1 && this.f28168b.D() == 0) {
                    iF += f(0);
                    i10 = this.f28170d;
                } else {
                    i10 = 0;
                }
                if (!M1.d(j10, iF)) {
                    return false;
                }
                this.f28169c = i10;
            }
            int iF2 = f(i10);
            int i11 = this.f28169c + this.f28170d;
            if (iF2 > 0) {
                P10 p10 = this.f28168b;
                p10.B(p10.D() + iF2);
                if (!M1.c(j10, p10.H(), p10.D(), iF2)) {
                    return false;
                }
                p10.E(p10.D() + iF2);
                this.f28171e = this.f28167a.f28564f[i11 + (-1)] != 255;
            }
            if (i11 == this.f28167a.f28561c) {
                i11 = -1;
            }
            this.f28169c = i11;
        }
    }

    public final C3563g5 c() {
        return this.f28167a;
    }

    public final P10 d() {
        return this.f28168b;
    }

    public final void e() {
        P10 p10 = this.f28168b;
        if (p10.H().length == 65025) {
            return;
        }
        p10.A(Arrays.copyOf(p10.H(), Math.max(65025, p10.D())), p10.D());
    }
}
