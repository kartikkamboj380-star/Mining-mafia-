package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4911qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32727a;

    public C4911qo(JSONObject jSONObject) throws JSONException {
        if (L4.p.j(2)) {
            AbstractC0786o0.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                C4785po c4785po = new C4785po(jSONArray.getJSONObject(i11));
                "banner".equalsIgnoreCase(c4785po.f32477c);
                arrayList.add(c4785po);
                if (i10 < 0) {
                    Iterator it = c4785po.f32475a.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i10 = i11;
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f32727a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            G4.t.B();
            C5036ro.a(jSONObjectOptJSONObject, "click_urls");
            G4.t.B();
            C5036ro.a(jSONObjectOptJSONObject, "imp_urls");
            G4.t.B();
            C5036ro.a(jSONObjectOptJSONObject, "downloaded_imp_urls");
            G4.t.B();
            C5036ro.a(jSONObjectOptJSONObject, "nofill_urls");
            G4.t.B();
            C5036ro.a(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            C2519Ur.a(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
