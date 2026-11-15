package N8;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: N8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0828e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection f3696a = G8.j.D(G8.j.d(ServiceLoader.load(I8.L.class, I8.L.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f3696a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
