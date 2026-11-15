package com.facebook.react.views.textinput;

import android.text.SpannableStringBuilder;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SpannableStringBuilder f16434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f16435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f16439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CharSequence f16440g;

    public p(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f16434a = new SpannableStringBuilder(editText.getText());
        this.f16435b = editText.getTextSize();
        this.f16436c = editText.getMinLines();
        this.f16437d = editText.getMaxLines();
        this.f16438e = editText.getInputType();
        this.f16439f = editText.getBreakStrategy();
        this.f16440g = editText.getHint();
    }

    public final void a(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        editText.setText(this.f16434a);
        editText.setTextSize(0, this.f16435b);
        editText.setMinLines(this.f16436c);
        editText.setMaxLines(this.f16437d);
        editText.setInputType(this.f16438e);
        editText.setHint(this.f16440g);
        editText.setBreakStrategy(this.f16439f);
    }
}
