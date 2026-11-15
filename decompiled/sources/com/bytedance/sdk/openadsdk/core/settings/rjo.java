package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.fax;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    private static final AtomicInteger kq = new AtomicInteger(1);

    public static boolean kq() {
        return kq.get() == 1;
    }

    protected static void kq(int i10) {
        boolean z9 = true;
        if (i10 == 1 || i10 == 2) {
            try {
                AtomicInteger atomicInteger = kq;
                if (atomicInteger.get() != i10) {
                    try {
                        atomicInteger.set(i10);
                    } catch (Throwable th) {
                        th = th;
                        fax.bob("SdkSwitch", th.getMessage());
                    }
                } else {
                    z9 = false;
                }
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
            }
            if (z9) {
                Log.e("SdkSwitch", "switch status changed: " + kq());
                if (kq()) {
                    com.bytedance.sdk.openadsdk.fou.kq.oq.oq();
                } else {
                    com.bytedance.sdk.openadsdk.fou.kq.oq.bob();
                }
            }
        }
    }
}
