package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K2 f20333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5570w2 f20334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f20337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f20344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f20345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f20346n;

    public L2(int i10, K2 k10, InterfaceC5570w2 interfaceC5570w2) {
        this.f20333a = k10;
        int iB = k10.b();
        boolean z9 = true;
        if (iB != 1) {
            if (iB == 2) {
                iB = 2;
            } else {
                z9 = false;
            }
        }
        AbstractC2418Ss0.a(z9);
        this.f20335c = j(i10, iB == 2 ? 1667497984 : 1651965952);
        this.f20337e = k10.c();
        this.f20334b = interfaceC5570w2;
        this.f20336d = iB == 2 ? j(i10, 1650720768) : -1;
        this.f20344l = -1L;
        this.f20345m = new long[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        this.f20346n = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        this.f20338f = k10.f20044d;
    }

    private final long h(int i10) {
        return (this.f20337e * ((long) i10)) / ((long) this.f20338f);
    }

    private final C4437n2 i(int i10) {
        return new C4437n2(((long) this.f20346n[i10]) * h(1), this.f20345m[i10]);
    }

    private static int j(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    public final void a(long j10, boolean z9) {
        if (this.f20344l == -1) {
            this.f20344l = j10;
        }
        if (z9) {
            if (this.f20343k == this.f20346n.length) {
                long[] jArr = this.f20345m;
                this.f20345m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f20346n;
                this.f20346n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f20345m;
            int i10 = this.f20343k;
            jArr2[i10] = j10;
            this.f20346n[i10] = this.f20342j;
            this.f20343k = i10 + 1;
        }
        this.f20342j++;
    }

    public final void b() {
        int i10;
        this.f20345m = Arrays.copyOf(this.f20345m, this.f20343k);
        this.f20346n = Arrays.copyOf(this.f20346n, this.f20343k);
        if ((this.f20335c & 1651965952) != 1651965952 || this.f20333a.f20046f == 0 || (i10 = this.f20343k) <= 0) {
            return;
        }
        this.f20338f = i10;
    }

    public final boolean c(int i10) {
        return this.f20335c == i10 || this.f20336d == i10;
    }

    public final void d(int i10) {
        this.f20339g = i10;
        this.f20340h = i10;
    }

    public final boolean e(J1 j10) {
        int i10 = this.f20340h;
        InterfaceC5570w2 interfaceC5570w2 = this.f20334b;
        int iD = i10 - interfaceC5570w2.d(j10, i10, false);
        this.f20340h = iD;
        boolean z9 = iD == 0;
        if (z9) {
            if (this.f20339g > 0) {
                interfaceC5570w2.c(h(this.f20341i), Arrays.binarySearch(this.f20346n, this.f20341i) >= 0 ? 1 : 0, this.f20339g, 0, null);
            }
            this.f20341i++;
        }
        return z9;
    }

    public final void f(long j10) {
        if (this.f20343k == 0) {
            this.f20341i = 0;
        } else {
            this.f20341i = this.f20346n[AbstractC4634ob0.I(this.f20345m, j10, true, true)];
        }
    }

    public final C4059k2 g(long j10) {
        if (this.f20343k == 0) {
            C4437n2 c4437n2 = new C4437n2(0L, this.f20344l);
            return new C4059k2(c4437n2, c4437n2);
        }
        int iH = (int) (j10 / h(1));
        int iH2 = AbstractC4634ob0.H(this.f20346n, iH, true, true);
        if (this.f20346n[iH2] == iH) {
            C4437n2 c4437n2I = i(iH2);
            return new C4059k2(c4437n2I, c4437n2I);
        }
        C4437n2 c4437n2I2 = i(iH2);
        int i10 = iH2 + 1;
        return i10 < this.f20345m.length ? new C4059k2(c4437n2I2, i(i10)) : new C4059k2(c4437n2I2, c4437n2I2);
    }
}
