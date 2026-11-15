package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f8322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f8323c;

    private h0(Context context, TypedArray typedArray) {
        this.f8321a = context;
        this.f8322b = typedArray;
    }

    public static h0 t(Context context, int i10, int[] iArr) {
        return new h0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static h0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new h0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static h0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new h0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z9) {
        return this.f8322b.getBoolean(i10, z9);
    }

    public int b(int i10, int i11) {
        return this.f8322b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f8322b.hasValue(i10) || (resourceId = this.f8322b.getResourceId(i10, 0)) == 0 || (colorStateListA = p080i.a.a(this.f8321a, resourceId)) == null) ? this.f8322b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f8322b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f8322b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f8322b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f8322b.hasValue(i10) || (resourceId = this.f8322b.getResourceId(i10, 0)) == 0) ? this.f8322b.getDrawable(i10) : p080i.a.b(this.f8321a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f8322b.hasValue(i10) || (resourceId = this.f8322b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C1090k.b().d(this.f8321a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f8322b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, E.h.e eVar) {
        int resourceId = this.f8322b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f8323c == null) {
            this.f8323c = new TypedValue();
        }
        return E.h.i(this.f8321a, resourceId, this.f8323c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f8322b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f8322b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f8322b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f8322b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f8322b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f8322b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f8322b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f8322b;
    }

    public boolean s(int i10) {
        return this.f8322b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f8322b.peekValue(i10);
    }

    public void x() {
        this.f8322b.recycle();
    }
}
