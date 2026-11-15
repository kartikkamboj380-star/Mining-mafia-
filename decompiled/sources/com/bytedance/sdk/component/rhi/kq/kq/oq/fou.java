package com.bytedance.sdk.component.rhi.kq.kq.oq;

import com.bytedance.sdk.component.rhi.kq.fou.kq;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public abstract class fou<T extends com.bytedance.sdk.component.rhi.kq.fou.kq> {
    private Queue<String> bob;
    private String fou;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq kq;
    private Queue<T> oq = new ConcurrentLinkedQueue();

    public fou(com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar, Queue<String> queue, String str) {
        this.kq = kqVar;
        this.bob = queue;
        this.fou = str;
    }

    public void kq(T t10) {
        Queue<T> queue = this.oq;
        if (queue == null || t10 == null) {
            return;
        }
        queue.offer(t10);
    }

    public synchronized boolean oq(int i10, int i11) {
        int size = this.oq.size();
        int iKq = this.kq.kq();
        if (i10 != 2 && i10 != 1) {
            return size >= iKq;
        }
        if (com.bytedance.sdk.component.rhi.kq.bob.kq.bob()) {
            return size > 0;
        }
        return size >= iKq;
    }

    public synchronized List<com.bytedance.sdk.component.rhi.kq.fou.kq> kq(int i10, int i11) {
        if (!oq(i10, i11)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.kq.kq());
        do {
            T tPoll = this.oq.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.kq.oq());
        return arrayList;
    }

    public synchronized void kq(int i10, List<T> list) {
        try {
            if (i10 != -1 && i10 != 200 && i10 != 509) {
                this.oq.addAll(list);
            } else {
                this.oq.size();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
