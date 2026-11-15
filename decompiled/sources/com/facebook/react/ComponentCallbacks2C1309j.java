package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1309j implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f14868a;

    public ComponentCallbacks2C1309j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14868a = new CopyOnWriteArrayList();
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private final void c(int i10) {
        Iterator it = this.f14868a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((MemoryPressureListener) it.next()).handleMemoryPressure(i10);
        }
    }

    public final void a(MemoryPressureListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f14868a.contains(listener)) {
            return;
        }
        this.f14868a.add(listener);
    }

    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    public final void d(MemoryPressureListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f14868a.remove(listener);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        c(i10);
    }
}
