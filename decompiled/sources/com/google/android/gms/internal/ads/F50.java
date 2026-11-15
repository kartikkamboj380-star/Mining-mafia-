package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class F50 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18673a;

    public F50(boolean z9) {
        this.f18673a = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((AF) obj).f17275a.putBoolean("is_gbid", this.f18673a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((AF) obj).f17276b.putBoolean("is_gbid", this.f18673a);
    }
}
