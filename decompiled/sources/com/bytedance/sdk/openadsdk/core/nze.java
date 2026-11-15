package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* JADX INFO: loaded from: classes.dex */
public class nze {
    private final com.bytedance.sdk.openadsdk.utils.kq kq = new com.bytedance.sdk.openadsdk.utils.kq();
    private boolean oq;

    private static class kq {
        private static final nze kq = new nze();
    }

    public static nze kq() {
        return kq.kq;
    }

    public boolean bob() {
        return this.oq;
    }

    public com.bytedance.sdk.openadsdk.utils.kq csi() {
        return this.kq;
    }

    public boolean fou() {
        return this.kq.kq();
    }

    public void oq() {
        try {
            Context contextKq = sns.kq();
            if (contextKq instanceof Application) {
                ((Application) contextKq).registerActivityLifecycleCallbacks(this.kq);
                this.oq = true;
            } else {
                if (contextKq == null || contextKq.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextKq.getApplicationContext()).registerActivityLifecycleCallbacks(this.kq);
                this.oq = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean kq(boolean z9) {
        return this.kq.kq(z9);
    }
}
