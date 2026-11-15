package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.rhi.ebt;
import com.bytedance.sdk.component.utils.uml;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class gm implements rjo<ebt> {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi bob;
    private String csi;
    private com.bytedance.sdk.component.adexpress.dynamic.fou.rjo fou;
    private ebt kq;
    private Context oq;
    private com.bytedance.sdk.component.adexpress.dynamic.fou.nn rhi;

    public gm(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar, String str, com.bytedance.sdk.component.adexpress.dynamic.fou.nn nnVar) {
        this.oq = context;
        this.bob = csiVar;
        this.fou = rjoVar;
        this.csi = str;
        this.rhi = nnVar;
        csi();
    }

    private void csi() {
        int iRz = this.fou.rz();
        final com.bytedance.sdk.component.adexpress.dynamic.rhi.kq dynamicClickListener = this.bob.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.csi)) {
            Context context = this.oq;
            ebt ebtVar = new ebt(context, com.bytedance.sdk.component.adexpress.bob.kq.dgq(context), this.rhi);
            this.kq = ebtVar;
            if (ebtVar.getWriggleLayout() != null) {
                this.kq.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.kq.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.fou.wj())) {
                    this.kq.getTopTextView().setText(uml.oq(this.oq, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.kq.getTopTextView().setText(this.fou.wj());
                }
            }
        } else {
            Context context2 = this.oq;
            this.kq = new ebt(context2, com.bytedance.sdk.component.adexpress.bob.kq.dgq(context2), this.rhi);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.kq.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.oq, iRz)));
        this.kq.setLayoutParams(layoutParams);
        this.kq.setShakeText(this.fou.jq());
        this.kq.setClipChildren(false);
        final View wriggleProgressIv = this.kq.getWriggleProgressIv();
        this.kq.setOnShakeViewListener(new ebt.kq() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bob.gm.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    /* JADX INFO: renamed from: fou, reason: merged with bridge method [inline-methods] */
    public ebt bob() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void kq() {
        this.kq.kq();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void oq() {
        this.kq.clearAnimation();
    }
}
