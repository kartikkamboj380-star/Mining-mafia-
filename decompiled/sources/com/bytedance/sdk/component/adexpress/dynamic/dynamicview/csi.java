package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class csi extends FrameLayout implements IAnimation, wf, xn {
    private static final View.OnTouchListener jhe = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener uml = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };
    protected float bob;
    protected float csi;
    protected int dgq;
    private float fax;
    protected float fou;
    private float gm;
    private float kq;
    private com.bytedance.sdk.component.utils.ou mq;
    protected boolean mxq;
    protected int nn;
    protected View nze;
    private float oq;
    protected float rhi;
    protected int rjo;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.kq.oq sns;
    protected DynamicRootView suf;
    protected int syt;
    protected Context ubx;
    protected com.bytedance.sdk.component.adexpress.dynamic.fou.rjo vvw;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.bob wcx;
    protected com.bytedance.sdk.component.adexpress.dynamic.fou.syt wki;

    public csi(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        super(context);
        this.ubx = context;
        this.suf = dynamicRootView;
        this.wki = sytVar;
        this.bob = sytVar.rhi();
        this.fou = sytVar.rjo();
        this.csi = sytVar.syt();
        this.rhi = sytVar.dgq();
        this.dgq = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.bob);
        this.nn = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.fou);
        this.rjo = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.csi);
        this.syt = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.rhi);
        com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar = new com.bytedance.sdk.component.adexpress.dynamic.fou.rjo(sytVar.nn());
        this.vvw = rjoVar;
        if (rjoVar.wcx() > 0) {
            this.rjo += this.vvw.wcx() * 2;
            this.syt += this.vvw.wcx() * 2;
            this.dgq -= this.vvw.wcx();
            this.nn -= this.vvw.wcx();
            List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> listUbx = sytVar.ubx();
            if (listUbx != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar2 : listUbx) {
                    sytVar2.bob(sytVar2.rhi() + com.bytedance.sdk.component.adexpress.fou.rjo.oq(this.ubx, this.vvw.wcx()));
                    sytVar2.fou(sytVar2.rjo() + com.bytedance.sdk.component.adexpress.fou.rjo.oq(this.ubx, this.vvw.wcx()));
                    sytVar2.kq(com.bytedance.sdk.component.adexpress.fou.rjo.oq(this.ubx, this.vvw.wcx()));
                    sytVar2.oq(com.bytedance.sdk.component.adexpress.fou.rjo.oq(this.ubx, this.vvw.wcx()));
                }
            }
        }
        this.mxq = this.vvw.suf() > 0.0d;
        this.wcx = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.bob();
    }

    public boolean bob() {
        dgq();
        rhi();
        fou();
        return true;
    }

    public boolean csi() {
        com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar = this.vvw;
        return (rjoVar == null || rjoVar.ibd() == 0) ? false : true;
    }

    protected boolean fou() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.nze;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (csi()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = jhe;
            onClickListener = uml;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iKq = com.bytedance.sdk.component.adexpress.dynamic.oq.kq.kq(this.vvw);
            if (iKq == 2 || iKq == 3) {
                view2.setOnClickListener(uml);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        kq(view2);
        oq(view2);
        return true;
    }

    protected Drawable getBackgroundDrawable() {
        return kq(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.mxq;
    }

    public int getClickArea() {
        return this.vvw.ibd();
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.rhi.kq getDynamicClickListener() {
        return this.suf.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.syt;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fou.rhi getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.fou.csi csiVarNn;
        com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar = this.wki;
        if (sytVar == null || (csiVarNn = sytVar.nn()) == null) {
            return null;
        }
        return csiVarNn.csi();
    }

    public int getDynamicWidth() {
        return this.rjo;
    }

    public String getImageObjectFit() {
        return this.vvw.pms();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.gm;
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(kq(oq(this.vvw.nz().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.fax;
    }

    public void kq(int i10) {
        com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar = this.vvw;
        if (rjoVar != null && rjoVar.kq(i10)) {
            dgq();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != null && (getChildAt(i11) instanceof csi)) {
                    ((csi) childAt).kq(i10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        rjo();
        kq();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        oq();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.wcx.kq(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.bob bobVar = this.wcx;
        View view = this.nze;
        if (view == null) {
            view = this;
        }
        bobVar.kq(view, i10, i11);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
    }

    protected void oq(@NonNull View view) {
        com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi;
        com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar = this.wki;
        if (sytVar == null || (rhiVarCsi = sytVar.nn().csi()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(rhiVarCsi.oyl()));
    }

    public void rhi() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.rjo, this.syt);
        layoutParams.topMargin = this.nn;
        int i10 = this.dgq;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public void rjo() {
        if (syt()) {
            return;
        }
        View view = this.nze;
        if (view == null) {
            view = this;
        }
        this.sns = new com.bytedance.sdk.component.adexpress.dynamic.animation.kq.oq(view, this.wki.nn().csi().iaf());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.kq.oq oqVar = csi.this.sns;
                if (oqVar != null) {
                    oqVar.kq();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.gm = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.kq = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.oq = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z9) {
        this.mxq = z9;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.fax = f10;
        this.wcx.kq(this, f10);
    }

    protected boolean syt() {
        com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar = this.wki;
        return sytVar == null || sytVar.nn() == null || this.wki.nn().csi() == null || this.wki.nn().csi().iaf() == null;
    }

    private List<String> oq(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '(') {
                i10++;
                z9 = true;
            } else if (str.charAt(i12) == ')' && (i10 = i10 - 1) == 0 && z9) {
                int i13 = i12 + 1;
                arrayList.add(str.substring(i11, i13));
                i11 = i13;
                z9 = false;
            }
        }
        return arrayList;
    }

    protected void kq(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.wki.syt());
            jSONObject.put("height", this.wki.dgq());
            if (com.bytedance.sdk.component.adexpress.fou.oq()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.kq.fax, this.vvw.yyl());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.kq.mq, this.wki.nn().oq());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.kq.jhe, this.wki.bob());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.kq.uml, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.vvw.yyl());
            view.setTag(2097610715, this.wki.nn().oq());
            view.setTag(2097610714, this.wki.bob());
            view.setTag(2097610713, jSONObject.toString());
            int iKq = com.bytedance.sdk.component.adexpress.dynamic.oq.kq.kq(this.vvw);
            if (iKq == 1) {
                view.setTag(2097610707, new Pair(this.vvw.ou(), Long.valueOf(this.vvw.ebt())));
                view.setTag(2097610708, Integer.valueOf(iKq));
            }
        } catch (JSONException unused) {
        }
    }

    public void oq() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.kq.oq oqVar = this.sns;
        if (oqVar != null) {
            oqVar.oq();
        }
    }

    protected Drawable kq(boolean z9, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iRs;
        if (!TextUtils.isEmpty(this.vvw.nz())) {
            try {
                String strNz = this.vvw.nz();
                String strSubstring = strNz.substring(strNz.indexOf("(") + 1, strNz.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.fou.rjo.kq(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.fou.rjo.kq(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.fou.rjo.kq(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.fou.rjo.kq(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d10 = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d10 > 225.0d && d10 < 315.0d) {
                        int i10 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i10;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableKq = kq(kq(strArrSplit[0]), iArr);
                gradientDrawableKq.setShape(0);
                gradientDrawableKq.setCornerRadius(com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.nze()));
                return gradientDrawableKq;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fKq = com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.nze());
        drawable.setCornerRadius(fKq);
        if (fKq < 1.0f) {
            float fKq2 = com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.fgm());
            float fKq3 = com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.zfx());
            float fKq4 = com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.ktb());
            float fKq5 = com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.wf());
            float[] fArr = new float[8];
            if (fKq2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[0] = fKq2;
                fArr[1] = fKq2;
            }
            if (fKq3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[2] = fKq3;
                fArr[3] = fKq3;
            }
            if (fKq4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[4] = fKq4;
                fArr[5] = fKq4;
            }
            if (fKq5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[6] = fKq5;
                fArr[7] = fKq5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z9) {
            iRs = Color.parseColor(str);
        } else {
            iRs = this.vvw.rs();
        }
        drawable.setColor(iRs);
        if (this.vvw.sns() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.sns()), this.vvw.mxq());
        } else if (this.vvw.wcx() > 0) {
            drawable.setStroke(this.vvw.wcx(), this.vvw.mxq());
            drawable.setAlpha(50);
            if (TextUtils.equals(this.wki.nn().oq(), "video-vd")) {
                setLayerType(1, null);
                return new gm((int) fKq, this.vvw.wcx());
            }
        }
        return drawable;
    }

    protected oq kq(Bitmap bitmap) {
        return new kq(bitmap, null);
    }

    private Drawable[] kq(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.fou.rjo.kq(strArrSplit[i12].substring(0, 7));
                    i11 = i12;
                }
                GradientDrawable gradientDrawableKq = kq(kq(strArrSplit[0]), iArr);
                gradientDrawableKq.setShape(0);
                gradientDrawableKq.setCornerRadius(com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.nze()));
                drawableArr[(list.size() - 1) - i10] = gradientDrawableKq;
            }
        }
        return drawableArr;
    }

    protected GradientDrawable kq(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    protected GradientDrawable.Orientation kq(String str) {
        try {
            int i10 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i10 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i10 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i10 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void kq() {
        if (isShown()) {
            int iKq = com.bytedance.sdk.component.adexpress.dynamic.oq.kq.kq(this.vvw);
            if (iKq == 2) {
                if (this.mq == null) {
                    this.mq = new com.bytedance.sdk.component.utils.ou(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi.4
                };
                com.bytedance.sdk.component.adexpress.oq.wki renderRequest = this.suf.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.nze();
                    renderRequest.mq();
                    renderRequest.gm();
                    return;
                }
                return;
            }
            if (iKq == 3) {
                if (this.mq == null) {
                    this.mq = new com.bytedance.sdk.component.utils.ou(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi.5
                };
                com.bytedance.sdk.component.adexpress.oq.wki renderRequest2 = this.suf.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.sns();
                    renderRequest2.jhe();
                    renderRequest2.wcx();
                    renderRequest2.fax();
                }
            }
        }
    }
}
