package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.rhi.ebt;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends FrameLayout implements syt {
    private com.bytedance.sdk.component.adexpress.dynamic.fou.rjo bob;
    private rjo csi;
    private int dgq;
    private View fou;
    private Context kq;
    private boolean nn;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi oq;
    private String rhi;
    private com.bytedance.sdk.component.adexpress.rhi.wcx rjo;
    private View.OnTouchListener syt;
    private com.bytedance.sdk.component.adexpress.dynamic.fou.nn ubx;
    private com.bytedance.sdk.component.adexpress.oq.wki vvw;

    public dgq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        super(context);
        this.kq = context;
        this.oq = csiVar;
        this.bob = rjoVar;
        rjo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dgq() {
        if (this.syt != null) {
            setOnClickListener((View.OnClickListener) this.oq.getDynamicClickListener());
            performClick();
            if (this.bob.rao()) {
                return;
            }
            setVisibility(8);
        }
    }

    private void rjo() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.rhi = this.bob.tvh();
        this.dgq = this.bob.ls();
        this.nn = this.bob.ea();
        rjo rjoVarKq = nn.kq(this.kq, this.oq, this.bob, this.ubx, this.vvw);
        this.csi = rjoVarKq;
        if (rjoVarKq != null) {
            this.fou = rjoVarKq.bob();
            if (this.bob.wbn()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.rhi, "6")) {
                if (!this.bob.qip() || TextUtils.isEmpty(this.bob.ysx())) {
                    this.rjo = new com.bytedance.sdk.component.adexpress.rhi.wcx(this.kq, Color.parseColor("#99000000"));
                } else {
                    this.rjo = new com.bytedance.sdk.component.adexpress.rhi.wcx(this.kq, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo.kq(this.bob.ysx()));
                }
                FrameLayout frameLayout = new FrameLayout(this.kq);
                frameLayout.addView(this.rjo, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bob.dgq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dgq.this.rjo.oq();
                    }
                });
            }
            if (kq(this.rhi) && com.bytedance.sdk.component.adexpress.fou.oq()) {
                int color = Color.parseColor("#99000000");
                if (this.bob.qip() && !TextUtils.isEmpty(this.bob.ysx())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.fou.rjo.kq(this.bob.ysx());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.kq);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.csi.bob());
            kq(this.csi.bob());
            setVisibility(0);
        }
    }

    private boolean syt() {
        return (this.bob.ea() || TextUtils.equals("9", this.rhi) || TextUtils.equals("16", this.rhi) || TextUtils.equals("17", this.rhi) || TextUtils.equals("18", this.rhi) || TextUtils.equals("20", this.rhi) || TextUtils.equals("29", this.rhi) || TextUtils.equals("10", this.rhi)) ? false : true;
    }

    public void bob() {
        rjo rjoVar = this.csi;
        if (rjoVar != null) {
            rjoVar.kq();
        }
    }

    public void csi() {
        if (this.fou != null && TextUtils.equals(this.rhi, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
            View view = this.fou;
            if (view instanceof com.bytedance.sdk.component.adexpress.rhi.bob) {
                ((com.bytedance.sdk.component.adexpress.rhi.bob) view).bob();
            }
        }
    }

    public void fou() {
        rjo rjoVar = this.csi;
        if (rjoVar != null) {
            rjoVar.oq();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            rjo rjoVar = this.csi;
            if (rjoVar != null) {
                rjoVar.oq();
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.syt instanceof com.bytedance.sdk.component.adexpress.dynamic.bob.kq.bob) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void rhi() {
        if (this.fou != null && TextUtils.equals(this.rhi, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
            View view = this.fou;
            if (view instanceof com.bytedance.sdk.component.adexpress.rhi.bob) {
                ((com.bytedance.sdk.component.adexpress.rhi.bob) view).fou();
            }
        }
    }

    private boolean kq(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.syt
    public void oq() {
        if (syt()) {
            setOnClickListener((View.OnClickListener) this.oq.getDynamicClickListener());
            performClick();
            if (this.bob.rao()) {
                return;
            }
            setVisibility(8);
        }
    }

    public dgq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar, com.bytedance.sdk.component.adexpress.dynamic.fou.nn nnVar, com.bytedance.sdk.component.adexpress.oq.wki wkiVar) {
        super(context);
        this.kq = context;
        this.oq = csiVar;
        this.bob = rjoVar;
        this.ubx = nnVar;
        this.vvw = wkiVar;
        rjo();
    }

    private void kq(ViewGroup viewGroup) {
        if (this.fou == null) {
            return;
        }
        String str = this.rhi;
        str.getClass();
        switch (str) {
            case "0":
                this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.csi(this, this.dgq);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case "1":
            case "6":
                if (!this.bob.qip() || TextUtils.isEmpty(this.bob.ysx())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.rhi(this);
                break;
            case "2":
            case "7":
                setBackgroundColor(Color.parseColor("#80000000"));
                this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.oq(this, this);
                break;
            case "5":
                if (this.bob.qip() && !TextUtils.isEmpty(this.bob.ysx())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.fou.rjo.kq(this.bob.ysx()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.bob(this);
                this.fou.setTag(2);
                break;
            case "8":
            case "11":
                this.oq.setClipChildren(false);
                this.oq.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.oq.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.rhi(this);
                break;
            case "9":
            case "17":
                this.fou.setTag(2);
                break;
            case "10":
                this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.fou(this, this.dgq, this.nn);
                break;
            case "12":
                this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.bob(this);
                this.fou.setTag(2);
                break;
            case "13":
            case "24":
                if (this.rhi.equals("24") && com.bytedance.sdk.component.adexpress.fou.oq()) {
                    this.oq.setClipChildren(false);
                    this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.rhi(this);
                    break;
                } else {
                    this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.csi(this, this.dgq);
                    break;
                }
                break;
            case "14":
                this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.oq(this, this);
                break;
            case "16":
                View view = this.fou;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.rhi.gm) && ((com.bytedance.sdk.component.adexpress.rhi.gm) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.rhi.gm) this.fou).getShakeLayout().setTag(2);
                }
                this.fou.setTag(2);
                break;
            case "18":
                View view2 = this.fou;
                if (view2 != null && (view2 instanceof ebt) && ((ebt) view2).getWriggleLayout() != null) {
                    ((ebt) this.fou).getWriggleLayout().setTag(2);
                }
                this.fou.setTag(2);
                break;
            case "20":
                this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.kq(this, this.dgq, viewGroup);
                break;
            case "22":
                if (com.bytedance.sdk.component.adexpress.fou.oq()) {
                    this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.syt(this, this.nn);
                    break;
                } else {
                    this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.rjo(this, this.dgq, viewGroup);
                    break;
                }
                break;
            case "23":
                if (com.bytedance.sdk.component.adexpress.fou.oq()) {
                    this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.rhi(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.fou.oq()) {
                    this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.syt(this, this.nn);
                    break;
                }
                break;
            case "29":
                View view3 = this.fou;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.rhi.rhi) && ((com.bytedance.sdk.component.adexpress.rhi.rhi) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.rhi.rhi) this.fou).getShakeView().setTag(2);
                }
                this.syt = new com.bytedance.sdk.component.adexpress.dynamic.bob.kq.csi(this, this.dgq);
                break;
        }
        View.OnTouchListener onTouchListener = this.syt;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (syt()) {
            this.fou.setTag(2);
            setOnClickListener((View.OnClickListener) this.oq.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.syt
    public void kq() {
        if (TextUtils.equals(this.rhi, "6")) {
            com.bytedance.sdk.component.adexpress.rhi.wcx wcxVar = this.rjo;
            if (wcxVar != null) {
                wcxVar.bob();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bob.dgq.2
                    @Override // java.lang.Runnable
                    public void run() {
                        dgq.this.dgq();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.rhi, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bob.dgq.3
                @Override // java.lang.Runnable
                public void run() {
                    dgq.this.dgq();
                }
            }, 400L);
        } else {
            dgq();
        }
    }
}
