package com.bytedance.sdk.component.oq.kq;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class ubx implements Cloneable {
    public TimeUnit bob;
    public TimeUnit csi;
    public long fou;
    public List<syt> kq;
    public long oq;
    public long rhi;
    public TimeUnit rjo;

    public ubx(kq kqVar) {
        this.oq = kqVar.oq;
        this.fou = kqVar.fou;
        this.rhi = kqVar.rhi;
        List<syt> list = kqVar.kq;
        this.bob = kqVar.bob;
        this.csi = kqVar.csi;
        this.rjo = kqVar.rjo;
        this.kq = list;
    }

    public abstract fou kq();

    public abstract oq kq(vvw vvwVar);

    public kq oq() {
        return new kq(this);
    }

    public static final class kq {
        public TimeUnit bob;
        public TimeUnit csi;
        public long fou;
        public final List<syt> kq;
        public long oq;
        public long rhi;
        public TimeUnit rjo;

        public kq() {
            this.kq = new ArrayList();
            this.oq = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.bob = timeUnit;
            this.fou = 10000L;
            this.csi = timeUnit;
            this.rhi = 10000L;
            this.rjo = timeUnit;
        }

        public kq bob(long j10, TimeUnit timeUnit) {
            this.rhi = j10;
            this.rjo = timeUnit;
            return this;
        }

        public kq kq(long j10, TimeUnit timeUnit) {
            this.oq = j10;
            this.bob = timeUnit;
            return this;
        }

        public kq oq(long j10, TimeUnit timeUnit) {
            this.fou = j10;
            this.csi = timeUnit;
            return this;
        }

        public kq kq(syt sytVar) {
            this.kq.add(sytVar);
            return this;
        }

        public ubx kq() {
            return com.bytedance.sdk.component.oq.kq.kq.kq.kq(this);
        }

        public kq(String str) {
            this.kq = new ArrayList();
            this.oq = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.bob = timeUnit;
            this.fou = 10000L;
            this.csi = timeUnit;
            this.rhi = 10000L;
            this.rjo = timeUnit;
        }

        public kq(ubx ubxVar) {
            this.kq = new ArrayList();
            this.oq = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.bob = timeUnit;
            this.fou = 10000L;
            this.csi = timeUnit;
            this.rhi = 10000L;
            this.rjo = timeUnit;
            this.oq = ubxVar.oq;
            this.bob = ubxVar.bob;
            this.fou = ubxVar.fou;
            this.csi = ubxVar.csi;
            this.rhi = ubxVar.rhi;
            this.rjo = ubxVar.rjo;
        }
    }
}
