package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class B7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f17498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17499b = "video/mp2t";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5570w2[] f17500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4668os0 f17501d;

    public B7(List list, String str) {
        this.f17498a = list;
        this.f17500c = new InterfaceC5570w2[list.size()];
        C4668os0 c4668os0 = new C4668os0(new InterfaceC2156Nr0() { // from class: com.google.android.gms.internal.ads.A7
            @Override // com.google.android.gms.internal.ads.InterfaceC2156Nr0
            public final /* synthetic */ void a(long j10, P10 p10) {
                this.f17246a.c(j10, p10);
            }
        });
        this.f17501d = c4668os0;
        c4668os0.a(3);
    }

    public final void a(L1 l10, C5706x7 c5706x7) {
        int i10 = 0;
        while (true) {
            InterfaceC5570w2[] interfaceC5570w2Arr = this.f17500c;
            if (i10 >= interfaceC5570w2Arr.length) {
                return;
            }
            c5706x7.a();
            InterfaceC5570w2 interfaceC5570w2B = l10.b(c5706x7.b(), 3);
            JY0 jy0 = (JY0) this.f17498a.get(i10);
            String str = jy0.f19929o;
            boolean z9 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z9 = false;
            }
            AbstractC2418Ss0.f(z9, "Invalid closed caption MIME type provided: %s", str);
            C5507vX0 c5507vX0 = new C5507vX0();
            c5507vX0.A(c5706x7.c());
            c5507vX0.k0(this.f17499b);
            c5507vX0.l0(str);
            c5507vX0.e0(jy0.f19919e);
            c5507vX0.d0(jy0.f19918d);
            c5507vX0.j(jy0.f19911L);
            c5507vX0.o0(jy0.f19932r);
            interfaceC5570w2B.f(c5507vX0.m());
            interfaceC5570w2Arr[i10] = interfaceC5570w2B;
            i10++;
        }
    }

    public final void b(long j10, P10 p10) {
        if (p10.C() < 9) {
            return;
        }
        int iB = p10.b();
        int iB2 = p10.b();
        int iR = p10.R();
        if (iB == 434 && iB2 == 1195456820 && iR == 3) {
            this.f17501d.c(j10, p10);
        }
    }

    final /* synthetic */ void c(long j10, P10 p10) {
        AbstractC5442v1.b(j10, p10, this.f17500c);
    }
}
