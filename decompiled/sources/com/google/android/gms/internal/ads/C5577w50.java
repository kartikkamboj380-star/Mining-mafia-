package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5577w50 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34472b;

    public C5577w50(String str, boolean z9) {
        this.f34471a = str;
        this.f34472b = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        bundle.putString("gct", this.f34471a);
        if (this.f34472b) {
            bundle.putString("de", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((AF) obj).f17276b.putString("gct", this.f34471a);
    }
}
