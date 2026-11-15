package com.bytedance.sdk.component.csi.fou.bob.kq.oq;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.csi.sns;

/* JADX INFO: loaded from: classes.dex */
public class kq implements sns {
    private int bob;
    private com.bytedance.sdk.component.csi.fou.bob.kq.bob<String, Bitmap> fou;
    private long kq = 4194304;
    private int oq;

    public kq(int i10, int i11) {
        this.oq = i11;
        this.bob = i10;
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
    public boolean kq(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iKq = kq(bitmap);
                if (iKq <= this.kq && iKq != 0) {
                    this.fou.kq(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public Bitmap kq(String str) {
        try {
            return this.fou.kq(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int kq(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
