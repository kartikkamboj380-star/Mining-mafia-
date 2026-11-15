package com.google.android.gms.internal.ads;

import H4.C0654z;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5252tW implements InterfaceC2459Tn {
    C5252tW() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2459Tn
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        C5378uW c5378uW = (C5378uW) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Ka)).booleanValue()) {
            C5672wr c5672wr = c5378uW.f33835c;
            jSONObject2.put("ad_request_url", c5672wr.e());
            jSONObject2.put("ad_request_post_body", c5672wr.d());
        }
        C5672wr c5672wr2 = c5378uW.f33835c;
        jSONObject2.put("base_url", c5672wr2.c());
        jSONObject2.put("signals", c5378uW.f33834b);
        AW aw = c5378uW.f33833a;
        jSONObject3.put("body", aw.f17351c);
        jSONObject3.put("headers", C0654z.a().t(aw.f17350b));
        jSONObject3.put("response_code", aw.f17349a);
        jSONObject3.put("latency", aw.f17352d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c5672wr2.h());
        return jSONObject;
    }
}
