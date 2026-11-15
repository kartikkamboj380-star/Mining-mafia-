package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2195Ol implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2247Pl f21665a;

    public C2195Ol(C2247Pl c2247Pl) {
        this.f21665a = c2247Pl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC1750Fw interfaceC1750Fw = (InterfaceC1750Fw) obj;
        boolean zEquals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("transparentBackground"));
        boolean zEquals2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("blur"));
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Fail to parse float", e10);
        }
        C2247Pl c2247Pl = this.f21665a;
        c2247Pl.a(zEquals);
        c2247Pl.b(zEquals2, f10);
        interfaceC1750Fw.M0(zEquals);
    }
}
