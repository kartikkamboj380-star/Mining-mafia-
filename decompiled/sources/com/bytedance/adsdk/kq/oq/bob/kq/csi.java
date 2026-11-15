package com.bytedance.adsdk.kq.oq.bob.kq;

import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class csi extends rhi {
    @Override // com.bytedance.adsdk.kq.oq.bob.kq.rhi
    public int kq(String str, int i10, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque, com.bytedance.adsdk.kq.oq.bob.kq kqVar) {
        char cKq;
        int i11 = i10;
        while (true) {
            cKq = kq(i11, str);
            if (!com.bytedance.adsdk.kq.oq.csi.kq.oq(cKq) && !com.bytedance.adsdk.kq.oq.csi.kq.bob(cKq)) {
                break;
            }
            i11++;
        }
        if (cKq != '(') {
            return kqVar.kq(str, i10, deque);
        }
        deque.push(new com.bytedance.adsdk.kq.oq.oq.kq.nn(str.substring(i10, i11)));
        return i11 + 1;
    }
}
