package com.bytedance.sdk.component.adexpress.rhi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class ebt extends LinearLayout {
    private TextView bob;
    private LinearLayout csi;
    private kq fou;
    private TextView kq;
    private com.bytedance.sdk.component.utils.ou oq;
    private com.bytedance.adsdk.oq.rhi rhi;
    private com.bytedance.sdk.component.adexpress.dynamic.fou.nn rjo;

    public interface kq {
    }

    public ebt(@NonNull Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.fou.nn nnVar) {
        super(context);
        this.rjo = nnVar;
        kq(context, view);
    }

    public TextView getTopTextView() {
        return this.kq;
    }

    public LinearLayout getWriggleLayout() {
        return this.csi;
    }

    public View getWriggleProgressIv() {
        return this.rhi;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.oq == null) {
                this.oq = new com.bytedance.sdk.component.utils.ou(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.rhi.ebt.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.fou.nn nnVar = this.rjo;
            if (nnVar != null) {
                nnVar.bob();
                this.rjo.csi();
                this.rjo.rhi();
                this.rjo.syt();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.oq.rhi rhiVar = this.rhi;
            if (rhiVar != null) {
                rhiVar.csi();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
    }

    public void setOnShakeViewListener(kq kqVar) {
        this.fou = kqVar;
    }

    public void setShakeText(String str) {
        this.bob.setText(str);
    }

    private void kq(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.csi = (LinearLayout) findViewById(2097610722);
        this.kq = (TextView) findViewById(2097610719);
        this.bob = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.oq.rhi rhiVar = (com.bytedance.adsdk.oq.rhi) findViewById(2097610706);
        this.rhi = rhiVar;
        rhiVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.rhi.setImageAssetsFolder("images/");
        this.rhi.kq(true);
    }

    public void kq() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.ebt.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ebt.this.rhi.kq();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }
}
