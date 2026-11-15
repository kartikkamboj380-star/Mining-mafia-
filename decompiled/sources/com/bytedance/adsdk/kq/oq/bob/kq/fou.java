package com.bytedance.adsdk.kq.oq.bob.kq;

import com.bytedance.adsdk.kq.oq.oq.kq.mq;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class fou extends rhi {
    @Override // com.bytedance.adsdk.kq.oq.bob.kq.rhi
    public int kq(String str, int i10, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque, com.bytedance.adsdk.kq.oq.bob.kq kqVar) {
        if ('(' != kq(i10, str)) {
            return kqVar.kq(str, i10, deque);
        }
        deque.push(new mq(com.bytedance.adsdk.kq.oq.fou.fou.LEFT_PAREN));
        return i10 + 1;
    }
}
