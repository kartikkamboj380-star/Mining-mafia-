package com.bytedance.sdk.openadsdk.core;

import G1.a;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ktb implements fgm {
    private static final Map<Integer, String> kq = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.ktb.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "screen_scale");
            put(6, "app_set_id_scope");
            put(7, "app_set_id");
            put(8, "installed_source");
            put(9, "app_running_time");
            put(10, "vendor");
            put(11, "model");
            put(12, "user_agent_device");
            put(13, "user_agent_webview");
            put(14, "sys_compiling_time");
            put(15, "sec_did");
            put(16, "url");
            put(17, "X-Argus");
            put(18, "X-Ladon");
            put(19, "X-Khronos");
            put(20, "X-Gorgon");
            put(21, "pangle_m");
            put(22, "screen_height");
            put(23, "screen_width");
            put(24, "rom_version");
            put(25, "carrier_name");
            put(26, "os_version");
            put(27, "conn_type");
            put(28, "boot");
            put(29, "feature_data");
            put(30, "t_ver");
            put(31, "aab");
            put(32, "w_ver");
            put(33, "is_fold");
            put(34, "abi");
            put(35, "is_multi");
        }
    };
    private int oq = 0;

    private boolean rhi(String str) {
        return "TX".equals(str);
    }

    public static void rjo() {
        try {
            com.bytedance.sdk.openadsdk.wcx.bob.oq(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ktb.3
                @Override // com.bytedance.sdk.openadsdk.wcx.fou
                public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                    com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                    kqVar.oq("bidding_token");
                    return kqVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAdManagerImpl", th.getMessage());
        }
    }

    public static void syt() {
        try {
            com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ktb.4
                @Override // com.bytedance.sdk.openadsdk.wcx.fou
                public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                    com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                    kqVar.oq("bidding_token");
                    return kqVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAdManagerImpl", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public String bob() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    /* JADX INFO: renamed from: csi, reason: merged with bridge method [inline-methods] */
    public ktb oq(String str) {
        dgq.oq().bob(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    /* JADX INFO: renamed from: fou, reason: merged with bridge method [inline-methods] */
    public ktb kq(String str) {
        dgq.oq().kq(str);
        return this;
    }

    public static void rhi() {
        try {
            com.bytedance.sdk.openadsdk.wcx.bob.kq(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.ktb.2
                @Override // com.bytedance.sdk.openadsdk.wcx.fou
                public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                    com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                    kqVar.oq("bidding_token");
                    return kqVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAdManagerImpl", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public fgm bob(int i10) {
        this.oq = i10;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public fgm csi(int i10) {
        dgq.oq().csi(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public int fou() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public fgm kq(int i10) {
        dgq.oq().rhi(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public fgm oq(int i10) {
        dgq.oq().fou(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public fgm bob(String str) {
        dgq.oq().syt(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public int csi() {
        return dgq.oq().ubx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public fgm fou(int i10) {
        dgq.oq().bob(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public fgm kq() {
        com.bytedance.sdk.component.utils.nze.kq("PangleSDK-7859");
        a.c("PangleSDK-7859");
        com.bytedance.sdk.component.utils.fax.kq("PangleSDK-7859");
        com.bytedance.sdk.component.utils.nze.oq();
        com.bytedance.sdk.component.rjo.kq.kq();
        a.a();
        com.bytedance.sdk.component.utils.fax.kq();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public int oq() {
        return dgq.oq().nn();
    }

    private JSONObject oq(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fgm
    public String kq(PAGBiddingRequest pAGBiddingRequest) {
        int size;
        try {
            com.bytedance.sdk.openadsdk.utils.wol.nn("getBiddingToken");
            com.bytedance.sdk.openadsdk.core.nn.bob.kq();
            rhi();
            String adxId = (pAGBiddingRequest == null || pAGBiddingRequest.getAdxId() == null) ? "" : pAGBiddingRequest.getAdxId();
            String strPfu = com.bytedance.sdk.openadsdk.core.settings.ubx.bob().pfu();
            if (!TextUtils.isEmpty(strPfu) && (!rhi(strPfu) || sns.fou().rs(adxId))) {
                if (dgq.oq().vvw()) {
                    syt();
                    return "";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_init", suf.csi() ? 1 : 0);
                String strUbx = sns.fou().ubx();
                String strHa = sns.fou().ha();
                if (strUbx != null && strHa != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("version", strUbx);
                    jSONObject2.put("param", strHa);
                    jSONObject.put("abtest", jSONObject2);
                }
                jSONObject.put("language", vvw.oq());
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.wol.rhi());
                if (pAGBiddingRequest != null) {
                    jSONObject.put("user_data", uml.kq(TextUtils.isEmpty(pAGBiddingRequest.getSlotId()) ? null : new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build()));
                }
                jSONObject.put("ts", System.currentTimeMillis() / 1000);
                String strOq = com.bytedance.sdk.openadsdk.multipro.fou.fou.oq("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                if (!strOq.isEmpty()) {
                    jSONObject.put("ipv6", strOq);
                } else {
                    String strOq2 = com.bytedance.sdk.openadsdk.multipro.fou.fou.oq("ttopenadsdk", "key_ipv4", "");
                    if (!strOq2.isEmpty()) {
                        jSONObject.put("ipv4", strOq2);
                    }
                }
                jSONObject.put("adx_id", adxId);
                Object objOz = sns.fou().oz();
                jSONObject.put("target_region", objOz);
                if (jSONObject.toString().getBytes().length <= 2680) {
                    com.bytedance.sdk.openadsdk.core.settings.ubx ubxVarFou = sns.fou();
                    com.bytedance.sdk.openadsdk.fax.kq.oq.kq.kq().kq(jSONObject);
                    if (pAGBiddingRequest != null) {
                        jSONObject.put("banner", oq(pAGBiddingRequest));
                    }
                    jSONObject.put("app_reg", ubxVarFou.ysx() ? 1 : 0);
                    Context contextKq = sns.kq();
                    jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.bob.rjo());
                    jSONObject.put("screen_scale", bss.rhi(contextKq));
                    jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.fou.oq());
                    jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.fou.bob());
                    jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.fou.fou());
                    jSONObject.put("app_running_time", (System.currentTimeMillis() - suf.kq()) / 1000);
                    jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.dgq.vvw.oq());
                    jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.dgq.vvw.bob());
                    jSONObject.put("gp_v_name", DeviceUtils.csi(contextKq));
                    jSONObject.put("gp_v_code", DeviceUtils.rhi(contextKq));
                    jSONObject.put("vendor", Build.MANUFACTURER);
                    jSONObject.put("model", Build.MODEL);
                    jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.wol.oq());
                    jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.wol.fou());
                    jSONObject.put("sys_compiling_time", vvw.oq(contextKq));
                    jSONObject.put("screen_height", bss.csi(contextKq));
                    jSONObject.put("screen_width", bss.bob(contextKq));
                    jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.ibd.kq());
                    jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.ha.kq());
                    jSONObject.put("os_version", Build.VERSION.RELEASE);
                    jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.wol.syt(contextKq));
                    if (ubxVarFou.ibd("boot")) {
                        jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                    }
                    com.bytedance.sdk.openadsdk.utils.wol.kq(jSONObject);
                    com.bytedance.sdk.openadsdk.core.nn.bob.kq(jSONObject);
                    com.bytedance.sdk.openadsdk.utils.syt.kq(jSONObject, contextKq);
                    jSONObject.put("is_multi", com.bytedance.sdk.openadsdk.multipro.oq.bob());
                    size = kq.size();
                } else {
                    size = 2;
                }
                while (size > 0 && jSONObject.toString().getBytes().length > 2680) {
                    jSONObject.remove(kq.get(Integer.valueOf(size)));
                    size--;
                }
                com.bytedance.sdk.openadsdk.rhi.oq.kq().kq(jSONObject);
                boolean zEt = com.bytedance.sdk.openadsdk.core.settings.ubx.et();
                JSONObject jSONObjectKq = kq(jSONObject, zEt);
                while (size > 0 && jSONObjectKq.toString().getBytes().length > 4096) {
                    jSONObject.remove(kq.get(Integer.valueOf(size)));
                    jSONObjectKq = kq(jSONObject, zEt);
                    size--;
                }
                if (jSONObjectKq.length() > 0) {
                    jSONObjectKq.put("target_region", objOz);
                }
                if (com.bytedance.sdk.component.utils.nze.fou()) {
                    jSONObjectKq.toString();
                    int length = jSONObjectKq.toString().getBytes().length;
                }
                jSONObjectKq.toString();
                rjo();
                return jSONObjectKq.toString();
            }
            syt();
            return "";
        } catch (Throwable unused) {
            syt();
            return "";
        }
    }

    private JSONObject kq(JSONObject jSONObject, boolean z9) {
        JSONObject jSONObjectKq;
        if (z9) {
            jSONObjectKq = PangleEncryptManager.encryptType4(jSONObject, new nb(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            ou.kq(jSONObjectKq);
        } else {
            jSONObjectKq = com.bytedance.sdk.component.utils.kq.kq(jSONObject);
        }
        return jSONObjectKq != null ? jSONObjectKq : new JSONObject();
    }
}
