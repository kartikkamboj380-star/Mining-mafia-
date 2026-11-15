package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC4263lf extends AbstractBinderC5144sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D4.a.AbstractC0017a f31319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31320b;

    public BinderC4263lf(D4.a.AbstractC0017a abstractC0017a, String str) {
        this.f31319a = abstractC0017a;
        this.f31320b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5396uf
    public final void G(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5396uf
    public final void f5(InterfaceC4893qf interfaceC4893qf) {
        D4.a.AbstractC0017a abstractC0017a = this.f31319a;
        if (abstractC0017a != null) {
            abstractC0017a.b(new C4389mf(interfaceC4893qf, this.f31320b));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5396uf
    public final void j0(H4.Z0 z9) {
        D4.a.AbstractC0017a abstractC0017a = this.f31319a;
        if (abstractC0017a != null) {
            abstractC0017a.a(z9.j());
        }
    }
}
