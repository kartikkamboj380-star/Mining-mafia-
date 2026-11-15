package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private List<Integer> bob;
    private List<String> csi;
    private int fou;
    private int kq;
    private int oq;
    private int rhi;
    private int rjo;

    public List<String> bob() {
        return this.csi;
    }

    public int csi() {
        return this.oq;
    }

    public int fou() {
        return this.kq;
    }

    public boolean kq() {
        return this.rhi == 1;
    }

    public int oq() {
        int i10 = this.rjo;
        if (i10 >= 2) {
            return i10;
        }
        return 0;
    }

    public List<Integer> rhi() {
        return this.bob;
    }

    public int rjo() {
        return this.fou;
    }

    public JSONObject syt() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.kq);
            jSONObject.put("interceptor_y", this.oq);
            if (this.bob != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.bob.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.fou);
            if (this.csi != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.csi.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.rhi);
            jSONObject.put("boc_index", this.rjo);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob(th.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    public void bob(int i10) {
        this.kq = i10;
    }

    public void csi(int i10) {
        this.fou = i10;
    }

    public void fou(int i10) {
        this.oq = i10;
    }

    public void kq(int i10) {
        this.rhi = i10;
    }

    public void oq(int i10) {
        this.rjo = i10;
    }

    public void kq(List<String> list) {
        this.csi = list;
    }

    public void oq(List<Integer> list) {
        this.bob = list;
    }
}
