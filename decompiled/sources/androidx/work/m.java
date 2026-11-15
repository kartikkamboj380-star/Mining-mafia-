package androidx.work;

import I8.B0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m implements com.google.common.util.concurrent.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B0 f11405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f11406b;

    static final class a extends kotlin.jvm.internal.m implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f45918a;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                if (!m.this.f11406b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                if (th instanceof CancellationException) {
                    m.this.f11406b.cancel(true);
                    return;
                }
                androidx.work.impl.utils.futures.c cVar = m.this.f11406b;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                cVar.q(th);
            }
        }
    }

    public m(B0 job, androidx.work.impl.utils.futures.c underlying) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f11405a = job;
        this.f11406b = underlying;
        job.Q(new a());
    }

    public final void b(Object obj) {
        this.f11406b.p(obj);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        return this.f11406b.cancel(z9);
    }

    @Override // com.google.common.util.concurrent.p
    public void e(Runnable runnable, Executor executor) {
        this.f11406b.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f11406b.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f11406b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f11406b.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f11406b.get(j10, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m(B0 b10, androidx.work.impl.utils.futures.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            cVar = androidx.work.impl.utils.futures.c.t();
            Intrinsics.checkNotNullExpressionValue(cVar, "create()");
        }
        this(b10, cVar);
    }
}
