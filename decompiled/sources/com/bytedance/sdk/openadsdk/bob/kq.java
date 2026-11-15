package com.bytedance.sdk.openadsdk.bob;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class kq extends com.bytedance.sdk.openadsdk.core.rhi.syt {
    private boolean bob;
    private int fou;
    private Paint kq;
    private float oq;

    public kq(Context context) {
        super(context);
        kq();
    }

    private void kq() {
        this.oq = bss.kq(getContext(), 8.0f);
        this.kq = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        kq(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.rhi.syt, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.fou = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.fou);
        } else {
            layoutParams.height = this.fou;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rhi.syt, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i10 = this.fou;
        if (i10 == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i10;
    }

    public void setMinTextSize(float f10) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.oq = f10;
    }

    private void kq(String str, int i10) {
        if (!this.bob && i10 > 0) {
            float textSize = getTextSize();
            this.kq.set(getPaint());
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            float fKq = kq(textSize, str);
            while (fKq > paddingLeft) {
                textSize -= 1.0f;
                this.kq.setTextSize(textSize);
                if (textSize <= this.oq) {
                    break;
                } else {
                    fKq = kq(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.bob = true;
        }
    }

    private float kq(float f10, String str) {
        this.kq.setTextSize(f10);
        return this.kq.measureText(str);
    }
}
