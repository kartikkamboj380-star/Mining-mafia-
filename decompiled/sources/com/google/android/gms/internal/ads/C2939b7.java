package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2939b7 implements InterfaceC3943j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JY0 f26726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private L90 f26727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5570w2 f26728c;

    public C2939b7(String str, String str2) {
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.k0("video/mp2t");
        c5507vX0.l0(str);
        this.f26726a = c5507vX0.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3943j7
    public final void a(L90 l90, L1 l10, C5706x7 c5706x7) {
        this.f26727b = l90;
        c5706x7.a();
        InterfaceC5570w2 interfaceC5570w2B = l10.b(c5706x7.b(), 5);
        this.f26728c = interfaceC5570w2B;
        interfaceC5570w2B.f(this.f26726a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3943j7
    public final void b(P10 p10) {
        this.f26727b.getClass();
        String str = AbstractC4634ob0.f32117a;
        long jB = this.f26727b.b();
        long jC = this.f26727b.c();
        if (jB == -9223372036854775807L || jC == -9223372036854775807L) {
            return;
        }
        JY0 jy0 = this.f26726a;
        if (jC != jy0.f19934t) {
            C5507vX0 c5507vX0A = jy0.a();
            c5507vX0A.q0(jC);
            JY0 jy0M = c5507vX0A.m();
            this.f26726a = jy0M;
            this.f26728c.f(jy0M);
        }
        int iC = p10.C();
        this.f26728c.b(p10, iC);
        this.f26728c.c(jB, 1, iC, 0, null);
    }
}
