package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private String bob;
    private uml csi;
    private int dgq;
    private String kq;
    private jhe nn;
    private int oq;
    private ou rhi;
    private String ubx;
    private uml vvw;
    private List<uml> fou = new ArrayList();
    private JSONObject rjo = new JSONObject();
    private volatile boolean syt = false;

    public int bob() {
        return this.oq;
    }

    public boolean csi() {
        List<uml> list = this.fou;
        return list != null && list.size() > 0;
    }

    public void dgq() {
        this.syt = false;
    }

    public List<uml> fou() {
        return this.fou;
    }

    public JSONObject kq() {
        return this.rjo;
    }

    public boolean nn() {
        return this.dgq == 1;
    }

    public uml nze() {
        return this.csi;
    }

    public String oq() {
        uml umlVarRhi = rhi();
        return umlVarRhi != null ? umlVarRhi.jp() : "";
    }

    public uml rhi() {
        if (this.fou.size() > 0) {
            return this.fou.get(0);
        }
        return null;
    }

    public jhe rjo() {
        return this.nn;
    }

    public String suf() {
        return this.ubx;
    }

    public boolean syt() {
        return this.syt;
    }

    public uml ubx() {
        return this.vvw;
    }

    public ou vvw() {
        return this.rhi;
    }

    public JSONObject wki() {
        try {
            JSONObject jSONObject = new JSONObject();
            jhe jheVarRjo = rjo();
            if (jheVarRjo != null) {
                jSONObject.put("loop_config", jheVarRjo.ubx());
            }
            ou ouVarVvw = vvw();
            if (ouVarVvw != null) {
                jSONObject.put("multi_ad_config", ouVarVvw.wcx());
            }
            List<uml> list = this.fou;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.fou.size(); i10++) {
                    jSONArray.put(this.fou.get(i10).ezl());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("multi_ad_style", this.dgq);
            jSONObject.put("request_id", this.kq);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.kq("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    public void bob(String str) {
        this.ubx = str;
    }

    public void kq(JSONObject jSONObject) {
        this.rjo = jSONObject;
    }

    public void kq(String str) {
        this.kq = str;
    }

    public void kq(int i10) {
        this.oq = i10;
    }

    public void oq(String str) {
        this.bob = str;
    }

    public void kq(uml umlVar) {
        this.fou.add(umlVar);
        if (this.vvw == null) {
            this.vvw = umlVar;
        }
    }

    public void oq(int i10) {
        this.dgq = i10;
    }

    public static kq oq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            kq kqVar = new kq();
            kqVar.kq(jhe.kq(jSONObject.optJSONObject("loop_config")));
            kqVar.oq(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    uml umlVarKq = com.bytedance.sdk.openadsdk.core.oq.kq(jSONArrayOptJSONArray.optJSONObject(i10), null, null, kqVar, i10);
                    if (umlVarKq != null) {
                        arrayList.add(umlVarKq);
                    }
                }
                kqVar.kq(arrayList);
            }
            kqVar.kq(jSONObject.optString("request_id", ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                kqVar.kq(ou.kq(strOptString));
            }
            return kqVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.kq("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void kq(List<uml> list) {
        this.fou = list;
        if (list.isEmpty()) {
            return;
        }
        this.vvw = list.get(0);
    }

    public static Map<String, uml> kq(kq kqVar) {
        if (kqVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (uml umlVar : kqVar.fou()) {
            if (!TextUtils.isEmpty(umlVar.ugp())) {
                map.put(umlVar.ugp(), umlVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void kq(jhe jheVar) {
        this.nn = jheVar;
    }

    public void kq(ou ouVar) {
        this.rhi = ouVar;
    }

    public void oq(uml umlVar) {
        this.csi = umlVar;
    }
}
