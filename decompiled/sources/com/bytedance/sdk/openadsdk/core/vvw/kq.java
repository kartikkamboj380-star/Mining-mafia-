package com.bytedance.sdk.openadsdk.core.vvw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.uml;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    bob bob;
    private String csi;
    private int dgq;
    private String fou;
    private int nn;
    oq oq;
    private String rhi;
    private String rjo;
    private double syt;
    private String vvw;
    final com.bytedance.sdk.openadsdk.core.model.fou kq = new com.bytedance.sdk.openadsdk.core.model.fou();
    private String ubx = "VAST_ACTION_BUTTON";

    private JSONArray nze() {
        Set<nn> setOq = this.kq.oq();
        if (setOq == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (nn nnVar : setOq) {
            if (nnVar != null) {
                jSONArray.put(nnVar.fou());
            }
        }
        return jSONArray;
    }

    public bob bob() {
        return this.bob;
    }

    public String csi() {
        return this.csi;
    }

    public String dgq() {
        bob bobVar;
        String str = this.rhi;
        if (!TextUtils.isEmpty(this.vvw)) {
            String str2 = this.vvw;
            this.vvw = null;
            return str2;
        }
        String str3 = this.ubx;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            oq oqVar = this.oq;
            if (oqVar != null && !TextUtils.isEmpty(oqVar.syt)) {
                str = this.oq.syt;
            }
        } else if (str3.equals("VAST_END_CARD") && (bobVar = this.bob) != null && !TextUtils.isEmpty(bobVar.syt)) {
            str = this.bob.syt;
        }
        this.ubx = "VAST_ACTION_BUTTON";
        return str;
    }

    public String fou() {
        return this.fou;
    }

    public fou kq() {
        return this.kq.kq();
    }

    public JSONObject nn() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        fou fouVarKq = this.kq.kq();
        if (fouVarKq != null) {
            jSONObject.put("videoTrackers", fouVarKq.kq());
        }
        oq oqVar = this.oq;
        if (oqVar != null) {
            jSONObject.put("vastIcon", oqVar.kq());
        }
        bob bobVar = this.bob;
        if (bobVar != null) {
            jSONObject.put("endCard", bobVar.kq());
        }
        jSONObject.put("title", this.fou);
        jSONObject.put("description", this.csi);
        jSONObject.put("clickThroughUrl", this.rhi);
        jSONObject.put("videoUrl", this.rjo);
        jSONObject.put("videDuration", this.syt);
        jSONObject.put("videoWidth", this.dgq);
        jSONObject.put("videoHeight", this.nn);
        jSONObject.put("viewabilityVendor", nze());
        return jSONObject;
    }

    public oq oq() {
        return this.oq;
    }

    public String rhi() {
        return this.rhi;
    }

    public String rjo() {
        return this.rjo;
    }

    public com.bytedance.sdk.openadsdk.core.model.fou suf() {
        return this.kq;
    }

    public double syt() {
        return this.syt;
    }

    public int ubx() {
        return this.dgq;
    }

    public int vvw() {
        return this.nn;
    }

    public Set<nn> wki() {
        return this.kq.oq();
    }

    public void bob(String str) {
        this.rhi = str;
    }

    public void csi(String str) {
        this.ubx = str;
    }

    public void fou(String str) {
        this.rjo = str;
    }

    public void kq(oq oqVar) {
        if (oqVar != null) {
            oqVar.kq(this.rjo);
        }
        this.oq = oqVar;
    }

    public void oq(String str) {
        this.csi = str;
    }

    public void rhi(String str) {
        this.vvw = str;
    }

    public void oq(int i10) {
        this.nn = i10;
    }

    public void kq(bob bobVar) {
        if (bobVar != null) {
            bobVar.kq(this.rjo);
        }
        this.bob = bobVar;
    }

    public void kq(String str) {
        this.fou = str;
    }

    public void kq(double d10) {
        this.syt = d10;
    }

    public static kq kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        kq kqVar = new kq();
        fou fouVarKq = kqVar.kq.kq();
        if (fouVarKq == null) {
            fouVarKq = new fou();
            kqVar.kq.kq(fouVarKq);
        }
        fouVarKq.kq(jSONObject.optJSONObject("videoTrackers"));
        kqVar.oq = oq.kq(jSONObject.optJSONObject("vastIcon"));
        kqVar.bob = bob.oq(jSONObject.optJSONObject("endCard"));
        kqVar.fou = jSONObject.optString("title");
        kqVar.csi = jSONObject.optString("description");
        kqVar.rhi = jSONObject.optString("clickThroughUrl");
        kqVar.rjo = jSONObject.optString("videoUrl");
        kqVar.syt = jSONObject.optDouble("videDuration");
        kqVar.dgq = jSONObject.optInt("videoWidth");
        kqVar.dgq = jSONObject.optInt("videoHeight");
        Set<nn> setOq = kqVar.kq.oq();
        if (setOq == null) {
            setOq = new HashSet<>();
            kqVar.kq.kq(setOq);
        }
        setOq.addAll(nn.kq(jSONObject.optJSONArray("viewabilityVendor")));
        return kqVar;
    }

    public void kq(uml umlVar) {
        this.kq.kq(umlVar);
        oq oqVar = this.oq;
        if (oqVar != null) {
            oqVar.kq(umlVar);
        }
        bob bobVar = this.bob;
        if (bobVar != null) {
            bobVar.kq(umlVar);
        }
    }

    public void kq(int i10) {
        this.dgq = i10;
    }

    public void kq(Set<nn> set) {
        this.kq.oq(set);
    }
}
