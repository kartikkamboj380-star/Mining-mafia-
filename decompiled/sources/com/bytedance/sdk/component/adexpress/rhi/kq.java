package com.bytedance.sdk.component.adexpress.rhi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.rs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kq extends TextSwitcher implements ViewSwitcher.ViewFactory, rs.kq {
    private int bob;
    private Context csi;
    private float dgq;
    private final int fou;
    Animation.AnimationListener kq;
    private int nn;
    private List<String> oq;
    private TextView rhi;
    private int rjo;
    private Handler suf;
    private int syt;
    private int ubx;
    private int vvw;
    private int wki;

    public kq(Context context, int i10, float f10, int i11, int i12) {
        super(context);
        this.oq = new ArrayList();
        this.bob = 0;
        this.fou = 1;
        this.suf = new rs(Looper.getMainLooper(), this);
        this.kq = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.kq.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (kq.this.rhi != null) {
                    kq.this.rhi.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.csi = context;
        this.syt = i10;
        this.dgq = f10;
        this.nn = i11;
        this.wki = i12;
        bob();
    }

    private void bob() {
        setFactory(this);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.rhi = textView;
        textView.setTextColor(this.syt);
        this.rhi.setTextSize(this.dgq);
        this.rhi.setMaxLines(this.nn);
        this.rhi.setTextAlignment(this.wki);
        return this.rhi;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.suf.sendEmptyMessageDelayed(1, this.rjo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.suf.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.csi.ubx.oq(this.oq.get(this.ubx), this.dgq, false)[0], 1073741824), i10);
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    public void oq() {
        List<String> list = this.oq;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i10 = this.bob;
        this.bob = i10 + 1;
        this.ubx = i10;
        setText(this.oq.get(i10));
        if (this.bob > this.oq.size() - 1) {
            this.bob = 0;
        }
    }

    public void setAnimationDuration(int i10) {
        this.rjo = i10;
    }

    public void setAnimationText(List<String> list) {
        this.oq = list;
    }

    public void setAnimationType(int i10) {
        this.vvw = i10;
    }

    public void setMaxLines(int i10) {
        this.nn = i10;
    }

    public void setTextColor(int i10) {
        this.syt = i10;
    }

    public void setTextSize(float f10) {
        this.dgq = f10;
    }

    public void kq() {
        int i10 = this.vvw;
        if (i10 == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.uml.dgq(this.csi, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.uml.dgq(this.csi, "tt_text_animation_y_out"));
        } else if (i10 == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.uml.dgq(this.csi, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.uml.dgq(this.csi, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.kq);
            getOutAnimation().setAnimationListener(this.kq);
        }
        this.suf.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.rs.kq
    public void kq(Message message) {
        if (message.what != 1) {
            return;
        }
        oq();
        this.suf.sendEmptyMessageDelayed(1, this.rjo);
    }
}
