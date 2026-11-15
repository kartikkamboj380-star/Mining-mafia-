package com.bytedance.sdk.component.dgq;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class bob implements View.OnTouchListener {
    private ViewConfiguration kq;
    private int oq = -1;

    abstract void kq(View.OnTouchListener onTouchListener);

    boolean kq(float f10, float f11, float f12, float f13, Context context) {
        if (this.kq == null) {
            this.kq = ViewConfiguration.get(context);
        }
        if (this.oq == -1) {
            this.oq = this.kq.getScaledTouchSlop();
        }
        return Math.abs(f10 - f12) <= ((float) this.oq) && Math.abs(f11 - f13) <= ((float) this.oq);
    }
}
