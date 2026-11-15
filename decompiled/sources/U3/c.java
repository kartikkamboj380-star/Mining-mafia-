package U3;

import android.content.Context;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Float[] f5900a = new Float[o.values().length];

    public final RectF a(int i10, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float fFloatValue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i10 == 0) {
            Float f10 = this.f5900a[o.START.ordinal()];
            float fFloatValue2 = (f10 == null && (f10 = this.f5900a[o.LEFT.ordinal()]) == null && (f10 = this.f5900a[o.HORIZONTAL.ordinal()]) == null && (f10 = this.f5900a[o.ALL.ordinal()]) == null) ? 0.0f : f10.floatValue();
            Float f11 = this.f5900a[o.BLOCK_START.ordinal()];
            float fFloatValue3 = (f11 == null && (f11 = this.f5900a[o.TOP.ordinal()]) == null && (f11 = this.f5900a[o.BLOCK.ordinal()]) == null && (f11 = this.f5900a[o.VERTICAL.ordinal()]) == null && (f11 = this.f5900a[o.ALL.ordinal()]) == null) ? 0.0f : f11.floatValue();
            Float f12 = this.f5900a[o.END.ordinal()];
            float fFloatValue4 = (f12 == null && (f12 = this.f5900a[o.RIGHT.ordinal()]) == null && (f12 = this.f5900a[o.HORIZONTAL.ordinal()]) == null && (f12 = this.f5900a[o.ALL.ordinal()]) == null) ? 0.0f : f12.floatValue();
            Float f13 = this.f5900a[o.BLOCK_END.ordinal()];
            if (f13 != null || (f13 = this.f5900a[o.BOTTOM.ordinal()]) != null || (f13 = this.f5900a[o.BLOCK.ordinal()]) != null || (f13 = this.f5900a[o.VERTICAL.ordinal()]) != null || (f13 = this.f5900a[o.ALL.ordinal()]) != null) {
                fFloatValue = f13.floatValue();
            }
            return new RectF(fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue);
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Expected resolved layout direction");
        }
        if (com.facebook.react.modules.i18nmanager.a.f14969a.a().d(context)) {
            Float f14 = this.f5900a[o.END.ordinal()];
            float fFloatValue5 = (f14 == null && (f14 = this.f5900a[o.RIGHT.ordinal()]) == null && (f14 = this.f5900a[o.HORIZONTAL.ordinal()]) == null && (f14 = this.f5900a[o.ALL.ordinal()]) == null) ? 0.0f : f14.floatValue();
            Float f15 = this.f5900a[o.BLOCK_START.ordinal()];
            float fFloatValue6 = (f15 == null && (f15 = this.f5900a[o.TOP.ordinal()]) == null && (f15 = this.f5900a[o.BLOCK.ordinal()]) == null && (f15 = this.f5900a[o.VERTICAL.ordinal()]) == null && (f15 = this.f5900a[o.ALL.ordinal()]) == null) ? 0.0f : f15.floatValue();
            Float f16 = this.f5900a[o.START.ordinal()];
            float fFloatValue7 = (f16 == null && (f16 = this.f5900a[o.LEFT.ordinal()]) == null && (f16 = this.f5900a[o.HORIZONTAL.ordinal()]) == null && (f16 = this.f5900a[o.ALL.ordinal()]) == null) ? 0.0f : f16.floatValue();
            Float f17 = this.f5900a[o.BLOCK_END.ordinal()];
            if (f17 != null || (f17 = this.f5900a[o.BOTTOM.ordinal()]) != null || (f17 = this.f5900a[o.BLOCK.ordinal()]) != null || (f17 = this.f5900a[o.VERTICAL.ordinal()]) != null || (f17 = this.f5900a[o.ALL.ordinal()]) != null) {
                fFloatValue = f17.floatValue();
            }
            return new RectF(fFloatValue5, fFloatValue6, fFloatValue7, fFloatValue);
        }
        Float f18 = this.f5900a[o.END.ordinal()];
        float fFloatValue8 = (f18 == null && (f18 = this.f5900a[o.LEFT.ordinal()]) == null && (f18 = this.f5900a[o.HORIZONTAL.ordinal()]) == null && (f18 = this.f5900a[o.ALL.ordinal()]) == null) ? 0.0f : f18.floatValue();
        Float f19 = this.f5900a[o.BLOCK_START.ordinal()];
        float fFloatValue9 = (f19 == null && (f19 = this.f5900a[o.TOP.ordinal()]) == null && (f19 = this.f5900a[o.BLOCK.ordinal()]) == null && (f19 = this.f5900a[o.VERTICAL.ordinal()]) == null && (f19 = this.f5900a[o.ALL.ordinal()]) == null) ? 0.0f : f19.floatValue();
        Float f20 = this.f5900a[o.START.ordinal()];
        float fFloatValue10 = (f20 == null && (f20 = this.f5900a[o.RIGHT.ordinal()]) == null && (f20 = this.f5900a[o.HORIZONTAL.ordinal()]) == null && (f20 = this.f5900a[o.ALL.ordinal()]) == null) ? 0.0f : f20.floatValue();
        Float f21 = this.f5900a[o.BLOCK_END.ordinal()];
        if (f21 != null || (f21 = this.f5900a[o.BOTTOM.ordinal()]) != null || (f21 = this.f5900a[o.BLOCK.ordinal()]) != null || (f21 = this.f5900a[o.VERTICAL.ordinal()]) != null || (f21 = this.f5900a[o.ALL.ordinal()]) != null) {
            fFloatValue = f21.floatValue();
        }
        return new RectF(fFloatValue8, fFloatValue9, fFloatValue10, fFloatValue);
    }

    public final void b(o edge, Float f10) {
        Intrinsics.checkNotNullParameter(edge, "edge");
        this.f5900a[edge.ordinal()] = f10;
    }
}
