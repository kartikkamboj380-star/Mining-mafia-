package com.bytedance.adsdk.kq.oq.bob.kq;

import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public abstract class rhi {
    protected char kq(int i10, String str) {
        if (i10 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i10);
    }

    public abstract int kq(String str, int i10, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque, com.bytedance.adsdk.kq.oq.bob.kq kqVar);

    protected int oq(int i10, String str) {
        while (com.bytedance.adsdk.kq.oq.csi.kq.kq(kq(i10, str))) {
            i10++;
        }
        return i10;
    }
}
