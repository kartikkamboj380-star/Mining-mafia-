package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private static boolean bob;
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.uml> kq;
    private static long oq;

    public static boolean bob() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.uml> weakReference = kq;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        bob = true;
        return true;
    }

    public static void kq(com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        com.bytedance.sdk.openadsdk.core.model.rhi rhiVarXo = umlVar.xo();
        if (rhiVarXo == null || TextUtils.isEmpty(rhiVarXo.kq())) {
            return;
        }
        kq = new WeakReference<>(umlVar);
    }

    private static void oq(final long j10) {
        com.bytedance.sdk.openadsdk.core.model.uml umlVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.uml> weakReference = kq;
        if (weakReference == null || j10 <= 0 || (umlVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.fou.bob.kq(System.currentTimeMillis(), umlVar, umlVar.csi(), "store_duration", new com.bytedance.sdk.openadsdk.mxq.bob.kq() { // from class: com.bytedance.sdk.openadsdk.utils.csi.1
            @Override // com.bytedance.sdk.openadsdk.mxq.bob.kq, com.bytedance.sdk.openadsdk.mxq.bob.oq
            public JSONObject oq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        kq = null;
        bob = false;
    }

    public static void kq(long j10) {
        oq(j10);
    }

    public static void kq() {
        if (kq == null || bob) {
            return;
        }
        if (oq > 0) {
            oq(SystemClock.elapsedRealtime() - oq);
        }
        kq = null;
        oq = 0L;
    }

    public static void oq() {
        if (kq == null || bob) {
            return;
        }
        oq = SystemClock.elapsedRealtime();
    }
}
