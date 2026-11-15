package com.bytedance.sdk.component.oq.kq.oq;

/* JADX INFO: loaded from: classes.dex */
final class csi {
    int bob;
    boolean csi;
    boolean fou;
    final byte[] kq;
    int oq;
    csi rhi;
    csi rjo;

    csi() {
        this.kq = new byte[8192];
        this.csi = true;
        this.fou = false;
    }

    final csi kq() {
        this.fou = true;
        return new csi(this.kq, this.oq, this.bob, true, false);
    }

    public final csi oq() {
        csi csiVar = this.rhi;
        csi csiVar2 = csiVar != this ? csiVar : null;
        csi csiVar3 = this.rjo;
        if (csiVar3 != null) {
            csiVar3.rhi = csiVar;
        }
        csi csiVar4 = this.rhi;
        if (csiVar4 != null) {
            csiVar4.rjo = csiVar3;
        }
        this.rhi = null;
        this.rjo = null;
        return csiVar2;
    }

    public final csi kq(csi csiVar) {
        csiVar.rjo = this;
        csiVar.rhi = this.rhi;
        this.rhi.rjo = csiVar;
        this.rhi = csiVar;
        return csiVar;
    }

    csi(byte[] bArr, int i10, int i11, boolean z9, boolean z10) {
        this.kq = bArr;
        this.oq = i10;
        this.bob = i11;
        this.fou = z9;
        this.csi = z10;
    }
}
