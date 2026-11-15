package com.bytedance.sdk.openadsdk.fou;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.core.model.ha;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.utils.ebt;
import com.bytedance.sdk.openadsdk.utils.nz;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq implements com.bytedance.sdk.component.rhi.kq.fou.kq.oq {
    private static final Set<String> nn = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> ubx = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.fou.kq.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };
    private boolean bob;
    private long csi;
    private int dgq;
    private com.bytedance.sdk.openadsdk.fou.oq.kq fax;
    private long fou;
    private String gm;
    private String jhe;
    public final String kq;
    private String mq;
    private String mxq;
    private String nb;
    private String nze;
    protected final JSONObject oq;
    private final String rhi;
    private int rjo;
    private String sns;
    private String suf;
    private int syt;
    private int uml;
    private final AtomicBoolean vvw;
    private String wcx;
    private JSONObject wki;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.fou.kq$kq, reason: collision with other inner class name */
    public static final class C0300kq {
        private String bob;
        private String csi;
        private String dgq;
        private String fax;
        private String fou;
        private boolean gm;
        public int kq;
        private final long mxq;
        private JSONObject nn;
        private com.bytedance.sdk.openadsdk.fou.oq.kq nze;
        private String oq;
        private String rhi;
        private String rjo;
        private int sns;
        private com.bytedance.sdk.openadsdk.fou.oq.oq suf;
        private String syt;
        private String ubx;
        private final int vvw;
        private int wcx;
        private String wki;

        public C0300kq(long j10, uml umlVar) {
            this.sns = -1;
            this.wcx = -1;
            this.kq = -1;
            if (umlVar != null) {
                this.gm = ha.oq(umlVar);
                this.sns = umlVar.uaj();
                this.wcx = umlVar.ui();
                this.kq = umlVar.pcj();
            }
            this.mxq = j10;
            this.vvw = com.bytedance.sdk.component.utils.wcx.bob(com.bytedance.sdk.openadsdk.core.sns.kq());
        }

        public C0300kq bob(String str) {
            this.fou = str;
            return this;
        }

        public C0300kq csi(String str) {
            this.syt = str;
            return this;
        }

        public C0300kq fou(String str) {
            this.csi = str;
            return this;
        }

        public C0300kq oq(String str) {
            this.bob = str;
            return this;
        }

        public C0300kq rhi(String str) {
            this.dgq = str;
            return this;
        }

        public C0300kq rjo(String str) {
            this.rjo = str;
            return this;
        }

        public C0300kq syt(String str) {
            this.fax = str;
            return this;
        }

        public C0300kq kq(String str) {
            this.wki = str;
            return this;
        }

        public C0300kq kq(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.nn = jSONObject;
            return this;
        }

        public void kq(com.bytedance.sdk.openadsdk.fou.oq.kq kqVar) {
            com.bytedance.sdk.openadsdk.rhi.oq.kq().kq(this.fou, this.fax, this.rjo, this.bob);
            this.nze = kqVar;
            final kq kqVar2 = new kq(this);
            try {
                com.bytedance.sdk.openadsdk.fou.oq.oq oqVar = this.suf;
                if (oqVar != null) {
                    oqVar.kq(kqVar2.oq, this.mxq);
                } else {
                    new com.bytedance.sdk.openadsdk.fou.oq.bob().kq(kqVar2.oq, this.mxq);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                nz.bob(new com.bytedance.sdk.component.syt.syt("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.fou.kq.kq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.fou.kq.oq.kq(kqVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.fou.kq.oq.kq(kqVar2);
            }
        }
    }

    public kq(String str, JSONObject jSONObject) {
        this.rhi = "adiff";
        this.vvw = new AtomicBoolean(false);
        this.wki = new JSONObject();
        this.kq = str;
        this.oq = jSONObject;
    }

    private boolean kq(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean oq(String str) {
        str.getClass();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private void rhi() {
        JSONObject jSONObject = this.wki;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.wki.optString("category");
            String strOptString3 = this.wki.optString("log_extra");
            if (kq(this.sns, this.mxq, this.jhe)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !oq(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.sns) || TextUtils.equals(this.sns, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.mxq) || !oq(this.mxq)) && (TextUtils.isEmpty(strOptString2) || !oq(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.jhe) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!kq(this.sns, this.mxq, this.jhe)) {
            return;
        }
        this.fou = com.bytedance.sdk.openadsdk.fou.kq.oq.kq.incrementAndGet();
    }

    private void rjo() throws JSONException {
        this.oq.putOpt("app_log_url", this.nb);
        this.oq.putOpt("tag", this.suf);
        this.oq.putOpt("label", this.nze);
        this.oq.putOpt("category", this.mxq);
        if (!TextUtils.isEmpty(this.sns)) {
            try {
                this.oq.putOpt("value", Long.valueOf(Long.parseLong(this.sns)));
            } catch (NumberFormatException unused) {
                this.oq.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.gm)) {
            try {
                this.oq.putOpt("ext_value", Long.valueOf(Long.parseLong(this.gm)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.jhe)) {
            this.oq.putOpt("log_extra", this.jhe);
        }
        if (!TextUtils.isEmpty(this.mq)) {
            try {
                this.oq.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.mq)));
            } catch (NumberFormatException unused3) {
            }
        }
        kq(this.oq, this.nze);
        try {
            this.oq.putOpt("nt", Integer.valueOf(this.uml));
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.wki.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.oq.putOpt(next, this.wki.opt(next));
        }
    }

    public JSONObject bob() {
        if (this.vvw.get()) {
            return this.oq;
        }
        try {
            rjo();
            if (this.oq.has("ad_extra_data")) {
                Object objOpt = this.oq.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.oq.put("ad_extra_data", kq((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.oq.put("ad_extra_data", kq(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e10) {
                        fax.bob("AdEvent", "json error", e10.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.kq);
                    if (this.bob) {
                        jSONObject.put("interaction_method", this.rjo);
                        jSONObject.put("real_interaction_method", this.syt);
                        jSONObject.put("image_mode", this.dgq);
                    }
                    this.oq.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e11) {
                    fax.bob("AdEvent", "json error", e11.getMessage());
                }
            }
            this.vvw.set(true);
        } catch (Throwable unused) {
        }
        return this.oq;
    }

    public boolean csi() {
        Set<String> setSuf;
        if (this.oq == null || (setSuf = com.bytedance.sdk.openadsdk.core.sns.fou().suf()) == null) {
            return false;
        }
        String strOptString = this.oq.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setSuf.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.nze)) {
            return false;
        }
        return setSuf.contains(this.nze);
    }

    public String fou() {
        return this.kq;
    }

    private void oq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : ubx.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(ubx.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject kq(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.kq);
            }
            if (this.bob) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.rjo);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.syt);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.dgq);
                }
            }
            oq(jSONObject);
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.kq + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th) {
            fax.bob("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    kq(C0300kq c0300kq) {
        this.rhi = "adiff";
        this.vvw = new AtomicBoolean(false);
        this.wki = new JSONObject();
        if (!TextUtils.isEmpty(c0300kq.oq)) {
            this.kq = c0300kq.oq;
        } else {
            this.kq = ebt.kq();
        }
        this.fax = c0300kq.nze;
        this.jhe = c0300kq.rhi;
        this.suf = c0300kq.bob;
        this.nze = c0300kq.fou;
        if (!TextUtils.isEmpty(c0300kq.csi)) {
            this.mxq = c0300kq.csi;
        } else {
            this.mxq = "app_union";
        }
        this.mq = c0300kq.ubx;
        this.sns = c0300kq.syt;
        this.gm = c0300kq.dgq;
        this.wcx = c0300kq.rjo;
        this.uml = c0300kq.vvw;
        this.nb = c0300kq.wki;
        this.wki = c0300kq.nn = c0300kq.nn != null ? c0300kq.nn : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.oq = jSONObject;
        if (!TextUtils.isEmpty(c0300kq.wki)) {
            try {
                jSONObject.put("app_log_url", c0300kq.wki);
            } catch (JSONException e10) {
                fax.bob("AdEvent", e10.getMessage());
            }
        }
        this.rjo = c0300kq.sns;
        this.syt = c0300kq.wcx;
        this.dgq = c0300kq.kq;
        this.bob = c0300kq.gm;
        this.csi = System.currentTimeMillis();
        rhi();
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq.oq
    public long oq() {
        return this.fou;
    }

    public JSONObject kq(boolean z9) {
        JSONObject jSONObjectBob = bob();
        try {
            if (z9) {
                JSONObject jSONObject = new JSONObject(jSONObjectBob.toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject == null) {
                    return jSONObject;
                }
                jSONObjectOptJSONObject.remove("app_log_url");
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObjectBob.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e10) {
            fax.bob("AdEvent", e10.getMessage());
            return jSONObjectBob;
        }
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq.oq
    public JSONObject kq(String str) {
        return bob();
    }

    @Override // com.bytedance.sdk.component.rhi.kq.fou.kq.oq
    public long kq() {
        return this.csi;
    }

    private static void kq(JSONObject jSONObject, String str) {
        try {
            Set<String> set = nn;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
        } catch (Throwable th) {
            fax.bob("AdEvent", th);
        }
    }
}
