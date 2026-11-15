package com.bytedance.sdk.component.adexpress.dynamic.bob.kq;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public class rjo implements View.OnTouchListener {
    private static int bob = 10;
    private int csi;
    private com.bytedance.sdk.component.adexpress.dynamic.bob.syt fou;
    private float kq;
    private float oq;
    private RectF rhi = new RectF();
    private long rjo = 0;
    private final int syt = TTAdConstant.MATE_VALID;
    private final int dgq = 3;
    private SoftReference<View> nn = new SoftReference<>(null);

    public rjo(com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar, int i10, final ViewGroup viewGroup) {
        this.csi = bob;
        this.fou = sytVar;
        if (i10 > 0) {
            this.csi = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bob.kq.rjo.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    rjo.this.nn = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar;
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.rhi = kq(this.nn.get());
            this.kq = motionEvent.getRawX();
            this.oq = motionEvent.getRawY();
            this.rjo = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.rhi;
            if (rectF != null && !rectF.contains(this.kq, this.oq)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.kq);
            float fAbs2 = Math.abs(rawY - this.oq);
            int iOq = com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq(), Math.abs(rawX - this.kq));
            int i10 = bob;
            if (fAbs < i10 || fAbs2 < i10) {
                if ((System.currentTimeMillis() - this.rjo < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (sytVar = this.fou) != null) {
                    sytVar.kq();
                }
            } else if (rawX > this.kq && iOq > this.csi && (sytVar2 = this.fou) != null) {
                sytVar2.kq();
            }
        }
        return true;
    }

    private RectF kq(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], i10 + view.getWidth(), iArr[1] + view.getHeight());
    }
}
