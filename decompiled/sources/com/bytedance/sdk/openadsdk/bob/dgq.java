package com.bytedance.sdk.openadsdk.bob;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.bytedance.sdk.openadsdk.utils.mxq;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends com.bytedance.sdk.openadsdk.core.rhi.bob implements nn.bob, nn.fou, nn.kq, nn.oq {
    private int bob;
    private com.bytedance.sdk.openadsdk.core.rhi.syt csi;
    private View dgq;
    private final nn fou;
    rhi kq;
    private com.bytedance.sdk.openadsdk.core.rhi.fou nn;
    private int oq;
    private TextView rhi;
    private ubx rjo;
    private FilterWord suf;
    private View syt;
    private com.bytedance.sdk.openadsdk.core.rhi.syt ubx;
    private int vvw;
    private int wki;

    public dgq(Context context, nn nnVar) {
        this(context, nnVar, null);
    }

    private void bob() {
        if (this.vvw > 0) {
            return;
        }
        this.vvw = bss.bob(getContext());
        int iCsi = bss.csi(getContext());
        this.wki = iCsi;
        this.fou.kq(this.vvw, iCsi);
    }

    private boolean fou() {
        if (this.vvw == 0) {
            bob();
        }
        return this.vvw < this.wki;
    }

    private com.bytedance.sdk.openadsdk.core.rhi.syt oq(Context context) {
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar = new com.bytedance.sdk.openadsdk.core.rhi.syt(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = fou() ? this.oq : bss.oq(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.bob);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.bob);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i10 = this.bob;
        sytVar.setPadding(0, i10, 0, i10);
        sytVar.setGravity(17);
        sytVar.setBackground(stateListDrawable);
        sytVar.setTextColor(-1);
        sytVar.setTextSize(16.0f);
        sytVar.setText(uml.kq(context, "tt_suggestion_commit"));
        sytVar.setEnabled(false);
        sytVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bob.dgq.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dgq.this.fou.fou();
            }
        });
        sytVar.setLayoutParams(layoutParams);
        return sytVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rhi.bob, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.vvw == 0) {
                bob();
            }
            layoutParams.width = Math.min(this.vvw, this.wki) - (bss.oq(getContext(), 16.0f) * 2);
        }
    }

    public dgq(Context context, nn nnVar, List<FilterWord> list) {
        super(context);
        this.fou = nnVar;
        nnVar.kq((nn.bob) this);
        nnVar.kq((nn.oq) this);
        nnVar.kq((nn.fou) this);
        nnVar.kq((nn.kq) this);
        bob();
        kq(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        oq(list);
    }

    private void kq(Context context) {
        this.bob = bss.oq(context, 8.0f);
        this.oq = bss.oq(context, 20.0f);
        int iOq = bss.oq(context, 56.0f);
        int iOq2 = bss.oq(context, 30.0f);
        int iOq3 = bss.oq(context, 12.0f);
        if (fou()) {
            iOq3 = this.oq;
        }
        if (!fou()) {
            iOq = iOq2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, bss.oq(getContext(), 98.0f));
        view.setBackground(uml.bob(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.bob);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        int iOq4 = bss.oq(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iOq4, iOq4);
        layoutParams3.setMargins(0, iOq3, iOq3, 0);
        layoutParams3.gravity = 8388661;
        fouVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ubx.kq(context, "tt_titlebar_close_seletor"));
        addView(fouVar, layoutParams3);
        fouVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bob.dgq.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                dgq.this.fou.csi();
            }
        });
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar2 = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        this.nn = fouVar2;
        fouVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bob.dgq.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                dgq.this.oq();
            }
        });
        this.nn.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iOq4, iOq4);
        layoutParams4.setMargins(iOq3, iOq3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableKq = com.bytedance.sdk.openadsdk.utils.ubx.kq(context, "tt_leftbackicon_selector");
        drawableKq.setAutoMirrored(true);
        this.nn.setImageDrawable(drawableKq);
        addView(this.nn, layoutParams4);
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVar = new com.bytedance.sdk.openadsdk.core.rhi.csi(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iOq3, iOq, iOq3, iOq3);
        csiVar.setOrientation(1);
        addView(csiVar, layoutParams5);
        View viewBob = bob(context);
        this.syt = viewBob;
        csiVar.addView(viewBob);
        View viewFou = fou(context);
        this.dgq = viewFou;
        csiVar.addView(viewFou);
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVarOq = oq(context);
        this.csi = sytVarOq;
        csiVar.addView(sytVarOq);
    }

    private View fou(Context context) {
        int iOq;
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVar = new com.bytedance.sdk.openadsdk.core.rhi.csi(context);
        csiVar.setOrientation(1);
        if (!fou()) {
            iOq = bss.oq(context, 200.0f);
        } else {
            iOq = bss.oq(context, 358.0f);
        }
        csiVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iOq));
        TextView textView = new TextView(context);
        textView.setText(uml.kq(context, "tt_select_reason"));
        textView.setTextSize(fou() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = bss.oq(context, fou() ? 24.0f : 4.0f);
        csiVar.addView(textView, layoutParams);
        rhi rhiVar = new rhi(context, this.fou);
        this.kq = rhiVar;
        csiVar.addView(rhiVar);
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar = new com.bytedance.sdk.openadsdk.core.rhi.syt(context);
        this.ubx = sytVar;
        sytVar.setId(mxq.ezl);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = fou() ? this.oq : bss.oq(context, 6.0f);
        layoutParams2.gravity = 17;
        this.ubx.setLayoutParams(layoutParams2);
        this.ubx.setFocusable(false);
        this.ubx.setHint(uml.kq(context, "tt_add_bad_reason"));
        this.ubx.setHintTextColor(Color.parseColor("#57000000"));
        this.ubx.setTextColor(Color.rgb(22, 24, 35));
        this.ubx.setTextSize(15.0f);
        this.ubx.setGravity(8388615);
        this.ubx.setVisibility(0);
        this.ubx.setPadding(0, bss.oq(context, 15.0f), 0, bss.oq(context, 14.0f));
        this.ubx.setEllipsize(TextUtils.TruncateAt.END);
        this.ubx.setSingleLine();
        this.ubx.setMaxLines(1);
        this.ubx.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bob.dgq.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dgq.this.fou.rhi();
            }
        });
        csiVar.addView(this.ubx, layoutParams2);
        csiVar.addView(new ubx(context, Color.argb(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 0, 0, 0)));
        csiVar.setVisibility(8);
        return csiVar;
    }

    private View bob(Context context) {
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVar = new com.bytedance.sdk.openadsdk.core.rhi.csi(context);
        csiVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        csiVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(uml.kq(context, "tt_like_this_ad"));
        textView.setTextSize(fou() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        csiVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(uml.kq(context, "tt_feel_hint"));
        textView2.setTextSize(fou() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (fou()) {
            layoutParams2.topMargin = bss.oq(context, 4.0f);
        }
        csiVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVar2 = new com.bytedance.sdk.openadsdk.core.rhi.csi(context);
        csiVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iOq = bss.oq(context, 16.0f);
        int iOq2 = bss.oq(context, 12.0f);
        int iOq3 = bss.oq(context, 8.0f);
        if (fou()) {
            layoutParams3.topMargin = iOq;
            layoutParams3.bottomMargin = iOq;
        } else {
            layoutParams3.topMargin = iOq2;
            layoutParams3.bottomMargin = iOq3;
        }
        csiVar.addView(csiVar2, layoutParams3);
        csiVar2.addView(new csi(context, 1, this.fou));
        csi csiVar3 = new csi(context, 2, this.fou);
        ViewGroup.LayoutParams layoutParams4 = csiVar3.getLayoutParams();
        boolean z9 = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z9) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iOq;
        layoutParams7.rightMargin = iOq;
        csiVar2.addView(csiVar3, layoutParams5);
        csiVar2.addView(new csi(context, 3, this.fou));
        ubx ubxVar = new ubx(context);
        this.rjo = ubxVar;
        csiVar.addView(ubxVar);
        this.rhi = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!fou()) {
            iOq = iOq3;
        }
        layoutParams8.topMargin = iOq;
        this.rhi.setTextColor(-16777216);
        this.rhi.setPadding(iOq2, iOq3, iOq2, iOq3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iOq3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.rhi.setBackground(gradientDrawable);
        this.rhi.setText(uml.kq(context, "tt_report_this_ad"));
        this.rhi.setTextSize(fou() ? 14 : 12);
        Drawable drawableBob = uml.bob(context, "tt_report_ad_arrow");
        drawableBob.setBounds(0, 0, iOq2, iOq2);
        this.rhi.setCompoundDrawables(null, null, drawableBob, null);
        this.rhi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bob.dgq.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dgq.this.kq();
            }
        });
        csiVar.addView(this.rhi, layoutParams8);
        return csiVar;
    }

    private void oq(List<FilterWord> list) {
        this.kq.kq(list);
    }

    public void oq() {
        View view = this.dgq;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.syt;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar = this.nn;
        if (fouVar != null) {
            fouVar.setVisibility(8);
        }
        nn nnVar = this.fou;
        if (nnVar != null) {
            FilterWord filterWord = this.suf;
            if (filterWord != null) {
                nnVar.kq(filterWord);
            } else {
                nnVar.kq(nn.kq);
            }
            this.fou.bob(null);
        }
    }

    public void kq() {
        View view = this.dgq;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.syt;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar = this.nn;
        if (fouVar != null) {
            fouVar.setVisibility(0);
        }
        nn nnVar = this.fou;
        if (nnVar == null || !nnVar.bob()) {
            return;
        }
        this.suf = this.fou.oq();
    }

    @Override // com.bytedance.sdk.openadsdk.bob.nn.bob
    public void kq(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.csi != null && TextUtils.isEmpty(this.fou.rjo())) {
            this.csi.setEnabled(!nn.kq.equals(filterWord));
        }
        if (csi.kq.equals(filterWord) || csi.oq.equals(filterWord)) {
            this.rhi.setVisibility(8);
            this.rjo.setVisibility(8);
        }
        if (csi.bob.equals(filterWord) || nn.kq.equals(filterWord)) {
            this.rhi.setVisibility(0);
            this.rjo.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bob.nn.oq
    public void kq(int i10) {
        if (nn.bob == i10) {
            this.suf = null;
            oq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bob.nn.fou
    public void kq(String str) {
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar;
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar2 = this.ubx;
        if (sytVar2 != null) {
            sytVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            nn nnVar = this.fou;
            if (nnVar == null || (sytVar = this.csi) == null) {
                return;
            }
            sytVar.setEnabled(nnVar.bob());
            return;
        }
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar3 = this.csi;
        if (sytVar3 != null) {
            sytVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bob.nn.kq
    public void kq(List<FilterWord> list) {
        oq(list);
    }
}
