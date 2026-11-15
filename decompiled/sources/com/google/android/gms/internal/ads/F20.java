package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class F20 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18628a;

    public F20(boolean z9) {
        this.f18628a = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((AF) obj).f17275a.putString("adid_p", true != this.f18628a ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }
}
