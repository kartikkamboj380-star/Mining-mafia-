package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5830y6 implements I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4436n10 f35243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f35244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f35247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC5570w2 f35249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f35253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JY0 f35254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f35255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f35256n;

    public C5830y6(String str, int i10, String str2) {
        C4436n10 c4436n10 = new C4436n10(new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT], IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        this.f35243a = c4436n10;
        this.f35244b = new P10(c4436n10.f31642a);
        this.f35250h = 0;
        this.f35256n = -9223372036854775807L;
        this.f35245c = str;
        this.f35246d = i10;
        this.f35247e = str2;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void l0(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void m0(L1 l10, C5706x7 c5706x7) {
        c5706x7.a();
        this.f35248f = c5706x7.c();
        this.f35249g = l10.b(c5706x7.b(), 1);
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void n0(long j10, int i10) {
        this.f35256n = j10;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void o0(P10 p10) {
        this.f35249g.getClass();
        while (p10.C() > 0) {
            int i10 = this.f35250h;
            if (i10 == 0) {
                while (p10.C() > 0) {
                    if (this.f35252j) {
                        int iR = p10.R();
                        if (iR == 119) {
                            this.f35252j = false;
                            this.f35250h = 1;
                            P10 p11 = this.f35244b;
                            p11.H()[0] = 11;
                            p11.H()[1] = 119;
                            this.f35251i = 2;
                            break;
                        }
                        this.f35252j = iR == 11;
                    } else {
                        this.f35252j = p10.R() == 11;
                    }
                }
            } else if (i10 != 1) {
                int iMin = Math.min(p10.C(), this.f35255m - this.f35251i);
                this.f35249g.b(p10, iMin);
                int i11 = this.f35251i + iMin;
                this.f35251i = i11;
                if (i11 == this.f35255m) {
                    AbstractC2418Ss0.i(this.f35256n != -9223372036854775807L);
                    this.f35249g.c(this.f35256n, 1, this.f35255m, 0, null);
                    this.f35256n += this.f35253k;
                    this.f35250h = 0;
                }
            } else {
                P10 p12 = this.f35244b;
                byte[] bArrH = p12.H();
                int iMin2 = Math.min(p10.C(), 128 - this.f35251i);
                p10.L(bArrH, this.f35251i, iMin2);
                int i12 = this.f35251i + iMin2;
                this.f35251i = i12;
                if (i12 == 128) {
                    C4436n10 c4436n10 = this.f35243a;
                    c4436n10.f(0);
                    C3681h1 c3681h1C = AbstractC3807i1.c(c4436n10);
                    JY0 jy0 = this.f35254l;
                    if (jy0 == null || c3681h1C.f28809c != jy0.f19906G || c3681h1C.f28808b != jy0.f19907H || !Objects.equals(c3681h1C.f28807a, jy0.f19929o)) {
                        C5507vX0 c5507vX0 = new C5507vX0();
                        c5507vX0.A(this.f35248f);
                        c5507vX0.k0(this.f35247e);
                        String str = c3681h1C.f28807a;
                        c5507vX0.l0(str);
                        c5507vX0.e(c3681h1C.f28809c);
                        c5507vX0.f(c3681h1C.f28808b);
                        c5507vX0.d0(this.f35245c);
                        c5507vX0.f0(this.f35246d);
                        int i13 = c3681h1C.f28812f;
                        c5507vX0.h0(i13);
                        if ("audio/ac3".equals(str)) {
                            c5507vX0.g0(i13);
                        }
                        JY0 jy0M = c5507vX0.m();
                        this.f35254l = jy0M;
                        this.f35249g.f(jy0M);
                    }
                    this.f35255m = c3681h1C.f28810d;
                    this.f35253k = (((long) c3681h1C.f28811e) * 1000000) / ((long) this.f35254l.f19907H);
                    p12.G(0);
                    this.f35249g.b(p12, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    this.f35250h = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void zza() {
        this.f35250h = 0;
        this.f35251i = 0;
        this.f35252j = false;
        this.f35256n = -9223372036854775807L;
    }
}
