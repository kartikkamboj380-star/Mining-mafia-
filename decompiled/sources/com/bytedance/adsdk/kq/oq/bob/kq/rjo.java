package com.bytedance.adsdk.kq.oq.bob.kq;

import com.bytedance.adsdk.kq.oq.oq.kq.nze;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends rhi {
    private boolean kq(String str, int i10, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque) {
        if ('-' != kq(i10, str)) {
            return com.bytedance.adsdk.kq.oq.csi.kq.bob(kq(i10, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.kq.oq.fou.bob.kq(deque.peek().kq())) {
            return false;
        }
        if (com.bytedance.adsdk.kq.oq.csi.kq.bob(kq(i10 + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i10));
    }

    @Override // com.bytedance.adsdk.kq.oq.bob.kq.rhi
    public int kq(String str, int i10, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque, com.bytedance.adsdk.kq.oq.bob.kq kqVar) {
        char cKq;
        if (!kq(str, i10, deque)) {
            return kqVar.kq(str, i10, deque);
        }
        int i11 = kq(i10, str) == '-' ? i10 + 1 : i10;
        boolean z9 = false;
        while (true) {
            cKq = kq(i11, str);
            if (!com.bytedance.adsdk.kq.oq.csi.kq.bob(cKq) && (z9 || cKq != '.')) {
                break;
            }
            i11++;
            if (cKq == '.') {
                z9 = true;
            }
        }
        if (cKq != '.') {
            deque.push(new nze(str.substring(i10, i11)));
            return i11;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i10, i11));
    }
}
