package com.bytedance.sdk.openadsdk.mq;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private int aed;
    private kq aq;
    private String aqe;
    private String ax;
    private boolean ayo;
    private volatile boolean be;
    public final String bob;
    private String bss;
    private JSONObject clh;
    public final String csi;
    private Runnable dgq;
    private boolean dra;
    private boolean ea;
    private long ebt;
    private String et;
    private Map<String, String> evn;
    private String fax;
    private long fgm;
    private Context fm;
    public final String fou;
    private int fsp;
    private volatile boolean gg;
    private Set<String> gm;
    private long ha;
    private long hlh;
    private int hn;
    private float iaf;
    private long ibd;
    private int iy;
    private boolean jhe;
    private int jhy;
    private int job;
    private int jq;
    private ViewTreeObserver.OnGlobalLayoutListener jqv;
    private int ju;
    private boolean jvy;
    private JSONObject jwr;
    private int kfr;
    private String kiq;
    public final String kq;
    private long ktb;
    private String ldy;
    private List<JSONObject> lqo;
    private int ls;
    private boolean ma;
    private String mq;
    private boolean mxq;
    private int mz;
    private boolean nb;
    private Runnable nn;
    private WeakReference<View> noa;
    private long nz;
    private oq nze;
    public final String oq;
    private String ou;
    private int oxe;
    private int oyl;
    private float oz;
    private int pfu;
    private int pms;
    private String pw;
    private JSONObject qdf;
    private int qip;
    private boolean qvq;
    private rhi rao;
    private WebView rhg;
    private final String rhi;
    private final String rjo;
    private bob rrl;
    private int rs;
    private JSONObject rul;
    private float rxz;
    private boolean rz;
    private boolean sns;
    private Runnable suf;
    private final Handler syt;
    private int syw;
    private boolean tk;
    private boolean tn;
    private String tvh;
    private long uaj;
    private Runnable ubx;
    private int ui;
    private String ul;
    private boolean uml;
    private String vd;
    private String vdk;
    private String vho;
    private boolean vi;
    private int vt;
    private final Handler vvw;
    private String wbn;
    private boolean wcx;
    private String wee;
    private long wf;
    private int wj;
    private Runnable wki;
    private long wol;
    private String wqw;
    private com.bytedance.sdk.openadsdk.mq.kq wxb;
    private boolean xb;
    private boolean xgx;
    private int xk;
    private long xn;
    private String xp;
    private int ye;
    private int ymy;
    private int yo;
    private int ysx;
    private long yyl;
    private String ze;
    private long zfx;
    private int zp;

    public enum kq {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private syt(Context context, WebView webView, bob bobVar, com.bytedance.sdk.openadsdk.mq.kq kqVar, kq kqVar2) {
        this.rhi = "playable_stuck_check_ping";
        this.rjo = "playable_apply_media_permission_callback";
        this.syt = new Handler(Looper.getMainLooper());
        this.vvw = new Handler(Looper.getMainLooper());
        this.mxq = true;
        this.sns = true;
        this.wcx = true;
        this.kq = "PL_sdk_playable_global_viewable";
        this.oq = "PL_sdk_page_screen_blank";
        this.bob = "PL_sdk_playable_destroy_analyze_summary";
        this.fou = "PL_sdk_playable_hardware_dialog_cancel";
        this.csi = "PL_sdk_playable_hardware_dialog_setting";
        this.gm = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.fax = null;
        this.mq = "embeded_ad";
        this.jhe = true;
        this.uml = true;
        this.nb = false;
        this.ou = "";
        this.ebt = 10L;
        this.ibd = 10L;
        this.rs = 700;
        this.ha = 0L;
        this.fgm = 0L;
        this.zfx = -1L;
        this.ktb = -1L;
        this.wf = -1L;
        this.xn = -1L;
        this.nz = -1L;
        this.yyl = -1L;
        this.wol = -1L;
        this.bss = "";
        this.wee = "";
        this.tvh = "";
        this.wbn = "";
        this.syw = 0;
        this.ls = 0;
        this.rz = false;
        this.pfu = 0;
        this.oxe = -1;
        this.ye = 0;
        this.jq = 0;
        this.pms = 0;
        this.xp = null;
        this.ea = false;
        this.qip = 0;
        this.ysx = 0;
        this.xk = 0;
        this.ui = 0;
        this.uaj = 0L;
        this.hlh = 0L;
        this.wj = -2;
        this.hn = 0;
        this.mz = 0;
        this.jhy = 0;
        this.rul = new JSONObject();
        this.evn = new HashMap();
        this.clh = new JSONObject();
        this.et = "";
        this.rxz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.iaf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ayo = false;
        this.qvq = false;
        this.jvy = false;
        this.lqo = new ArrayList();
        this.tn = true;
        this.gg = true;
        this.be = true;
        this.jqv = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.mq.syt.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) syt.this.noa.get();
                    if (view == null) {
                        return;
                    }
                    syt.this.oq(view);
                } catch (Throwable th) {
                    rjo.kq("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.iy = -1;
        this.wj = 0;
        this.aq = kqVar2;
        this.rhg = webView;
        dgq.kq(webView);
        kq(webView);
        kq(context, bobVar, kqVar);
    }

    private void tvh() {
        String str;
        if (this.clh == null || (str = this.aqe) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.clh.optString("cid");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.aqe).getHost();
        if (TextUtils.isEmpty(host)) {
            this.aqe += "/cid_" + strOptString;
            return;
        }
        this.aqe = this.aqe.replace(host, host + "/cid_" + strOptString);
    }

    static /* synthetic */ int vvw(syt sytVar) {
        int i10 = sytVar.syw;
        sytVar.syw = i10 + 1;
        return i10;
    }

    private void wbn() {
        Runnable runnable;
        Runnable runnable2;
        this.nze.kq(System.currentTimeMillis());
        Handler handler = this.vvw;
        if (handler != null) {
            int i10 = this.wj;
            if (i10 == 0 && (runnable2 = this.wki) != null) {
                handler.post(runnable2);
            } else if ((i10 == 1 || i10 == 2) && (runnable = this.suf) != null) {
                handler.post(runnable);
            }
            this.nze.kq(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        }
    }

    private void wee() {
        this.nze = new oq(this, this.rs);
        this.dgq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.mq.syt.5
            @Override // java.lang.Runnable
            public void run() {
                if (syt.this.jhe) {
                    syt.this.jhe = false;
                    syt.this.syt.removeCallbacks(syt.this.nn);
                    syt.this.kq(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.nn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.mq.syt.6
            @Override // java.lang.Runnable
            public void run() {
                if (syt.this.jhe) {
                    syt.this.jhe = false;
                    syt.this.gg = false;
                    syt.this.syt.removeCallbacks(syt.this.dgq);
                    syt.this.kq(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.wki = new Runnable() { // from class: com.bytedance.sdk.openadsdk.mq.syt.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (syt.this.rhg != null) {
                    syt.this.rhg.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.mq.syt.7.1
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (syt.this.nze != null) {
                                syt.this.nze.kq(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (syt.this.vvw != null) {
                    syt.this.vvw.postDelayed(this, 500L);
                }
            }
        };
        this.suf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.mq.syt.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                syt.this.kq("playable_stuck_check_ping", new JSONObject());
                if (syt.this.vvw != null) {
                    syt.this.vvw.postDelayed(this, 500L);
                }
            }
        };
        this.ubx = new Runnable() { // from class: com.bytedance.sdk.openadsdk.mq.syt.9
            @Override // java.lang.Runnable
            public void run() {
                if (syt.this.hlh <= 0) {
                    syt.this.oq(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (syt.this.hlh - syt.this.uaj > syt.this.rs) {
                        syt.this.oq(1, "Clicking on the hot zone causes the program to freeze.");
                        return;
                    }
                    syt.this.ktb();
                    syt.this.uaj = 0L;
                    syt.this.hlh = 0L;
                }
            }
        };
    }

    static /* synthetic */ int wki(syt sytVar) {
        int i10 = sytVar.ls;
        sytVar.ls = i10 + 1;
        return i10;
    }

    public int bss() {
        return this.iy;
    }

    public void ebt() {
        if (this.wxb != null) {
            kq kqVar = kq.LAND_PAGE;
        }
    }

    public JSONObject fax() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.oz);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.zp);
            jSONObject2.put("height", this.ymy);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.vt);
            jSONObject3.put("y", this.kfr);
            jSONObject3.put("width", this.yo);
            jSONObject3.put("height", this.aed);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.job);
            jSONObject4.put("y", this.ju);
            jSONObject4.put("width", this.fsp);
            jSONObject4.put("height", this.oyl);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "getViewport error", th);
            return jSONObject;
        }
    }

    public void fgm() {
        int i10;
        int i11 = this.wj;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            if (this.gg) {
                this.syt.postDelayed(this.dgq, this.ebt * 1000);
            }
            if ((this.be && vvw(this.aqe)) || (i10 = this.wj) == 1 || i10 == 2) {
                this.syt.postDelayed(this.nn, this.ibd * 1000);
            }
        }
    }

    public JSONObject gm() {
        return this.clh;
    }

    public void ha() {
        oq oqVar;
        this.hlh = System.currentTimeMillis();
        int i10 = this.wj;
        if ((i10 == 1 || i10 == 2) && (oqVar = this.nze) != null) {
            oqVar.kq(System.currentTimeMillis());
        }
    }

    public void ibd() {
        if (this.wxb != null) {
            kq kqVar = kq.LAND_PAGE;
        }
    }

    public void jhe() {
        com.bytedance.sdk.openadsdk.mq.kq kqVar = this.wxb;
        if (kqVar != null) {
            kqVar.bob();
        }
    }

    public void ktb() {
        if (this.uml) {
            this.yyl = System.currentTimeMillis();
            if (this.aq == kq.FEED_AWEME) {
                if (this.xb && this.hn == 3) {
                    oq oqVar = this.nze;
                    if (oqVar != null && oqVar.oq()) {
                        wbn();
                        return;
                    } else {
                        if (this.nze == null) {
                            this.nze = new oq(this, this.rs);
                            wbn();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.xb && this.hn == 2) {
                oq oqVar2 = this.nze;
                if (oqVar2 != null && oqVar2.oq()) {
                    wbn();
                } else if (this.nze == null) {
                    this.nze = new oq(this, this.rs);
                    wbn();
                }
            }
        }
    }

    public void mq() {
        com.bytedance.sdk.openadsdk.mq.kq kqVar = this.wxb;
        if (kqVar != null) {
            kqVar.oq();
        }
    }

    public String mxq() {
        com.bytedance.sdk.openadsdk.mq.kq kqVar;
        if (TextUtils.isEmpty(this.tvh) && (kqVar = this.wxb) != null) {
            this.tvh = kqVar.kq().toString();
        }
        return this.tvh;
    }

    public void nb() {
        this.oxe = 2;
    }

    public void nz() {
        if (this.jvy) {
            return;
        }
        this.jvy = true;
        this.fgm = 0L;
        this.sns = true;
        xn();
        try {
            View view = this.noa.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.jqv);
            }
        } catch (Throwable unused) {
        }
        try {
            this.rao.oq();
        } catch (Throwable unused2) {
        }
        try {
            oq oqVar = this.nze;
            if (oqVar != null) {
                oqVar.kq();
                this.nze = null;
            }
            Handler handler = this.vvw;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.aqe)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.syw);
                jSONObject.put("playable_hit_times", this.ls);
                int i10 = this.syw;
                if (i10 > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.ls) / (((double) i10) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                bob("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.aqe)) {
                if (this.zfx != -1) {
                    this.ha += System.currentTimeMillis() - this.zfx;
                    this.zfx = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.ha);
                bob("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.gg = false;
        this.be = false;
        this.syt.removeCallbacks(this.dgq);
        this.syt.removeCallbacks(this.nn);
        this.syt.removeCallbacksAndMessages(null);
    }

    public JSONObject nze() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.aq.ordinal());
            jSONObject.put("safe_area_top_height", this.rxz);
            jSONObject.put("safe_area_bottom_height", this.iaf);
            jSONObject.put("playable_enter_from", this.jq);
            jSONObject.put("playable_retry_count", this.ye);
            jSONObject.put("playable_card_session", this.bss);
            jSONObject.put("playable_video_session", this.wee);
            jSONObject.put("playable_network_type", mxq());
            jSONObject.put("aweme_id", this.wbn);
            return jSONObject;
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void ou() {
        this.ea = true;
    }

    public void rs() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.nz > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.nz);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.wf > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.wf);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            bob("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public com.bytedance.sdk.openadsdk.mq.kq sns() {
        return this.wxb;
    }

    public JSONObject suf() {
        boolean zKq;
        boolean zKq2;
        try {
            boolean z9 = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zKq = csi.kq(this.fm, "android.permission.READ_MEDIA_IMAGES");
                zKq2 = true;
            } else {
                zKq = csi.kq(this.fm, "android.permission.READ_EXTERNAL_STORAGE");
                zKq2 = csi.kq(this.fm, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zKq);
            jSONObject.put("isHasWrite", zKq2);
            if (!zKq || !zKq2) {
                z9 = false;
            }
            jSONObject.put("result", z9);
            return jSONObject;
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void uml() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.nz > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.nz);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.wf > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.wf;
                this.wol = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            bob("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public JSONObject wcx() {
        if (this.rul.isNull("width")) {
            View view = this.noa.get();
            if (view == null) {
                return this.rul;
            }
            oq(view);
        }
        return this.rul;
    }

    public void wf() {
        try {
            oq oqVar = this.nze;
            if (oqVar != null) {
                oqVar.kq();
            }
            Handler handler = this.vvw;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public String wol() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public void xn() {
        this.mz = 0;
        this.jhy = 0;
        this.oz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.zp = 0;
        this.ymy = 0;
        this.kfr = 0;
        this.vt = 0;
        this.yo = 0;
        this.aed = 0;
        this.ju = 0;
        this.job = 0;
        this.fsp = 0;
        this.oyl = 0;
    }

    public int yyl() {
        return (this.ktb == -1 || !this.xb) ? 1 : 2;
    }

    public void zfx() {
        this.be = false;
        this.syt.removeCallbacks(this.nn);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.wf > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.wf);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            bob("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    private boolean vvw(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public JSONObject bob() {
        return this.jwr;
    }

    public String csi() {
        return this.vho;
    }

    public boolean dgq() {
        return this.xb;
    }

    public String fou() {
        return this.pw;
    }

    public JSONObject nn() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.tk);
            return jSONObject;
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public String rhi() {
        return this.vd;
    }

    public String rjo() {
        return this.wqw;
    }

    public boolean syt() {
        return this.vi;
    }

    public Set<String> ubx() {
        return this.rao.kq();
    }

    public JSONObject wki() {
        try {
            boolean zKq = csi.kq(this.fm, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zKq);
            return jSONObject;
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public syt bob(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.jwr = jSONObject;
            return this;
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "setPlayableStyle error", th);
            return this;
        }
    }

    public syt csi(String str) {
        this.wqw = str;
        return this;
    }

    public void dgq(String str) {
        WebView webView;
        boolean z9 = this.hn == -1;
        this.hn = 2;
        if (!z9) {
            this.ul = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.xn = jCurrentTimeMillis;
                long j10 = this.wf;
                jSONObject.put("playable_html_load_start_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
                jSONObject.put("playable_has_show", yyl());
            } catch (Throwable th) {
                rjo.kq("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            bob("PL_sdk_html_load_finish", jSONObject);
        }
        this.gg = false;
        this.syt.removeCallbacks(this.dgq);
        try {
            if (this.wj == 0) {
                if (this.mxq && (webView = this.rhg) != null) {
                    this.mxq = false;
                    webView.evaluateJavascript(wol(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.mq.syt.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                ktb();
            }
        } catch (Throwable th2) {
            rjo.kq("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public syt fou(String str) {
        this.vd = str;
        return this;
    }

    public syt rhi(String str) {
        this.mq = str;
        return this;
    }

    public syt rjo(String str) {
        int iIndexOf;
        String strDecode;
        this.et = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                    if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                        if (this.wj == -1) {
                            oq(2);
                        } else {
                            oq(1);
                        }
                    }
                } else {
                    oq(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                }
            } else {
                oq(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            }
        } catch (Throwable unused) {
        }
        this.aqe = str;
        return this;
    }

    public JSONObject syt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", csi.oq(this.fm, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt == 2) {
                    jSONObject2.put("result", csi.oq(this.fm, "android.permission.CAMERA"));
                    return jSONObject2;
                }
                if (iOptInt == 3) {
                    jSONObject2.put("result", csi.kq(this.fm));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void ubx(String str) {
        this.syt.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mq.syt.3
            @Override // java.lang.Runnable
            public void run() {
                syt.wki(syt.this);
            }
        });
    }

    public JSONObject vvw() {
        try {
            boolean zKq = csi.kq(this.fm, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zKq);
            return jSONObject;
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.mz == view.getWidth() && this.jhy == view.getHeight()) {
                return;
            }
            this.mz = view.getWidth();
            this.jhy = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.mz);
            jSONObject.put("height", this.jhy);
            kq("resize", jSONObject);
            this.rul = jSONObject;
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public void csi(JSONObject jSONObject) {
        this.qdf = jSONObject;
        this.pms++;
        wf();
        this.syt.removeCallbacks(this.ubx);
        if (this.uml) {
            this.yyl = System.currentTimeMillis();
            this.uaj = System.currentTimeMillis();
            this.hlh = 0L;
            int i10 = this.wj;
            if (i10 == 0) {
                WebView webView = this.rhg;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.mq.syt.10
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            syt.this.hlh = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i10 == 1 || i10 == 2) {
                kq("playable_stuck_check_ping", new JSONObject());
            }
            this.syt.postDelayed(this.ubx, this.rs);
        }
    }

    public syt fou(boolean z9) {
        this.tk = z9;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.tk);
            kq("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "setPlayableClick error", th);
            return this;
        }
    }

    public void rhi(JSONObject jSONObject) {
        oq(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    private void kq(Context context, bob bobVar, com.bytedance.sdk.openadsdk.mq.kq kqVar) {
        this.fax = UUID.randomUUID().toString();
        this.fm = context;
        this.wxb = kqVar;
        this.rrl = bobVar;
        nn.kq(kqVar);
        this.rao = new rhi(this);
        wee();
        if (this.rhg == null) {
            this.iy = 4;
            this.syt.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mq.syt.4
                @Override // java.lang.Runnable
                public void run() {
                    syt.this.kq(5, "webview is null");
                }
            });
        }
    }

    public void nn(String str) {
        this.syt.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mq.syt.2
            @Override // java.lang.Runnable
            public void run() {
                syt.vvw(syt.this);
            }
        });
    }

    public syt bob(boolean z9) {
        if (this.iy != -1 && this.xb != z9) {
            this.xb = z9;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.xb) {
                    jSONObject.put("playable_background_show_type", this.ysx);
                }
            } catch (JSONException unused) {
            }
            bob(this.xb ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.ktb == -1 && this.xb) {
                this.ktb = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.iy == 1 ? 1 : 2);
                    int i10 = this.iy;
                    if (i10 != -1) {
                        jSONObject2.put("webview_state", i10);
                    }
                } catch (JSONException unused2) {
                }
                bob("PL_sdk_page_show", jSONObject2);
            }
            if (this.ktb != -1 && !this.xb && !this.ayo) {
                this.ayo = true;
            }
            if (this.xb) {
                this.zfx = System.currentTimeMillis();
            } else if (this.zfx != -1) {
                this.ha += System.currentTimeMillis() - this.zfx;
                this.zfx = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.xb);
                kq("viewableChange", jSONObject3);
            } catch (Throwable th) {
                rjo.kq("PlayablePlugin", "setViewable error", th);
            }
            if (this.xb) {
                ktb();
            } else {
                wf();
            }
        }
        return this;
    }

    public void rhi(boolean z9) {
        this.dra = z9;
    }

    public void fou(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.xp = jSONObject.optString("section");
        }
    }

    private String fou(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.aqe = str3;
        return str3;
    }

    public void syt(String str) {
        this.hn = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.wf = jCurrentTimeMillis;
            long j10 = this.ktb;
            jSONObject.put("playable_page_show_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        bob("PL_sdk_html_load_start", jSONObject);
        this.gg = true;
        this.be = true;
        if (this.tn) {
            fgm();
            this.gg = false;
            this.be = false;
        }
        if (this.sns) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (csi.kq(this.fm, csi.vvw)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    if (csi.oq(this.fm, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (csi.kq(this.fm, csi.ubx)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (csi.kq(this.fm, csi.nn)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (csi.kq(this.fm, csi.dgq)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (csi.kq(this.fm, csi.syt)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    if (csi.oq(this.fm, "android.permission.CAMERA")) {
                        stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (csi.kq(this.fm, csi.rjo)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    if (csi.kq(this.fm)) {
                        stringBuffer3.append(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                bob("PL_sdk_hardware_detect", jSONObject2);
                this.sns = false;
            } catch (Throwable th2) {
                rjo.kq("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public JSONObject fou(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (rjo.kq() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectKq = this.rao.kq(str, jSONObject);
        if (rjo.kq()) {
            System.currentTimeMillis();
            if (jSONObjectKq != null) {
                jSONObjectKq.toString();
            }
        }
        return jSONObjectKq;
    }

    public Map<String, String> oq() {
        return this.evn;
    }

    public syt oq(String str) {
        this.pw = str;
        return this;
    }

    public void kq(View view) {
        if (view == null) {
            return;
        }
        try {
            this.noa = new WeakReference<>(view);
            oq(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.jqv);
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    public syt oq(boolean z9) {
        this.xgx = z9;
        return this;
    }

    public syt oq(long j10) {
        if (j10 <= 0) {
            this.ibd = 10L;
            return this;
        }
        this.ibd = j10;
        return this;
    }

    private void csi(String str, JSONObject jSONObject) {
        try {
            int i10 = this.wj;
            if (i10 == 0) {
                if (this.aq != kq.LAND_PAGE && !vvw(this.aqe)) {
                    tvh();
                }
                jSONObject.put("playable_url", this.aqe);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", fou(this.kiq, this.ax));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", bob(this.vdk, this.ze));
            }
            jSONObject.put("playable_render_type", this.wj);
            if (this.wxb != null) {
                if (this.wj == 0 && (this.aq != kq.LAND_PAGE || vvw(this.aqe))) {
                    this.wxb.kq(jSONObject);
                } else if (this.wj != 0) {
                    this.wxb.kq(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void oq(JSONObject jSONObject) {
        if (this.wxb != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public Context kq() {
        return this.fm;
    }

    public syt kq(String str, String str2) {
        this.evn.put(str, str2);
        return this;
    }

    public void oq(String str, String str2) {
        Bitmap bitmapKq;
        if (TextUtils.isEmpty(str2) || (bitmapKq = csi.kq(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.fm.getContentResolver(), bitmapKq, str, "");
    }

    public syt kq(String str) {
        this.vho = str;
        return this;
    }

    public void dgq(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.hn = 3;
                ktb();
            } else {
                this.hn = -2;
            }
            if (zOptBoolean || !this.jhe) {
                return;
            }
            this.jhe = false;
            this.gg = false;
            this.be = false;
            this.syt.removeCallbacks(this.dgq);
            this.syt.removeCallbacks(this.nn);
            kq(4, "CaseRenderFail");
        }
    }

    public syt kq(boolean z9) {
        this.vi = z9;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.vi);
            kq("volumeChange", jSONObject);
            return this;
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "setIsMute error", th);
            return this;
        }
    }

    public syt oq(int i10) {
        this.wj = i10;
        return this;
    }

    public JSONObject rjo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return vvw();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : suf();
        }
        return wki();
    }

    public void oq(int i10, String str) {
        this.oxe = i10;
        if (this.qdf == null) {
            this.qdf = new JSONObject();
        }
        try {
            this.qdf.put("playable_stuck_type", i10);
            this.qdf.put("playable_stuck_reason", str);
            if (this.yyl > 0) {
                this.qdf.put("playable_stuck_duration", System.currentTimeMillis() - this.yyl);
            } else {
                this.qdf.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        bob("PL_sdk_page_stuck", this.qdf);
        wf();
        if (this.wxb == null || i10 != 2) {
            return;
        }
        this.qdf = new JSONObject();
    }

    public syt kq(long j10) {
        if (j10 <= 0) {
            this.ebt = 10L;
            return this;
        }
        this.ebt = j10;
        return this;
    }

    public syt csi(boolean z9) {
        this.tn = z9;
        return this;
    }

    public void kq(int i10) {
        this.iy = i10;
    }

    public void rjo(boolean z9) {
        this.ma = z9;
    }

    public void kq(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.mq.kq kqVar = this.wxb;
        if (kqVar == null || kqVar.oq(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            oq(strOptString2, strOptString);
        }
    }

    public syt bob(JSONObject jSONObject) {
        this.clh = jSONObject;
        return this;
    }

    private void bob(int i10, String str) {
        com.bytedance.sdk.openadsdk.mq.kq kqVar = this.wxb;
        if (kqVar != null) {
            kqVar.kq(i10, str);
        }
    }

    public void kq(String str, JSONObject jSONObject) {
        if (this.ma) {
            if (!rjo.kq() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (rjo.kq() && jSONObject != null) {
            jSONObject.toString();
        }
        bob bobVar = this.rrl;
        if (bobVar != null) {
            bobVar.kq(str, jSONObject);
        }
    }

    protected void oq(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        csi(str, jSONObject);
    }

    private String bob(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.ldy) && !TextUtils.isEmpty(this.et)) {
            Uri uri = Uri.parse(this.et);
            String host = uri.getHost();
            if (!"lynxview".equalsIgnoreCase(host) && (host == null || !host.contains("lynxview"))) {
                queryParameter = "";
                queryParameter2 = "";
            } else {
                queryParameter = uri.getQueryParameter("surl");
                queryParameter2 = uri.getQueryParameter("playable_hash");
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.ldy = builderAppendQueryParameter.toString();
        }
        return this.ldy;
    }

    public syt kq(float f10) {
        this.oz = f10;
        return this;
    }

    protected void kq(int i10, String str) {
        wf();
        bob(i10, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "reportRenderFatal error", th);
        }
        bob("PL_sdk_global_faild", jSONObject);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void bob(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.rz && this.ls > 0) {
                this.rz = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.dra ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.xb);
            jSONObject.put("playable_session_id", this.fax);
            int i10 = this.wj;
            if (i10 == 0) {
                if (this.aq != kq.LAND_PAGE && !vvw(this.aqe)) {
                    tvh();
                }
                jSONObject.put("playable_url", this.aqe);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", fou(this.kiq, this.ax));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", bob(this.vdk, this.ze));
            }
            jSONObject.put("playable_full_url", this.et);
            jSONObject.put("playable_replay_count", this.pfu);
            jSONObject.put("playable_is_prerender", this.xgx);
            jSONObject.put("playable_is_preload", this.rz);
            jSONObject.put("playable_render_type", this.wj);
            jSONObject.put("playable_scenes_type", this.aq.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.vdk) ? "" : this.vdk);
            if (!TextUtils.isEmpty(this.ze)) {
                str2 = this.ze;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.kiq);
            jSONObject.put("playable_minigamelite_schema", this.ax);
            jSONObject.put("playable_is_debug", this.qvq);
            jSONObject.put("playable_retry_count", this.ye);
            jSONObject.put("playable_enter_from", this.jq);
            jSONObject.put("playable_sequence", this.pms);
            jSONObject.put("playable_current_section", this.xp);
            jSONObject.put("is_playable_finish", this.ea);
            jSONObject.put("playable_card_session", this.bss);
            jSONObject.put("playable_video_session", this.wee);
            jSONObject.put("playable_network_type", mxq());
            jSONObject.put("playable_lynx_version", this.ou);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.mq);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.clh.opt("cid"));
            jSONObject2.put("log_extra", this.clh.opt("log_extra"));
            int i11 = this.wj;
            if (i11 != -1 && i11 != -2) {
                if (this.wxb != null) {
                    List<JSONObject> list = this.lqo;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.lqo.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("adExtraData");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.wj);
                                jSONObjectOptJSONObject.put("playable_url", this.aqe);
                            }
                            this.wxb.kq(jSONObjectOptJSONObject);
                        }
                        this.lqo.clear();
                    }
                    if (this.wj == 0 && (this.aq != kq.LAND_PAGE || vvw(this.aqe))) {
                        this.wxb.kq(jSONObject);
                        return;
                    } else {
                        if (this.wj != 0) {
                            this.wxb.kq(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.lqo == null) {
                this.lqo = new ArrayList();
            }
            this.lqo.add(jSONObject2);
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void kq(int i10, String str, String str2) {
        this.hn = -1;
        this.ul = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", yyl());
        } catch (Throwable th) {
            rjo.kq("PlayablePlugin", "onWebReceivedError error", th);
        }
        bob("PL_sdk_html_load_error", jSONObject);
        if (this.jhe) {
            this.jhe = false;
            this.gg = false;
            this.be = false;
            this.syt.removeCallbacks(this.dgq);
            this.syt.removeCallbacks(this.nn);
            kq(1, "ContainerLoadFail");
        }
    }

    public void kq(boolean z9, String str, int i10) {
        if (z9) {
            this.hn = -1;
            this.ul = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i10);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", yyl());
            } catch (Throwable th) {
                rjo.kq("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            bob("PL_sdk_html_load_error", jSONObject);
            if (this.jhe) {
                this.jhe = false;
                this.gg = false;
                this.be = false;
                this.syt.removeCallbacks(this.dgq);
                this.syt.removeCallbacks(this.nn);
                kq(1, "ContainerLoadFail");
            }
        }
    }

    private syt(Context context, int i10, bob bobVar, com.bytedance.sdk.openadsdk.mq.kq kqVar) {
        this.rhi = "playable_stuck_check_ping";
        this.rjo = "playable_apply_media_permission_callback";
        this.syt = new Handler(Looper.getMainLooper());
        this.vvw = new Handler(Looper.getMainLooper());
        this.mxq = true;
        this.sns = true;
        this.wcx = true;
        this.kq = "PL_sdk_playable_global_viewable";
        this.oq = "PL_sdk_page_screen_blank";
        this.bob = "PL_sdk_playable_destroy_analyze_summary";
        this.fou = "PL_sdk_playable_hardware_dialog_cancel";
        this.csi = "PL_sdk_playable_hardware_dialog_setting";
        this.gm = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.fax = null;
        this.mq = "embeded_ad";
        this.jhe = true;
        this.uml = true;
        this.nb = false;
        this.ou = "";
        this.ebt = 10L;
        this.ibd = 10L;
        this.rs = 700;
        this.ha = 0L;
        this.fgm = 0L;
        this.zfx = -1L;
        this.ktb = -1L;
        this.wf = -1L;
        this.xn = -1L;
        this.nz = -1L;
        this.yyl = -1L;
        this.wol = -1L;
        this.bss = "";
        this.wee = "";
        this.tvh = "";
        this.wbn = "";
        this.syw = 0;
        this.ls = 0;
        this.rz = false;
        this.pfu = 0;
        this.oxe = -1;
        this.ye = 0;
        this.jq = 0;
        this.pms = 0;
        this.xp = null;
        this.ea = false;
        this.qip = 0;
        this.ysx = 0;
        this.xk = 0;
        this.ui = 0;
        this.uaj = 0L;
        this.hlh = 0L;
        this.wj = -2;
        this.hn = 0;
        this.mz = 0;
        this.jhy = 0;
        this.rul = new JSONObject();
        this.evn = new HashMap();
        this.clh = new JSONObject();
        this.et = "";
        this.rxz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.iaf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ayo = false;
        this.qvq = false;
        this.jvy = false;
        this.lqo = new ArrayList();
        this.tn = true;
        this.gg = true;
        this.be = true;
        this.jqv = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.mq.syt.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) syt.this.noa.get();
                    if (view == null) {
                        return;
                    }
                    syt.this.oq(view);
                } catch (Throwable th) {
                    rjo.kq("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.iy = -1;
        this.wj = i10;
        this.aq = kq.LAND_PAGE;
        kq(context, bobVar, kqVar);
    }

    public static syt kq(Context context, WebView webView, bob bobVar, com.bytedance.sdk.openadsdk.mq.kq kqVar) {
        if (bobVar == null || kqVar == null) {
            return null;
        }
        if (webView == null) {
            return new syt(context, 0, bobVar, kqVar);
        }
        return new syt(context, webView, bobVar, kqVar, kq.LAND_PAGE);
    }
}
