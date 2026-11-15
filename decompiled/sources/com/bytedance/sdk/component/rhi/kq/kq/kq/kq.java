package com.bytedance.sdk.component.rhi.kq.kq.kq;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class kq extends oq {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile kq kq;

    private kq(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.kq.oq
    public /* bridge */ /* synthetic */ oq.C0252oq kq() {
        return super.kq();
    }

    public static kq kq(Context context) {
        if (kq == null) {
            synchronized (kq.class) {
                try {
                    if (kq == null) {
                        kq = new kq(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }
}
