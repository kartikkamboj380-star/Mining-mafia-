package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.AbstractC1313n;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0348a f15965f = new C0348a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f15966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f15969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressBar f15970e;

    /* JADX INFO: renamed from: com.facebook.react.views.progressbar.a$a, reason: collision with other inner class name */
    private static final class C0348a {
        public /* synthetic */ C0348a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0348a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15967b = true;
        this.f15968c = true;
    }

    private final void setColor(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.f15966a;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public final void a() {
        ProgressBar progressBar = this.f15970e;
        if (progressBar == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar.setIndeterminate(this.f15967b);
        setColor(progressBar);
        progressBar.setProgress((int) (this.f15969d * ((double) 1000)));
        progressBar.setVisibility(this.f15968c ? 0 : 4);
    }

    public final boolean getAnimating$ReactAndroid_release() {
        return this.f15968c;
    }

    @Nullable
    public final Integer getColor$ReactAndroid_release() {
        return this.f15966a;
    }

    public final boolean getIndeterminate$ReactAndroid_release() {
        return this.f15967b;
    }

    public final double getProgress$ReactAndroid_release() {
        return this.f15969d;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        String str = (String) getTag(AbstractC1313n.f15062v);
        if (str != null) {
            info.setViewIdResourceName(str);
        }
    }

    public final void setAnimating$ReactAndroid_release(boolean z9) {
        this.f15968c = z9;
    }

    public final void setColor$ReactAndroid_release(@Nullable Integer num) {
        this.f15966a = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z9) {
        this.f15967b = z9;
    }

    public final void setProgress$ReactAndroid_release(double d10) {
        this.f15969d = d10;
    }

    public final void setStyle$ReactAndroid_release(@Nullable String str) {
        ReactProgressBarViewManager.a aVar = ReactProgressBarViewManager.Companion;
        ProgressBar progressBarA = aVar.a(getContext(), aVar.b(str));
        progressBarA.setMax(1000);
        this.f15970e = progressBarA;
        removeAllViews();
        addView(this.f15970e, new ViewGroup.LayoutParams(-1, -1));
    }
}
