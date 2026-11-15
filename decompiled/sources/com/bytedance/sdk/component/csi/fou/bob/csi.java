package com.bytedance.sdk.component.csi.fou.bob;

import android.content.Context;
import com.bytedance.sdk.component.csi.fax;
import com.bytedance.sdk.component.csi.mq;
import com.bytedance.sdk.component.csi.sns;
import com.bytedance.sdk.component.csi.vvw;
import com.bytedance.sdk.component.csi.wcx;
import com.bytedance.sdk.component.csi.wki;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class csi implements wki {
    private com.bytedance.sdk.component.csi.fou bob;
    private wcx csi;
    private mq dgq;
    private sns fou;
    private vvw kq;
    private boolean nn;
    private ExecutorService oq;
    private com.bytedance.sdk.component.csi.bob rhi;
    private com.bytedance.sdk.component.csi.oq rjo;
    private fax syt;

    public static class kq {
        private com.bytedance.sdk.component.csi.fou bob;
        private wcx csi;
        private mq dgq;
        private sns fou;
        private vvw kq;
        private boolean nn;
        private ExecutorService oq;
        private com.bytedance.sdk.component.csi.bob rhi;
        private com.bytedance.sdk.component.csi.oq rjo;
        private fax syt;

        public kq kq(com.bytedance.sdk.component.csi.oq oqVar) {
            this.rjo = oqVar;
            return this;
        }

        public kq kq(mq mqVar) {
            this.dgq = mqVar;
            return this;
        }

        public kq kq(fax faxVar) {
            this.syt = faxVar;
            return this;
        }

        public kq kq(com.bytedance.sdk.component.csi.fou fouVar) {
            this.bob = fouVar;
            return this;
        }

        public kq kq(boolean z9) {
            this.nn = z9;
            return this;
        }

        public csi kq() {
            return new csi(this);
        }
    }

    @Override // com.bytedance.sdk.component.csi.wki
    public fax bob() {
        return this.syt;
    }

    @Override // com.bytedance.sdk.component.csi.wki
    public sns csi() {
        return this.fou;
    }

    @Override // com.bytedance.sdk.component.csi.wki
    public mq dgq() {
        return this.dgq;
    }

    @Override // com.bytedance.sdk.component.csi.wki
    public com.bytedance.sdk.component.csi.fou fou() {
        return this.bob;
    }

    @Override // com.bytedance.sdk.component.csi.wki
    public vvw kq() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.csi.wki
    public boolean nn() {
        return this.nn;
    }

    @Override // com.bytedance.sdk.component.csi.wki
    public ExecutorService oq() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.component.csi.wki
    public wcx rhi() {
        return this.csi;
    }

    @Override // com.bytedance.sdk.component.csi.wki
    public com.bytedance.sdk.component.csi.bob rjo() {
        return this.rhi;
    }

    @Override // com.bytedance.sdk.component.csi.wki
    public com.bytedance.sdk.component.csi.oq syt() {
        return this.rjo;
    }

    private csi(kq kqVar) {
        this.kq = kqVar.kq;
        this.oq = kqVar.oq;
        this.bob = kqVar.bob;
        this.fou = kqVar.fou;
        this.csi = kqVar.csi;
        this.rhi = kqVar.rhi;
        this.rjo = kqVar.rjo;
        this.syt = kqVar.syt;
        this.dgq = kqVar.dgq;
        this.nn = kqVar.nn;
    }

    public static csi kq(Context context) {
        return new kq().kq();
    }
}
