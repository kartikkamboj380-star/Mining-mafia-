package com.bytedance.sdk.openadsdk.bob;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class ubx extends View {
    private final int kq;

    public ubx(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(getMeasuredWidth(), this.kq);
    }

    public ubx(Context context, int i10) {
        super(context);
        setBackgroundColor(i10);
        this.kq = bss.oq(getContext(), 0.66f);
    }
}
