package p025c4;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends CharacterStyle implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f11837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f11838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f11839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11840d;

    public o(float f10, float f11, float f12, int i10) {
        this.f11837a = f10;
        this.f11838b = f11;
        this.f11839c = f12;
        this.f11840d = i10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setShadowLayer(this.f11839c, this.f11837a, this.f11838b, this.f11840d);
    }
}
