package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.syt.syt;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.nb;
import com.bytedance.sdk.openadsdk.core.settings.ubx;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.core.vvw;
import com.bytedance.sdk.openadsdk.multipro.fou.fou;
import com.bytedance.sdk.openadsdk.utils.nz;
import com.bytedance.sdk.openadsdk.utils.wol;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.services.UnityAdsConstants;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ApmHelper {
    private static String bob = null;
    private static oq csi = null;
    private static boolean fou = false;
    private static volatile boolean kq = false;
    private static final AtomicBoolean oq = new AtomicBoolean(false);
    private static kq rhi;

    private static class kq {
        public final Throwable bob;
        public final String kq;
        public final String oq;

        public kq(String str, String str2, Throwable th) {
            this.kq = str;
            this.oq = str2;
            this.bob = th;
        }
    }

    private interface oq {
        void kq(String str, String str2, Throwable th);
    }

    @NonNull
    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.fax.kq.oq.kq.kq().oq());
            jSONObject.put("ipv6", fou.oq("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put("region", sns.fou().rz());
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new nb(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = "0";
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "4";
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "3";
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (oq.compareAndSet(false, true) && !kq) {
            nz.kq(new syt("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!ApmHelper.kq) {
                        ubx ubxVarFou = sns.fou();
                        boolean unused = ApmHelper.fou = ubxVarFou.rrl();
                        String strWcx = wol.wcx();
                        if (ApmHelper.fou && !TextUtils.isEmpty(strWcx)) {
                            String unused2 = ApmHelper.bob = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String strKq = vvw.kq(context);
                            try {
                                Npth.setCrashWaitTime(com.bytedance.sdk.openadsdk.jhe.kq.kq("apm_crash_wait_time", UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS));
                                Npth.enableLoopMonitor(false);
                                Npth.enableAnrInfo(false);
                                Npth.enableNativeDump(false);
                                Npth.enableActivityDump(false);
                                Npth.enableMessageDump(false);
                                MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.CustomRequestHeader
                                    public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                        httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                        httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                        httpURLConnection.setRequestProperty("x-pangle-target-idc", sns.fou().oz());
                                    }
                                });
                                final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 7859L, BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.apm.insight.AttachUserData
                                    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> mapSyt = ApmHelper.syt();
                                        if (mapSyt.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapSyt.get("render_type"));
                                            return mapSyt;
                                        }
                                        monitorCrashInitSDK.addTags("render_type", "-2");
                                        return mapSyt;
                                    }
                                });
                                if (ubxVarFou.xp()) {
                                    monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strKq);
                                monitorCrashInitSDK.setReportUrl(strWcx);
                                monitorCrashInitSDK.addTags("host_appid", ApmHelper.bob);
                                monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                                oq unused3 = ApmHelper.csi = new oq() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.oq
                                    public void kq(String str, String str2, Throwable th) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th);
                                    }
                                };
                                boolean unused4 = ApmHelper.kq = true;
                                ApmHelper.bob(strKq, strWcx);
                                kq kqVar = ApmHelper.rhi;
                                kq unused5 = ApmHelper.rhi = null;
                                if (kqVar != null) {
                                    ApmHelper.csi.kq(kqVar.kq, kqVar.oq, kqVar.bob);
                                }
                            } catch (Throwable unused6) {
                                boolean unused7 = ApmHelper.kq = false;
                            }
                        }
                    }
                    ApmHelper.oq.set(false);
                }
            });
        }
    }

    public static boolean isIsInit() {
        return kq;
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        oq oqVar = csi;
        if (oqVar != null) {
            oqVar.kq(str, str2, th);
        } else {
            rhi = new kq(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() {
        if (fou) {
            oq(vvw.kq(sns.kq()), wol.wcx());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> syt() {
        HashMap map = new HashMap();
        uml umlVarBob = com.bytedance.sdk.openadsdk.utils.oq.bob();
        if (umlVarBob != null) {
            map.put("adType", String.valueOf(umlVarBob.uc()));
            map.put("aid", String.valueOf(umlVarBob.vyv()));
            map.put("cid", umlVarBob.dra());
            map.put("reqId", umlVarBob.jp());
            map.put("rit", umlVarBob.zfx("-1"));
            int iMz = umlVarBob.mz();
            if (umlVarBob.fm() != 2) {
                iMz = -1;
            }
            map.put("render_type", String.valueOf(iMz));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bob(String str, String str2) {
        oq(str, str2);
    }

    private static void oq(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        sns.bob().kq(oq(str), "https://" + str2 + "/monitor/collect/c/session?version_code=7859&device_platform=android&aid=10000001");
    }

    private static JSONObject oq(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", bob);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e10) {
            fax.bob("ApmHelper", e10.getMessage());
            return jSONObject;
        }
    }
}
