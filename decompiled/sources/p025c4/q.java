package p025c4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends ReplacementSpan implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11844c;

    public q(int i10, int i11, int i12) {
        this.f11842a = i10;
        this.f11843b = i11;
        this.f11844c = i12;
    }

    public final int a() {
        return this.f11844c;
    }

    public final int b() {
        return this.f11842a;
    }

    public final int c() {
        return this.f11843b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (fontMetricsInt != null) {
            int i12 = -this.f11844c;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return this.f11843b;
    }
}
