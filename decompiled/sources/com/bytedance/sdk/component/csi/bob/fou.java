package com.bytedance.sdk.component.csi.bob;

import com.bytedance.sdk.component.csi.ubx;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fou<T> implements ubx {
    private T bob;
    private int csi;
    private boolean dgq;
    private T fou;
    private String kq;
    private com.bytedance.sdk.component.csi.rjo nn;
    private String oq;
    private int rhi;
    private Map<String, String> rjo;
    private boolean syt;
    private int ubx;

    @Override // com.bytedance.sdk.component.csi.ubx
    public T bob() {
        return this.fou;
    }

    @Override // com.bytedance.sdk.component.csi.ubx
    public boolean csi() {
        return this.syt;
    }

    @Override // com.bytedance.sdk.component.csi.ubx
    public Map<String, String> fou() {
        return this.rjo;
    }

    public fou kq(bob bobVar, T t10) {
        this.bob = t10;
        this.kq = bobVar.nn();
        this.oq = bobVar.kq();
        this.csi = bobVar.oq();
        this.rhi = bobVar.bob();
        this.dgq = bobVar.nze();
        this.nn = bobVar.mxq();
        this.ubx = bobVar.sns();
        return this;
    }

    @Override // com.bytedance.sdk.component.csi.ubx
    public T oq() {
        return this.bob;
    }

    @Override // com.bytedance.sdk.component.csi.ubx
    public boolean rhi() {
        return this.dgq;
    }

    @Override // com.bytedance.sdk.component.csi.ubx
    public int rjo() {
        return this.ubx;
    }

    public fou kq(bob bobVar, T t10, Map<String, String> map, boolean z9) {
        this.rjo = map;
        this.syt = z9;
        return kq(bobVar, t10);
    }

    @Override // com.bytedance.sdk.component.csi.ubx
    public String kq() {
        return this.oq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.csi.ubx
    public void kq(Object obj) {
        this.fou = this.bob;
        this.bob = obj;
    }
}
