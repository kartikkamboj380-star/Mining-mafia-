package com.bytedance.adsdk.ugeno.rhi.kq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.rhi.fou;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq extends LinearLayout {
    protected int bob;
    private int csi;
    private int dgq;
    private List<View> fou;
    protected Context kq;
    private float nn;
    protected int oq;
    private int rhi;
    private int rjo;
    private boolean syt;
    private float ubx;
    private String vvw;

    public kq(Context context) {
        super(context);
        this.csi = -65536;
        this.rhi = -16776961;
        this.rjo = 5;
        this.oq = 40;
        this.bob = 20;
        this.vvw = "row";
        this.kq = context;
        this.fou = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fou() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        float height2 = getHeight();
        float f10 = this.ubx;
        layoutParams.topMargin = (int) (((int) ((height * f10) / 100.0f)) - ((height2 * f10) / 100.0f));
        float f11 = this.nn;
        layoutParams.leftMargin = (int) (((int) ((width * f11) / 100.0f)) - ((width2 * f11) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public void bob() {
        this.fou.clear();
        removeAllViews();
    }

    public int getSize() {
        return this.fou.size();
    }

    public abstract Drawable oq(int i10);

    public void oq() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof oq) {
            this.bob = this.oq;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.oq, this.bob);
        if (getOrientation() == 1) {
            int i10 = this.rjo;
            layoutParams.topMargin = i10;
            layoutParams.bottomMargin = i10;
        } else {
            int i11 = this.rjo;
            layoutParams.leftMargin = i11;
            layoutParams.rightMargin = i11;
        }
        addView(view, layoutParams);
        view.setBackground(oq(this.rhi));
        this.fou.add(view);
    }

    public void setIndicatorDirection(String str) {
        this.vvw = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i10) {
        this.bob = i10;
    }

    public void setIndicatorWidth(int i10) {
        this.oq = i10;
    }

    public void setIndicatorX(float f10) {
        this.nn = f10;
    }

    public void setIndicatorY(float f10) {
        this.ubx = f10;
    }

    public void setLoop(boolean z9) {
        this.syt = z9;
    }

    public void setSelectedColor(int i10) {
        this.csi = i10;
    }

    public void setUnSelectedColor(int i10) {
        this.rhi = i10;
    }

    public void kq(int i10, int i11) {
        Iterator<View> it = this.fou.iterator();
        while (it.hasNext()) {
            it.next().setBackground(oq(this.rhi));
        }
        if (i10 < 0 || i10 >= this.fou.size()) {
            i10 = 0;
        }
        if (this.fou.size() > 0) {
            this.fou.get(i10).setBackground(oq(this.csi));
            this.dgq = i11;
        }
    }

    public void kq() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.rhi.kq.kq.1
            @Override // java.lang.Runnable
            public void run() {
                kq.this.fou();
            }
        });
    }

    public void kq(int i10) {
        if (this instanceof oq) {
            this.bob = this.oq;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.oq, this.bob);
        if (getOrientation() == 1) {
            int i11 = this.rjo;
            layoutParams.topMargin = i11;
            layoutParams.bottomMargin = i11;
        } else {
            int i12 = this.rjo;
            layoutParams.leftMargin = i12;
            layoutParams.rightMargin = i12;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.oq, this.bob);
        if (getOrientation() == 1) {
            int i13 = this.rjo;
            layoutParams2.topMargin = i13;
            layoutParams2.bottomMargin = i13;
        } else {
            int i14 = this.rjo;
            layoutParams2.leftMargin = i14;
            layoutParams2.rightMargin = i14;
        }
        int iKq = fou.kq(this.syt, this.dgq, this.fou.size());
        int iKq2 = fou.kq(this.syt, i10, this.fou.size());
        if (this.fou.size() == 0) {
            iKq2 = 0;
        }
        if (!this.fou.isEmpty() && fou.kq(iKq, this.fou) && fou.kq(iKq2, this.fou)) {
            this.fou.get(iKq).setBackground(oq(this.rhi));
            this.fou.get(iKq).setLayoutParams(layoutParams2);
            this.fou.get(iKq2).setBackground(oq(this.csi));
            this.fou.get(iKq2).setLayoutParams(layoutParams);
            this.dgq = i10;
        }
    }
}
