package com.bytedance.sdk.component.csi.bob.kq.oq;

import com.bytedance.sdk.component.csi.wcx;

/* JADX INFO: loaded from: classes.dex */
public class bob implements wcx {
    private com.bytedance.sdk.component.csi.bob.kq.bob<String, byte[]> bob;
    private int kq;
    private int oq;

    public bob(int i10, int i11) {
        this.oq = i10;
        this.kq = i11;
        this.bob = new com.bytedance.sdk.component.csi.bob.kq.bob<String, byte[]>(i10) { // from class: com.bytedance.sdk.component.csi.bob.kq.oq.bob.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.csi.bob.kq.bob
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public int oq(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public boolean oq(String str) {
        return this.bob.kq(str) != null;
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public boolean kq(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.bob.kq(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public byte[] kq(String str) {
        return this.bob.kq(str);
    }
}
