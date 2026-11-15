package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC4793ps extends AbstractBinderC3912is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U4.d f32490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U4.c f32491b;

    public BinderC4793ps(U4.d dVar, U4.c cVar) {
        this.f32490a = dVar;
        this.f32491b = cVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void n(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void o(H4.Z0 z9) {
        U4.d dVar = this.f32490a;
        if (dVar != null) {
            dVar.a(z9.j());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void zze() {
        U4.d dVar = this.f32490a;
        if (dVar != null) {
            dVar.b(this.f32491b);
        }
    }
}
