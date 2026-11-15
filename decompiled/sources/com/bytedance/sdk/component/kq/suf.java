package com.bytedance.sdk.component.kq;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class suf {
    public final String bob;
    public final String csi;
    public final String fou;
    public final int kq;
    public final String oq;
    public final String rhi;
    public final String rjo;
    public final String syt;

    public static final class kq {
        private String bob;
        private String csi;
        private String fou;
        private String kq;
        private String oq;
        private String rhi;
        private String rjo;

        private kq() {
        }

        public kq bob(String str) {
            this.bob = str;
            return this;
        }

        public kq csi(String str) {
            this.csi = str;
            return this;
        }

        public kq fou(String str) {
            this.fou = str;
            return this;
        }

        public kq kq(String str) {
            this.kq = str;
            return this;
        }

        public kq oq(String str) {
            this.oq = str;
            return this;
        }

        public kq rhi(String str) {
            this.rhi = str;
            return this;
        }

        public kq rjo(String str) {
            this.rjo = str;
            return this;
        }

        public suf kq() {
            return new suf(this);
        }
    }

    public static kq kq() {
        return new kq();
    }

    public String toString() {
        return "methodName: " + this.fou + ", params: " + this.csi + ", callbackId: " + this.rhi + ", type: " + this.bob + ", version: " + this.oq + ", ";
    }

    private suf(String str, int i10) {
        this.oq = null;
        this.bob = null;
        this.fou = null;
        this.csi = null;
        this.rhi = str;
        this.rjo = null;
        this.kq = i10;
        this.syt = null;
    }

    public static suf kq(String str, int i10) {
        return new suf(str, i10);
    }

    public static boolean kq(suf sufVar) {
        return sufVar == null || sufVar.kq != 1 || TextUtils.isEmpty(sufVar.fou) || TextUtils.isEmpty(sufVar.csi);
    }

    private suf(kq kqVar) {
        this.oq = kqVar.kq;
        this.bob = kqVar.oq;
        this.fou = kqVar.bob;
        this.csi = kqVar.fou;
        this.rhi = kqVar.csi;
        this.rjo = kqVar.rhi;
        this.kq = 1;
        this.syt = kqVar.rjo;
    }
}
