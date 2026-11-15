package com.facebook.react.uimanager;

import android.view.Choreographer;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSExceptionHandler f15359a;

    protected M(JSExceptionHandler exceptionHandler) {
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        this.f15359a = exceptionHandler;
    }

    protected abstract void a(long j10);

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        try {
            a(j10);
        } catch (RuntimeException e10) {
            this.f15359a.handleException(e10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected M(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        Intrinsics.checkNotNullExpressionValue(exceptionHandler, "getExceptionHandler(...)");
        this(exceptionHandler);
    }
}
