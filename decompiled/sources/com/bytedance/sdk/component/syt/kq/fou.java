package com.bytedance.sdk.component.syt.kq;

import com.bytedance.sdk.component.syt.kq.bob;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class fou<T extends bob> {
    private int kq;
    private BlockingQueue<T> oq = new LinkedBlockingQueue();

    private fou(int i10) {
        this.kq = i10;
    }

    public static fou kq(int i10) {
        return new fou(i10);
    }

    public T kq() {
        return this.oq.poll();
    }

    public boolean kq(T t10) {
        if (t10 == null) {
            return false;
        }
        t10.kq();
        if (this.oq.size() >= this.kq) {
            return false;
        }
        return this.oq.offer(t10);
    }
}
