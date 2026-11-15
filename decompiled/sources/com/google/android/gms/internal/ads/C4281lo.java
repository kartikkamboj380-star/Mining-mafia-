package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4281lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2095Mn f31365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.common.util.concurrent.p f31366b;

    C4281lo(C2095Mn c2095Mn) {
        this.f31365a = c2095Mn;
    }

    private final void d() {
        if (this.f31366b == null) {
            final C2575Vt c2575Vt = new C2575Vt();
            this.f31366b = c2575Vt;
            this.f31365a.b(null).a(new InterfaceC2783Zt() { // from class: com.google.android.gms.internal.ads.ko
                @Override // com.google.android.gms.internal.ads.InterfaceC2783Zt
                public final /* synthetic */ void zza(Object obj) {
                    c2575Vt.b((InterfaceC2147Nn) obj);
                }
            }, new InterfaceC2679Xt() { // from class: com.google.android.gms.internal.ads.ho
                @Override // com.google.android.gms.internal.ads.InterfaceC2679Xt
                public final /* synthetic */ void zza() {
                    c2575Vt.c(new C2251Pn("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final C4659oo a(String str, InterfaceC2459Tn interfaceC2459Tn, InterfaceC2407Sn interfaceC2407Sn) {
        d();
        return new C4659oo(this.f31366b, "google.afma.activeView.handleUpdate", interfaceC2459Tn, interfaceC2407Sn);
    }

    public final void b(final String str, final InterfaceC2091Ml interfaceC2091Ml) {
        d();
        this.f31366b = AbstractC5685wx0.j(this.f31366b, new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.io
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                InterfaceC2147Nn interfaceC2147Nn = (InterfaceC2147Nn) obj;
                interfaceC2147Nn.D0(str, interfaceC2091Ml);
                return AbstractC5685wx0.a(interfaceC2147Nn);
            }
        }, AbstractC2315Qt.f22479g);
    }

    public final void c(final String str, final InterfaceC2091Ml interfaceC2091Ml) {
        this.f31366b = AbstractC5685wx0.k(this.f31366b, new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.jo
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                InterfaceC2147Nn interfaceC2147Nn = (InterfaceC2147Nn) obj;
                interfaceC2147Nn.w0(str, interfaceC2091Ml);
                return interfaceC2147Nn;
            }
        }, AbstractC2315Qt.f22479g);
    }
}
