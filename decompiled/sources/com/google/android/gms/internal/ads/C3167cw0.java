package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3167cw0 implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C3042bw0 f27251c = C3042bw0.f26958a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f27252a = new ArrayDeque(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Throwable f27253b;

    C3167cw0(C3042bw0 c3042bw0) {
    }

    public static C3167cw0 a() {
        return new C3167cw0(f27251c);
    }

    public final Closeable c(Closeable closeable) {
        this.f27252a.addFirst(closeable);
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.f27253b;
        while (true) {
            Deque deque = this.f27252a;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        AbstractC2916aw0.f26673a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
                    }
                }
            }
        }
        if (this.f27253b != null || th == null) {
            return;
        }
        AbstractC4796pt0.a(th, IOException.class);
        AbstractC4796pt0.b(th);
        throw new AssertionError(th);
    }

    public final RuntimeException h(Throwable th) throws Throwable {
        this.f27253b = th;
        AbstractC4796pt0.a(th, IOException.class);
        AbstractC4796pt0.b(th);
        throw new RuntimeException(th);
    }
}
