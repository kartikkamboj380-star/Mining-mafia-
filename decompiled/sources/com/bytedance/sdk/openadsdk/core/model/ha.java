package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bykv.vk.openvk.kq.kq.kq.bob.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ha {
    private boolean bob;
    private String csi;
    private int dgq;
    private int fou;
    private int kq;
    private String mxq;
    private boolean nn;
    private int nze;
    private int oq;
    private String rhi;
    private int rjo;
    private String sns;
    private int suf;
    private int syt;
    private int ubx;
    private int vvw;
    private String wcx;
    private int wki;

    public ha(JSONObject jSONObject) {
        this.vvw = 5;
        this.wki = 5;
        this.suf = 10;
        this.nze = 20;
        this.mxq = "Next Ad";
        this.sns = "Next ad in %1$ds";
        this.wcx = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.bob = jSONObject.optBoolean("is_playable");
        this.fou = jSONObject.optInt("playable_type", 0);
        this.csi = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.rhi = jSONObjectOptJSONObject.optString("playable_url", "");
            this.rjo = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.oq = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.kq = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iKq = kq(this.fou);
            this.syt = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iKq);
            this.dgq = jSONObjectOptJSONObject.optInt("playable_js_timeout", iKq);
            this.nn = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.vvw = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.wki = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.suf = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.nze = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.sns = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.mxq = jSONObjectOptJSONObject.optString("next_ad_text");
            this.wcx = jSONObjectOptJSONObject.optString("play_now_text");
            int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
            this.ubx = iOptInt;
            if (iOptInt == 0 || iOptInt == 1 || iOptInt == 2) {
                return;
            }
            this.ubx = 0;
        }
    }

    public static int dgq(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return 0;
        }
        return haVarRs.ubx;
    }

    public static int ebt(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return 0;
        }
        return haVarRs.bob();
    }

    public static boolean fax(uml umlVar) {
        ha haVarRs = rs(umlVar);
        return haVarRs != null && haVarRs.nn();
    }

    public static long gm(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return 5L;
        }
        return haVarRs.dgq();
    }

    private static int ha(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return 0;
        }
        return haVarRs.fou;
    }

    public static int ibd(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return 0;
        }
        return haVarRs.fou();
    }

    public static String jhe(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return null;
        }
        return haVarRs.csi();
    }

    private static int kq(int i10) {
        return i10 == 1 ? 10 : 5;
    }

    public static int mq(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return 0;
        }
        return haVarRs.kq();
    }

    public static boolean mxq(uml umlVar) {
        return false;
    }

    public static String nb(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return null;
        }
        return haVarRs.rhi();
    }

    public static String nn(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return null;
        }
        return haVarRs.csi;
    }

    public static int nze(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return 0;
        }
        return haVarRs.rjo;
    }

    public static int ou(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return 0;
        }
        return haVarRs.oq();
    }

    private static ha rs(uml umlVar) {
        if (umlVar == null) {
            return null;
        }
        return umlVar.xk();
    }

    public static long sns(uml umlVar) {
        return Math.max(wcx(umlVar), gm(umlVar));
    }

    public static boolean suf(uml umlVar) {
        c cVarJob = umlVar.job();
        return cVarJob != null && cVarJob.i() == 1;
    }

    public static boolean syt(uml umlVar) {
        ha haVarXk = umlVar.xk();
        return haVarXk != null && umlVar.bpo() && haVarXk.bob && haVarXk.oq == 1;
    }

    public static String ubx(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return null;
        }
        return haVarRs.rhi;
    }

    public static String uml(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return null;
        }
        return haVarRs.rjo();
    }

    public static String vvw(uml umlVar) {
        if (umlVar == null) {
            return null;
        }
        ha haVarXk = umlVar.xk();
        if (haVarXk != null && haVarXk.bob) {
            String str = haVarXk.rhi;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (umlVar.ui() == 20) {
            return umlVar.ze();
        }
        if (umlVar.job() != null) {
            return umlVar.job().L();
        }
        return null;
    }

    public static long wcx(uml umlVar) {
        ha haVarRs = rs(umlVar);
        if (haVarRs == null) {
            return 5L;
        }
        return haVarRs.syt();
    }

    public static boolean wki(uml umlVar) {
        return true;
    }

    public int bob() {
        return this.suf;
    }

    public String csi() {
        return this.mxq;
    }

    public int fou() {
        return this.nze;
    }

    public int oq() {
        return this.wki;
    }

    public String rhi() {
        return this.sns;
    }

    public String rjo() {
        return this.wcx;
    }

    public static boolean bob(uml umlVar) {
        return oq(umlVar) && ha(umlVar) == 1;
    }

    public static boolean csi(uml umlVar) {
        ha haVarRs = rs(umlVar);
        return haVarRs != null && umlVar.bpo() && haVarRs.bob && !TextUtils.isEmpty(vvw(umlVar));
    }

    public static boolean fou(uml umlVar) {
        return bob(umlVar) && !rjo(umlVar);
    }

    public static boolean oq(uml umlVar) {
        ha haVarRs = rs(umlVar);
        return (haVarRs == null || !haVarRs.bob || TextUtils.isEmpty(vvw(umlVar))) ? false : true;
    }

    public static boolean rhi(uml umlVar) {
        return csi(umlVar) && ha(umlVar) == 1;
    }

    public static boolean rjo(uml umlVar) {
        ha haVarXk = umlVar.xk();
        return haVarXk != null && haVarXk.bob && haVarXk.oq == 1;
    }

    public int kq() {
        return this.vvw;
    }

    public static int kq(uml umlVar) {
        int i10;
        ha haVarXk = umlVar.xk();
        if (haVarXk != null && (i10 = haVarXk.kq) >= 0 && i10 <= 100) {
            return i10;
        }
        return 0;
    }

    public int dgq() {
        return this.dgq;
    }

    public boolean nn() {
        return this.nn;
    }

    public int syt() {
        return this.syt;
    }

    public void kq(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.bob);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.fax.bob("PlayableModel", e10.getMessage());
        }
        if (!TextUtils.isEmpty(this.rhi)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.rhi);
                jSONObject2.put("playable_orientation", this.rjo);
                jSONObject2.put("new_style", this.oq);
                jSONObject2.put("close_2_app", this.kq);
                jSONObject2.put("playable_webview_timeout", this.syt);
                jSONObject2.put("playable_js_timeout", this.dgq);
                jSONObject2.put("playable_backup_enable", this.nn ? 1 : 0);
                jSONObject2.put("wait_tips_time", this.vvw);
                jSONObject2.put("auto_to_next_time", this.wki);
                jSONObject2.put("next_ad_tips_show_time", this.suf);
                jSONObject2.put("max_show_time", this.nze);
                jSONObject2.put("next_ad_in_xs", this.sns);
                jSONObject2.put("play_now_text", this.wcx);
                jSONObject2.put("next_ad_text", this.mxq);
                jSONObject2.put("countdown_show_type", this.ubx);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e11) {
                com.bytedance.sdk.component.utils.fax.bob("PlayableModel", e11.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.fou);
        } catch (JSONException e12) {
            com.bytedance.sdk.component.utils.fax.bob("PlayableModel", e12.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.csi);
        } catch (JSONException e13) {
            com.bytedance.sdk.component.utils.fax.bob("PlayableModel", e13.getMessage());
        }
    }
}
