package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5408ul implements InterfaceC2091Ml {
    C5408ul() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        ((InterfaceC1750Fw) obj).V0(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("custom_close")));
    }
}
