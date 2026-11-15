package com.bytedance.sdk.component.syt;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class rjo<V> extends FutureTask<V> implements Comparable<rjo<V>> {
    private int kq;
    private int oq;

    public rjo(Callable<V> callable, int i10, int i11) {
        super(callable);
        this.kq = i10 == -1 ? 5 : i10;
        this.oq = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public int compareTo(rjo rjoVar) {
        if (kq() < rjoVar.kq()) {
            return 1;
        }
        return kq() > rjoVar.kq() ? -1 : 0;
    }

    public int kq() {
        return this.kq;
    }
}
