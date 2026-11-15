package com.bytedance.sdk.openadsdk.jhe;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.component.utils.ibd;
import com.bytedance.sdk.component.utils.syt;
import com.bytedance.sdk.openadsdk.core.nb;
import com.bytedance.sdk.openadsdk.core.nn.oq;
import com.bytedance.sdk.openadsdk.core.settings.dgq;
import com.bytedance.sdk.openadsdk.core.settings.ubx;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.core.suf;
import com.bytedance.sdk.openadsdk.core.uml;
import com.bytedance.sdk.openadsdk.uml.bob;
import com.bytedance.sdk.openadsdk.uml.fou;
import com.bytedance.sdk.openadsdk.utils.jhe;
import com.bytedance.sdk.openadsdk.utils.nz;
import com.bytedance.sdk.openadsdk.utils.wol;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static volatile bob bob;
    public static final ConcurrentHashMap<String, Object> kq = new ConcurrentHashMap<>();
    public static String oq;

    public static boolean bob() {
        return oq() && kq("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    public static int csi() {
        if (oq()) {
            return kq("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    public static boolean dgq() {
        return kq("iv_rv_listen_new_arch", 0) == 1;
    }

    public static boolean fou() {
        return oq() && kq("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    public static bob kq(final Context context, final String str) {
        if (bob == null) {
            synchronized (kq.class) {
                try {
                    if (bob == null) {
                        try {
                            bob bobVar = new bob(new fou() { // from class: com.bytedance.sdk.openadsdk.jhe.kq.1
                                @Override // com.bytedance.sdk.openadsdk.uml.fou
                                public String bob() {
                                    return "pag_adn_strategy_center";
                                }

                                @Override // com.bytedance.sdk.openadsdk.uml.fou
                                public String csi() {
                                    String strKq = wol.kq("/api/ad/union/sdk/strategies/adn", false, true);
                                    kq.oq = strKq;
                                    return strKq;
                                }

                                @Override // com.bytedance.sdk.openadsdk.uml.fou
                                public Handler fou() {
                                    return suf.oq();
                                }

                                @Override // com.bytedance.sdk.openadsdk.uml.fou
                                public ExecutorService kq() {
                                    return nz.csi();
                                }

                                @Override // com.bytedance.sdk.openadsdk.uml.fou
                                public Context oq() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : sns.kq();
                                }

                                @Override // com.bytedance.sdk.openadsdk.uml.fou
                                public JSONObject rhi() {
                                    try {
                                        JSONObject jSONObjectKq = dgq.kq(ibd.kq(sns.kq(), 0L));
                                        if (!jSONObjectKq.has("app_id")) {
                                            if (!TextUtils.isEmpty(str)) {
                                                jSONObjectKq.put("app_id", str);
                                            } else {
                                                if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.dgq.oq().fou())) {
                                                    return null;
                                                }
                                                jSONObjectKq.put("app_id", com.bytedance.sdk.openadsdk.core.dgq.oq().fou());
                                            }
                                        }
                                        return uml.kq(PangleEncryptConstant.CryptDataScene.STRATEGY, jSONObjectKq);
                                    } catch (Throwable th) {
                                        fax.bob("StrategyUtils", th.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.uml.fou
                                public Map<String, String> rjo() {
                                    HashMap map = new HashMap();
                                    map.put("User-Agent", wol.fou());
                                    String strOq = com.bytedance.sdk.openadsdk.multipro.fou.fou.oq("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                    if (!strOq.isEmpty()) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ipv6", strOq);
                                        } catch (JSONException unused) {
                                        }
                                        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new nb(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                        if (jSONObjectEncryptType4 != null) {
                                            map.put("transfer-param", jSONObjectEncryptType4.optString(PglCryptUtils.KEY_MESSAGE));
                                            if (jSONObjectEncryptType4.optInt("cypher") == 4) {
                                                map.put("cypher", "4");
                                            } else {
                                                map.put("cypher", "3");
                                            }
                                        }
                                    }
                                    try {
                                        map.put("x-pangle-target-idc", ubx.bob().oz());
                                    } catch (Throwable unused2) {
                                    }
                                    return map;
                                }

                                @Override // com.bytedance.sdk.openadsdk.uml.fou
                                public JSONObject kq(JSONObject jSONObject) {
                                    String strKq = uml.kq(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                    if (!TextUtils.isEmpty(strKq)) {
                                        try {
                                            return new JSONObject(strKq);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    return jSONObject;
                                }

                                @Override // com.bytedance.sdk.openadsdk.uml.fou
                                public HandlerThread kq(String str2, int i10) {
                                    return syt.kq(str2, i10);
                                }
                            });
                            bob = bobVar;
                            bobVar.kq(new com.bytedance.sdk.openadsdk.uml.kq() { // from class: com.bytedance.sdk.openadsdk.jhe.kq.2
                                @Override // com.bytedance.sdk.openadsdk.uml.kq
                                public void kq() {
                                    com.bytedance.sdk.openadsdk.wcx.bob.kq(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.jhe.kq.2.1
                                        @Override // com.bytedance.sdk.openadsdk.wcx.fou
                                        public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                                            com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                                            kqVar.oq("strategy_fetch");
                                            return kqVar;
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.uml.kq
                                public void oq() {
                                    com.bytedance.sdk.openadsdk.wcx.bob.oq(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.jhe.kq.2.2
                                        @Override // com.bytedance.sdk.openadsdk.wcx.fou
                                        public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                                            com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                                            kqVar.oq("strategy_fetch");
                                            return kqVar;
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.rhi.kq.kq().oq();
                                    com.bytedance.sdk.openadsdk.mq.kq.bob.kq().oq();
                                    jhe.oq();
                                    HashMap map = new HashMap();
                                    String strKq = kq.kq(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                    if (!TextUtils.isEmpty(strKq)) {
                                        map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strKq);
                                    }
                                    oq.oq().kq(map);
                                }

                                @Override // com.bytedance.sdk.openadsdk.uml.kq
                                public void kq(int i10, String str2) {
                                    com.bytedance.sdk.openadsdk.wcx.bob.bob(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.jhe.kq.2.3
                                        @Override // com.bytedance.sdk.openadsdk.wcx.fou
                                        public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                                            com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                                            kqVar.oq("strategy_fetch");
                                            return kqVar;
                                        }
                                    });
                                    jhe.kq(kq.oq);
                                }
                            });
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return bob;
    }

    public static boolean nn() {
        return kq("iv_rv_top_bar_listen_new", 0) == 1;
    }

    public static boolean oq() {
        return kq("ad_load_and_render_opt", "enable", 0) == 1;
    }

    public static int rhi() {
        if (oq()) {
            return kq("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    public static boolean rjo() {
        return kq("jsb_opt_enable", 0) == 1;
    }

    public static boolean syt() {
        return kq("no_call_close", 0) == 1;
    }

    private static bob ubx() {
        return kq(sns.kq(), com.bytedance.sdk.openadsdk.core.dgq.oq().fou());
    }

    public static int kq(String str, int i10) {
        bob bobVarUbx = ubx();
        return bobVarUbx != null ? bobVarUbx.kq(str, i10) : i10;
    }

    public static boolean kq(String str, boolean z9) {
        bob bobVarUbx = ubx();
        return bobVarUbx != null ? bobVarUbx.kq(str, z9) : z9;
    }

    public static String kq(String str, String str2) {
        bob bobVarUbx = ubx();
        return bobVarUbx != null ? bobVarUbx.kq(str, str2) : str2;
    }

    public static int kq(String str, String str2, int i10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = kq;
            Object obj = concurrentHashMap.get(str3);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strKq = ubx().kq(str, "");
                if (!TextUtils.isEmpty(strKq)) {
                    int iOptInt = new JSONObject(strKq).optInt(str2, i10);
                    concurrentHashMap.put(str3, Integer.valueOf(iOptInt));
                    return iOptInt;
                }
            } catch (Throwable th) {
                fax.bob("StrategyUtils", th.getMessage());
            }
        }
        return i10;
    }

    public static String kq(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str4 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = kq;
            Object obj = concurrentHashMap.get(str4);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strKq = ubx().kq(str, "");
                if (!TextUtils.isEmpty(strKq)) {
                    String strOptString = new JSONObject(strKq).optString(str2, str3);
                    concurrentHashMap.put(str4, strOptString);
                    return strOptString;
                }
            } catch (Throwable th) {
                fax.bob("StrategyUtils", th.getMessage());
            }
        }
        return str3;
    }

    public static void kq() {
        bob bobVarUbx = ubx();
        if (bobVarUbx != null) {
            bobVarUbx.kq();
        }
    }
}
