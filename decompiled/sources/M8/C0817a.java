package M8;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: M8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0817a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f3544a;

    public C0817a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f3544a = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
