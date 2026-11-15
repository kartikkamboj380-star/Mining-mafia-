package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.I0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static final ReactContext a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return I0.d(view);
    }

    public static final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return I0.e(context);
    }
}
