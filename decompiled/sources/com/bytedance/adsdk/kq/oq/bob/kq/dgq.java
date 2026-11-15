package com.bytedance.adsdk.kq.oq.bob.kq;

import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends rhi {
    @Override // com.bytedance.adsdk.kq.oq.bob.kq.rhi
    public int kq(String str, int i10, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque, com.bytedance.adsdk.kq.oq.bob.kq kqVar) {
        com.bytedance.adsdk.kq.oq.oq.kq kqVarPollFirst;
        if (')' != kq(i10, str)) {
            return kqVar.kq(str, i10, deque);
        }
        LinkedList<com.bytedance.adsdk.kq.oq.oq.kq> linkedList = new LinkedList();
        while (true) {
            kqVarPollFirst = deque.pollFirst();
            if (kqVarPollFirst == null || kqVarPollFirst.kq() == com.bytedance.adsdk.kq.oq.fou.fou.LEFT_PAREN || ((kqVarPollFirst instanceof com.bytedance.adsdk.kq.oq.oq.kq.nn) && kqVarPollFirst.kq() == com.bytedance.adsdk.kq.oq.fou.oq.METHOD && !((com.bytedance.adsdk.kq.oq.oq.kq.nn) kqVarPollFirst).bob())) {
                break;
            }
            linkedList.addFirst(kqVarPollFirst);
        }
        if (kqVarPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i10));
        }
        if (kqVarPollFirst.kq() != com.bytedance.adsdk.kq.oq.fou.oq.METHOD) {
            deque.push(com.bytedance.adsdk.kq.oq.csi.oq.kq(linkedList, str, i10));
            return i10 + 1;
        }
        com.bytedance.adsdk.kq.oq.oq.kq.nn nnVar = (com.bytedance.adsdk.kq.oq.oq.kq.nn) kqVarPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.kq.oq.oq.kq kqVar2 : linkedList) {
            if (kqVar2.kq() == com.bytedance.adsdk.kq.oq.fou.fou.COMMA) {
                linkedList2.add(com.bytedance.adsdk.kq.oq.csi.oq.kq(linkedList3, str, i10));
                linkedList3.clear();
            } else {
                linkedList3.addLast(kqVar2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.kq.oq.csi.oq.kq(linkedList3, str, i10));
        }
        nnVar.kq((com.bytedance.adsdk.kq.oq.oq.kq[]) linkedList2.toArray(new com.bytedance.adsdk.kq.oq.oq.kq[linkedList2.size()]));
        nnVar.kq(true);
        int i11 = i10 + 1;
        deque.push(nnVar);
        return i11;
    }
}
