package N8;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: N8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0830g extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient CoroutineContext f3697a;

    public C0830g(CoroutineContext coroutineContext) {
        this.f3697a = coroutineContext;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f3697a.toString();
    }
}
