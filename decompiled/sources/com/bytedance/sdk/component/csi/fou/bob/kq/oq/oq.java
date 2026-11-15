package com.bytedance.sdk.component.csi.fou.bob.kq.oq;

import com.bytedance.sdk.component.csi.wcx;

/* JADX INFO: loaded from: classes.dex */
public class oq implements wcx {
    private int bob;
    private com.bytedance.sdk.component.csi.fou.bob.kq.bob<String, byte[]> fou;
    private long kq = 1048576;
    private int oq;

    public oq(int i10, int i11) {
        this.bob = i10;
        this.oq = i11;
        this.fou = new com.bytedance.sdk.component.csi.fou.bob.kq.bob<>(i11);
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public boolean oq(String str) {
        try {
            return this.fou.kq(str) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public boolean kq(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.kq) {
                    return false;
                }
                this.fou.kq(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public byte[] kq(String str) {
        try {
            return this.fou.kq(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
