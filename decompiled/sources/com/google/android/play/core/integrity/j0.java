package com.google.android.play.core.integrity;

import V5.AbstractC0971h;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e0 f39868a;

    static synchronized e0 a(Context context) {
        try {
            if (f39868a == null) {
                d0 d0Var = new d0(null);
                d0Var.a(AbstractC0971h.a(context));
                f39868a = d0Var.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f39868a;
    }
}
