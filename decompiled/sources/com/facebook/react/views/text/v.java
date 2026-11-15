package com.facebook.react.views.text;

import com.facebook.react.uimanager.C1356f0;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f16302h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16303a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f16304b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f16305c = Float.NaN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f16306d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f16307e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y f16308f = y.UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f16309g = Float.NaN;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final v a(v child) {
        Intrinsics.checkNotNullParameter(child, "child");
        v vVar = new v();
        vVar.f16303a = this.f16303a;
        vVar.f16304b = !Float.isNaN(child.f16304b) ? child.f16304b : this.f16304b;
        vVar.f16305c = !Float.isNaN(child.f16305c) ? child.f16305c : this.f16305c;
        vVar.f16306d = !Float.isNaN(child.f16306d) ? child.f16306d : this.f16306d;
        vVar.m(!Float.isNaN(child.f16309g) ? child.f16309g : this.f16309g);
        vVar.f16307e = !Float.isNaN(child.f16307e) ? child.f16307e : this.f16307e;
        y yVar = child.f16308f;
        if (yVar == y.UNSET) {
            yVar = this.f16308f;
        }
        vVar.f16308f = yVar;
        return vVar;
    }

    public final boolean b() {
        return this.f16303a;
    }

    public final int c() {
        float f10 = !Float.isNaN(this.f16304b) ? this.f16304b : 14.0f;
        return (int) (this.f16303a ? Math.ceil(C1356f0.l(f10, f())) : Math.ceil(C1356f0.i(f10)));
    }

    public final float d() {
        if (Float.isNaN(this.f16306d)) {
            return Float.NaN;
        }
        return (this.f16303a ? C1356f0.l(this.f16306d, f()) : C1356f0.i(this.f16306d)) / c();
    }

    public final float e() {
        if (Float.isNaN(this.f16305c)) {
            return Float.NaN;
        }
        float fL = this.f16303a ? C1356f0.l(this.f16305c, f()) : C1356f0.i(this.f16305c);
        if (!Float.isNaN(this.f16307e)) {
            float f10 = this.f16307e;
            if (f10 > fL) {
                return f10;
            }
        }
        return fL;
    }

    public final float f() {
        return !Float.isNaN(this.f16309g) ? this.f16309g : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float g() {
        return this.f16309g;
    }

    public final void h(boolean z9) {
        this.f16303a = z9;
    }

    public final void i(float f10) {
        this.f16304b = f10;
    }

    public final void j(float f10) {
        this.f16307e = f10;
    }

    public final void k(float f10) {
        this.f16306d = f10;
    }

    public final void l(float f10) {
        this.f16305c = f10;
    }

    public final void m(float f10) {
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 >= 1.0f || Float.isNaN(f10)) {
            this.f16309g = f10;
        } else {
            Z1.a.I("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
            this.f16309g = Float.NaN;
        }
    }

    public String toString() {
        return StringsKt.j("\n    TextAttributes {\n      getAllowFontScaling(): " + this.f16303a + "\n      getFontSize(): " + this.f16304b + "\n      getEffectiveFontSize(): " + c() + "\n      getHeightOfTallestInlineViewOrImage(): " + this.f16307e + "\n      getLetterSpacing(): " + this.f16306d + "\n      getEffectiveLetterSpacing(): " + d() + "\n      getLineHeight(): " + this.f16305c + "\n      getEffectiveLineHeight(): " + e() + "\n      getTextTransform(): " + this.f16308f + "\n      getMaxFontSizeMultiplier(): " + this.f16309g + "\n      getEffectiveMaxFontSizeMultiplier(): " + f() + "\n    }\n  ");
    }
}
