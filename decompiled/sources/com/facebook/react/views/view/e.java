package com.facebook.react.views.view;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f16448a = new e();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16449a;

        static {
            int[] iArr = new int[com.facebook.yoga.p.values().length];
            try {
                iArr[com.facebook.yoga.p.EXACTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.facebook.yoga.p.AT_MOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16449a = iArr;
        }
    }

    private e() {
    }

    public static final int a(float f10, com.facebook.yoga.p mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i10 = a.f16449a[mode.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec((int) f10, LinearLayoutManager.INVALID_OFFSET);
        }
        return View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824);
    }
}
