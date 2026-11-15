package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ubx {
    private JSONObject bob;
    private Map<String, Object> fou;
    private Context kq;
    private JSONObject oq;

    public void kq(Context context) {
        this.kq = context;
    }

    public void oq(JSONObject jSONObject) {
        this.bob = jSONObject;
    }

    public void kq(JSONObject jSONObject) {
        this.oq = jSONObject;
    }

    public Map<String, Object> oq() {
        return this.fou;
    }

    public JSONObject kq() {
        return this.bob;
    }

    public void kq(Map<String, Object> map) {
        this.fou = map;
    }
}
