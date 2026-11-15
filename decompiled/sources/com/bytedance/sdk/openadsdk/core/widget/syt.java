package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class syt extends View {
    private static final int[] kq = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final RectF bob;
    private final Paint csi;
    private int dgq;
    private final ArrayList<kq> fou;
    private final RectF oq;
    private final Paint rhi;
    private int rjo;
    private int syt;

    private static final class kq {
        float bob;
        float fou;
        public Paint kq;
        public float oq;

        public kq(Paint paint, float f10, float f11, float f12) {
            this.kq = paint;
            this.oq = f10;
            this.bob = f11;
            this.fou = f12;
        }
    }

    public syt(Context context) {
        super(context);
        this.oq = new RectF();
        this.bob = new RectF();
        this.fou = new ArrayList<>();
        this.rhi = new Paint();
        Paint paint = new Paint();
        this.csi = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void kq() {
        if (this.rjo <= 0) {
            return;
        }
        this.bob.right = Math.max(this.dgq, (int) (((this.syt * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.oq;
        int i10 = this.rjo;
        canvas.drawRoundRect(rectF, i10, i10, this.csi);
        RectF rectF2 = this.bob;
        int i11 = this.rjo;
        canvas.drawRoundRect(rectF2, i11, i11, this.rhi);
        int iSave = canvas.save();
        canvas.translate(this.bob.right - this.dgq, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList<kq> arrayList = this.fou;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            kq kqVar = arrayList.get(i12);
            i12++;
            kq kqVar2 = kqVar;
            canvas.drawCircle(kqVar2.bob, kqVar2.fou, kqVar2.oq, kqVar2.kq);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i11 / 2;
        this.rjo = i14;
        this.dgq = i14 * 5;
        float f10 = i10;
        float f11 = i11;
        this.oq.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f11);
        this.bob.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
        this.rhi.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.fou.clear();
        float f12 = this.rjo / 4.0f;
        for (int i15 : kq) {
            Paint paint = new Paint();
            paint.setColor(i15);
            this.fou.add(new kq(paint, this.rjo / 2.0f, f12, f11 / 2.0f));
            f12 += (this.rjo / 2.0f) * 3.0f;
        }
        kq();
    }

    public void setProgress(int i10) {
        int i11 = this.syt;
        if (i11 == i10) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 100) {
            i10 = 100;
        }
        if (i11 == i10) {
            return;
        }
        this.syt = i10;
        kq();
    }
}
