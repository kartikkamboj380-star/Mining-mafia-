package W;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class B extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f6168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Throwable readException, int i10) {
        super(i10, null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f6168b = readException;
    }

    public final Throwable b() {
        return this.f6168b;
    }
}
