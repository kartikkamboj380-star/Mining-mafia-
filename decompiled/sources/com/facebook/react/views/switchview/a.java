package com.facebook.react.views.switchview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.appcompat.widget.c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c0 {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f16149o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Integer f16150p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Integer f16151q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16149o0 = true;
    }

    private final ColorStateList r(int i10) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}}, new int[]{i10});
    }

    public final void s(Drawable drawable, Integer num) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        setBackground(new RippleDrawable(r(i10), new ColorDrawable(i10), null));
    }

    @Override // androidx.appcompat.widget.c0, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        if (!this.f16149o0 || isChecked() == z9) {
            super.setChecked(isChecked());
            return;
        }
        this.f16149o0 = false;
        super.setChecked(z9);
        setTrackColor(z9);
    }

    public final void setOn(boolean z9) {
        if (isChecked() != z9) {
            super.setChecked(z9);
            setTrackColor(z9);
        }
        this.f16149o0 = true;
    }

    public final void setThumbColor(@Nullable Integer num) {
        Drawable thumbDrawable = super.getThumbDrawable();
        Intrinsics.checkNotNullExpressionValue(thumbDrawable, "getThumbDrawable(...)");
        s(thumbDrawable, num);
        if (num == null || !(super.getBackground() instanceof RippleDrawable)) {
            return;
        }
        ColorStateList colorStateListR = r(num.intValue());
        Drawable background = super.getBackground();
        Intrinsics.d(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        ((RippleDrawable) background).setColor(colorStateListR);
    }

    public final void setTrackColor(@Nullable Integer num) {
        Drawable trackDrawable = super.getTrackDrawable();
        Intrinsics.checkNotNullExpressionValue(trackDrawable, "getTrackDrawable(...)");
        s(trackDrawable, num);
    }

    public final void setTrackColorForFalse(@Nullable Integer num) {
        if (Intrinsics.b(num, this.f16150p0)) {
            return;
        }
        this.f16150p0 = num;
        if (isChecked()) {
            return;
        }
        setTrackColor(this.f16150p0);
    }

    public final void setTrackColorForTrue(@Nullable Integer num) {
        if (Intrinsics.b(num, this.f16151q0)) {
            return;
        }
        this.f16151q0 = num;
        if (isChecked()) {
            setTrackColor(this.f16151q0);
        }
    }

    private final void setTrackColor(boolean z9) {
        Integer num = this.f16151q0;
        if (num == null && this.f16150p0 == null) {
            return;
        }
        if (!z9) {
            num = this.f16150p0;
        }
        setTrackColor(num);
    }
}
