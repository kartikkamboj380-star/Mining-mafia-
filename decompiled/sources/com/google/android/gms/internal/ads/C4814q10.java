package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4814q10 implements G4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RK f32546a;

    C4814q10(C4939r10 c4939r10, RK rk) {
        this.f32546a = rk;
        Objects.requireNonNull(c4939r10);
    }

    @Override // G4.g
    public final void a(View view) {
    }

    @Override // G4.g
    public final void zzb() {
        this.f32546a.c().onAdClicked();
    }

    @Override // G4.g
    public final void zzc() {
        RK rk = this.f32546a;
        rk.d().zza();
        rk.e().zza();
    }
}
