package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3936j30 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f30287a;

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((AF) obj).f17275a.putStringArrayList("ad_types", this.f30287a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((AF) obj).f17276b.putStringArrayList("ad_types", this.f30287a);
    }
}
