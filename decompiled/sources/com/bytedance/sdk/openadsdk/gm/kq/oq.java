package com.bytedance.sdk.openadsdk.gm.kq;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.component.utils.fou;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private byte[] bob;
    private Bitmap csi;
    private Bitmap fou;
    int kq;
    private Drawable oq;

    public oq(Drawable drawable, int i10) {
        this.bob = null;
        this.fou = null;
        this.csi = null;
        this.oq = drawable;
        this.kq = i10;
    }

    public byte[] bob() {
        try {
            if (this.bob == null) {
                this.bob = fou.kq(this.fou);
            }
        } catch (OutOfMemoryError e10) {
            fax.bob("GifRequestResult", e10.getMessage());
        }
        return this.bob;
    }

    public boolean csi() {
        if (this.fou != null || this.oq != null) {
            return true;
        }
        byte[] bArr = this.bob;
        return bArr != null && bArr.length > 0;
    }

    public Drawable fou() {
        return this.oq;
    }

    public Bitmap kq() {
        return this.fou;
    }

    public Bitmap oq() {
        return this.csi;
    }

    public oq(byte[] bArr, int i10) {
        this.oq = null;
        this.fou = null;
        this.csi = null;
        this.bob = bArr;
        this.kq = i10;
    }

    public oq(Bitmap bitmap, Bitmap bitmap2, int i10) {
        this.oq = null;
        this.bob = null;
        this.csi = bitmap2;
        this.fou = bitmap;
        this.kq = i10;
    }
}
