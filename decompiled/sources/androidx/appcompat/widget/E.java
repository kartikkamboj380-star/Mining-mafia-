package androidx.appcompat.widget;

import O.AbstractC0845c0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f7899l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f7900m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7901a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7902b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f7903c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f7904d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f7905e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f7906f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7907g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f7908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f7909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f7910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f7911k;

    private static final class a {
        @NonNull
        static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.E.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) E.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.E.b, androidx.appcompat.widget.E.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.E.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class d {
        d() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) E.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    E(TextView textView) {
        this.f7909i = textView;
        this.f7910j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f7911k = new c();
        } else {
            this.f7911k = new b();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f7901a = 0;
        this.f7904d = -1.0f;
        this.f7905e = -1.0f;
        this.f7903c = -1.0f;
        this.f7906f = new int[0];
        this.f7902b = false;
    }

    private int e(RectF rectF) {
        int length = this.f7906f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f7906f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f7906f[i12];
    }

    private static Method k(String str) {
        try {
            Method declaredMethod = (Method) f7900m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f7900m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    private void s(float f10) {
        if (f10 != this.f7909i.getPaint().getTextSize()) {
            this.f7909i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f7909i.isInLayout();
            if (this.f7909i.getLayout() != null) {
                this.f7902b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f7909i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f7909i.forceLayout();
                } else {
                    this.f7909i.requestLayout();
                }
                this.f7909i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f7901a == 1) {
            if (!this.f7907g || this.f7906f.length == 0) {
                int iFloor = ((int) Math.floor((this.f7905e - this.f7904d) / this.f7903c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f7904d + (i10 * this.f7903c));
                }
                this.f7906f = b(iArr);
            }
            this.f7902b = true;
        } else {
            this.f7902b = false;
        }
        return this.f7902b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f7906f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int[] iArr = this.f7906f;
        int length = iArr.length;
        boolean z9 = length > 0;
        this.f7907g = z9;
        if (z9) {
            this.f7901a = 1;
            this.f7904d = iArr[0];
            this.f7905e = iArr[length - 1];
            this.f7903c = -1.0f;
        }
        return z9;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f7909i.getText();
        TransformationMethod transformationMethod = this.f7909i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f7909i)) != null) {
            text = transformation;
        }
        int maxLines = this.f7909i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f7909i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f7909i instanceof C1091l);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f7901a = 1;
        this.f7904d = f10;
        this.f7905e = f11;
        this.f7903c = f12;
        this.f7907g = false;
    }

    void a() {
        if (n()) {
            if (this.f7902b) {
                if (this.f7909i.getMeasuredHeight() <= 0 || this.f7909i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f7911k.b(this.f7909i) ? 1048576 : (this.f7909i.getMeasuredWidth() - this.f7909i.getTotalPaddingLeft()) - this.f7909i.getTotalPaddingRight();
                int height = (this.f7909i.getHeight() - this.f7909i.getCompoundPaddingBottom()) - this.f7909i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f7899l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f7909i.getTextSize()) {
                            t(0, fE);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f7902b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f7909i, this.f7908h, this.f7911k);
    }

    int f() {
        return Math.round(this.f7905e);
    }

    int g() {
        return Math.round(this.f7904d);
    }

    int h() {
        return Math.round(this.f7903c);
    }

    int[] i() {
        return this.f7906f;
    }

    int j() {
        return this.f7901a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f7908h;
        if (textPaint == null) {
            this.f7908h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f7908h.set(this.f7909i.getPaint());
        this.f7908h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f7901a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f7910j.obtainStyledAttributes(attributeSet, p060g.j.f44181g0, i10, 0);
        TextView textView = this.f7909i;
        AbstractC0845c0.k0(textView, textView.getContext(), p060g.j.f44181g0, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        if (typedArrayObtainStyledAttributes.hasValue(p060g.j.f44206l0)) {
            this.f7901a = typedArrayObtainStyledAttributes.getInt(p060g.j.f44206l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(p060g.j.f44201k0) ? typedArrayObtainStyledAttributes.getDimension(p060g.j.f44201k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(p060g.j.f44191i0) ? typedArrayObtainStyledAttributes.getDimension(p060g.j.f44191i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(p060g.j.f44186h0) ? typedArrayObtainStyledAttributes.getDimension(p060g.j.f44186h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(p060g.j.f44196j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(p060g.j.f44196j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f7901a = 0;
            return;
        }
        if (this.f7901a == 1) {
            if (!this.f7907g) {
                DisplayMetrics displayMetrics = this.f7910j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f7910j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f7910j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f7906f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f7907g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f7910j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f10) {
        Context context = this.f7910j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
