package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4321m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31445a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5570w2[] f31447c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31446b = "video/mp2t";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4668os0 f31448d = new C4668os0(new InterfaceC2156Nr0() { // from class: com.google.android.gms.internal.ads.l7
        @Override // com.google.android.gms.internal.ads.InterfaceC2156Nr0
        public final /* synthetic */ void a(long j10, P10 p10) {
            this.f31196a.f(j10, p10);
        }
    });

    public C4321m7(List list, String str) {
        this.f31445a = list;
        this.f31447c = new InterfaceC5570w2[list.size()];
    }

    public final void a(L1 l10, C5706x7 c5706x7) {
        int i10 = 0;
        while (true) {
            InterfaceC5570w2[] interfaceC5570w2Arr = this.f31447c;
            if (i10 >= interfaceC5570w2Arr.length) {
                return;
            }
            c5706x7.a();
            InterfaceC5570w2 interfaceC5570w2B = l10.b(c5706x7.b(), 3);
            JY0 jy0 = (JY0) this.f31445a.get(i10);
            String str = jy0.f19929o;
            boolean z9 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z9 = false;
            }
            AbstractC2418Ss0.f(z9, "Invalid closed caption MIME type provided: %s", str);
            String strC = jy0.f19915a;
            if (strC == null) {
                strC = c5706x7.c();
            }
            C5507vX0 c5507vX0 = new C5507vX0();
            c5507vX0.A(strC);
            c5507vX0.k0(this.f31446b);
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

    public final void b(int i10) {
        this.f31448d.a(i10);
    }

    public final void c(long j10, P10 p10) {
        this.f31448d.c(j10, p10);
    }

    public final void d() {
        this.f31448d.e();
    }

    public final void e() {
        this.f31448d.e();
    }

    final /* synthetic */ void f(long j10, P10 p10) {
        AbstractC5442v1.a(j10, p10, this.f31447c);
    }
}
