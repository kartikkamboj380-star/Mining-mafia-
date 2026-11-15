package com.google.android.gms.internal.ads;

import Q4.AbstractC0928c;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class JR {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f19881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1796Gt f19882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6019zb0 f19883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f19885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5138sc f19886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f19887g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f19888h;

    public JR(Context context, WR wr, C1796Gt c1796Gt, C6019zb0 c6019zb0, String str, String str2, C5138sc c5138sc) {
        ActivityManager.MemoryInfo memoryInfoN;
        ConcurrentHashMap concurrentHashMapD = wr.d();
        this.f19881a = concurrentHashMapD;
        this.f19882b = c1796Gt;
        this.f19883c = c6019zb0;
        this.f19884d = str;
        this.f19885e = str2;
        this.f19886f = c5138sc;
        this.f19888h = context;
        concurrentHashMapD.put("ad_format", str2.toUpperCase(Locale.ROOT));
        g();
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29602K2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            d("rt_f", String.valueOf(runtime.freeMemory()));
            d("rt_m", String.valueOf(runtime.maxMemory()));
            d("rt_t", String.valueOf(runtime.totalMemory()));
            d("wv_c", String.valueOf(G4.t.l().o()));
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29682S2)).booleanValue() && (memoryInfoN = L4.g.n(context)) != null) {
                d("mem_avl", String.valueOf(memoryInfoN.availMem));
                d("mem_tt", String.valueOf(memoryInfoN.totalMem));
                d("low_m", true != memoryInfoN.lowMemory ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29702U2)).booleanValue()) {
            d("ad_unit_id", c6019zb0.f35798g);
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29677R7)).booleanValue()) {
            int iG = AbstractC0928c.g(c6019zb0) - 1;
            if (iG == 0) {
                concurrentHashMapD.put("request_id", str);
                concurrentHashMapD.put("scar", "false");
                return;
            }
            if (iG == 1) {
                concurrentHashMapD.put("request_id", str);
                concurrentHashMapD.put("se", "query_g");
            } else if (iG == 2) {
                concurrentHashMapD.put("se", "r_adinfo");
            } else if (iG != 3) {
                concurrentHashMapD.put("se", "r_both");
            } else {
                concurrentHashMapD.put("se", "r_adstring");
            }
            concurrentHashMapD.put("scar", "true");
            d("ragent", c6019zb0.f35795d.f1278G);
            d("rtype", AbstractC0928c.b(AbstractC0928c.c(c6019zb0.f35795d)));
        }
    }

    public final void a(C5011rb0 c5011rb0) {
        C4886qb0 c4886qb0 = c5011rb0.f32991b;
        List list = c4886qb0.f32671a;
        if (!list.isEmpty()) {
            int i10 = ((C3502fb0) list.get(0)).f28397b;
            d("ad_format", C3502fb0.a(i10));
            if (i10 == 6) {
                this.f19881a.put("as", true != this.f19882b.k() ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29622M2)).booleanValue()) {
            d("mwl", Integer.toString(list.size()));
        }
        d("gqi", c4886qb0.f32672b.f29455b);
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            d("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            d("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map c() {
        return this.f19881a;
    }

    public final void d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f19881a.put(str, str2);
    }

    public final Bundle e() {
        return this.f19887g;
    }

    public final void f() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Me)).booleanValue()) {
            d("brr", true != this.f19883c.f35808q ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
    }

    public final void g() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Ya)).booleanValue()) {
            InterfaceC4509nc interfaceC4509ncB = this.f19886f.b();
            if (interfaceC4509ncB instanceof G4.k) {
                this.f19881a.put("asv", ((G4.k) interfaceC4509ncB).l());
            } else if (interfaceC4509ncB instanceof C2687Xx) {
                this.f19881a.put("asv", ((C2687Xx) interfaceC4509ncB).a());
            } else {
                this.f19881a.put("asv", "NA");
            }
        }
    }
}
