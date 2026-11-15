package com.bytedance.sdk.component.rhi.kq;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq bob;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq csi;
    private csi dgq;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq fou;
    private com.bytedance.sdk.component.rhi.kq.kq.csi kq;
    private boolean nn;
    private com.bytedance.sdk.component.rhi.kq.oq.bob oq;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq rhi;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq rjo;
    private boolean syt;
    private int ubx;
    private int vvw;
    private long wki;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.rhi.kq.kq$kq, reason: collision with other inner class name */
    public static class C0251kq {
        private com.bytedance.sdk.component.rhi.kq.fou.oq.kq bob;
        private com.bytedance.sdk.component.rhi.kq.fou.oq.kq csi;
        private boolean dgq;
        private com.bytedance.sdk.component.rhi.kq.fou.oq.kq fou;
        private com.bytedance.sdk.component.rhi.kq.oq.bob kq;
        private com.bytedance.sdk.component.rhi.kq.fou.oq.kq oq;
        private boolean rhi;
        private csi rjo;
        private com.bytedance.sdk.component.rhi.kq.kq.csi syt;
        private long vvw;
        private int nn = 5000;
        private int ubx = 10;

        public C0251kq bob(com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
            this.fou = kqVar;
            return this;
        }

        public C0251kq kq(long j10) {
            this.vvw = j10;
            return this;
        }

        public C0251kq oq(com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
            this.bob = kqVar;
            return this;
        }

        public C0251kq kq(com.bytedance.sdk.component.rhi.kq.kq.csi csiVar) {
            this.syt = csiVar;
            return this;
        }

        public C0251kq oq(int i10) {
            this.ubx = i10;
            return this;
        }

        public C0251kq kq(csi csiVar) {
            this.rjo = csiVar;
            return this;
        }

        public C0251kq kq(boolean z9) {
            this.rhi = z9;
            return this;
        }

        public C0251kq kq(com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar) {
            this.oq = kqVar;
            return this;
        }

        public C0251kq kq(com.bytedance.sdk.component.rhi.kq.oq.bob bobVar) {
            this.kq = bobVar;
            return this;
        }

        public C0251kq kq(int i10) {
            this.nn = i10;
            return this;
        }

        public kq kq() {
            kq kqVar = new kq();
            kqVar.oq = this.kq;
            kqVar.bob = this.oq;
            kqVar.fou = this.bob;
            kqVar.csi = this.fou;
            kqVar.rhi = this.csi;
            kqVar.syt = this.rhi;
            kqVar.dgq = this.rjo;
            kqVar.kq = this.syt;
            kqVar.nn = this.dgq;
            kqVar.vvw = this.ubx;
            kqVar.ubx = this.nn;
            kqVar.wki = this.vvw;
            return kqVar;
        }
    }

    public long csi() {
        return this.wki;
    }

    public com.bytedance.sdk.component.rhi.kq.fou.oq.kq dgq() {
        return this.csi;
    }

    public com.bytedance.sdk.component.rhi.kq.oq.bob nn() {
        return this.oq;
    }

    public com.bytedance.sdk.component.rhi.kq.fou.oq.kq rhi() {
        return this.rjo;
    }

    public com.bytedance.sdk.component.rhi.kq.fou.oq.kq rjo() {
        return this.bob;
    }

    public com.bytedance.sdk.component.rhi.kq.fou.oq.kq syt() {
        return this.fou;
    }

    public boolean ubx() {
        return this.syt;
    }

    public int vvw() {
        return this.ubx;
    }

    public int wki() {
        return this.vvw;
    }

    private kq() {
        this.ubx = TTAdConstant.MATE_VALID;
        this.vvw = 10;
    }

    public boolean bob() {
        return this.nn;
    }

    public csi fou() {
        return this.dgq;
    }

    public com.bytedance.sdk.component.rhi.kq.fou.oq.kq oq() {
        return this.rhi;
    }

    public com.bytedance.sdk.component.rhi.kq.kq.csi kq() {
        return this.kq;
    }
}
