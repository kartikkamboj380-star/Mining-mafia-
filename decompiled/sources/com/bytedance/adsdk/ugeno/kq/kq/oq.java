package com.bytedance.adsdk.ugeno.kq.kq;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq extends kq {
    private int bob;
    private int csi;
    private int fou;
    private Paint rhi;

    public oq(com.bytedance.adsdk.ugeno.oq.bob bobVar, JSONObject jSONObject) {
        super(bobVar, jSONObject);
        Paint paint = new Paint();
        this.rhi = paint;
        paint.setAntiAlias(true);
    }

    private void bob(Canvas canvas) {
        try {
            if (this.oq.ls() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.rhi.setColor(this.bob);
                this.rhi.setAlpha((int) ((1.0f - this.oq.ls()) * 255.0f));
                ((ViewGroup) this.oq.ubx().getParent()).setClipChildren(true);
                int i10 = this.fou;
                int i11 = this.csi;
                canvas.drawCircle(i10, i11, Math.min(i10, i11) * 2 * this.oq.ls(), this.rhi);
            }
        } catch (Throwable th) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void kq(Canvas canvas) {
        bob(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void oq() {
        this.bob = com.bytedance.adsdk.ugeno.rjo.kq.kq(this.kq.optString("backgroundColor"), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.kq.kq.kq
    public void kq(int i10, int i11) {
        this.fou = i10 / 2;
        this.csi = i11 / 2;
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
