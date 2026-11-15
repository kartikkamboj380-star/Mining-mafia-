package com.bytedance.adsdk.kq.kq;

/* JADX INFO: loaded from: classes.dex */
public class oq extends RuntimeException {
    public oq(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
