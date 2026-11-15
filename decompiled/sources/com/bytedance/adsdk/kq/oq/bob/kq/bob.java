package com.bytedance.adsdk.kq.oq.bob.kq;

import com.bytedance.adsdk.kq.oq.oq.kq.jhe;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class bob extends rhi {
    @Override // com.bytedance.adsdk.kq.oq.bob.kq.rhi
    public int kq(String str, int i10, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque, com.bytedance.adsdk.kq.oq.bob.kq kqVar) {
        char cKq = kq(i10, str);
        return (com.bytedance.adsdk.kq.oq.csi.kq.oq(cKq) || cKq == '$') ? kq(str, i10, deque) : kqVar.kq(str, i10, deque);
    }

    private int kq(String str, int i10, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i12 + i10;
            char cKq = kq(i11, str);
            if (!com.bytedance.adsdk.kq.oq.csi.kq.oq(cKq) && !com.bytedance.adsdk.kq.oq.csi.kq.bob(cKq) && '.' != cKq && '[' != cKq && ']' != cKq && '_' != cKq && '$' != cKq) {
                break;
            }
            i12++;
        }
        String strSubstring = str.substring(i10, i11);
        if (com.bytedance.adsdk.kq.oq.fou.kq.kq(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.kq.oq.oq.kq.rjo(strSubstring));
            return i11;
        }
        deque.push(new jhe(strSubstring));
        return i11;
    }
}
