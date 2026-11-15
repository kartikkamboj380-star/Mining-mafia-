package com.bytedance.adsdk.ugeno.kq.kq;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class csi extends kq {
    private float bob;
    private Paint csi;
    private boolean dgq;
    private float fou;
    private Path nn;
    private float rhi;
    private String rjo;
    private boolean syt;
    private Path ubx;
    private Path vvw;
    private PorterDuffXfermode wki;

    public csi(com.bytedance.adsdk.ugeno.oq.bob bobVar, JSONObject jSONObject) {
        super(bobVar, jSONObject);
        this.syt = true;
        this.dgq = true;
        Paint paint = new Paint();
        this.csi = paint;
        paint.setAntiAlias(true);
        this.oq.ubx().setLayerType(2, null);
        this.wki = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.nn = new Path();
        this.ubx = new Path();
        this.vvw = new Path();
        this.csi.setXfermode(this.wki);
    }

    private void bob(Canvas canvas) {
        if (this.oq.pfu() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.csi.setXfermode(this.wki);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.bob, this.fou, this.csi);
            return;
        }
        int iPfu = (int) (this.bob * this.oq.pfu());
        int iPfu2 = (int) (this.fou * this.oq.pfu());
        this.csi.setXfermode(this.wki);
        String str = this.rjo;
        str.getClass();
        switch (str) {
            case "bottom":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iPfu2, this.bob, this.fou, this.csi);
                break;
            case "center":
                this.nn.reset();
                this.ubx.reset();
                this.vvw.reset();
                Path.Direction direction = Path.Direction.CW;
                this.nn.addCircle(this.bob / 2.0f, this.fou / 2.0f, iPfu, direction);
                Path path = this.ubx;
                float f10 = this.bob;
                path.addRect(f10 / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, this.fou, direction);
                Path path2 = this.ubx;
                Path path3 = this.nn;
                Path.Op op = Path.Op.DIFFERENCE;
                path2.op(path3, op);
                this.vvw.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.bob / 2.0f, this.fou, direction);
                this.vvw.op(this.nn, op);
                canvas.drawPath(this.ubx, this.csi);
                canvas.drawPath(this.vvw, this.csi);
                break;
            case "top":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.bob, this.fou - iPfu2, this.csi);
                break;
            case "left":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.bob - iPfu, this.fou, this.csi);
                break;
            case "right":
                canvas.drawRect(iPfu, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.bob, this.fou, this.csi);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void kq(Canvas canvas) {
        bob(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void oq() {
        this.rhi = (float) this.kq.optDouble("start", 0.0d);
        this.rjo = this.kq.optString("direction", "center");
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void kq(int i10, int i11) {
        if (i10 > 0 && this.syt) {
            this.bob = i10;
            this.syt = false;
        }
        if (i11 <= 0 || !this.dgq) {
            return;
        }
        this.fou = i11;
        this.dgq = false;
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void oq(Canvas canvas) {
        bob(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public List<PropertyValuesHolder> bob() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(fou(), this.rhi, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
