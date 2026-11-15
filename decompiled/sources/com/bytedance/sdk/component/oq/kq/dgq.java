package com.bytedance.sdk.component.oq.kq;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class dgq {
    private String kq;
    private String oq;

    private dgq(String str) {
        this.kq = str;
    }

    public static dgq kq(String str) {
        return new dgq(str);
    }

    public String kq() {
        return this.kq;
    }

    public Charset kq(Charset charset) {
        try {
            String str = this.oq;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
