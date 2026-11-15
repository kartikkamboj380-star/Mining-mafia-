package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.yyl;

/* JADX INFO: loaded from: classes.dex */
public class zfx {
    private long csi;
    private long dgq;
    public boolean kq;
    private long nn;
    public long oq;
    private long rhi;
    private long rjo;
    private long syt;
    private int ubx;
    private long vvw;
    private int wki;
    private yyl bob = yyl.bob();
    private yyl fou = yyl.bob();

    public long bob() {
        return this.rhi;
    }

    public long csi() {
        return this.syt;
    }

    public long dgq() {
        return this.vvw;
    }

    public long fou() {
        return this.rjo;
    }

    public void kq(yyl yylVar, yyl yylVar2, int i10, yyl yylVar3) {
        this.csi = yylVar.kq(this.bob);
        this.rhi = yylVar2.kq(yylVar);
        this.rjo = i10;
        this.syt = yylVar3.kq(yylVar2);
    }

    public synchronized int nn() {
        return this.wki;
    }

    public void oq(yyl yylVar) {
        this.fou = yylVar;
        this.dgq = yylVar.kq(this.bob);
    }

    public long rhi() {
        return this.dgq;
    }

    public long rjo() {
        return this.nn;
    }

    public int syt() {
        return this.ubx;
    }

    public long oq() {
        return this.csi;
    }

    public void oq(long j10) {
        this.vvw = j10;
    }

    public void kq(yyl yylVar) {
        this.bob = yylVar;
    }

    public synchronized void oq(int i10) {
        this.wki = i10;
    }

    public yyl kq() {
        return this.bob;
    }

    public void kq(long j10) {
        this.nn = j10;
    }

    public void kq(int i10) {
        this.ubx = i10;
    }
}
