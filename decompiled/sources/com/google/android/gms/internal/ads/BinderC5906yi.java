package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC5906yi extends AbstractBinderC6032zi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G4.g f35427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35429c;

    public BinderC5906yi(G4.g gVar, String str, String str2) {
        this.f35427a = gVar;
        this.f35428b = str;
        this.f35429c = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1462Ai
    public final void W(com.google.android.gms.dynamic.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f35427a.a((View) com.google.android.gms.dynamic.b.h0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1462Ai
    public final void b() {
        this.f35427a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1462Ai
    public final String zzb() {
        return this.f35428b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1462Ai
    public final String zzc() {
        return this.f35429c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1462Ai
    public final void zze() {
        this.f35427a.zzb();
    }
}
