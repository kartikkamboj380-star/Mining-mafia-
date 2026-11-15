package com.bytedance.sdk.component.rjo;

import com.bytedance.sdk.component.oq.kq.nn;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    final Map<String, String> bob;
    final long csi;
    private final boolean dgq;
    final String fou;
    final int kq;
    final String oq;
    final long rhi;
    nn rjo;
    private File syt = null;
    private byte[] nn = null;

    public oq(boolean z9, int i10, String str, Map<String, String> map, String str2, long j10, long j11) {
        this.dgq = z9;
        this.kq = i10;
        this.oq = str;
        this.bob = map;
        this.fou = str2;
        this.csi = j10;
        this.rhi = j11;
    }

    public Map<String, String> bob() {
        return this.bob;
    }

    public File csi() {
        return this.syt;
    }

    public String fou() {
        return this.fou;
    }

    public int kq() {
        return this.kq;
    }

    public String oq() {
        return this.oq;
    }

    public boolean rhi() {
        return this.dgq;
    }

    public nn rjo() {
        return this.rjo;
    }

    public void kq(File file) {
        this.syt = file;
    }

    public void kq(byte[] bArr) {
        this.nn = bArr;
    }

    public void kq(nn nnVar) {
        this.rjo = nnVar;
    }
}
