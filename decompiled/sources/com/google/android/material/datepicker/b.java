package com.google.android.material.datepicker;

import O.AbstractC0845c0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f39060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f39061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f39062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f39063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f39064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final K5.k f39065f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, K5.k kVar, Rect rect) {
        N.f.d(rect.left);
        N.f.d(rect.top);
        N.f.d(rect.right);
        N.f.d(rect.bottom);
        this.f39060a = rect;
        this.f39061b = colorStateList2;
        this.f39062c = colorStateList;
        this.f39063d = colorStateList3;
        this.f39064e = i10;
        this.f39065f = kVar;
    }

    static b a(Context context, int i10) {
        N.f.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, p186s5.k.f48859A3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(p186s5.k.f48868B3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p186s5.k.f48886D3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p186s5.k.f48877C3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p186s5.k.f48895E3, 0));
        ColorStateList colorStateListA = H5.c.a(context, typedArrayObtainStyledAttributes, p186s5.k.f48904F3);
        ColorStateList colorStateListA2 = H5.c.a(context, typedArrayObtainStyledAttributes, p186s5.k.f48949K3);
        ColorStateList colorStateListA3 = H5.c.a(context, typedArrayObtainStyledAttributes, p186s5.k.f48931I3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p186s5.k.f48940J3, 0);
        K5.k kVarM = K5.k.b(context, typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f48913G3, 0), typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f48922H3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    void b(TextView textView) {
        c(textView, null, null);
    }

    void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        K5.g gVar = new K5.g();
        K5.g gVar2 = new K5.g();
        gVar.setShapeAppearanceModel(this.f39065f);
        gVar2.setShapeAppearanceModel(this.f39065f);
        if (colorStateList == null) {
            colorStateList = this.f39062c;
        }
        gVar.W(colorStateList);
        gVar.b0(this.f39064e, this.f39063d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f39061b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f39061b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f39060a;
        AbstractC0845c0.q0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
