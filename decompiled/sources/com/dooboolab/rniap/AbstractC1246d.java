package com.dooboolab.rniap;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.dooboolab.rniap.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1246d {
    public static final void a(Promise promise, String message) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        c(promise, message, null, null);
    }

    public static final void b(Promise promise, String code, String str) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        Intrinsics.checkNotNullParameter(code, "code");
        c(promise, code, str, null);
    }

    public static final void c(Promise promise, String code, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        Intrinsics.checkNotNullParameter(code, "code");
        try {
            promise.reject(code, str, th);
        } catch (RuntimeException e10) {
            Log.d("IapPromises", "Already consumed " + e10.getMessage());
        }
    }

    public static final void d(Promise promise, Object obj) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        try {
            promise.resolve(obj);
        } catch (RuntimeException e10) {
            Log.d("IapPromises", "Already consumed " + e10.getMessage());
        }
    }
}
