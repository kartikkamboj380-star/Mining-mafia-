package com.bytedance.sdk.component.csi.oq;

import com.bytedance.sdk.component.csi.rhi;
import com.bytedance.sdk.component.csi.rjo;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bob<T> implements rhi {
    private T bob;
    private rjo csi;
    private String fou;
    Map<String, String> kq;
    private int oq;

    public bob(int i10, T t10, String str) {
        this.oq = i10;
        this.bob = t10;
        this.fou = str;
    }

    @Override // com.bytedance.sdk.component.csi.rhi
    public T bob() {
        return this.bob;
    }

    @Override // com.bytedance.sdk.component.csi.rhi
    public Map<String, String> csi() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.csi.rhi
    public String fou() {
        return this.fou;
    }

    @Override // com.bytedance.sdk.component.csi.rhi
    public rjo kq() {
        return this.csi;
    }

    @Override // com.bytedance.sdk.component.csi.rhi
    public int oq() {
        return this.oq;
    }

    public void kq(rjo rjoVar) {
        this.csi = rjoVar;
    }

    public bob(int i10, T t10, String str, Map<String, String> map) {
        this(i10, t10, str);
        this.kq = map;
    }
}
