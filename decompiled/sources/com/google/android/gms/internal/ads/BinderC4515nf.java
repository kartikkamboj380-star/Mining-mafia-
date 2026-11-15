package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC4515nf extends AbstractBinderC5774xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private B4.j f31855a;

    @Override // com.google.android.gms.internal.ads.InterfaceC5900yf
    public final void D0(H4.Z0 z9) {
        B4.j jVar = this.f31855a;
        if (jVar != null) {
            jVar.d(z9.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5900yf
    public final void b() {
        B4.j jVar = this.f31855a;
        if (jVar != null) {
            jVar.e();
        }
    }

    public final void y6(B4.j jVar) {
        this.f31855a = jVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5900yf
    public final void zzc() {
        B4.j jVar = this.f31855a;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5900yf
    public final void zzd() {
        B4.j jVar = this.f31855a;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5900yf
    public final void zzg() {
        B4.j jVar = this.f31855a;
        if (jVar != null) {
            jVar.b();
        }
    }
}
