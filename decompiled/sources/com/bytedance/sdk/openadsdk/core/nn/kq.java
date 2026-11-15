package com.bytedance.sdk.openadsdk.core.nn;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dgq;
import com.bytedance.sdk.openadsdk.core.settings.ubx;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.core.suf;
import com.bytedance.sdk.openadsdk.core.vvw;
import com.bytedance.sdk.openadsdk.multipro.fou.fou;
import com.bytedance.sdk.openadsdk.utils.wol;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class kq {
    private volatile boolean bob = true;
    private volatile boolean fou = false;
    private PglSSManager kq;
    private volatile boolean oq;

    public kq() {
        kq();
    }

    private void dgq() {
        if (this.kq == null) {
            this.kq = PglSSManager.getInstance();
        }
    }

    private Class nn() {
        Class<PglSSManager> cls;
        try {
            cls = PglSSManager.class;
            String str = PglSSManager.REPORT_SCENE_ADSHOW;
            try {
                this.bob = true;
                return cls;
            } catch (Throwable unused) {
                this.bob = false;
                return cls;
            }
        } catch (Throwable unused2) {
            cls = null;
        }
    }

    private boolean syt() {
        if (!this.oq && this.bob) {
            kq();
        }
        return this.oq;
    }

    public void bob() {
        if (syt()) {
            dgq();
            if (this.kq != null) {
                suf.oq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nn.kq.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, sns.fou().uml());
                            kq.this.kq.setCustomInfo(map);
                        } catch (Throwable th) {
                            fax.bob("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public String csi() {
        if (!syt()) {
            return "";
        }
        dgq();
        PglSSManager pglSSManager = this.kq;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public String fou() {
        if (!syt()) {
            return "";
        }
        dgq();
        PglSSManager pglSSManager = this.kq;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public boolean oq() {
        return this.oq;
    }

    public long rhi() {
        if (!syt()) {
            return 0L;
        }
        dgq();
        PglSSManager pglSSManager = this.kq;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public int rjo() {
        if (this.bob) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public synchronized void kq() {
        if (!this.oq) {
            try {
                Context contextKq = sns.kq();
                String strFou = dgq.oq().fou();
                if (TextUtils.isEmpty(strFou)) {
                    strFou = dgq.kq("app_id", Long.MAX_VALUE);
                }
                if (TextUtils.isEmpty(strFou)) {
                    return;
                }
                String strKq = vvw.kq(contextKq);
                String strOq = com.bytedance.sdk.openadsdk.fax.kq.oq.kq.kq().oq();
                PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strFou).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
                String strOq2 = fou.oq("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                HashMap map = new HashMap();
                if (!TextUtils.isEmpty(strOq2)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strOq2);
                }
                Set<String> setIaf = ubx.bob().iaf();
                if (setIaf != null && !setIaf.isEmpty()) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setIaf);
                }
                String strWcx = wol.wcx();
                if (!TextUtils.isEmpty(strWcx)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strWcx);
                }
                map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, ubx.bob().oz());
                String strKq2 = com.bytedance.sdk.openadsdk.jhe.kq.kq(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                if (!TextUtils.isEmpty(strKq2)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strKq2);
                }
                pglSSConfigBuild.setCustomInfo(map);
                pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.nn.kq.1
                    @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                    public void reportSoftDecData(final String str, final String str2) {
                        com.bytedance.sdk.openadsdk.mxq.bob.kq(str, false, new com.bytedance.sdk.openadsdk.mxq.oq() { // from class: com.bytedance.sdk.openadsdk.core.nn.kq.1.1
                            @Override // com.bytedance.sdk.openadsdk.mxq.oq
                            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                                return com.bytedance.sdk.openadsdk.mxq.kq.fou.oq().kq(str).oq(str2);
                            }
                        });
                    }
                });
                PglSSManager.init(contextKq, pglSSConfigBuild, null, null, strKq, strOq);
                dgq();
                this.oq = true;
            } catch (Throwable unused) {
                nn();
                this.oq = false;
            }
            try {
                if (this.bob) {
                    bob(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                fax.bob("mssdk", th.getMessage());
            }
        }
    }

    public void oq(String str) {
        if (syt()) {
            dgq();
            PglSSManager pglSSManager = this.kq;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    private void bob(final String str) {
        if (this.fou || TextUtils.isEmpty(str)) {
            return;
        }
        sns.csi().kq(new com.bytedance.sdk.openadsdk.mxq.oq() { // from class: com.bytedance.sdk.openadsdk.core.nn.kq.4
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() {
                return com.bytedance.sdk.openadsdk.mxq.kq.fou.oq().kq("secsdk_init_error").oq(str);
            }
        }, false);
        this.fou = true;
    }

    public void kq(String str) {
        if (syt()) {
            dgq();
            PglSSManager pglSSManager = this.kq;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void kq(final Map<String, Object> map) {
        if (syt()) {
            dgq();
            if (this.kq != null) {
                suf.oq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nn.kq.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            kq.this.kq.setCustomInfo(map);
                        } catch (Throwable th) {
                            fax.bob("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void kq(String str, Map<String, Object> map) {
        if (syt()) {
            dgq();
            PglSSManager pglSSManager = this.kq;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void kq(MotionEvent motionEvent) {
        if (oq()) {
            dgq();
            PglSSManager pglSSManager = this.kq;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> kq(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!syt() || (featureHash = this.kq.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
