package com.bytedance.adsdk.ugeno.kq.kq;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.rjo.syt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fou extends kq {
    private static final float mxq;
    private static final float nze;
    private static final float sns;
    private static final float suf;
    private int bob;
    private Path csi;
    private float dgq;
    private Paint fou;
    private int nn;
    private com.bytedance.adsdk.ugeno.rjo.kq.C0232kq rhi;
    private int rjo;
    private int syt;
    private int ubx;
    private boolean vvw;
    private float wcx;
    private Path wki;

    static {
        float radians = (float) Math.toRadians(30.0d);
        suf = radians;
        nze = (float) Math.tan(radians);
        mxq = (float) Math.cos(radians);
        sns = (float) Math.sin(radians);
    }

    public fou(com.bytedance.adsdk.ugeno.oq.bob bobVar, JSONObject jSONObject) {
        super(bobVar, jSONObject);
        this.vvw = true;
        Paint paint = new Paint();
        this.fou = paint;
        paint.setAntiAlias(true);
        this.csi = new Path();
        this.dgq = this.oq.uml();
        this.wki = new Path();
    }

    private void bob(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.oq.rz() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i10 = this.nn;
                float f10 = nze;
                float fRz = (i10 + (i10 * f10)) * this.oq.rz();
                this.wki.reset();
                this.wki.moveTo(fRz, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int i11 = this.ubx;
                float f11 = fRz - (i11 * f10);
                this.wki.lineTo(f11, i11);
                this.wki.lineTo(f11 + this.bob, this.ubx);
                this.wki.lineTo(this.bob + fRz, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.wki.close();
                float f12 = this.wcx;
                float f13 = mxq * f12;
                float f14 = f12 * sns;
                if (!this.vvw || this.rhi == null) {
                    int i12 = this.syt;
                    linearGradient = new LinearGradient(fRz, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fRz + f13, f14, new int[]{i12, this.rjo, i12}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fRz, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fRz + f13, f14, this.rhi.oq, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.fou.setShader(linearGradient);
                Path path = this.csi;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.wki, this.fou);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    @SuppressLint({"DrawAllocation"})
    public void kq(Canvas canvas) {
        bob(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void oq() {
        this.bob = (int) syt.kq(this.oq.ubx().getContext(), this.kq.optInt("shineWidth", 30));
        String strOptString = this.kq.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.rhi = com.bytedance.adsdk.ugeno.rjo.kq.oq(str);
        } else {
            int iKq = com.bytedance.adsdk.ugeno.rjo.kq.kq(str);
            this.rjo = iKq;
            this.syt = com.bytedance.adsdk.ugeno.rjo.kq.kq(iKq, 32);
            this.vvw = false;
        }
        this.wcx = mxq * this.bob;
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void kq(int i10, int i11) {
        this.nn = i10;
        this.ubx = i11;
        try {
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10, i11);
            Path path = this.csi;
            float f10 = this.dgq;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void oq(Canvas canvas) {
        bob(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public List<PropertyValuesHolder> bob() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(fou(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
