package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4269li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31336a = (String) AbstractC3266dj.f27498a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f31338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31339d;

    public C4269li(Context context, String str) {
        this.f31338c = context;
        this.f31339d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f31337b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        G4.t.g();
        linkedHashMap.put("device", K4.F0.i0());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        G4.t.g();
        boolean zJ = K4.F0.j(context);
        String str2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        linkedHashMap.put("is_lite_sdk", true != zJ ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        Future futureA = G4.t.t().a(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C5924yr) futureA.get()).f35468j));
            linkedHashMap.put("network_fine", Integer.toString(((C5924yr) futureA.get()).f35469k));
        } catch (Exception e10) {
            G4.t.l().j(e10, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Oc)).booleanValue()) {
            Map map = this.f31337b;
            G4.t.g();
            map.put("is_bstar", true != K4.F0.g(context) ? "0" : str2);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Sa)).booleanValue()) {
            if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29732X2)).booleanValue() || AbstractC4040jt0.c(G4.t.l().x())) {
                return;
            }
            this.f31337b.put("plugin", G4.t.l().x());
        }
    }

    final String a() {
        return this.f31336a;
    }

    final Context b() {
        return this.f31338c;
    }

    final String c() {
        return this.f31339d;
    }

    final Map d() {
        return this.f31337b;
    }
}
