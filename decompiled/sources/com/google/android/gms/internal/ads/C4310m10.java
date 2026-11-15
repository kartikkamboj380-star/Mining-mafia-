package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4310m10 implements G4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private G4.g f31427a;

    @Override // G4.g
    public final synchronized void a(View view) {
        G4.g gVar = this.f31427a;
        if (gVar != null) {
            gVar.a(view);
        }
    }

    public final synchronized void b(G4.g gVar) {
        this.f31427a = gVar;
    }

    @Override // G4.g
    public final synchronized void zzb() {
        G4.g gVar = this.f31427a;
        if (gVar != null) {
            gVar.zzb();
        }
    }

    @Override // G4.g
    public final synchronized void zzc() {
        G4.g gVar = this.f31427a;
        if (gVar != null) {
            gVar.zzc();
        }
    }
}
