package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ou {
    private int bob;
    private int csi;
    private String dgq;
    private int fou;
    private oq gm;
    private int kq;
    private int rhi;
    private JSONObject rjo;
    private int suf;
    private boolean ubx;
    private JSONObject vvw;
    private ktb wcx;
    private int wki;
    private int oq = 10;
    private int syt = 1;
    private kq nn = new kq();
    private int nze = 1;
    private String mxq = "Next Ad";
    private String sns = "Next ad in %1$ds";

    public static ou kq(String str) {
        ou ouVar = new ou();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                ouVar.kq = jSONObject.optInt("auto_switch");
                ouVar.oq = jSONObject.optInt("playable_preload_count");
                ouVar.bob = jSONObject.optInt("disable_on_interaction");
                ouVar.fou = jSONObject.optInt("ceiling_type");
                ouVar.csi = jSONObject.optInt("can_loop");
                ouVar.rhi = jSONObject.optInt("multi_skip_time", -1);
                ouVar.syt = jSONObject.optInt("load_more_strategy");
                ouVar.nze = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                ouVar.rjo = jSONObjectOptJSONObject;
                if (jSONObjectOptJSONObject != null) {
                    ktb ktbVarKq = ktb.kq(jSONObjectOptJSONObject);
                    ouVar.wcx = ktbVarKq;
                    if (ktbVarKq != null && !TextUtils.isEmpty(ktbVarKq.bob())) {
                        com.bytedance.sdk.openadsdk.core.ubx.kq.oq.kq().kq(new com.bytedance.sdk.openadsdk.core.ubx.syt.kq().kq(ouVar.wcx.kq()).oq(ouVar.wcx.oq()).bob(ouVar.wcx.bob()).fou(ouVar.wcx.fou()), "guide");
                    }
                    int iOptInt = ouVar.rjo.optInt("delay_show_time", 5);
                    ouVar.wki = iOptInt;
                    if (iOptInt < 0) {
                        ouVar.wki = 5;
                    }
                    int iOptInt2 = ouVar.rjo.optInt("dismiss_after_idle_time", 3);
                    ouVar.suf = iOptInt2;
                    if (iOptInt2 <= 0) {
                        ouVar.suf = 3;
                    }
                }
                ouVar.dgq = jSONObject.optString("agg_endcard_url");
                ouVar.ubx = jSONObject.optBoolean("has_more");
                ouVar.vvw = jSONObject.optJSONObject("session_params");
                ouVar.nn = kq.kq(jSONObject.optJSONObject("layout_config"));
                ouVar.gm = oq.kq(jSONObject.optJSONObject("progress_config"));
            } catch (JSONException unused) {
            }
        }
        return ouVar;
    }

    public JSONObject bob() {
        ktb ktbVar = this.wcx;
        if (ktbVar == null) {
            return null;
        }
        return ktbVar.csi();
    }

    public int csi() {
        return this.suf;
    }

    public int dgq() {
        return this.rhi;
    }

    public int fou() {
        return this.wki;
    }

    public int mxq() {
        return this.oq;
    }

    public boolean nn() {
        return this.csi == 1;
    }

    public boolean nze() {
        return this.kq == 1;
    }

    public JSONObject oq() {
        ktb ktbVar = this.wcx;
        if (ktbVar == null) {
            return null;
        }
        try {
            String strFou = ktbVar.fou();
            if (!TextUtils.isEmpty(strFou)) {
                return new JSONObject(strFou);
            }
            String strKq = com.bytedance.sdk.openadsdk.core.ubx.kq.oq.kq().kq("guide", this.wcx.kq(), this.wcx.oq());
            if (TextUtils.isEmpty(strKq)) {
                return null;
            }
            return new JSONObject(strKq);
        } catch (JSONException unused) {
            return null;
        }
    }

    public kq rhi() {
        return this.nn;
    }

    public String rjo() {
        return this.dgq;
    }

    public oq sns() {
        return this.gm;
    }

    public boolean suf() {
        return this.bob == 1;
    }

    public int syt() {
        return this.syt;
    }

    public boolean ubx() {
        return this.fou == 1;
    }

    public JSONObject vvw() {
        return this.vvw;
    }

    public JSONObject wcx() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auto_switch", this.kq);
            jSONObject.put("playable_preload_count", this.oq);
            jSONObject.put("disable_on_interaction", this.bob);
            jSONObject.put("ceiling_type", this.fou);
            jSONObject.put("can_loop", this.csi);
            jSONObject.put("multi_skip_time", this.rhi);
            jSONObject.put("load_more_strategy", this.syt);
            jSONObject.put("report_show_by_percent", this.nze);
            jSONObject.put("gesture_tpl_info", this.rjo);
            jSONObject.put("agg_endcard_url", this.dgq);
            jSONObject.put("layoutConfig", this.nn.rhi());
            jSONObject.put("has_more", this.ubx);
            jSONObject.put("session_params", this.vvw);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean wki() {
        return this.ubx;
    }

    public static class kq {
        private int bob;
        private int csi;
        private int fou;
        private int kq;
        private int oq;

        public static kq kq(JSONObject jSONObject) {
            kq kqVar = new kq();
            if (jSONObject == null) {
                return kqVar;
            }
            kqVar.kq = Math.max(0, jSONObject.optInt("padding_left", 0));
            kqVar.oq = Math.max(0, jSONObject.optInt("padding_right", 0));
            kqVar.bob = Math.max(0, jSONObject.optInt("padding_top", 0));
            kqVar.fou = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            kqVar.csi = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return kqVar;
        }

        public int bob() {
            return this.kq;
        }

        public int csi() {
            return this.csi;
        }

        public int fou() {
            return this.oq;
        }

        public int oq() {
            return this.bob;
        }

        public JSONObject rhi() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("padding_left", this.kq);
                jSONObject.put("padding_right", this.oq);
                jSONObject.put("padding_top", this.bob);
                jSONObject.put("padding_bottom", this.fou);
                jSONObject.put("card_spacing", this.csi);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public int kq() {
            return this.fou;
        }
    }

    public static class oq {
        private String bob;
        private float csi;
        private float fou;
        private int kq;
        private String oq;

        public static oq kq(JSONObject jSONObject) {
            oq oqVar = new oq();
            if (jSONObject == null) {
                return oqVar;
            }
            oqVar.kq = jSONObject.optInt("progress_type", 0);
            oqVar.oq = jSONObject.optString("progress_color");
            oqVar.bob = jSONObject.optString("progress_background_color");
            oqVar.fou = jSONObject.optInt("progress_size", 0);
            oqVar.csi = jSONObject.optInt("bar_radius", 0);
            return oqVar;
        }

        public String bob() {
            return this.bob;
        }

        public float csi() {
            return this.csi;
        }

        public float fou() {
            return this.fou;
        }

        public String oq() {
            return this.oq;
        }

        public int kq() {
            return this.kq;
        }
    }

    public boolean kq() {
        return this.nze == 1;
    }
}
