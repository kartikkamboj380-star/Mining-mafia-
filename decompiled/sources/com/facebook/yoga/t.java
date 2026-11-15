package com.facebook.yoga;

/* JADX INFO: loaded from: classes2.dex */
public class t extends YogaNodeJNIBase {
    public t(c cVar) {
        super(cVar);
    }

    protected void finalize() throws Throwable {
        try {
            v0();
        } finally {
            super.finalize();
        }
    }

    public void v0() {
        long j10 = this.f16602f;
        if (j10 != 0) {
            this.f16602f = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }
}
