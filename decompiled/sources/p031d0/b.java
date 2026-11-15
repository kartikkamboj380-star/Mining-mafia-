package p031d0;

import N.f;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.emoji2.text.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f42859b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f42858a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f42860c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f42861d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f42862e = 1.0f;

    b(m mVar) {
        f.h(mVar, "rasterizer cannot be null");
        this.f42859b = mVar;
    }

    public final m a() {
        return this.f42859b;
    }

    final int b() {
        return this.f42860c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f42858a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f42858a;
        this.f42862e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f42859b.e();
        this.f42861d = (short) (this.f42859b.e() * this.f42862e);
        short sI = (short) (this.f42859b.i() * this.f42862e);
        this.f42860c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f42858a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
