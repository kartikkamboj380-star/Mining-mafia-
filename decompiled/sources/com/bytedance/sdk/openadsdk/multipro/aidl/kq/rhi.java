package com.bytedance.sdk.openadsdk.multipro.aidl.kq;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.sns;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends com.bytedance.sdk.component.rhi.kq.rhi.kq {
    private static volatile rhi kq;

    public static rhi oq() {
        if (kq == null) {
            synchronized (rhi.class) {
                try {
                    if (kq == null) {
                        kq = new rhi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi
    public Map kq(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!com.bytedance.sdk.openadsdk.core.settings.rjo.kq()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.kq.kq.kq(com.bytedance.sdk.openadsdk.multipro.csi.kq(sns.kq()).kq(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi
    public String kq(Uri uri) {
        if (com.bytedance.sdk.openadsdk.core.settings.rjo.kq()) {
            return com.bytedance.sdk.openadsdk.multipro.csi.kq(sns.kq()).kq(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi
    public String kq(Uri uri, ContentValues contentValues) {
        Uri uriKq;
        if (com.bytedance.sdk.openadsdk.core.settings.rjo.kq() && (uriKq = com.bytedance.sdk.openadsdk.multipro.csi.kq(sns.kq()).kq(uri, contentValues)) != null) {
            return uriKq.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi
    public int kq(Uri uri, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.rjo.kq()) {
            return com.bytedance.sdk.openadsdk.multipro.csi.kq(sns.kq()).kq(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.rhi
    public int kq(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.rjo.kq()) {
            return com.bytedance.sdk.openadsdk.multipro.csi.kq(sns.kq()).kq(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
