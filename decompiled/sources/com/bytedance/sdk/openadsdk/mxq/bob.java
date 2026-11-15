package com.bytedance.sdk.openadsdk.mxq;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.syt.syt;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.settings.ubx;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.core.suf;
import com.bytedance.sdk.openadsdk.core.vvw;
import com.bytedance.sdk.openadsdk.mxq.kq.fou;
import com.bytedance.sdk.openadsdk.utils.nz;
import com.bytedance.sdk.openadsdk.utils.wol;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private static volatile bob kq;

    private bob() {
    }

    private boolean bob(fou fouVar) {
        return fouVar == null;
    }

    public static void fou() {
        kq("disk_log", false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.7
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j10 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jKq = bob.kq(file2);
                        j10 += jKq;
                        jSONObject.put(file2.getName(), jKq);
                    }
                }
                if (j10 < 524288000) {
                    return null;
                }
                return fou.oq().kq("disk_log").oq(jSONObject.toString());
            }
        });
    }

    public static bob kq() {
        if (kq == null) {
            synchronized (bob.class) {
                try {
                    if (kq == null) {
                        kq = new bob();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    public static void oq(final uml umlVar) {
        if (wol.kq(umlVar) == null || TextUtils.isEmpty(umlVar.ugp())) {
            return;
        }
        kq("download_gecko_start", false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.14
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", umlVar.ze());
                jSONObject.put("channel_name", umlVar.ugp());
                return fou.oq().kq("download_gecko_start").kq(umlVar.uc()).oq(jSONObject.toString());
            }
        });
    }

    public void bob() {
        kq("blind_mode_status", true, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.5
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                return fou.oq().kq("blind_mode_status");
            }
        });
    }

    public void oq(final fou fouVar) {
        if (bob(fouVar)) {
            return;
        }
        fouVar.kq("show_backup_endcard");
        sns.csi().kq(new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.17
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                return fouVar;
            }
        });
    }

    public static void kq(final uml umlVar) {
        if (umlVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        kq("bidding_receive", false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.1
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (umlVar.uc() == 3) {
                    jSONObject.put("is_icon_only", umlVar.fgm() ? 1 : 0);
                }
                return fou.oq().kq("bidding_receive").oq(jSONObject.toString());
            }
        });
    }

    public static void oq() {
        nz.bob(new syt("showFailLog") { // from class: com.bytedance.sdk.openadsdk.mxq.bob.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    bob.kq().kq("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    fax.bob("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public static void kq(uml umlVar, final long j10) {
        if (umlVar == null) {
            return;
        }
        kq("bidding_load", false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.8
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j10);
                return fou.oq().kq("bidding_load").oq(jSONObject.toString());
            }
        });
    }

    public static void kq(final String str, final com.bytedance.sdk.openadsdk.fou.csi.oq.kq kqVar) {
        if (kqVar == null) {
            return;
        }
        kq(str, false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.13
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                JSONObject jSONObjectBob = kqVar.bob();
                if (jSONObjectBob == null) {
                    jSONObjectBob = new JSONObject();
                }
                uml umlVarKq = kqVar.kq();
                jSONObjectBob.put("req_id", umlVarKq.jp());
                com.bytedance.sdk.openadsdk.fou.csi.oq.bob bobVarCsi = kqVar.csi();
                if (bobVarCsi != null) {
                    bobVarCsi.kq(jSONObjectBob);
                }
                return fou.oq().kq(str).kq(umlVarKq.uc()).oq(jSONObjectBob.toString());
            }
        });
    }

    public static void kq(final uml umlVar, final JSONObject jSONObject) {
        if (wol.kq(umlVar) == null || TextUtils.isEmpty(umlVar.ugp())) {
            return;
        }
        kq("download_gecko_end", false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.15
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", umlVar.ze());
                jSONObject2.put("channel_name", umlVar.ugp());
                jSONObject2.put(JsonStorageKeyNames.DATA_KEY, jSONObject);
                return fou.oq().kq("download_gecko_end").kq(umlVar.uc()).oq(jSONObject2.toString());
            }
        });
    }

    public void kq(final fou fouVar) {
        if (bob(fouVar)) {
            return;
        }
        fouVar.kq("express_ad_render");
        sns.csi().kq(new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.16
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                return fouVar;
            }
        });
    }

    public void kq(final long j10, final long j11) {
        final long j12 = j11 - j10;
        kq("general_label", false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.2
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                int i10 = !suf.oq.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j10);
                    jSONObject.put("endtime", j11);
                    jSONObject.put("start_type", i10);
                } catch (Throwable unused) {
                }
                return fou.oq().kq("general_label").syt(String.valueOf(j12)).oq(jSONObject.toString());
            }
        });
    }

    public void kq(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        kq(str, false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.4
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                return fou.oq().kq(str).oq(jSONObject.toString());
            }
        });
    }

    public void kq(final JSONObject jSONObject) {
        if (jSONObject == null) {
            fax.kq("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            fax.kq("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            fax.kq("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            kq("ad_revenue", true, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.6
                @Override // com.bytedance.sdk.openadsdk.mxq.oq
                public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                    try {
                        jSONObject.put("event", 272);
                        jSONObject.put("uuid", vvw.bob(sns.kq()));
                        String strKq = "";
                        try {
                            if (vvw.kq(sns.kq()) != null) {
                                strKq = vvw.kq(sns.kq());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", strKq);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return fou.oq().kq("ad_revenue").oq(jSONObject.toString());
                }
            });
        }
    }

    public static long kq(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jKq = 0;
        for (File file2 : file.listFiles()) {
            jKq += kq(file2);
        }
        return jKq;
    }

    public static void kq(String str, boolean z9, oq oqVar) {
        kq(str, z9, 100, oqVar);
    }

    public static void kq(String str, boolean z9, int i10, oq oqVar) {
        try {
            int iKq = ubx.bob().kq(str, i10);
            if (!TextUtils.isEmpty(str) && iKq != 0 && oqVar != null) {
                boolean z10 = iKq == 100;
                if (!z10) {
                    z10 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= iKq;
                }
                if (z10) {
                    sns.csi().kq(oqVar, z9);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void kq(long j10, long j11, final String str, final int i10) {
        if (j10 == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j12 = jElapsedRealtime - j10;
        final long j13 = jElapsedRealtime - j11;
        final long j14 = j11 - j10;
        kq("ad_show_cost_time", false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.9
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j12);
                jSONObject.put("renderDuration", j13);
                jSONObject.put("showToRenderDuration", j14);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i10);
                return fou.oq().kq("ad_show_cost_time").oq(jSONObject.toString());
            }
        });
    }

    public static void kq(int i10, String str) {
        kq(i10, str, 0, (String) null);
    }

    public static void kq(final int i10, final String str, final int i11, final String str2) {
        kq("ipv6_req", false, new oq<com.bytedance.sdk.openadsdk.mxq.kq.bob>() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.10
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i12 = i10;
                if (i12 == 1) {
                    str3 = "success";
                } else if (i12 == -1) {
                    jSONObject.put("error_code", i11);
                    jSONObject.put("error_msg", str2);
                    str3 = "fail";
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return fou.oq().kq("ipv6_req").oq(jSONObject.toString());
            }
        });
    }

    public static void kq(final String str, final boolean z9) {
        kq("img_error_param", false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.11
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z9 ? 1 : 0);
                    jSONObject.put("msg", str);
                } catch (Throwable unused) {
                }
                return fou.oq().kq("img_error_param").oq(jSONObject.toString());
            }
        });
    }

    public static void kq(final boolean z9) {
        kq("web_container_reuse", false, new oq() { // from class: com.bytedance.sdk.openadsdk.mxq.bob.12
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_hit", z9 ? 1 : 0);
                return fou.oq().kq("web_container_reuse").oq(jSONObject.toString());
            }
        });
    }
}
