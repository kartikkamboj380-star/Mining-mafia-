package com.bytedance.adsdk.oq.oq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.oq.fou;
import com.bytedance.adsdk.oq.nn;
import com.bytedance.adsdk.oq.rhi.rhi;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private static final Object kq = new Object();
    private final String bob;
    private final Map<String, nn> csi;
    private fou fou;
    private final Context oq;

    public oq(Drawable.Callback callback, String str, fou fouVar, Map<String, nn> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.bob = str;
        } else {
            this.bob = str + '/';
        }
        this.csi = map;
        kq(fouVar);
        if (callback instanceof View) {
            this.oq = ((View) callback).getContext().getApplicationContext();
        } else {
            this.oq = null;
        }
    }

    private Bitmap oq(String str, Bitmap bitmap) {
        synchronized (kq) {
            this.csi.get(str).kq(bitmap);
        }
        return bitmap;
    }

    public void kq(fou fouVar) {
        this.fou = fouVar;
    }

    public Bitmap kq(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapUbx = this.csi.get(str).ubx();
            oq(str, bitmap);
            return bitmapUbx;
        }
        nn nnVar = this.csi.get(str);
        Bitmap bitmapUbx2 = nnVar.ubx();
        nnVar.kq(null);
        return bitmapUbx2;
    }

    public Bitmap kq(String str) {
        nn nnVar = this.csi.get(str);
        if (nnVar == null) {
            return null;
        }
        Bitmap bitmapUbx = nnVar.ubx();
        if (bitmapUbx != null) {
            return bitmapUbx;
        }
        fou fouVar = this.fou;
        if (fouVar != null) {
            return fouVar.kq(nnVar);
        }
        Context context = this.oq;
        if (context == null) {
            return null;
        }
        String strDgq = nnVar.dgq();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strDgq.startsWith("data:") && strDgq.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strDgq.substring(strDgq.indexOf(44) + 1), 0);
                return oq(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.bob)) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.bob + strDgq), null, options);
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    return oq(str, rhi.kq(bitmapDecodeStream, nnVar.kq(), nnVar.oq()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean kq(Context context) {
        return (context == null && this.oq == null) || this.oq.equals(context);
    }
}
