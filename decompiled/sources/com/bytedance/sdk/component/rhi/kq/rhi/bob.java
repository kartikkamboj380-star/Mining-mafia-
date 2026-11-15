package com.bytedance.sdk.component.rhi.kq.rhi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.rhi.kq.syt;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.UnityAdsConstants;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob implements oq {
    private final Context kq;
    private final csi oq;

    @SuppressLint({"StaticFieldLeak"})
    private class kq extends com.bytedance.sdk.component.rhi.kq.csi.csi {
        private final String bob;
        private final Map<String, String> fou;
        private final fou oq;

        private String bob(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.bob)) ? str.replace("{UID}", this.bob).replace("__UID__", this.bob) : str;
        }

        boolean kq(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        String oq(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(bob.bob().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.rhi.kq.csi.fou fouVarKq;
            com.bytedance.sdk.component.rhi.kq.csi csiVarMxq = syt.rjo().mxq();
            if (csiVarMxq == null || syt.rjo().rhi() == null || !csiVarMxq.bob() || !kq(this.oq.oq())) {
                return;
            }
            if (this.oq.fou() >= csiVarMxq.bob(this.oq.rhi())) {
                bob.this.oq.bob(this.oq);
                return;
            }
            try {
                if (this.oq.ubx()) {
                    bob.this.oq.kq(this.oq);
                }
                if (csiVarMxq.kq(bob.this.kq())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strOq = this.oq.oq();
                    if (csiVarMxq.rhi() == 0) {
                        strOq = bob(this.oq.oq());
                        if (this.oq.bob()) {
                            strOq = oq(strOq);
                        }
                    }
                    com.bytedance.sdk.component.rhi.kq.csi.bob bobVarNn = csiVarMxq.nn();
                    if (bobVarNn == null) {
                        return;
                    }
                    bobVarNn.kq("User-Agent", csiVarMxq.dgq());
                    bobVarNn.kq("csj_client_source_from", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    if (this.fou != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.fou.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        bobVarNn.kq("csj_extra_info", jSONObject.toString());
                    }
                    bobVarNn.kq(strOq);
                    try {
                        fouVarKq = bobVarNn.kq();
                        try {
                            fouVarKq.kq();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        fouVarKq = null;
                    }
                    fou fouVar = this.oq;
                    fouVar.kq(fouVar.fou() + 1);
                    if (fouVarKq != null && fouVarKq.kq()) {
                        bob.this.oq.bob(this.oq);
                        this.oq.oq();
                        csiVarMxq.kq(true, TTAdConstant.MATE_VALID, System.currentTimeMillis() - jCurrentTimeMillis, this.oq);
                        return;
                    }
                    if (fouVarKq != null) {
                        this.oq.oq(fouVarKq.oq());
                        this.oq.bob(fouVarKq.bob());
                    }
                    if (fouVarKq == null || fouVarKq.oq() != 8848) {
                        this.oq.oq();
                        if (this.oq.fou() >= csiVarMxq.bob(this.oq.rhi())) {
                            bob.this.oq.bob(this.oq);
                            this.oq.oq();
                        } else {
                            bob.this.oq.oq(this.oq);
                        }
                    } else {
                        fouVarKq.bob();
                        bob.this.oq.bob(this.oq);
                    }
                    csiVarMxq.kq(false, this.oq.syt(), System.currentTimeMillis() - jCurrentTimeMillis, this.oq);
                }
            } catch (Throwable unused3) {
            }
        }

        private kq(fou fouVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.oq = fouVar;
            this.bob = str;
            this.fou = map;
        }
    }

    public bob(Context context, csi csiVar) {
        this.kq = context;
        this.oq = csiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random bob() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context kq() {
        Context context = this.kq;
        return context == null ? syt.rjo().rhi() : context;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi.oq
    public void kq(String str, List<String> list, boolean z9, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.rhi.kq.csi csiVarMxq = syt.rjo().mxq();
        if (csiVarMxq == null || syt.rjo().rhi() == null || csiVarMxq.fou() == null || !csiVarMxq.bob() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            csiVarMxq.fou().execute(new kq(new fou(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z9, i10, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi.oq
    public Runnable kq(final fou fouVar, final String str, final Map<String, String> map) {
        if (fouVar == null || TextUtils.isEmpty(fouVar.kq())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.rhi.kq.rhi.bob.1
            @Override // java.lang.Runnable
            public void run() {
                if (bob.this.oq.kq(fouVar.kq()) != null) {
                    new kq(fouVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi.oq
    public void kq(final String str, final boolean z9) {
        com.bytedance.sdk.component.rhi.kq.csi csiVarMxq = syt.rjo().mxq();
        if (csiVarMxq == null || syt.rjo().rhi() == null || !csiVarMxq.bob()) {
            return;
        }
        com.bytedance.sdk.component.rhi.kq.csi.csi csiVar = new com.bytedance.sdk.component.rhi.kq.csi.csi("trackFailedUrls") { // from class: com.bytedance.sdk.component.rhi.kq.rhi.bob.2
            @Override // java.lang.Runnable
            public void run() {
                bob.this.kq(bob.this.oq.kq(), str, z9);
            }
        };
        csiVar.kq(1);
        if (csiVarMxq.fou() != null) {
            csiVarMxq.fou().execute(csiVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(List<fou> list, String str, boolean z9) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.rhi.kq.csi csiVarMxq = syt.rjo().mxq();
        for (fou fouVar : list) {
            if (csiVarMxq == null || csiVarMxq.fou() == null) {
                str2 = str;
            } else {
                fouVar.kq(z9);
                str2 = str;
                csiVarMxq.fou().execute(new kq(fouVar, str2, null));
            }
            str = str2;
        }
    }
}
