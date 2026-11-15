package com.bytedance.sdk.component.csi.bob.kq.oq;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.csi.sns;

/* JADX INFO: loaded from: classes.dex */
public class fou implements sns {
    private final sns kq;
    private final com.bytedance.sdk.component.csi.bob.kq.oq oq;

    public fou(sns snsVar) {
        this(snsVar, null);
    }

    public fou(sns snsVar, com.bytedance.sdk.component.csi.bob.kq.oq oqVar) {
        this.kq = snsVar;
        this.oq = oqVar;
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public boolean oq(String str) {
        return this.kq.oq(str);
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public boolean kq(String str, Bitmap bitmap) {
        return this.kq.kq(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public Bitmap kq(String str) {
        return this.kq.kq(str);
    }
}
