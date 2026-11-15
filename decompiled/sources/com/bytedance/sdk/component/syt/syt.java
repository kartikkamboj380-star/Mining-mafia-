package com.bytedance.sdk.component.syt;

/* JADX INFO: loaded from: classes.dex */
public abstract class syt implements Comparable<syt>, Runnable {
    private int kq;
    private String oq;

    public syt(String str, int i10) {
        this.kq = 0;
        this.kq = i10 == 0 ? 5 : i10;
        this.oq = str;
    }

    public String getName() {
        return this.oq;
    }

    public int getPriority() {
        return this.kq;
    }

    public void setPriority(int i10) {
        this.kq = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(syt sytVar) {
        if (getPriority() < sytVar.getPriority()) {
            return 1;
        }
        return getPriority() >= sytVar.getPriority() ? -1 : 0;
    }

    public syt(String str) {
        this.kq = 5;
        this.oq = str;
    }
}
