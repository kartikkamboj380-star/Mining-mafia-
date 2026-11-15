package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.dgq.fou.a;
import com.bytedance.adsdk.ugeno.dgq.fou.b;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class rs implements com.bytedance.sdk.component.csi.mxq {
    private final WeakReference<ImageView> kq;

    public rs(ImageView imageView) {
        this.kq = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.csi.mxq
    public void kq(com.bytedance.sdk.component.csi.ubx ubxVar) {
        ImageView imageView = this.kq.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objOq = ubxVar.oq();
            if (objOq instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objOq);
                return;
            }
            if (!(objOq instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.a(objOq)) {
                b.a(objOq).start();
            }
            imageView.setImageDrawable((Drawable) objOq);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.csi.mxq
    public void kq(int i10, String str, Throwable th) {
        ImageView imageView = this.kq.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
