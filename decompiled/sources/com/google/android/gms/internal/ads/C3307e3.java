package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3307e3 implements I1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private L1 f27665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C4187l3 f27666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private J1 f27667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C5066s2 f27668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private N4 f27669f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f27672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27673j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f27664a = new P10(16);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f27674k = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27670g = 0;

    private final void a() {
        L1 l10 = this.f27665b;
        l10.getClass();
        l10.q();
        this.f27665b.o(new C4185l2(-9223372036854775807L, 0L));
        this.f27670g = 4;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
        if (this.f27669f != null) {
            this.f27669f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        if (j10 != 0) {
            if (this.f27670g == 3) {
                N4 n10 = this.f27669f;
                n10.getClass();
                n10.d(j10, j11);
                return;
            }
            return;
        }
        this.f27670g = 0;
        this.f27673j = 0;
        this.f27674k = -1L;
        if (this.f27669f != null) {
            this.f27669f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) throws EOFException, InterruptedIOException {
        int i10;
        P10 p10 = new P10(16);
        boolean z9 = true;
        while (true) {
            p10.z(8);
            if (!j10.H(p10.H(), 0, 8, true)) {
                return false;
            }
            long jY = p10.Y();
            int iB = p10.b();
            if (jY != 1) {
                i10 = 8;
            } else {
                if (!j10.H(p10.H(), 8, 8, true)) {
                    return false;
                }
                jY = p10.j();
                i10 = 16;
            }
            long j11 = i10;
            if (jY < j11) {
                return false;
            }
            int i11 = (int) (jY - j11);
            if (z9) {
                if (iB != 1718909296 || i11 < 8) {
                    return false;
                }
                p10.z(4);
                C5946z1 c5946z1 = (C5946z1) j10;
                c5946z1.H(p10.H(), 0, 4, false);
                if (p10.b() != 1751476579) {
                    return false;
                }
                c5946z1.c(i11 - 4, false);
            } else {
                if (iB == 1836086884) {
                    return true;
                }
                if (i11 != 0) {
                    ((C5946z1) j10).c(i11, false);
                }
            }
            z9 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        this.f27665b = l10;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) throws C2817a9 {
        while (true) {
            int i10 = this.f27670g;
            if (i10 == 0) {
                if (this.f27673j == 0) {
                    P10 p10 = this.f27664a;
                    if (!j10.K(p10.H(), 0, 8, true)) {
                        a();
                        return -1;
                    }
                    this.f27673j = 8;
                    p10.G(0);
                    this.f27672i = p10.Y();
                    this.f27671h = p10.b();
                }
                long j11 = this.f27672i;
                if (j11 == 1) {
                    P10 p11 = this.f27664a;
                    j10.I(p11.H(), 8, 8);
                    this.f27673j += 8;
                    j11 = p11.j();
                    this.f27672i = j11;
                }
                if (this.f27671h == 1836086884) {
                    long jZzn = j10.zzn();
                    this.f27674k = jZzn;
                    long j12 = this.f27673j;
                    C4187l3 c4187l3 = new C4187l3(0L, jZzn - j12, -9223372036854775807L, jZzn, j11 - j12);
                    this.f27666c = c4187l3;
                    L1 l10 = this.f27665b;
                    l10.getClass();
                    InterfaceC5570w2 interfaceC5570w2B = l10.b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 4);
                    C5507vX0 c5507vX0 = new C5507vX0();
                    c5507vX0.k0(ClipboardModule.MIMETYPE_HEIC);
                    c5507vX0.j0(new V6(-9223372036854775807L, c4187l3));
                    interfaceC5570w2B.f(c5507vX0.m());
                    this.f27670g = 2;
                } else {
                    this.f27670g = 1;
                }
            } else if (i10 == 1) {
                j10.n((int) (this.f27672i - ((long) this.f27673j)));
                this.f27673j = 0;
                this.f27670g = 0;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return -1;
                    }
                    if (this.f27668e == null || j10 != this.f27667d) {
                        this.f27667d = j10;
                        this.f27668e = new C5066s2(j10, this.f27674k);
                    }
                    N4 n10 = this.f27669f;
                    n10.getClass();
                    int iG = n10.g(this.f27668e, c3933j2);
                    if (iG == 1) {
                        c3933j2.f30283a += this.f27674k;
                    }
                    return iG;
                }
                if (this.f27669f == null) {
                    this.f27669f = new N4(InterfaceC5576w5.f34470a, 8);
                }
                C5066s2 c5066s2 = new C5066s2(j10, this.f27674k);
                this.f27668e = c5066s2;
                if (this.f27669f.e(c5066s2)) {
                    N4 n11 = this.f27669f;
                    long j13 = this.f27674k;
                    L1 l11 = this.f27665b;
                    l11.getClass();
                    n11.f(new C5318u2(j13, l11));
                    this.f27670g = 3;
                } else {
                    a();
                }
            }
        }
    }
}
