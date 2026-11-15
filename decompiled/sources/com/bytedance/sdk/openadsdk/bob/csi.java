package com.bytedance.sdk.openadsdk.bob;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class csi extends com.bytedance.sdk.openadsdk.core.rhi.csi implements View.OnClickListener, nn.bob {
    private FilterWord csi;
    private final nn fou;
    private StateListDrawable rhi;
    private final int rjo;
    public static FilterWord kq = new FilterWord("100:1", "GOOD");
    public static FilterWord oq = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord bob = new FilterWord("100:3", "BAD");

    public csi(@NonNull Context context, int i10, nn nnVar) {
        super(context);
        this.rjo = i10;
        this.fou = nnVar;
        if (nnVar != null) {
            nnVar.kq(this);
        }
        kq(i10);
        kq();
        oq();
    }

    private void kq(int i10) {
        if (i10 == 1) {
            this.csi = kq;
        } else if (i10 == 2) {
            this.csi = oq;
        } else {
            if (i10 != 3) {
                return;
            }
            this.csi = bob;
        }
    }

    private void oq() {
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar = new com.bytedance.sdk.openadsdk.core.rhi.syt(getContext());
        sytVar.setTextSize(this.fou.dgq() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, bss.oq(getContext(), 12.0f), 0, bss.oq(getContext(), this.fou.dgq() ? 8.0f : 4.0f));
        addView(sytVar, layoutParams);
        kq kqVar = new kq(getContext());
        kqVar.setTextSize(this.fou.dgq() ? 17 : 12);
        kqVar.setTextColor(-16777216);
        kqVar.setMaxLines(1);
        kqVar.setSingleLine();
        kqVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, bss.oq(getContext(), 12.0f));
        addView(kqVar, layoutParams2);
        int i10 = this.rjo;
        if (i10 == 1) {
            sytVar.setText("😍");
            kqVar.setText(uml.kq(getContext(), "tt_good"));
        } else if (i10 == 2) {
            kqVar.setText(uml.kq(getContext(), "tt_not_bad"));
            sytVar.setText("😐");
        } else {
            if (i10 != 3) {
                return;
            }
            kqVar.setText(uml.kq(getContext(), "tt_bad"));
            sytVar.setText("😡");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.fou.kq(nn.kq);
        } else {
            this.fou.kq(this.csi);
        }
    }

    private void kq() {
        if (this.rhi == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(bss.oq(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(bss.oq(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(bss.oq(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.rhi = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.rhi.addState(new int[0], gradientDrawable);
        }
        setBackground(this.rhi);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.bob.nn.bob
    public void kq(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.csi) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
