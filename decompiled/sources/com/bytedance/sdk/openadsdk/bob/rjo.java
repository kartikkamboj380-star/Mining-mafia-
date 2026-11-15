package com.bytedance.sdk.openadsdk.bob;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends LinearLayout {
    private final nn bob;
    private final FilterWord kq;
    private syt oq;

    public rjo(Context context, FilterWord filterWord, nn nnVar) {
        super(context);
        setOrientation(1);
        this.kq = filterWord;
        this.bob = nnVar;
        kq();
    }

    private void bob() {
        String name = this.kq.getName();
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar = new com.bytedance.sdk.openadsdk.core.rhi.syt(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = bss.oq(getContext(), 12.0f);
        layoutParams.gravity = 17;
        sytVar.setGravity(17);
        sytVar.setText(name);
        sytVar.setTextColor(Color.argb(85, 22, 24, 35));
        sytVar.setTextSize(this.bob.dgq() ? 14 : 10);
        addView(sytVar, layoutParams);
    }

    private void kq() {
        bob();
        oq();
    }

    private void oq() {
        this.oq = new syt(getContext(), this.bob);
        new LinearLayout.LayoutParams(-1, -2);
        this.oq.kq(this.kq.getOptions());
        addView(this.oq);
    }
}
