package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f39066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f39067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f39068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f39069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f39070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f39071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b f39072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Paint f39073h;

    c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(H5.b.d(context, p186s5.a.f48591D, i.class.getCanonicalName()), p186s5.k.f49242q3);
        this.f39066a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f49278u3, 0));
        this.f39072g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f49260s3, 0));
        this.f39067b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f49269t3, 0));
        this.f39068c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f49287v3, 0));
        ColorStateList colorStateListA = H5.c.a(context, typedArrayObtainStyledAttributes, p186s5.k.f49296w3);
        this.f39069d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f49314y3, 0));
        this.f39070e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f49305x3, 0));
        this.f39071f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f49323z3, 0));
        Paint paint = new Paint();
        this.f39073h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
