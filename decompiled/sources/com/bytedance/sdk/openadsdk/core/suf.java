package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class suf {
    public static long fou = 0;
    public static volatile boolean kq = false;
    public static long rhi;
    private static volatile HandlerThread syt;
    public static AtomicBoolean oq = new AtomicBoolean(false);
    public static long bob = 0;
    private static volatile int rjo = 0;
    public static float csi = 1.0f;
    private static volatile Handler dgq = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.suf.1
            boolean kq = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.kq) {
                    return;
                }
                this.kq = true;
                super.start();
            }
        };
        syt = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.syt.kq(syt);
        rhi = System.currentTimeMillis();
    }

    public static Handler bob() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean csi() {
        return fou() == 1;
    }

    public static int fou() {
        return rjo;
    }

    public static void kq(long j10) {
        rhi = j10;
    }

    public static Handler oq() {
        if (syt == null || !syt.isAlive()) {
            synchronized (suf.class) {
                try {
                    if (syt == null || !syt.isAlive()) {
                        syt = com.bytedance.sdk.component.utils.syt.kq("csj_init_handle", -1);
                        dgq = new Handler(syt.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (dgq == null) {
            synchronized (suf.class) {
                try {
                    if (dgq == null) {
                        dgq = new Handler(syt.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return dgq;
    }

    public static void rhi() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - bob <= 10000) {
            return;
        }
        bob = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.nz.kq(new com.bytedance.sdk.component.syt.syt("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.suf.2
            @Override // java.lang.Runnable
            public void run() {
                String strOq = com.bytedance.sdk.openadsdk.core.settings.ubx.oq(sns.kq());
                if (TextUtils.equals(strOq, com.bytedance.sdk.openadsdk.core.settings.ubx.fou)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.ubx.bob().kq(6, true);
                com.bytedance.sdk.openadsdk.core.settings.ubx.fou = strOq;
            }
        });
    }

    public static void rjo() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - bob <= 10000) {
            return;
        }
        synchronized (suf.class) {
            try {
                if (jElapsedRealtime - bob <= 10000) {
                    return;
                }
                bob = jElapsedRealtime;
                com.bytedance.sdk.component.utils.dgq.kq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.suf.3
                    @Override // java.lang.Runnable
                    public void run() {
                        String strOq = com.bytedance.sdk.openadsdk.core.settings.ubx.oq(sns.kq());
                        if (TextUtils.equals(strOq, com.bytedance.sdk.openadsdk.core.settings.ubx.fou)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.settings.ubx.bob().kq(6, true);
                        com.bytedance.sdk.openadsdk.core.settings.ubx.fou = strOq;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void syt() {
        oq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.suf.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.wcx.bob.kq(new com.bytedance.sdk.openadsdk.wcx.fou() { // from class: com.bytedance.sdk.openadsdk.core.suf.4.1
                        @Override // com.bytedance.sdk.openadsdk.wcx.fou
                        public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
                            com.bytedance.sdk.openadsdk.wcx.oq.kq kqVar = new com.bytedance.sdk.openadsdk.wcx.oq.kq();
                            kqVar.oq("init");
                            return kqVar;
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.fax.bob("InitHelper", th.getMessage());
                }
            }
        });
    }

    public static long kq() {
        return rhi;
    }

    public static void kq(int i10) {
        rjo = i10;
    }

    public static void kq(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if ("mediation".equals(jSONObject.optString(MediationMetaData.KEY_NAME, ""))) {
                    dgq.oq().oq(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("InitHelper", th.getMessage());
        }
    }
}
