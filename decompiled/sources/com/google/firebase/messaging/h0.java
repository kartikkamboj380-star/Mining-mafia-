package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f40272d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f40273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d0 f40274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f40275c;

    private h0(SharedPreferences sharedPreferences, Executor executor) {
        this.f40275c = executor;
        this.f40273a = sharedPreferences;
    }

    public static synchronized h0 b(Context context, Executor executor) {
        h0 h0Var;
        try {
            WeakReference weakReference = f40272d;
            h0Var = weakReference != null ? (h0) weakReference.get() : null;
            if (h0Var == null) {
                h0Var = new h0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                h0Var.d();
                f40272d = new WeakReference(h0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h0Var;
    }

    private synchronized void d() {
        this.f40274b = d0.d(this.f40273a, "topic_operation_queue", ",", this.f40275c);
    }

    synchronized boolean a(g0 g0Var) {
        return this.f40274b.b(g0Var.e());
    }

    synchronized g0 c() {
        return g0.a(this.f40274b.f());
    }

    synchronized boolean e(g0 g0Var) {
        return this.f40274b.g(g0Var.e());
    }
}
