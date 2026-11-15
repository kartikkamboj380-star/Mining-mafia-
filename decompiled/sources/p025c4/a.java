package p025c4;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends MetricAffectingSpan implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f11819a;

    public a(float f10) {
        this.f11819a = f10;
    }

    private final void a(TextPaint textPaint) {
        if (Float.isNaN(this.f11819a)) {
            return;
        }
        textPaint.setLetterSpacing(this.f11819a);
    }

    public final float b() {
        return this.f11819a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        a(paint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        a(paint);
    }
}
