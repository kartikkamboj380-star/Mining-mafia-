package com.bytedance.sdk.component.adexpress.rhi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vvw extends View {
    private int bob;
    private int csi;
    private int[] dgq;
    private int fou;
    Rect kq;
    private Bitmap nn;
    private final List<kq> nze;
    Rect oq;
    private int rhi;
    private int rjo;
    private LinearGradient suf;
    private int syt;
    private Paint ubx;
    private Xfermode vvw;
    private PorterDuff.Mode wki;

    public static class kq {
        private final int kq;
        private int oq = 0;

        public kq(int i10) {
            this.kq = i10;
        }

        public void kq() {
            this.oq += this.kq;
        }
    }

    public vvw(Context context) {
        super(context);
        this.wki = PorterDuff.Mode.DST_IN;
        this.nze = new ArrayList();
        kq();
    }

    private void kq() {
        this.bob = com.bytedance.sdk.component.utils.uml.fou(getContext(), "tt_splash_unlock_image_arrow");
        this.fou = Color.parseColor("#00ffffff");
        this.csi = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.rhi = color;
        this.rjo = 10;
        this.syt = 40;
        this.dgq = new int[]{this.fou, this.csi, color};
        setLayerType(1, null);
        this.ubx = new Paint(1);
        this.nn = BitmapFactory.decodeResource(getResources(), this.bob);
        this.vvw = new PorterDuffXfermode(this.wki);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.nn, this.kq, this.oq, this.ubx);
        canvas.save();
        Iterator<kq> it = this.nze.iterator();
        while (it.hasNext()) {
            kq next = it.next();
            this.suf = new LinearGradient(next.oq, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, next.oq + this.syt, this.rjo, this.dgq, (float[]) null, Shader.TileMode.CLAMP);
            this.ubx.setColor(-1);
            this.ubx.setShader(this.suf);
            Canvas canvas2 = canvas;
            canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), this.ubx);
            this.ubx.setShader(null);
            next.kq();
            if (next.oq > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.ubx.setXfermode(this.vvw);
        canvas3.drawBitmap(this.nn, this.kq, this.oq, this.ubx);
        this.ubx.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.nn == null) {
            return;
        }
        this.kq = new Rect(0, 0, this.nn.getWidth(), this.nn.getHeight());
        this.oq = new Rect(0, 0, getWidth(), getHeight());
    }

    public void kq(int i10) {
        this.nze.add(new kq(i10));
        postInvalidate();
    }
}
