package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public class vvw extends YogaNodeJNIBase {
    protected void finalize() throws Throwable {
        try {
            wki();
        } finally {
            super.finalize();
        }
    }

    public void wki() {
        long j10 = this.kq;
        if (j10 != 0) {
            this.kq = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }
}
