package com.bytedance.sdk.openadsdk.core.ubx.rhi;

import com.bytedance.adsdk.ugeno.core.wcx;
import com.bytedance.sdk.component.adexpress.oq.wki;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq extends wki {
    private float bob;
    private boolean csi;
    private float fou;
    private JSONObject kq;
    private wcx oq;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ubx.rhi.kq$kq, reason: collision with other inner class name */
    public static class C0287kq extends wki.kq {
        private float bob;
        private boolean csi;
        private float fou;
        private JSONObject kq;
        private wcx oq;

        public C0287kq rhi(boolean z9) {
            this.csi = z9;
            return this;
        }

        public C0287kq oq(float f10) {
            this.fou = f10;
            return this;
        }

        public C0287kq kq(JSONObject jSONObject) {
            this.kq = jSONObject;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.oq.wki.kq
        /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
        public kq kq() {
            return new kq(this);
        }

        public C0287kq kq(wcx wcxVar) {
            this.oq = wcxVar;
            return this;
        }

        public C0287kq kq(float f10) {
            this.bob = f10;
            return this;
        }
    }

    public kq(C0287kq c0287kq) {
        super(c0287kq);
        this.kq = c0287kq.kq;
        this.oq = c0287kq.oq;
        this.bob = c0287kq.bob;
        this.fou = c0287kq.fou;
        this.csi = c0287kq.csi;
    }

    public float fgm() {
        return this.fou;
    }

    public float ha() {
        return this.bob;
    }

    public wcx ktb() {
        return this.oq;
    }

    public boolean wf() {
        return this.csi;
    }

    public JSONObject zfx() {
        return this.kq;
    }
}
