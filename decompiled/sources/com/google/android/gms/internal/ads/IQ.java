package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class IQ {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f19546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f19547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f19549e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19545a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f19550f = new AtomicBoolean(false);

    public IQ(Executor executor) {
        this.f19547c = executor;
    }

    private final void g() {
        if (this.f19550f.getAndSet(true)) {
            return;
        }
        G4.t.l().r().P0(new Runnable() { // from class: com.google.android.gms.internal.ads.FQ
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f18753a.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void f() {
        JSONObject jSONObjectG;
        Map map;
        try {
            this.f19548d = true;
            C5802xt c5802xtZzi = G4.t.l().r().zzi();
            if (c5802xtZzi != null && (jSONObjectG = c5802xtZzi.g()) != null) {
                this.f19546b = ((Boolean) H4.B.c().d(AbstractC3892ii.f29724W4)).booleanValue() ? jSONObjectG.optJSONObject("common_settings") : null;
                this.f19549e = jSONObjectG.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObjectG.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                Map map2 = this.f19545a;
                                if (map2.containsKey(strOptString2)) {
                                    map = (Map) map2.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    map2.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a() {
        g();
        this.f19547c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.HQ
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f19289a.d();
            }
        });
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29704U4)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f19548d) {
            f();
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29714V4)).booleanValue()) {
                g();
            }
        }
        Map map = (Map) this.f19545a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strA = KQ.a(this.f19549e, str, str2);
        if (strA != null) {
            return (JSONObject) map.get(strA);
        }
        return null;
    }

    public final JSONObject c() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29724W4)).booleanValue()) {
            return this.f19546b;
        }
        return null;
    }

    final /* synthetic */ void e() {
        this.f19547c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.GQ
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f19040a.f();
            }
        });
    }
}
