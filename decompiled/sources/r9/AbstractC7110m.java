package r9;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7110m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReentrantLock f48478d = g0.b();

    /* JADX INFO: renamed from: r9.m$a */
    private static final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC7110m f48479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f48480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48481c;

        public a(AbstractC7110m fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f48479a = fileHandle;
            this.f48480b = j10;
        }

        @Override // r9.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f48481c) {
                return;
            }
            this.f48481c = true;
            ReentrantLock reentrantLockN = this.f48479a.n();
            reentrantLockN.lock();
            try {
                this.f48479a.f48477c--;
                if (this.f48479a.f48477c == 0 && this.f48479a.f48476b) {
                    Unit unit = Unit.f45918a;
                    reentrantLockN.unlock();
                    this.f48479a.v();
                    return;
                }
                reentrantLockN.unlock();
            } catch (Throwable th) {
                reentrantLockN.unlock();
                throw th;
            }
        }

        @Override // r9.c0
        public d0 i() {
            return d0.f48431e;
        }

        @Override // r9.c0
        public long s(C7105h sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f48481c) {
                throw new IllegalStateException("closed");
            }
            long jG = this.f48479a.G(this.f48480b, sink, j10);
            if (jG != -1) {
                this.f48480b += jG;
            }
            return jG;
        }
    }

    public AbstractC7110m(boolean z9) {
        this.f48475a = z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long G(long j10, C7105h c7105h, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (j13 < j12) {
            X xQ1 = c7105h.q1(1);
            byte[] bArr = xQ1.f48409a;
            int i10 = xQ1.f48411c;
            int iW = w(j13, bArr, i10, (int) Math.min(j12 - j13, 8192 - i10));
            if (iW == -1) {
                if (xQ1.f48410b == xQ1.f48411c) {
                    c7105h.f48456a = xQ1.b();
                    Y.b(xQ1);
                }
                if (j10 != j13) {
                    break;
                }
                return -1L;
            }
            xQ1.f48411c += iW;
            long j14 = iW;
            j13 += j14;
            c7105h.n1(c7105h.size() + j14);
        }
        return j13 - j10;
    }

    public final c0 J(long j10) {
        ReentrantLock reentrantLock = this.f48478d;
        reentrantLock.lock();
        try {
            if (this.f48476b) {
                throw new IllegalStateException("closed");
            }
            this.f48477c++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f48478d;
        reentrantLock.lock();
        try {
            if (this.f48476b) {
                reentrantLock.unlock();
                return;
            }
            this.f48476b = true;
            if (this.f48477c != 0) {
                reentrantLock.unlock();
                return;
            }
            Unit unit = Unit.f45918a;
            reentrantLock.unlock();
            v();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ReentrantLock n() {
        return this.f48478d;
    }

    public final long size() {
        ReentrantLock reentrantLock = this.f48478d;
        reentrantLock.lock();
        try {
            if (this.f48476b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f45918a;
            reentrantLock.unlock();
            return x();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    protected abstract void v();

    protected abstract int w(long j10, byte[] bArr, int i10, int i11);

    protected abstract long x();
}
