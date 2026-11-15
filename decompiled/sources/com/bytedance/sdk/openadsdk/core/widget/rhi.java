package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends com.bytedance.sdk.openadsdk.core.rhi.fou {
    private float kq;
    private int oq;

    public rhi(Context context) {
        super(context);
        this.kq = 2.25f;
        this.oq = 12;
        kq();
    }

    private void kq() {
        setBackground(fou.kq());
        setImageResource(uml.fou(getContext(), "tt_close_btn"));
        int iOq = bss.oq(getContext(), this.kq);
        setPadding(iOq, iOq, iOq, iOq);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static com.bytedance.sdk.openadsdk.core.rhi.fou oq(Context context) {
        return new rhi(context, 28, 5.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rhi.fou, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iOq = bss.oq(getContext(), this.oq);
            layoutParams.width = iOq;
            layoutParams.height = iOq;
        }
        super.setLayoutParams(layoutParams);
    }

    public rhi(Context context, int i10, float f10) {
        super(context);
        this.kq = f10;
        this.oq = i10;
        kq();
    }

    public static com.bytedance.sdk.openadsdk.core.rhi.fou kq(Context context) {
        return new rhi(context);
    }
}
