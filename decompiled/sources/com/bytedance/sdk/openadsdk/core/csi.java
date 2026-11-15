package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class csi extends rhi {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile csi kq;

    private csi(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rhi
    public /* bridge */ /* synthetic */ rhi.bob kq() {
        return super.kq();
    }

    public static csi kq(Context context) {
        if (kq == null) {
            synchronized (csi.class) {
                try {
                    if (kq == null) {
                        kq = new csi(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }
}
