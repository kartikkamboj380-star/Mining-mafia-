package com.google.android.material.timepicker;

import K5.g;
import K5.i;
import O.AbstractC0845c0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p186s5.k;

/* JADX INFO: loaded from: classes2.dex */
abstract class d extends ConstraintLayout {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Runnable f39769O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f39770P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private g f39771Q;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(p186s5.g.f48789g, this);
        AbstractC0845c0.q0(this, u());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f49172i5, i10, 0);
        this.f39770P = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f49181j5, 0);
        this.f39769O = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f39768a.z();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private void A() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f39769O);
            handler.post(this.f39769O);
        }
    }

    private void t(List list, androidx.constraintlayout.widget.e eVar, int i10) {
        Iterator it = list.iterator();
        float size = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (it.hasNext()) {
            eVar.g(((View) it.next()).getId(), p186s5.e.f48756c, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable u() {
        g gVar = new g();
        this.f39771Q = gVar;
        gVar.U(new i(0.5f));
        this.f39771Q.W(ColorStateList.valueOf(-1));
        return this.f39771Q;
    }

    private static boolean y(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(AbstractC0845c0.k());
        }
        A();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        z();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f39771Q.W(ColorStateList.valueOf(i10));
    }

    int v(int i10) {
        return i10 == 2 ? Math.round(this.f39770P * 0.66f) : this.f39770P;
    }

    public int w() {
        return this.f39770P;
    }

    public void x(int i10) {
        this.f39770P = i10;
        z();
    }

    protected void z() {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.f(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != p186s5.e.f48756c && !y(childAt)) {
                int i11 = (Integer) childAt.getTag(p186s5.e.f48764k);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            t((List) entry.getValue(), eVar, v(((Integer) entry.getKey()).intValue()));
        }
        eVar.c(this);
    }
}
