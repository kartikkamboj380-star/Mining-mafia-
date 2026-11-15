package com.bytedance.sdk.openadsdk.core.nn;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private static com.bytedance.sdk.openadsdk.core.nn.kq kq;
    private String oq;

    private static class kq {
        private static final oq kq = new oq();
    }

    public boolean bob() {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar = kq;
        if (kqVar == null) {
            return false;
        }
        return kqVar.oq();
    }

    public String csi() {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar = kq;
        return kqVar != null ? kqVar.csi() : "";
    }

    public String fou() {
        String strFou;
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar = kq;
        return (kqVar == null || (strFou = kqVar.fou()) == null) ? "" : strFou;
    }

    public void kq(String str) {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar;
        if (TextUtils.isEmpty(str) || (kqVar = kq) == null) {
            return;
        }
        kqVar.kq(str);
    }

    public void oq(String str) {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar;
        if (TextUtils.isEmpty(str) || (kqVar = kq) == null) {
            return;
        }
        kqVar.oq(str);
    }

    public long rhi() {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar = kq;
        if (kqVar != null) {
            return kqVar.rhi();
        }
        return 0L;
    }

    public int rjo() {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar = kq;
        if (kqVar != null) {
            return kqVar.rjo();
        }
        return 1;
    }

    private oq() {
        this.oq = null;
        kq = new com.bytedance.sdk.openadsdk.core.nn.kq();
    }

    public static oq oq() {
        return kq.kq;
    }

    public void kq(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar = kq;
        if (kqVar != null) {
            kqVar.kq(map);
        }
    }

    public void kq() {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar = kq;
        if (kqVar != null) {
            kqVar.bob();
        }
    }

    public void kq(@NonNull String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar = kq;
        if (kqVar != null) {
            kqVar.kq(str, map);
        }
    }

    public Map<String, String> kq(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar = kq;
        if (kqVar != null) {
            return kqVar.kq(str, bArr);
        }
        return new HashMap();
    }

    public void kq(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.nn.kq kqVar = kq;
        if (kqVar != null) {
            kqVar.kq(motionEvent);
        }
    }
}
