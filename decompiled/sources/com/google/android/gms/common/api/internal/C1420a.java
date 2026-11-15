package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1420a extends LifecycleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f17029a;

    private C1420a(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f17029a = new ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    static /* bridge */ /* synthetic */ C1420a a(Activity activity) {
        C1420a c1420a;
        synchronized (activity) {
            try {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                c1420a = (C1420a) fragment.getCallbackOrNull("LifecycleObserverOnStop", C1420a.class);
                if (c1420a == null) {
                    c1420a = new C1420a(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1420a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void c(Runnable runnable) {
        this.f17029a.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        List list;
        synchronized (this) {
            list = this.f17029a;
            this.f17029a = new ArrayList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
