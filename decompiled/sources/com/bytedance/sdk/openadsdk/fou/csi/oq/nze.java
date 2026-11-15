package com.bytedance.sdk.openadsdk.fou.csi.oq;

import com.bykv.vk.openvk.kq.kq.kq.bob.a;
import com.bykv.vk.openvk.kq.kq.kq.bob.b;
import com.bytedance.sdk.openadsdk.core.model.uml;

/* JADX INFO: loaded from: classes.dex */
public class nze {
    private int bob;
    private uml csi;
    private a fou;
    private long kq;
    private String oq;

    public static class kq {
        private boolean csi;
        private int dgq;
        private boolean fou;
        private int nn;
        private b suf;
        private int syt;
        private int ubx;
        private int vvw;
        private long kq = 0;
        private long oq = 0;
        private long bob = 0;
        private long rhi = 0;
        private boolean rjo = false;
        private boolean wki = false;

        private void mxq() {
            long j10 = this.bob;
            if (j10 > 0) {
                long j11 = this.kq;
                if (j11 > j10) {
                    long j12 = j11 % j10;
                    this.kq = j12;
                    if (j12 == 0) {
                        this.kq = j10;
                    }
                }
            }
        }

        public long bob() {
            return this.oq;
        }

        public int csi() {
            return this.syt;
        }

        public int dgq() {
            return this.ubx;
        }

        public long fou() {
            return this.bob;
        }

        public long kq() {
            return this.rhi;
        }

        public int nn() {
            return this.vvw;
        }

        public boolean nze() {
            return this.csi;
        }

        public long oq() {
            return this.kq;
        }

        public int rhi() {
            return this.dgq;
        }

        public int rjo() {
            long j10 = this.bob;
            if (j10 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.kq * 100) / j10), 100);
        }

        public boolean suf() {
            return this.fou;
        }

        public int syt() {
            return this.nn;
        }

        public boolean ubx() {
            return this.wki;
        }

        public boolean vvw() {
            return this.rjo;
        }

        public b wki() {
            return this.suf;
        }

        public void bob(long j10) {
            this.oq = j10;
        }

        public void fou(long j10) {
            this.bob = j10;
            mxq();
        }

        public void kq(long j10) {
            this.rhi = j10;
        }

        public void oq(long j10) {
            this.kq = j10;
            mxq();
        }

        public void bob(int i10) {
            this.nn = i10;
        }

        public void kq(int i10) {
            this.syt = i10;
        }

        public void bob(boolean z9) {
            this.csi = z9;
        }

        public void fou(int i10) {
            this.vvw = i10;
        }

        public void kq(boolean z9) {
            this.rjo = z9;
        }

        public void oq(int i10) {
            this.dgq = i10;
        }

        public void kq(b bVar) {
            this.suf = bVar;
        }

        public void oq(boolean z9) {
            this.fou = z9;
        }
    }

    public nze(long j10, String str, int i10, a aVar, uml umlVar) {
        this.kq = j10;
        this.oq = str;
        this.bob = i10;
        this.fou = aVar;
        this.csi = umlVar;
    }

    public int bob() {
        return this.bob;
    }

    public uml csi() {
        return this.csi;
    }

    public a fou() {
        return this.fou;
    }

    public long kq() {
        return this.kq;
    }

    public String oq() {
        return this.oq;
    }
}
