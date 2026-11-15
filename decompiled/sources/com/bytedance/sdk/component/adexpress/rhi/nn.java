package com.bytedance.sdk.component.adexpress.rhi;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class nn extends com.bytedance.adsdk.oq.rhi {
    private Map<String, Bitmap> kq;
    private String oq;

    private static class kq implements com.bytedance.sdk.component.csi.mxq {
        private final String bob;
        private final Map<String, Bitmap> fou;
        private final WeakReference<nn> kq;
        private final com.bytedance.adsdk.oq.nn oq;

        public kq(nn nnVar, com.bytedance.adsdk.oq.nn nnVar2, String str, Map<String, Bitmap> map) {
            this.kq = new WeakReference<>(nnVar);
            this.oq = nnVar2;
            this.bob = str;
            this.fou = map;
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(int i10, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(com.bytedance.sdk.component.csi.ubx ubxVar) {
            Object objOq = ubxVar.oq();
            if (objOq instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objOq, this.oq.kq(), this.oq.oq(), false);
                this.fou.put(this.bob, bitmapCreateScaledBitmap);
                nn nnVar = this.kq.get();
                if (nnVar != null) {
                    nnVar.kq(this.oq.syt(), bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public nn(Context context) {
        super(context);
        this.kq = new HashMap();
    }

    public void setAnimationsLoop(boolean z9) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setImageLottieTosPath(String str) {
        this.oq = str;
    }

    public void setLottieAdDescMaxLength(int i10) {
    }

    public void setLottieAdTitleMaxLength(int i10) {
    }

    public void setLottieAppNameMaxLength(int i10) {
    }

    public void syt() {
        if (TextUtils.isEmpty(this.oq)) {
            return;
        }
        setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        kq(true);
        setAnimationFromUrl(this.oq);
        setImageAssetDelegate(new com.bytedance.adsdk.oq.fou() { // from class: com.bytedance.sdk.component.adexpress.rhi.nn.1
            @Override // com.bytedance.adsdk.oq.fou
            public Bitmap kq(final com.bytedance.adsdk.oq.nn nnVar) {
                final String strSyt = nnVar.syt();
                String strNn = nnVar.nn();
                String strDgq = nnVar.dgq();
                if (TextUtils.equals(strSyt, "image_0") && TextUtils.equals(strDgq, "Lark20201123-180048_2.png")) {
                    strDgq = "hand.png";
                }
                Bitmap bitmap = (Bitmap) nn.this.kq.get(strSyt);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strNn) || !TextUtils.isEmpty(strDgq)) {
                    if (!TextUtils.isEmpty(strDgq) && TextUtils.isEmpty(strNn)) {
                        strNn = strDgq;
                    } else if (TextUtils.isEmpty(strDgq) || TextUtils.isEmpty(strNn)) {
                        strNn = "";
                    } else {
                        strNn = strNn + strDgq;
                    }
                }
                if (TextUtils.isEmpty(strNn)) {
                    return null;
                }
                com.bytedance.sdk.component.csi.nn nnVarKq = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().csi().kq(strNn).bob(2).kq(new com.bytedance.sdk.component.csi.syt() { // from class: com.bytedance.sdk.component.adexpress.rhi.nn.1.1
                    @Override // com.bytedance.sdk.component.csi.syt
                    public Bitmap kq(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, nnVar.kq(), nnVar.oq(), false);
                        nn.this.kq.put(strSyt, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                nn nnVar2 = nn.this;
                nnVarKq.kq(new kq(nnVar2, nnVar, strSyt, nnVar2.kq));
                return (Bitmap) nn.this.kq.get(strSyt);
            }
        });
        kq();
    }
}
