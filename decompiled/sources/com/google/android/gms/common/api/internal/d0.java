package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f17051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f17052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e0 f17053c;

    d0(e0 e0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f17051a = lifecycleCallback;
        this.f17052b = str;
        Objects.requireNonNull(e0Var);
        this.f17053c = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        e0 e0Var = this.f17053c;
        if (e0Var.m() > 0) {
            LifecycleCallback lifecycleCallback = this.f17051a;
            if (e0Var.n() != null) {
                bundle = e0Var.n().getBundle(this.f17052b);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (e0Var.m() >= 2) {
            this.f17051a.onStart();
        }
        if (e0Var.m() >= 3) {
            this.f17051a.onResume();
        }
        if (e0Var.m() >= 4) {
            this.f17051a.onStop();
        }
        if (e0Var.m() >= 5) {
            this.f17051a.onDestroy();
        }
    }
}
