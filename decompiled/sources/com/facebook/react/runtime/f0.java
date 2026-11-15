package com.facebook.react.runtime;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1320d f15241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LifecycleState f15242b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15243a;

        static {
            int[] iArr = new int[LifecycleState.values().length];
            try {
                iArr[LifecycleState.BEFORE_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LifecycleState.RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LifecycleState.BEFORE_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15243a = iArr;
        }
    }

    public f0(C1320d bridgelessReactStateTracker) {
        Intrinsics.checkNotNullParameter(bridgelessReactStateTracker, "bridgelessReactStateTracker");
        this.f15241a = bridgelessReactStateTracker;
        this.f15242b = LifecycleState.BEFORE_CREATE;
    }

    public final LifecycleState a() {
        return this.f15242b;
    }

    public final void b(ReactContext reactContext) {
        if (reactContext != null) {
            int i10 = a.f15243a[this.f15242b.ordinal()];
            if (i10 == 2) {
                this.f15241a.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
                this.f15241a.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            } else if (i10 == 3) {
                this.f15241a.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            }
        }
        this.f15242b = LifecycleState.BEFORE_CREATE;
    }

    public final void c(ReactContext reactContext, Activity activity) {
        if (reactContext != null) {
            int i10 = a.f15243a[this.f15242b.ordinal()];
            if (i10 == 1) {
                this.f15241a.a("ReactContext.onHostResume()");
                reactContext.onHostResume(activity);
                this.f15241a.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
            } else if (i10 == 2) {
                this.f15241a.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
            }
        }
        this.f15242b = LifecycleState.BEFORE_RESUME;
    }

    public final void d(ReactContext reactContext, Activity activity) {
        LifecycleState lifecycleState = this.f15242b;
        LifecycleState lifecycleState2 = LifecycleState.RESUMED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        if (reactContext != null) {
            this.f15241a.a("ReactContext.onHostResume()");
            reactContext.onHostResume(activity);
        }
        this.f15242b = lifecycleState2;
    }

    public final void e(ReactContext currentContext, Activity activity) {
        Intrinsics.checkNotNullParameter(currentContext, "currentContext");
        if (this.f15242b == LifecycleState.RESUMED) {
            this.f15241a.a("ReactContext.onHostResume()");
            currentContext.onHostResume(activity);
        }
    }
}
