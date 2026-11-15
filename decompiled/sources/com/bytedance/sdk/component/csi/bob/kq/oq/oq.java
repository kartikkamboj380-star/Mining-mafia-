package com.bytedance.sdk.component.csi.bob.kq.oq;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.csi.sns;

/* JADX INFO: loaded from: classes.dex */
public class oq implements sns {
    private com.bytedance.sdk.component.csi.bob.kq.bob<String, Bitmap> bob;
    private int kq;
    private int oq;

    public oq(int i10, int i11) {
        this.oq = i10;
        this.kq = i11;
        this.bob = new com.bytedance.sdk.component.csi.bob.kq.bob<String, Bitmap>(i10) { // from class: com.bytedance.sdk.component.csi.bob.kq.oq.oq.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.csi.bob.kq.bob
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public int oq(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return oq.kq(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public boolean oq(String str) {
        return this.bob.kq(str) != null;
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public boolean kq(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.bob.kq(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public Bitmap kq(String str) {
        return this.bob.kq(str);
    }

    public static int kq(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
