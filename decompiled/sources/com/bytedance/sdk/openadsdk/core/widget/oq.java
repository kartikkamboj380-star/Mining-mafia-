package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.bytedance.sdk.openadsdk.utils.nb;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class oq extends Dialog {
    private com.bytedance.sdk.openadsdk.core.rhi.syt bob;
    private com.bytedance.sdk.openadsdk.core.rhi.kq csi;
    private String dgq;
    private com.bytedance.sdk.openadsdk.core.rhi.syt fou;
    public InterfaceC0292oq kq;
    private String nn;
    private boolean nze;
    private com.bytedance.sdk.openadsdk.core.rhi.fou oq;
    private com.bytedance.sdk.openadsdk.core.rhi.kq rhi;
    private View rjo;
    private OnBackInvokedCallback suf;
    private final Context syt;
    private String ubx;
    private String vvw;
    private int wki;

    private static class kq implements OnBackInvokedCallback {
        private final WeakReference<oq> kq;

        kq(oq oqVar) {
            this.kq = new WeakReference<>(oqVar);
        }

        public void onBackInvoked() {
            oq oqVar = this.kq.get();
            if (oqVar != null) {
                com.bytedance.sdk.component.utils.fax.kq("CustomCommonDialog", "onBackInvoked");
                oqVar.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.oq$oq, reason: collision with other inner class name */
    public interface InterfaceC0292oq {
        void kq();

        void oq();
    }

    public oq(Context context) {
        super(context, uml.rhi(context, "tt_custom_dialog"));
        this.wki = -1;
        this.nze = false;
        this.syt = context;
    }

    private void bob() {
        if (this.suf == null || !nb.kq()) {
            return;
        }
        com.bytedance.sdk.component.utils.fax.kq("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.suf);
    }

    private void kq() {
        this.rhi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.oq.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0292oq interfaceC0292oq = oq.this.kq;
                if (interfaceC0292oq != null) {
                    interfaceC0292oq.kq();
                }
            }
        });
        this.csi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.oq.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0292oq interfaceC0292oq = oq.this.kq;
                if (interfaceC0292oq != null) {
                    interfaceC0292oq.oq();
                }
            }
        });
    }

    private void oq() {
        if (TextUtils.isEmpty(this.nn)) {
            this.bob.setVisibility(8);
        } else {
            this.bob.setText(this.nn);
            this.bob.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.dgq)) {
            this.fou.setText(this.dgq);
        }
        if (TextUtils.isEmpty(this.ubx)) {
            this.rhi.setText(uml.kq(com.bytedance.sdk.openadsdk.core.sns.kq(), "tt_postive_txt"));
        } else {
            this.rhi.setText(this.ubx);
        }
        if (TextUtils.isEmpty(this.vvw)) {
            this.csi.setText(uml.kq(com.bytedance.sdk.openadsdk.core.sns.kq(), "tt_negtive_txt"));
        } else {
            this.csi.setText(this.vvw);
        }
        int i10 = this.wki;
        if (i10 != -1) {
            this.oq.setImageResource(i10);
            this.oq.setVisibility(0);
        } else {
            this.oq.setVisibility(8);
        }
        if (this.nze) {
            this.rjo.setVisibility(8);
            this.csi.setVisibility(8);
        } else {
            this.csi.setVisibility(0);
            this.rjo.setVisibility(0);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        bob();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.bytedance.sdk.component.utils.fax.kq("CustomCommonDialog", "onBackPressed");
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(kq(this.syt));
        if (nb.kq()) {
            com.bytedance.sdk.component.utils.fax.kq("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.suf = new kq(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.suf);
        }
        setCanceledOnTouchOutside(false);
        oq();
        kq();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        oq();
    }

    private View kq(Context context) {
        com.bytedance.sdk.openadsdk.core.rhi.rjo rjoVar = new com.bytedance.sdk.openadsdk.core.rhi.rjo(context);
        rjoVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVar = new com.bytedance.sdk.openadsdk.core.rhi.csi(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        csiVar.setMinimumWidth(kq(260.0f));
        csiVar.setPadding(0, kq(32.0f), 0, 0);
        csiVar.setBackground(com.bytedance.sdk.openadsdk.utils.ubx.kq(context, "tt_custom_dialog_bg"));
        csiVar.setOrientation(1);
        csiVar.setLayoutParams(layoutParams);
        this.bob = new com.bytedance.sdk.openadsdk.core.rhi.syt(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = kq(16.0f);
        layoutParams2.rightMargin = kq(16.0f);
        layoutParams2.bottomMargin = kq(16.0f);
        this.bob.setGravity(17);
        this.bob.setVisibility(0);
        this.bob.setTextColor(Color.parseColor("#333333"));
        this.bob.setTextSize(18.0f);
        this.bob.setLayoutParams(layoutParams2);
        this.oq = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = kq(16.0f);
        layoutParams3.rightMargin = kq(16.0f);
        layoutParams3.bottomMargin = kq(10.0f);
        this.oq.setMaxHeight(kq(150.0f));
        this.oq.setMaxWidth(kq(150.0f));
        this.oq.setVisibility(0);
        this.oq.setLayoutParams(layoutParams3);
        this.fou = new com.bytedance.sdk.openadsdk.core.rhi.syt(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = kq(20.0f);
        layoutParams4.rightMargin = kq(20.0f);
        this.fou.setGravity(17);
        this.fou.setLineSpacing(kq(3.0f), 1.2f);
        this.fou.setTextSize(18.0f);
        this.fou.setTextColor(Color.parseColor("#000000"));
        this.fou.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = kq(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVar2 = new com.bytedance.sdk.openadsdk.core.rhi.csi(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        csiVar2.setOrientation(0);
        csiVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.rhi.kq kqVar = new com.bytedance.sdk.openadsdk.core.rhi.kq(context);
        this.csi = kqVar;
        kqVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = kq(10.0f);
        layoutParams7.weight = 1.0f;
        this.csi.setPadding(0, kq(16.0f), 0, kq(16.0f));
        this.csi.setBackground(null);
        this.csi.setGravity(17);
        this.csi.setSingleLine(true);
        this.csi.setTextColor(Color.parseColor("#999999"));
        this.csi.setTextSize(16.0f);
        this.csi.setLayoutParams(layoutParams7);
        this.rjo = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.rjo.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.rjo.setLayoutParams(layoutParams8);
        this.rhi = new com.bytedance.sdk.openadsdk.core.rhi.kq(context);
        this.csi.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = kq(10.0f);
        layoutParams9.weight = 1.0f;
        this.rhi.setPadding(0, kq(16.0f), 0, kq(16.0f));
        this.rhi.setBackground(null);
        this.rhi.setGravity(17);
        this.rhi.setSingleLine(true);
        this.rhi.setTextColor(Color.parseColor("#38ADFF"));
        this.rhi.setTextSize(16.0f);
        this.rhi.setLayoutParams(layoutParams9);
        rjoVar.addView(csiVar);
        csiVar.addView(this.bob);
        csiVar.addView(this.oq);
        csiVar.addView(this.fou);
        csiVar.addView(view);
        csiVar.addView(csiVar2);
        csiVar2.addView(this.csi);
        csiVar2.addView(this.rjo);
        csiVar2.addView(this.rhi);
        return rjoVar;
    }

    public oq bob(String str) {
        this.vvw = str;
        return this;
    }

    public oq oq(String str) {
        this.ubx = str;
        return this;
    }

    private int kq(float f10) {
        return bss.oq(getContext(), f10);
    }

    public oq kq(InterfaceC0292oq interfaceC0292oq) {
        this.kq = interfaceC0292oq;
        return this;
    }

    public oq kq(String str) {
        this.dgq = str;
        return this;
    }
}
