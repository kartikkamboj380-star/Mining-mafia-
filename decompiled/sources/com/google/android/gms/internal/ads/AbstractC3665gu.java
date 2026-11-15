package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3665gu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f28760a;

    public AbstractC3665gu(View view) {
        this.f28760a = new WeakReference(view);
    }

    protected abstract void a(ViewTreeObserver viewTreeObserver);

    protected abstract void b(ViewTreeObserver viewTreeObserver);

    public final void c() {
        ViewTreeObserver viewTreeObserverE = e();
        if (viewTreeObserverE != null) {
            a(viewTreeObserverE);
        }
    }

    public final void d() {
        ViewTreeObserver viewTreeObserverE = e();
        if (viewTreeObserverE != null) {
            b(viewTreeObserverE);
        }
    }

    protected final ViewTreeObserver e() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f28760a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
