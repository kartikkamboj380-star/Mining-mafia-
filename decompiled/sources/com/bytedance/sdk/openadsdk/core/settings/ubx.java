package com.bytedance.sdk.openadsdk.core.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.component.utils.vvw;
import com.bytedance.sdk.component.utils.wcx;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.model.a;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.core.suf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.nz;
import com.bytedance.sdk.openadsdk.utils.wol;
import com.google.android.gms.common.api.Api;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ubx implements dgq.kq {
    private static String ibd;
    private csi.oq<JSONObject> ebt;
    private boolean gm;
    private final Runnable jhe;
    private final BroadcastReceiver mq;
    private volatile boolean mxq;
    private final Set<String> nb;
    private Set<String> nn;
    private final AtomicBoolean nze;
    private final csi.oq<Set<String>> ou;
    final csi.oq<ConcurrentHashMap<String, Integer>> rjo;
    private int sns;
    private final syt suf;
    csi.oq<com.bytedance.sdk.openadsdk.fou.kq.ubx> syt;
    private final csi.oq<Map<String, Integer>> uml;
    private int wcx;
    private final com.bytedance.sdk.openadsdk.core.settings.kq wki;
    public static final String kq = a.a("_", new CharSequence[]{"bus_con_collect", wol.ha()});
    public static final String oq = a.a("_", new CharSequence[]{"bus_con", wol.ha(), wol.rs(), "timeout"});
    public static final String bob = a.a("_", new CharSequence[]{"bus_con", wol.ha(), wol.rs(), "alpha"});
    private static final String dgq = wol.jhe();
    private static final com.bytedance.sdk.component.syt.syt ubx = new com.bytedance.sdk.component.syt.syt("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.adexpress.kq.oq.csi.oq().dgq();
            com.bytedance.sdk.component.adexpress.kq.oq.csi.oq().oq(false);
            com.bytedance.sdk.component.adexpress.kq.oq.oq.oq();
            com.bytedance.sdk.component.adexpress.kq.oq.csi.oq().bob();
        }
    };
    public static String fou = "";
    public static String csi = AndroidTcfDataSource.TCF_TCSTRING_KEY;
    private static boolean vvw = false;
    private static final ConcurrentLinkedQueue<nn.kq> fax = new ConcurrentLinkedQueue<>();
    static final ConcurrentHashMap<String, Integer> rhi = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.ubx$9, reason: invalid class name */
    class AnonymousClass9 extends BroadcastReceiver {
        private final Runnable oq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.9.1
            @Override // java.lang.Runnable
            public void run() {
                nz.oq(new com.bytedance.sdk.component.syt.syt("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.9.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ubx.this.fou();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        AnonymousClass9() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            nz.oq(new com.bytedance.sdk.component.syt.syt("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.9.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        ubx.this.kq(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.dgq.kq().removeCallbacks(AnonymousClass9.this.oq);
                        com.bytedance.sdk.component.utils.dgq.kq().postDelayed(AnonymousClass9.this.oq, 10000L);
                    }
                }
            });
        }
    }

    private static final class kq {
        static final ubx kq = new ubx();
    }

    public static ubx bob() {
        return kq.kq;
    }

    public static boolean et() {
        return vvw;
    }

    private static SharedPreferences fou(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    private String vt() {
        return this.suf.kq("force_language", "");
    }

    private Set<String> yo() {
        return (Set) this.suf.kq("perf_con_applog_send", this.nb, this.ou);
    }

    public static String zp() {
        if (ibd == null) {
            String strOq = com.bytedance.sdk.openadsdk.core.bob.kq().oq("settings_host_from_meta", "");
            ibd = strOq;
            if (strOq == null) {
                ibd = "";
            }
        }
        return ibd;
    }

    public JSONObject aq() {
        return (JSONObject) this.suf.kq("video_cache_config", null, csi.kq);
    }

    public int aqe() {
        return this.suf.kq("perf_con_close_button_delay_check_time", -1);
    }

    public String bss() {
        return this.suf.kq("ads_url", "");
    }

    public com.bytedance.sdk.openadsdk.fou.kq.ubx clh() {
        return (com.bytedance.sdk.openadsdk.fou.kq.ubx) this.suf.kq("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.fou.kq.ubx.kq, this.syt);
    }

    public String csi() {
        return this.suf.kq("aes_key", "");
    }

    public void dgq() {
        this.suf.kq().kq("tt_sdk_settings").kq("ab_test_param").kq();
    }

    public boolean ea() {
        return this.suf.kq("bus_con_sec_type", Api.BaseClientBuilder.API_PRIORITY_OTHER) != 0;
    }

    public int ebt() {
        return this.suf.kq(oq, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
    }

    public int evn() {
        int iKq = this.suf.kq("bus_con_auto_click_delay", 3000);
        if (iKq <= 0) {
            return 3000;
        }
        return iKq;
    }

    public boolean fax() {
        return this.suf.kq("bus_con_adshow_check_enable", true);
    }

    public boolean fgm() {
        return this.suf.kq("landingpage_new_style", -1) == 1;
    }

    public long fm() {
        long jKq = this.suf.kq("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (jKq < 0 || jKq > 86400000) ? TTAdConstant.AD_MAX_EVENT_TIME : jKq;
    }

    public boolean gm() {
        return this.suf.kq("ad_revenue_enable", true);
    }

    public String ha() {
        return this.suf.kq("ab_test_param", "");
    }

    public int hlh() {
        int iKq = this.suf.kq("perf_con_webview_cache_count", 0);
        if (iKq < 0) {
            return 0;
        }
        return iKq;
    }

    public int hn() {
        return this.suf.kq("blank_detect_rate", 30);
    }

    public Set<String> iaf() {
        return (Set) this.suf.kq("privacy_fields_allowed", Collections.EMPTY_SET, csi.oq);
    }

    public float ibd() {
        return this.suf.kq(bob, 1.0f);
    }

    public int jhe() {
        return this.suf.kq("bus_con_behavior_count", 300);
    }

    public boolean jhy() {
        return this.suf.kq("perf_con_is_new_net_thread", 0) == 1;
    }

    public boolean jq() {
        int iKq = this.suf.kq("privacy_ad_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iKq == 1) {
            return true;
        }
        if (iKq == 0) {
            return false;
        }
        int iNb = wol.nb();
        return iNb == 1 || iNb == 2 || iNb == 3;
    }

    public boolean jwr() {
        return this.suf.kq("bus_con_video_keep_screen_on", 1) == 1;
    }

    public int ktb() {
        return this.suf.kq("max", 50);
    }

    public int ldy() {
        return this.suf.kq("perf_con_sync_gaid", 0);
    }

    public String ls() {
        return this.suf.kq("dyn_draw_engine_url", dgq);
    }

    public String mq() {
        return this.suf.kq("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public int mxq() {
        yo();
        return this.sns;
    }

    public long mz() {
        return this.suf.kq("perf_con_adlog_expire_time", 0L);
    }

    public boolean nb() {
        return this.suf.kq("bus_con_url_check", 1) != 0;
    }

    public boolean nn() {
        return this.suf.kq("if_both_open", 0) == 1;
    }

    void noa() {
        if (dgq.kq()) {
            suf.oq().removeCallbacks(this.jhe);
            suf.oq().postDelayed(this.jhe, fm());
        }
    }

    public int nz() {
        int iKq = this.suf.kq("fetch_tpl_second", 0);
        if (iKq <= 0) {
            return 0;
        }
        return iKq;
    }

    public int nze() {
        yo();
        return this.wcx;
    }

    public boolean ou() {
        return this.suf.kq(kq, false);
    }

    public int oxe() {
        return this.suf.kq("isGdprUser", -1);
    }

    public String oz() {
        return this.suf.kq("target_region", "");
    }

    public String pfu() {
        return this.suf.kq("dc", "");
    }

    public int pms() {
        int iKq = this.suf.kq("privacy_personalized_ad", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iKq != Integer.MAX_VALUE) {
            return iKq;
        }
        int iNb = wol.nb();
        if (iNb == 1 || iNb == 2) {
            return 2;
        }
        return iNb != 3 ? 0 : 1;
    }

    public boolean pw() {
        return this.suf.kq("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    public int qdf() {
        int iKq = this.suf.kq("perf_con_webview_cache_count_v3", 0);
        if (iKq < 0) {
            return 0;
        }
        return iKq;
    }

    public boolean qip() {
        return this.suf.kq("privacy_debug_unlock", 1) != 0;
    }

    public boolean rao() {
        if (com.bytedance.sdk.component.adexpress.fou.oq.kq(sns.kq())) {
            return this.suf.kq("support_rtl", false);
        }
        return false;
    }

    public long rhg() {
        return this.suf.kq("last_req_time", 0L);
    }

    public int rhi() {
        return this.suf.kq("max_tpl_cnts", 100);
    }

    public JSONObject rjo() {
        return (JSONObject) this.suf.kq("digest", null, csi.kq);
    }

    public boolean rrl() {
        int iKq = this.wki.kq("perf_con_apm", 100);
        if (iKq == 0) {
            return false;
        }
        return iKq < 0 || iKq >= 100 || iKq > ((int) (Math.random() * 100.0d));
    }

    public int rs() {
        return this.suf.kq("loadedCallbackOpportunity", 0);
    }

    public JSONObject rul() {
        return (JSONObject) this.suf.kq("perf_con_thread_pool_config", new JSONObject(), this.ebt);
    }

    public void rxz() {
        csi.kq kqVarKq = this.suf.kq();
        kqVarKq.kq("settings_url", "");
        kqVarKq.kq();
        ha("");
    }

    public String rz() {
        return this.suf.kq("dc", "TX");
    }

    public boolean sns() {
        return this.suf.kq("allow_blind_mode_request_ad", false);
    }

    public Set<String> suf() {
        return yo();
    }

    public long syt() {
        return this.suf.kq("data_time", 0L);
    }

    public int syw() {
        return this.suf.kq("ivrv_downward", 0);
    }

    public String tvh() {
        return this.suf.kq("app_log_url", "");
    }

    public boolean uaj() {
        return this.suf.kq("read_video_from_cache", 1) == 1;
    }

    public String ubx() {
        return this.suf.kq("ab_test_version", "");
    }

    public boolean ui() {
        return this.suf.kq("global_rate", 1.0f) == 1.0f;
    }

    public Set<String> ul() {
        return (Set) this.suf.kq("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, csi.oq);
    }

    public String uml() {
        return this.suf.kq("bus_con_check_clz", "");
    }

    public String vd() {
        return this.suf.kq("dual_event_url", (String) null);
    }

    public boolean vho() {
        return this.suf.kq("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    public int vvw() {
        return this.suf.kq("splash_video_load_strategy", 0);
    }

    public String wbn() {
        return this.suf.kq("policy_url", "");
    }

    public boolean wcx() {
        return this.suf.kq("support_gzip", false);
    }

    public String wee() {
        return this.suf.kq("settings_url", "");
    }

    public rhi wf() {
        return (rhi) this.suf.kq("insert_js_config", rhi.kq, new csi.oq<rhi>() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.csi.oq
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public rhi oq(String str) {
                return new rhi(str);
            }
        });
    }

    public String[] wj() {
        try {
            Set<String> set = this.nn;
            if (set == null || set.size() == 0) {
                JSONArray jSONArray = new JSONArray(this.suf.kq("gecko_hosts", (String) null));
                if (jSONArray.length() != 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        this.nn.add(jSONArray.getString(i10));
                    }
                }
                Set<String> setKq = syt.kq(this.nn);
                this.nn = setKq;
                if (setKq != null) {
                    if (setKq.size() == 0) {
                    }
                }
                return null;
            }
            return (String[]) this.nn.toArray(new String[0]);
        } catch (Throwable unused) {
        }
    }

    public int wki() {
        return this.suf.kq("perf_con_drawable_code", 0);
    }

    public boolean wol() {
        return this.suf.oq();
    }

    public int wxb() {
        return this.suf.kq("perf_con_thread_stack_size", 0);
    }

    public boolean xk() {
        return this.mxq;
    }

    public int xn() {
        int iKq = this.suf.kq("fetch_tpl_timeout_ctrl", 3000);
        if (iKq <= 0) {
            return 3000;
        }
        return iKq;
    }

    public boolean xp() {
        return this.suf.kq("perf_con_apm_native", Api.BaseClientBuilder.API_PRIORITY_OTHER) == 1;
    }

    public int ye() {
        return this.suf.kq("vbtt", 5);
    }

    public boolean ysx() {
        return this.suf.kq("privacy_app_reg", true);
    }

    public void yyl() {
        String strVt = vt();
        if (TextUtils.isEmpty(strVt)) {
            return;
        }
        if (strVt.equals("zh-Hant")) {
            vvw.kq(sns.kq(), "zh", "tw");
        } else {
            vvw.kq(sns.kq(), strVt, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            fax.bob("TTAD.SdkSettings", th.getMessage());
        }
    }

    public long zfx() {
        return this.suf.kq("duration", 10000L);
    }

    private ubx() {
        this.nn = Collections.synchronizedSet(new HashSet());
        this.wki = new com.bytedance.sdk.openadsdk.core.settings.kq();
        this.suf = new syt(new nn.kq() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.nn.kq
            public void kq() {
                nn.kq[] kqVarArr;
                boolean unused = ubx.vvw = true;
                if (ubx.fax == null || ubx.fax.size() == 0 || (kqVarArr = (nn.kq[]) ubx.fax.toArray()) == null) {
                    return;
                }
                for (nn.kq kqVar : kqVarArr) {
                    kqVar.kq();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.nn.kq
            public void oq() {
                if (ubx.fax == null || ubx.fax.isEmpty()) {
                    return;
                }
                Iterator it = ubx.fax.iterator();
                while (it.hasNext()) {
                    ((nn.kq) it.next()).oq();
                }
            }
        });
        this.nze = new AtomicBoolean(false);
        this.mxq = false;
        this.sns = 5000;
        this.wcx = 10;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9();
        this.mq = anonymousClass9;
        this.jhe = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.10
            @Override // java.lang.Runnable
            public void run() {
                ubx.this.fou(2);
                ubx.this.noa();
            }
        };
        this.rjo = new csi.oq<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.11
            @Override // com.bytedance.sdk.openadsdk.core.settings.csi.oq
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public ConcurrentHashMap<String, Integer> oq(String str) {
                if (TextUtils.isEmpty(str)) {
                    return ubx.rhi;
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iOptInt = jSONObject.optInt(next, 100);
                        if (!TextUtils.isEmpty(next) && iOptInt >= 0 && iOptInt <= 100) {
                            concurrentHashMap.put(next, Integer.valueOf(iOptInt));
                        }
                    }
                    return concurrentHashMap;
                } catch (JSONException e10) {
                    Log.i("TTAD.SdkSettings", e10.getMessage());
                    return concurrentHashMap;
                }
            }
        };
        this.uml = new csi.oq<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.12
            @Override // com.bytedance.sdk.openadsdk.core.settings.csi.oq
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> oq(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap map = new HashMap(jSONObject.length());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObject.optInt(next, 100);
                            if (iOptInt < 0 || iOptInt > 100) {
                                map.put(next, 100);
                            } else {
                                map.put(next, Integer.valueOf(iOptInt));
                            }
                        }
                    }
                    return map;
                } catch (Exception e10) {
                    fax.bob("get applog rate from sp failed:" + e10.getMessage(), new Object[0]);
                    return null;
                }
            }
        };
        this.nb = new HashSet();
        this.ou = new csi.oq<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.csi.oq
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public Set<String> oq(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            ubx.this.wcx = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            ubx.this.sns = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                String string = jSONArray.getString(i10);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        Log.i("TTAD.SdkSettings", e10.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.ebt = new csi.oq<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.csi.oq
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public JSONObject oq(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    fax.bob("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.syt = new csi.oq<com.bytedance.sdk.openadsdk.fou.kq.ubx>() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.csi.oq
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.fou.kq.ubx oq(String str) {
                com.bytedance.sdk.openadsdk.fou.kq.ubx ubxVar = new com.bytedance.sdk.openadsdk.fou.kq.ubx();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    ubxVar.kq(jSONObject.optInt("enable_strategy", 0) == 1);
                    ubxVar.kq(kq(jSONObject.optJSONObject(BuildConfig.FLAVOR)));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ubxVar.kq(next, kq(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return ubxVar;
            }

            private com.bytedance.sdk.openadsdk.fou.kq.ubx.kq kq(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new com.bytedance.sdk.openadsdk.fou.kq.ubx.kq(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            Context contextKq = sns.kq();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (Build.VERSION.SDK_INT >= 33) {
                contextKq.registerReceiver(anonymousClass9, intentFilter, 4);
            } else {
                contextKq.registerReceiver(anonymousClass9, intentFilter);
            }
        } catch (Exception e10) {
            fax.kq("TTAD.SdkSettings", "", e10);
        }
    }

    public static void ha(String str) {
        if (str == null) {
            str = "";
        }
        String strZp = zp();
        if (strZp == null || !strZp.equals(str)) {
            com.bytedance.sdk.openadsdk.core.bob.kq().kq("settings_host_from_meta", str);
            ibd = str;
            bob().kq(8, true);
        }
    }

    public boolean bob(String str) {
        return ebt(str).bob == 1;
    }

    public boolean csi(String str) {
        int i10 = ebt(str).csi;
        if (i10 != 1) {
            return i10 == 2 && wcx.bob(sns.kq()) != 0;
        }
        return wcx.fou(sns.kq());
    }

    public int dgq(String str) {
        if (str == null) {
            return 1500;
        }
        return ebt(str).mxq;
    }

    @NonNull
    public oq ebt(String str) {
        return bob.kq(str);
    }

    public boolean fax(String str) {
        return ebt(str).mq;
    }

    public synchronized void fou() {
        SystemClock.elapsedRealtime();
        boolean z9 = this.mxq;
        this.wki.kq(this.mxq);
        this.suf.kq(this.mxq);
        bob.kq(!z9);
        this.mxq = true;
        SystemClock.elapsedRealtime();
        if (!z9) {
            suf.oq().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.6
                @Override // java.lang.Runnable
                public void run() {
                    if (!dgq.kq()) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq().oq();
                    } else {
                        ubx.this.fou(1);
                        ubx.this.noa();
                    }
                }
            }, 1000L);
        }
    }

    public int gm(String str) {
        return ebt(str).fax;
    }

    public boolean ibd(@NonNull String str) {
        Set set = (Set) this.suf.kq("privacy_fields_allowed", Collections.EMPTY_SET, csi.oq);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iNb = wol.nb();
        if (iNb != 1) {
            if (iNb != 2 && iNb != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    public int jhe(String str) {
        return ebt(str).ebt;
    }

    public int mq(String str) {
        return ebt(str).ou;
    }

    public boolean nb(String str) {
        return ebt(str).fgm;
    }

    public int nn(String str) {
        return ebt(str).ubx;
    }

    public boolean ou(String str) {
        return sns.fou().ebt(str).nze == 1;
    }

    public boolean rhi(String str) {
        return ebt(str).rjo == 1;
    }

    public int rjo(String str) {
        return ebt(str).wcx;
    }

    public boolean rs(String str) {
        Set set;
        if (TextUtils.isEmpty(str) || (set = (Set) this.suf.kq("token_adx_ids", Collections.EMPTY_SET, csi.oq)) == null || set.size() == 0) {
            return false;
        }
        return set.contains(str);
    }

    public boolean sns(String str) {
        return str == null || DeviceUtils.nn(sns.kq()) == 0 || ebt(str).wki == 1;
    }

    public boolean suf(String str) {
        return wki(str) != 1;
    }

    public boolean syt(String str) {
        return str == null || ebt(str).suf == 1;
    }

    public int ubx(String str) {
        return ebt(str).vvw;
    }

    public int uml(String str) {
        return ebt(str).ibd;
    }

    public boolean vvw(String str) {
        try {
            return ebt(str).uml != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public JSONObject wcx(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.suf.kq("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", ebt(str).ktb);
                return jSONObject2;
            } catch (JSONException e10) {
                e = e10;
                jSONObject = jSONObject2;
                fax.bob("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    public int wki(String str) {
        return ebt(String.valueOf(str)).syt;
    }

    private static void oq(int i10, boolean z9) {
        Context contextKq = sns.kq();
        if (contextKq != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextKq.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z9);
                intent.putExtra("_source", i10);
                contextKq.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public void kq() {
        try {
            bob.kq();
            this.suf.bob();
            this.wki.bob();
            Context contextKq = sns.kq();
            File file = new File(new File(contextKq.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                contextKq.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    public boolean mxq(String str) {
        return ebt(str).jhe == 0;
    }

    public int nze(String str) {
        return ebt(str).nn;
    }

    public int bob(int i10) {
        return ebt(String.valueOf(i10)).dgq;
    }

    public void bob(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.mq, intentFilter, 4);
            } else {
                context.registerReceiver(this.mq, intentFilter);
            }
        } catch (Exception e10) {
            fax.kq("TTAD.SdkSettings", "", e10);
        }
        if (xk()) {
            fou(1);
            noa();
        }
    }

    public static void oq() {
        Context contextKq;
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob() && (contextKq = sns.kq()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextKq.getPackageName());
                intent.setAction("_dataChanged");
                contextKq.sendBroadcast(intent);
            } catch (Throwable th) {
                fax.kq("TTAD.SdkSettings", "", th);
            }
        }
    }

    public boolean fou(String str) {
        return ebt(str).rs;
    }

    public static int kq(Context context) {
        SharedPreferences sharedPreferencesFou;
        if (context == null || (sharedPreferencesFou = fou(context)) == null) {
            return -2;
        }
        int i10 = sharedPreferencesFou.getInt("IABTCF_CmpSdkID", LinearLayoutManager.INVALID_OFFSET);
        int i11 = sharedPreferencesFou.getInt("IABTCF_CmpSdkVersion", LinearLayoutManager.INVALID_OFFSET);
        if (i10 == Integer.MIN_VALUE && i11 == Integer.MIN_VALUE) {
            return -2;
        }
        return sharedPreferencesFou.getInt("IABTCF_gdprApplies", -1);
    }

    public void fou(@TTSdkSettings.FETCH_REQUEST_SOURCE int i10) {
        kq(i10, false);
    }

    public static String oq(Context context) {
        SharedPreferences sharedPreferencesFou;
        return (context == null || (sharedPreferencesFou = fou(context)) == null) ? "" : sharedPreferencesFou.getString(csi, "");
    }

    public void kq(JSONObject jSONObject, csi.kq kqVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        syt sytVar = this.suf;
        String str = dgq;
        String strKq = sytVar.kq("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strKq) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strKq)) {
            suf.oq().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.ubx.7
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(ubx.this.suf.kq("dyn_draw_engine_url", ubx.dgq), strOptString)) {
                        com.bytedance.sdk.component.adexpress.kq.oq.csi.oq().bob();
                    }
                }
            }, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        }
        kqVar.kq("dyn_draw_engine_url", strOptString);
    }

    public void oq(JSONObject jSONObject, csi.kq kqVar) {
        if (jSONObject.has("is_gdpr_user")) {
            int iOptInt = jSONObject.optInt("is_gdpr_user", -1);
            kqVar.kq("isGdprUser", (iOptInt == -1 || iOptInt == 1 || iOptInt == 0) ? iOptInt : -1);
        }
    }

    public int kq(String str) {
        if (str == null) {
            return 0;
        }
        return sns.fou().ebt(str).gm;
    }

    public int oq(String str) {
        Integer num;
        Map map = (Map) this.suf.kq("perf_con_applog_rate", null, this.uml);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    public int kq(String str, int i10) {
        Integer num;
        Map map = (Map) this.suf.kq("perf_con_stats_rate", rhi, this.rjo);
        return (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) ? i10 : num.intValue();
    }

    public int oq(int i10) {
        return ebt(String.valueOf(i10)).oq;
    }

    public int kq(int i10) {
        return ebt(String.valueOf(i10)).zfx;
    }

    public void kq(long j10) {
        this.suf.kq().kq("last_req_time", j10).kq();
    }

    public void kq(@TTSdkSettings.FETCH_REQUEST_SOURCE int i10, boolean z9) {
        if (!suf.csi() && i10 != 1 && i10 != 2) {
            if (z9) {
                this.gm = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.dgq.oq().fou())) {
                return;
            }
            if (this.gm) {
                this.gm = false;
                if (!z9) {
                    z9 = true;
                }
            }
            long jRhg = rhg();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jFm = fm();
            long j10 = jCurrentTimeMillis - jRhg;
            if (z9 || j10 >= jFm) {
                if (!dgq.kq()) {
                    oq(i10, z9);
                } else if (this.nze.compareAndSet(false, true)) {
                    nz.oq((com.bytedance.sdk.component.syt.syt) new dgq(this, this.suf, this.wki));
                    suf.oq().removeCallbacks(this.jhe);
                }
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("settings request error", "settings", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.dgq.kq
    public void kq(boolean z9) {
        this.nze.set(false);
        noa();
        if (z9) {
            HashMap map = new HashMap();
            Set<String> setIaf = iaf();
            if (setIaf != null && !setIaf.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setIaf);
            }
            String strWcx = wol.wcx();
            if (!TextUtils.isEmpty(strWcx)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strWcx);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, oz());
            com.bytedance.sdk.openadsdk.core.nn.oq.oq().kq(map);
            oq();
        }
    }

    public static void kq(nn.kq kqVar) {
        ConcurrentLinkedQueue<nn.kq> concurrentLinkedQueue = fax;
        if (concurrentLinkedQueue.contains(kqVar)) {
            return;
        }
        concurrentLinkedQueue.add(kqVar);
    }
}
