package com.bytedance.adsdk.kq.oq.bob.kq;

import com.bytedance.adsdk.kq.oq.oq.kq.fax;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class oq extends rhi {
    @Override // com.bytedance.adsdk.kq.oq.bob.kq.rhi
    public int kq(String str, int i10, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque, com.bytedance.adsdk.kq.oq.bob.kq kqVar) {
        if ('\'' != kq(i10, str)) {
            return kqVar.kq(str, i10, deque);
        }
        int i11 = i10 + 1;
        int length = str.length();
        int i12 = i11;
        while (i12 < length && kq(i12, str) != '\'') {
            i12++;
        }
        if (kq(i12, str) != '\'') {
            throw new com.bytedance.adsdk.kq.kq.kq("String expression not surrounded by '", str.substring(i10));
        }
        deque.push(new fax(str.substring(i11, i12)));
        return i12 + 1;
    }
}
