package p025c4;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.I0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends ClickableSpan implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11829c;

    public f(int i10) {
        this.f11827a = i10;
    }

    public final void a(int i10) {
        this.f11829c = i10;
    }

    public final void b(boolean z9) {
        this.f11828b = z9;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherC = I0.c(reactContext, this.f11827a);
        if (eventDispatcherC != null) {
            eventDispatcherC.c(new k(I0.e(reactContext), this.f11827a));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (this.f11828b) {
            ds.bgColor = this.f11829c;
        }
    }
}
