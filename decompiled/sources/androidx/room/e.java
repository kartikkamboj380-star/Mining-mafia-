package androidx.room;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements A0.h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0.h.c f10806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1185c f10807b;

    public e(A0.h.c delegate, C1185c autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f10806a = delegate;
        this.f10807b = autoCloser;
    }

    @Override // A0.h.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(A0.h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new d(this.f10806a.a(configuration), this.f10807b);
    }
}
