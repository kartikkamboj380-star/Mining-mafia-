package com.bytedance.sdk.openadsdk.core.nn;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.appsflyer.AdRevenueScheme;
import com.bytedance.sdk.component.utils.csi;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.sns;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private static boolean kq = false;

    public static String bob() {
        return sns.fou().ea() ? oq.oq().csi() : "";
    }

    public static int csi() {
        if (sns.fou().ea()) {
            return oq.oq().rjo();
        }
        return 6;
    }

    public static long fou() {
        if (sns.fou().ea()) {
            return oq.oq().rhi();
        }
        return 0L;
    }

    public static void kq() {
        if (!kq && sns.fou().ea()) {
            oq.oq();
            kq = oq.oq().bob();
        }
    }

    public static void oq(String str) {
        if (TextUtils.isEmpty(str) || !sns.fou().ea()) {
            return;
        }
        oq.oq().oq(str);
    }

    public static String rhi() {
        if (sns.fou().ea()) {
            return oq.oq().fou();
        }
        return null;
    }

    public static void oq() {
        if (sns.fou().ea()) {
            oq.oq().kq();
        }
    }

    public static void kq(String str) {
        if (sns.fou().ea()) {
            oq.oq().kq(str);
        }
    }

    public static void kq(uml umlVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (sns.fou().ea()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (umlVar != null) {
                String strJp = umlVar.jp();
                String strOptString = "-1";
                if (!TextUtils.isEmpty(strJp)) {
                    map.put("request_id", strJp);
                } else {
                    map.put("request_id", "-1");
                }
                try {
                    long j10 = -1;
                    if (umlVar.zj() != null) {
                        jOptLong = umlVar.zj().optLong("ad_id", -1L);
                        jOptLong2 = umlVar.zj().optLong("rit", -1L);
                        jOptLong3 = umlVar.zj().optLong("ad_slot_type", -1L);
                        strOptString = umlVar.zj().optString(AdRevenueScheme.AD_TYPE, "-1");
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", Long.valueOf(jOptLong3));
                    map.put(AdRevenueScheme.AD_TYPE, strOptString);
                    Map<String, Object> mapLl = umlVar.ll();
                    if (mapLl != null && (obj = mapLl.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j10 = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j10));
                    oq.oq().kq("AdShow", map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Map<String, String> kq(String str, String str2) {
        if (sns.fou().ea()) {
            return oq.oq().kq(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void kq(MotionEvent motionEvent) {
        if (sns.fou().ea()) {
            oq.oq().kq(motionEvent);
        }
    }

    public static void kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (sns.fou().ea()) {
                kq();
                if (csi() == 0) {
                    jSONObject.put("sec_did", oq.oq().fou());
                    String strKq = csi.kq(jSONObject.toString());
                    Map<String, String> mapKq = oq.oq().kq("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strKq != null ? strKq.getBytes() : new byte[0]);
                    if (mapKq != null && mapKq.size() > 0) {
                        for (String str : mapKq.keySet()) {
                            jSONObject.put(str, mapKq.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strKq);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", oq.oq().rhi());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(csi()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            fax.bob("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }
}
