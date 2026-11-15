package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4689p2 implements I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private L1 f32275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC5570w2 f32276g;

    public C4689p2(int i10, int i11, String str) {
        this.f32270a = i10;
        this.f32271b = i11;
        this.f32272c = str;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        if (j10 == 0 || this.f32274e == 1) {
            this.f32274e = 1;
            this.f32273d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) {
        int i10 = this.f32270a;
        AbstractC2418Ss0.i((i10 == -1 || this.f32271b == -1) ? false : true);
        int i11 = this.f32271b;
        P10 p10 = new P10(i11);
        ((C5946z1) j10).H(p10.H(), 0, i11, false);
        return p10.S() == i10;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        this.f32275f = l10;
        InterfaceC5570w2 interfaceC5570w2B = l10.b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 4);
        this.f32276g = interfaceC5570w2B;
        C5507vX0 c5507vX0 = new C5507vX0();
        String str = this.f32272c;
        c5507vX0.k0(str);
        c5507vX0.l0(str);
        interfaceC5570w2B.f(c5507vX0.m());
        this.f32275f.q();
        this.f32275f.o(new C4815q2(-9223372036854775807L));
        this.f32274e = 1;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) {
        int i10 = this.f32274e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC5570w2 interfaceC5570w2 = this.f32276g;
        interfaceC5570w2.getClass();
        int iD = interfaceC5570w2.d(j10, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, true);
        if (iD == -1) {
            this.f32274e = 2;
            this.f32276g.c(0L, 1, this.f32273d, 0, null);
            this.f32273d = 0;
        } else {
            this.f32273d += iD;
        }
        return 0;
    }
}
