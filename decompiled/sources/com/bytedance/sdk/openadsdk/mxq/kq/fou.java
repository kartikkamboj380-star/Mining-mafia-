package com.bytedance.sdk.openadsdk.mxq.kq;

import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.component.utils.wcx;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dgq;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.mxq.kq.fou;
import com.bytedance.sdk.openadsdk.utils.ebt;
import com.bytedance.sdk.openadsdk.utils.wol;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fou<T extends fou> implements bob {
    private String bob;
    private String dgq;
    private String kq;
    private String nn;
    private String oq;
    private String rjo;
    private String ubx;
    private String vvw;
    private String wki;
    private final String fou = BuildConfig.VERSION_NAME;
    private long csi = System.currentTimeMillis() / 1000;
    private int rhi = 0;
    private int syt = 0;

    private fou() {
        try {
            this.wki = ebt.kq();
        } catch (Throwable unused) {
            this.wki = com.unity3d.ads.BuildConfig.FLAVOR;
        }
    }

    private T mxq() {
        return this;
    }

    private JSONObject nze() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", wol.rhi());
            jSONObject.put("ua", wol.fou());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static fou<fou> oq() {
        return new fou<>();
    }

    public String bob() {
        return this.kq;
    }

    public String csi() {
        return this.oq;
    }

    public int dgq() {
        return this.rhi;
    }

    public String fou() {
        return this.ubx;
    }

    @Override // com.bytedance.sdk.openadsdk.mxq.kq.bob
    public JSONObject kq() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", rjo());
            jSONObject2.put("app_version", wol.syt());
            jSONObject2.put("timestamp", syt());
            jSONObject2.put("conn_type", wcx.oq(sns.kq()));
            jSONObject2.put(AppsFlyerProperties.APP_ID, TextUtils.isEmpty(dgq.oq().fou()) ? "" : dgq.oq().fou());
            jSONObject2.put("device_info", nze());
            if (!TextUtils.isEmpty(bob())) {
                jSONObject2.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, bob());
            }
            jSONObject2.put("error_code", ubx());
            if (!TextUtils.isEmpty(vvw())) {
                jSONObject2.put("error_msg", vvw());
            }
            if (!TextUtils.isEmpty(csi())) {
                jSONObject2.put("rit", csi());
            }
            if (!TextUtils.isEmpty(rhi())) {
                jSONObject2.put("creative_id", rhi());
            }
            if (dgq() > 0) {
                jSONObject2.put("adtype", dgq());
            }
            if (!TextUtils.isEmpty(nn())) {
                jSONObject2.put("req_id", nn());
            }
            if (!TextUtils.isEmpty(wki())) {
                jSONObject2.put("extra", wki());
            }
            String strFou = fou();
            if (TextUtils.isEmpty(strFou)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strFou);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.wki + "-" + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strFou)) {
                jSONObject2.put("event_extra", strFou);
            }
            if (!TextUtils.isEmpty(suf())) {
                jSONObject2.put("duration", suf());
            }
        } catch (Throwable th) {
            fax.bob("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    public String nn() {
        return this.rjo;
    }

    public String rhi() {
        return this.bob;
    }

    public String rjo() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public String suf() {
        return this.vvw;
    }

    public long syt() {
        return this.csi;
    }

    public int ubx() {
        return this.syt;
    }

    public String vvw() {
        return this.dgq;
    }

    public String wki() {
        return this.nn;
    }

    public T bob(String str) {
        this.oq = str;
        return (T) mxq();
    }

    public T csi(String str) {
        this.rjo = str;
        return (T) mxq();
    }

    public T fou(String str) {
        this.bob = str;
        return (T) mxq();
    }

    public T oq(String str) {
        this.ubx = str;
        return (T) mxq();
    }

    public T rhi(String str) {
        this.dgq = str;
        return (T) mxq();
    }

    public T rjo(String str) {
        this.nn = str;
        return (T) mxq();
    }

    public T syt(String str) {
        this.vvw = str;
        return (T) mxq();
    }

    public T oq(int i10) {
        this.syt = i10;
        return (T) mxq();
    }

    public T kq(String str) {
        this.kq = str;
        return (T) mxq();
    }

    public T kq(int i10) {
        this.rhi = i10;
        return (T) mxq();
    }
}
