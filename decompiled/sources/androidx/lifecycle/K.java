package androidx.lifecycle;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC1168n, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I f10164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10165c;

    public K(String key, I handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f10163a = key;
        this.f10164b = handle;
    }

    public final boolean G() {
        return this.f10165c;
    }

    public final void a(p251z0.d registry, AbstractC1164j lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f10165c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f10165c = true;
        lifecycle.a(this);
        registry.h(this.f10163a, this.f10164b.c());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final I h() {
        return this.f10164b;
    }

    @Override // androidx.lifecycle.InterfaceC1168n
    public void onStateChanged(r source, AbstractC1164j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1164j.a.ON_DESTROY) {
            this.f10165c = false;
            source.getLifecycle().d(this);
        }
    }
}
