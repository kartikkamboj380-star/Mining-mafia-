package com.bytedance.sdk.openadsdk.core.ubx.oq.oq;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.oq.fou;
import com.bytedance.adsdk.oq.nn;
import com.bytedance.adsdk.ugeno.csi;
import com.bytedance.adsdk.ugeno.oq.bob;
import com.bytedance.adsdk.ugeno.rjo.syt;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class kq extends bob<oq> {
    private float aed;
    protected HashMap<String, Bitmap> et;
    private String iaf;
    protected ImageView.ScaleType jwr;
    private boolean kfr;
    protected String kq;
    private boolean oz;
    protected ImageView.ScaleType rxz;
    private boolean vt;
    private int ymy;
    private float yo;
    private boolean zp;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ubx.oq.oq.kq$1, reason: invalid class name */
    class AnonymousClass1 implements fou {
        AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.oq.fou
        public Bitmap kq(final nn nnVar) {
            final String strKq;
            if (nnVar == null) {
                return null;
            }
            String strNn = nnVar.nn();
            String strDgq = nnVar.dgq();
            if (!TextUtils.isEmpty(strNn) && TextUtils.isEmpty(strDgq)) {
                strKq = com.bytedance.adsdk.ugeno.bob.oq.kq(strNn, ((bob) kq.this).fou);
            } else if (!TextUtils.isEmpty(strDgq) && TextUtils.isEmpty(strNn)) {
                strKq = com.bytedance.adsdk.ugeno.bob.oq.kq(strDgq, ((bob) kq.this).fou);
            } else if (TextUtils.isEmpty(strDgq) || TextUtils.isEmpty(strNn)) {
                strKq = null;
            } else {
                strKq = com.bytedance.adsdk.ugeno.bob.oq.kq(strNn, ((bob) kq.this).fou) + com.bytedance.adsdk.ugeno.bob.oq.kq(strDgq, ((bob) kq.this).fou);
            }
            if (TextUtils.isEmpty(strKq)) {
                return null;
            }
            Bitmap bitmap = kq.this.et.get(strKq);
            if (bitmap != null) {
                return bitmap;
            }
            csi.kq().oq().kq(((bob) kq.this).dgq, strKq, new com.bytedance.adsdk.ugeno.kq.InterfaceC0228kq() { // from class: com.bytedance.sdk.openadsdk.core.ubx.oq.oq.kq.1.1
                @Override // com.bytedance.adsdk.ugeno.kq.InterfaceC0228kq
                public void kq(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, nnVar.kq(), nnVar.oq(), false);
                        kq.this.et.put(strKq, bitmapCreateScaledBitmap);
                        syt.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ubx.oq.oq.kq.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((oq) ((bob) kq.this).csi).kq(nnVar.syt(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return kq.this.et.get(strKq);
        }
    }

    public kq(Context context) {
        super(context);
        this.iaf = "images";
        this.vt = true;
        this.aed = 1.0f;
        this.jwr = ImageView.ScaleType.FIT_CENTER;
        this.rxz = ImageView.ScaleType.FIT_XY;
        this.et = new HashMap<>();
    }

    private ImageView.ScaleType mxq(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private ImageView.ScaleType nze(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private String suf(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("local")) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        return str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "";
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public oq kq() {
        oq oqVar = new oq(this.oq);
        oqVar.kq(this);
        return oqVar;
    }

    public void fou() {
        T t10 = this.csi;
        if (t10 != 0) {
            ((oq) t10).kq();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        super.oq();
        ((oq) this.csi).setProgress(this.yo);
        if (this.aed <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.aed = 1.0f;
        }
        ((oq) this.csi).setSpeed(this.aed);
        if (this.kq.startsWith("local")) {
            ((oq) this.csi).setAnimation(suf(this.kq));
            ((oq) this.csi).setImageAssetsFolder(this.iaf);
        } else {
            ((oq) this.csi).setAnimationFromUrl(this.kq);
        }
        ((oq) this.csi).setImageAssetDelegate(new AnonymousClass1());
        if (zfx()) {
            ((oq) this.csi).setScaleType(this.rxz);
        } else {
            ((oq) this.csi).setScaleType(this.jwr);
        }
        if (zfx()) {
            ((oq) this.csi).setRepeatCount(this.ymy);
        } else {
            ((oq) this.csi).kq(this.zp);
        }
        if (!zfx()) {
            T t10 = this.csi;
            if (t10 != 0) {
                ((oq) t10).kq();
                return;
            }
            return;
        }
        T t11 = this.csi;
        if (t11 == 0 || !this.vt) {
            return;
        }
        ((oq) t11).kq();
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void kq(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.kq(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
                this.rxz = mxq(str2);
                break;
            case "scaleType":
                this.jwr = nze(str2);
                break;
            case "progress":
                this.yo = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "imagePath":
                this.iaf = str2;
                break;
            case "autoReverse":
                this.oz = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, false);
                break;
            case "src":
                this.kq = com.bytedance.sdk.openadsdk.core.ubx.fou.kq(str2);
                break;
            case "loop":
                if (zfx()) {
                    this.ymy = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 0);
                    break;
                } else {
                    this.zp = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, false);
                    break;
                }
                break;
            case "speed":
                this.aed = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 1.0f);
                break;
            case "autoPlay":
                this.kfr = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, false);
                break;
            case "autoplay":
                this.vt = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, true);
                break;
        }
    }

    public void kq(AnimatorListenerAdapter animatorListenerAdapter) {
        ((oq) this.csi).kq(animatorListenerAdapter);
    }
}
