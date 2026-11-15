package com.google.android.play.core.integrity;

import V5.AbstractC0971h;
import android.content.Context;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6707v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static InterfaceC6706u f39890a;

    static synchronized InterfaceC6706u a(Context context) {
        try {
            if (f39890a == null) {
                f0 f0Var = new f0(null);
                f0Var.a(AbstractC0971h.a(context));
                f39890a = f0Var.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f39890a;
    }
}
