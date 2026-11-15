package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4785po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32477c;

    public C4785po(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.f32475a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        G4.t.B();
        C5036ro.a(jSONObject, "clickurl");
        G4.t.B();
        C5036ro.a(jSONObject, "imp_urls");
        G4.t.B();
        C5036ro.a(jSONObject, "downloaded_imp_urls");
        G4.t.B();
        C5036ro.a(jSONObject, "fill_urls");
        G4.t.B();
        C5036ro.a(jSONObject, "video_start_urls");
        G4.t.B();
        C5036ro.a(jSONObject, "video_complete_urls");
        G4.t.B();
        C5036ro.a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            G4.t.B();
            C5036ro.a(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY);
        this.f32476b = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        G4.t.B();
        C5036ro.a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.f32477c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
