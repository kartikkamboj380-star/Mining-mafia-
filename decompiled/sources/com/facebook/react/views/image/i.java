package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p193t2.p;
import p193t2.q;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f15931l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final q f15932m = new i();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            return i.f15932m;
        }

        private a() {
        }
    }

    @Override // p193t2.p
    public void b(Matrix outTransform, Rect parentRect, int i10, int i11, float f10, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(outTransform, "outTransform");
        Intrinsics.checkNotNullParameter(parentRect, "parentRect");
        float f14 = kotlin.ranges.b.f(Math.min(f12, f13), 1.0f);
        float f15 = parentRect.left;
        float f16 = parentRect.top;
        outTransform.setScale(f14, f14);
        outTransform.postTranslate(Math.round(f15), Math.round(f16));
    }

    public String toString() {
        return "start_inside";
    }
}
