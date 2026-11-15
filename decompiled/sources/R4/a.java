package R4;

import G4.t;
import H4.B;
import K4.F0;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2759Zh;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC4040jt0;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5286c;

    public a(Context context, L4.a aVar) {
        this.f5284a = context;
        this.f5285b = context.getPackageName();
        this.f5286c = aVar.f3097a;
    }

    public void a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        t.g();
        map.put("device", F0.i0());
        map.put("app", this.f5285b);
        t.g();
        Context context = this.f5284a;
        boolean zJ = F0.j(context);
        String str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        map.put("is_lite_sdk", true != zJ ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.f29759a;
        List listF = B.b().f();
        if (((Boolean) B.c().d(AbstractC3892ii.f29637N7)).booleanValue()) {
            listF.addAll(t.l().r().zzi().h());
        }
        map.put("e", TextUtils.join(",", listF));
        map.put("sdkVersion", this.f5286c);
        if (((Boolean) B.c().d(AbstractC3892ii.Oc)).booleanValue()) {
            t.g();
            if (true != F0.g(context)) {
                str = "0";
            }
            map.put("is_bstar", str);
        }
        if (((Boolean) B.c().d(AbstractC3892ii.Sa)).booleanValue()) {
            if (((Boolean) B.c().d(AbstractC3892ii.f29732X2)).booleanValue()) {
                map.put("plugin", AbstractC4040jt0.a(t.l().x()));
            }
        }
    }
}
