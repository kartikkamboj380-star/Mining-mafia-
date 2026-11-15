package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class H6 implements I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19206a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5570w2[] f19208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19211f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19207b = "video/mp2t";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19212g = -9223372036854775807L;

    public H6(List list, String str) {
        this.f19206a = list;
        this.f19208c = new InterfaceC5570w2[list.size()];
    }

    private final boolean a(P10 p10, int i10) {
        if (p10.C() == 0) {
            return false;
        }
        if (p10.R() != i10) {
            this.f19209d = false;
        }
        this.f19210e--;
        return this.f19209d;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void l0(boolean z9) {
        if (this.f19209d) {
            AbstractC2418Ss0.i(this.f19212g != -9223372036854775807L);
            for (InterfaceC5570w2 interfaceC5570w2 : this.f19208c) {
                interfaceC5570w2.c(this.f19212g, 1, this.f19211f, 0, null);
            }
            this.f19209d = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void m0(L1 l10, C5706x7 c5706x7) {
        int i10 = 0;
        while (true) {
            InterfaceC5570w2[] interfaceC5570w2Arr = this.f19208c;
            if (i10 >= interfaceC5570w2Arr.length) {
                return;
            }
            C5328u7 c5328u7 = (C5328u7) this.f19206a.get(i10);
            c5706x7.a();
            InterfaceC5570w2 interfaceC5570w2B = l10.b(c5706x7.b(), 3);
            C5507vX0 c5507vX0 = new C5507vX0();
            c5507vX0.A(c5706x7.c());
            c5507vX0.k0(this.f19207b);
            c5507vX0.l0("application/dvbsubs");
            c5507vX0.o0(Collections.singletonList(c5328u7.f33737b));
            c5507vX0.d0(c5328u7.f33736a);
            interfaceC5570w2B.f(c5507vX0.m());
            interfaceC5570w2Arr[i10] = interfaceC5570w2B;
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void n0(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f19209d = true;
        this.f19212g = j10;
        this.f19211f = 0;
        this.f19210e = 2;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void o0(P10 p10) {
        if (this.f19209d) {
            if (this.f19210e != 2 || a(p10, 32)) {
                if (this.f19210e != 1 || a(p10, 0)) {
                    int iF = p10.F();
                    int iC = p10.C();
                    for (InterfaceC5570w2 interfaceC5570w2 : this.f19208c) {
                        p10.G(iF);
                        interfaceC5570w2.b(p10, iC);
                    }
                    this.f19211f += iC;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void zza() {
        this.f19209d = false;
        this.f19212g = -9223372036854775807L;
    }
}
