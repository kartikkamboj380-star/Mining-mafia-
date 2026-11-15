package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mxq implements com.bytedance.sdk.component.adexpress.bob {
    public final float bob;
    public final long csi;
    public JSONObject dgq;
    public final float fou;
    public final float kq;
    public SparseArray<com.bytedance.sdk.openadsdk.core.bob.bob.kq> nn;
    public int nze;
    public final float oq;
    public final long rhi;
    public final String rjo;
    public boolean suf;
    public int syt;
    public final boolean ubx;
    public int vvw;
    public JSONObject wki;

    public static class kq {
        private long bob;
        private float csi;
        private String dgq;
        private float fou;
        private int nn;
        private boolean nze;
        private long oq;
        private float rhi;
        private float rjo;
        private int syt;
        private JSONObject ubx;
        private int vvw;
        private JSONObject wki;
        private boolean suf = false;
        protected SparseArray<com.bytedance.sdk.openadsdk.core.bob.bob.kq> kq = new SparseArray<>();

        public kq bob(int i10) {
            this.syt = i10;
            return this;
        }

        public kq fou(float f10) {
            this.rjo = f10;
            return this;
        }

        public kq kq(int i10) {
            this.vvw = i10;
            return this;
        }

        public kq oq(int i10) {
            this.nn = i10;
            return this;
        }

        public kq bob(float f10) {
            this.rhi = f10;
            return this;
        }

        public kq kq(JSONObject jSONObject) {
            this.ubx = jSONObject;
            return this;
        }

        public kq oq(long j10) {
            this.bob = j10;
            return this;
        }

        public kq kq(boolean z9) {
            this.nze = z9;
            return this;
        }

        public kq oq(float f10) {
            this.csi = f10;
            return this;
        }

        public kq kq(long j10) {
            this.oq = j10;
            return this;
        }

        public kq oq(JSONObject jSONObject) {
            this.wki = jSONObject;
            return this;
        }

        public kq kq(float f10) {
            this.fou = f10;
            return this;
        }

        public kq oq(boolean z9) {
            this.suf = z9;
            return this;
        }

        public kq kq(String str) {
            this.dgq = str;
            return this;
        }

        public kq kq(SparseArray<com.bytedance.sdk.openadsdk.core.bob.bob.kq> sparseArray) {
            this.kq = sparseArray;
            return this;
        }

        public mxq kq() {
            return new mxq(this);
        }
    }

    private mxq(@NonNull kq kqVar) {
        this.suf = false;
        this.kq = kqVar.rjo;
        this.oq = kqVar.rhi;
        this.bob = kqVar.csi;
        this.fou = kqVar.fou;
        this.csi = kqVar.bob;
        this.rhi = kqVar.oq;
        this.rjo = kqVar.dgq;
        this.nn = kqVar.kq;
        this.ubx = kqVar.nze;
        this.syt = kqVar.nn;
        this.dgq = kqVar.ubx;
        this.vvw = kqVar.vvw;
        this.wki = kqVar.wki;
        this.suf = kqVar.suf;
        this.nze = kqVar.syt;
    }
}
