package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements p169q8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f45957a = new c();

    private c() {
    }

    @Override // p169q8.b
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p169q8.b
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
