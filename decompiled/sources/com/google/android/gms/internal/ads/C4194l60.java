package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4194l60 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f31195a;

    public C4194l60(Map map) {
        this.f31195a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Map map = this.f31195a;
        AF af = (AF) obj;
        if (map.isEmpty()) {
            return;
        }
        Bundle bundle = af.f17275a;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            if (!arrayDeque.isEmpty()) {
                AbstractC5874yS abstractC5874yS = (AbstractC5874yS) entry.getKey();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", abstractC5874yS.a());
                    jSONObject.put("event_type", abstractC5874yS.b());
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put((Long) it.next());
                    }
                    jSONObject.put("timestamps", jSONArray2);
                    jSONArray.put(jSONObject);
                } catch (JSONException e10) {
                    AbstractC0786o0.l("Failed putting the on-device storage record.", e10);
                }
            }
        }
        if (jSONArray.length() > 0) {
            bundle.putString("on_device_storage_records", jSONArray.toString());
        }
    }
}
