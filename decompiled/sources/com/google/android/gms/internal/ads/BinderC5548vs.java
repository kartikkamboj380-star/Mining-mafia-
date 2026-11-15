package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC5548vs extends AbstractBinderC3912is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V4.b f34182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5674ws f34183b;

    public BinderC5548vs(V4.b bVar, C5674ws c5674ws) {
        this.f34182a = bVar;
        this.f34183b = c5674ws;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void n(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void o(H4.Z0 z9) {
        V4.b bVar = this.f34182a;
        if (bVar != null) {
            bVar.a(z9.j());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4037js
    public final void zze() {
        C5674ws c5674ws;
        V4.b bVar = this.f34182a;
        if (bVar == null || (c5674ws = this.f34183b) == null) {
            return;
        }
        bVar.b(c5674ws);
    }
}
