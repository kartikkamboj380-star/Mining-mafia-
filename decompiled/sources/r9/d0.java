package r9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f48430d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f48431e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f48433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f48434c;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public d0 a() {
        this.f48432a = false;
        return this;
    }

    public d0 b() {
        this.f48434c = 0L;
        return this;
    }

    public long c() {
        if (this.f48432a) {
            return this.f48433b;
        }
        throw new IllegalStateException("No deadline");
    }

    public d0 d(long j10) {
        this.f48432a = true;
        this.f48433b = j10;
        return this;
    }

    public boolean e() {
        return this.f48432a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f48432a && this.f48433b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public d0 g(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 >= 0) {
            this.f48434c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f48434c;
    }

    public static final class a extends d0 {
        a() {
        }

        @Override // r9.d0
        public d0 g(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }

        @Override // r9.d0
        public void f() {
        }

        @Override // r9.d0
        public d0 d(long j10) {
            return this;
        }
    }
}
