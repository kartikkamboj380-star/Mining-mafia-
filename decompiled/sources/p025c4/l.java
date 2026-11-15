package p025c4;

import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f11832a;

    public l(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        this.f11832a = textPaint;
    }

    public final TextPaint a() {
        return this.f11832a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.b(this.f11832a, ((l) obj).f11832a);
    }

    public int hashCode() {
        return this.f11832a.hashCode();
    }

    public String toString() {
        return "ReactTextPaintHolderSpan(textPaint=" + this.f11832a + ")";
    }
}
