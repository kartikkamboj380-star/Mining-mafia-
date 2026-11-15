package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC1168n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M f10162a;

    public J(M provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f10162a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1168n
    public void onStateChanged(r source, AbstractC1164j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1164j.a.ON_CREATE) {
            source.getLifecycle().d(this);
            this.f10162a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
