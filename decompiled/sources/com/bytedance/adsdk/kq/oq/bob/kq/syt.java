package com.bytedance.adsdk.kq.oq.bob.kq;

import com.bytedance.adsdk.kq.oq.oq.kq.mxq;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class syt extends rhi {
    @Override // com.bytedance.adsdk.kq.oq.bob.kq.rhi
    public int kq(String str, int i10, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque, com.bytedance.adsdk.kq.oq.bob.kq kqVar) {
        if (!com.bytedance.adsdk.kq.oq.csi.kq.fou(kq(i10, str))) {
            return kqVar.kq(str, i10, deque);
        }
        int i11 = i10 + 1;
        String str2 = new String(new char[]{kq(i10, str), kq(i11, str)});
        if (com.bytedance.adsdk.kq.oq.fou.bob.kq(str2) != null) {
            deque.push(new mxq(com.bytedance.adsdk.kq.oq.fou.bob.kq(str2)));
            return i10 + 2;
        }
        String strValueOf = String.valueOf(kq(i10, str));
        if (com.bytedance.adsdk.kq.oq.fou.bob.kq(strValueOf) != null) {
            deque.push(new mxq(com.bytedance.adsdk.kq.oq.fou.bob.kq(strValueOf)));
            return i11;
        }
        throw new IllegalArgumentException("Unrecognized:" + strValueOf + "examine:" + str.substring(0, i10));
    }
}
