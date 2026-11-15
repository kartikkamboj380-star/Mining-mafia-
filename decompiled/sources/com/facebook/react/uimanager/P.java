package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class P extends JSApplicationCausedNativeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f15453a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(String msg, View view, Throwable cause) {
        super(msg, cause);
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f15453a = view;
    }
}
