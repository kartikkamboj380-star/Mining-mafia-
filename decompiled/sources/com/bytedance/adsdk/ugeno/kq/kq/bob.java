package com.bytedance.adsdk.ugeno.kq.kq;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob extends kq {
    private String bob;
    private float csi;
    private PorterDuffXfermode dgq;
    private float fou;
    private LinearGradient nn;
    private View rhi;
    private Paint rjo;
    private Paint syt;
    private Matrix ubx;

    public bob(com.bytedance.adsdk.ugeno.oq.bob bobVar, JSONObject jSONObject) {
        super(bobVar, jSONObject);
        this.rhi = this.oq.ubx();
        Paint paint = new Paint();
        this.rjo = paint;
        paint.setAntiAlias(true);
        this.rhi.setLayerType(2, null);
        this.dgq = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.syt = new Paint();
        this.ubx = new Matrix();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void bob(Canvas canvas) {
        byte b10;
        try {
            if (this.oq.oxe() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.rjo.setXfermode(this.dgq);
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fou, this.csi, this.rjo);
                return;
            }
            int iOxe = (int) (this.fou * this.oq.oxe());
            int iOxe2 = (int) (this.csi * this.oq.oxe());
            this.rjo.setXfermode(this.dgq);
            String str = this.bob;
            switch (str.hashCode()) {
                case -1383228885:
                    if (!str.equals("bottom")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 115029:
                    if (!str.equals("top")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 3317767:
                    if (!str.equals("left")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 108511772:
                    if (!str.equals("right")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                float f10 = iOxe;
                canvas.drawRect(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fou, this.csi, this.rjo);
                this.ubx.setTranslate(f10, this.csi);
                this.nn.setLocalMatrix(this.ubx);
                this.syt.setShader(this.nn);
                if (this.oq.oxe() <= 1.0f && this.oq.oxe() > 0.9f) {
                    this.syt.setAlpha((int) (255.0f - (this.oq.oxe() * 255.0f)));
                }
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, this.csi, this.syt);
                return;
            }
            if (b10 == 1) {
                float f11 = iOxe;
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fou - f11, this.csi, this.rjo);
                this.ubx.setTranslate(this.fou - f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.nn.setLocalMatrix(this.ubx);
                this.syt.setShader(this.nn);
                if (this.oq.oxe() <= 1.0f && this.oq.oxe() > 0.9f) {
                    this.syt.setAlpha((int) (255.0f - (this.oq.oxe() * 255.0f)));
                }
                float f12 = this.fou;
                canvas.drawRect(f12, this.csi, f12 - f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.syt);
                return;
            }
            if (b10 == 2) {
                float f13 = iOxe2;
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13, this.fou, this.csi, this.rjo);
                this.ubx.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13);
                this.nn.setLocalMatrix(this.ubx);
                this.syt.setShader(this.nn);
                if (this.oq.oxe() <= 1.0f && this.oq.oxe() > 0.9f) {
                    this.syt.setAlpha((int) (255.0f - (this.oq.oxe() * 255.0f)));
                }
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fou, f13, this.syt);
                return;
            }
            if (b10 != 3) {
                return;
            }
            float f14 = iOxe2;
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fou, this.csi - f14, this.rjo);
            this.ubx.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.csi - f14);
            this.nn.setLocalMatrix(this.ubx);
            this.syt.setShader(this.nn);
            if (this.oq.oxe() <= 1.0f && this.oq.oxe() > 0.9f) {
                this.syt.setAlpha((int) (255.0f - (this.oq.oxe() * 255.0f)));
            }
            float f15 = this.fou;
            float f16 = this.csi;
            canvas.drawRect(f15, f16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f16 - f14, this.syt);
        } catch (Throwable th) {
            Log.e("BaseEffectWrapper", th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void kq(Canvas canvas) {
        bob(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void oq() {
        this.bob = this.kq.optString("direction", "left");
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void kq(int i10, int i11) {
        this.fou = i10;
        this.csi = i11;
        String str = this.bob;
        str.getClass();
        switch (str) {
            case "bottom":
                this.nn = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -this.csi, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.nn = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.csi, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.nn = new LinearGradient(this.fou, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.nn = new LinearGradient(-this.fou, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.csi, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void oq(Canvas canvas) {
        bob(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public List<PropertyValuesHolder> bob() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.kq.csi.ALPHA.oq(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        return arrayList;
    }
}
