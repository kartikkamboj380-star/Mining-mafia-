package b9;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class h implements com.google.common.util.concurrent.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.p f11651a;

    public class a implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f11652a;

        public a(h hVar, b bVar) {
            this.f11652a = bVar;
        }

        @Override // com.google.common.util.concurrent.i
        public void onFailure(Throwable th) {
            this.f11652a.a(new Exception(th), null);
        }

        @Override // com.google.common.util.concurrent.i
        public void onSuccess(Object obj) {
            this.f11652a.a(null, obj);
        }
    }

    public h(com.google.common.util.concurrent.p pVar) {
        this.f11651a = pVar;
    }

    public h a(b bVar, Executor executor) {
        com.google.common.util.concurrent.j.a(this, new a(this, bVar), executor);
        return this;
    }

    public h b(com.google.common.util.concurrent.d dVar, Executor executor) {
        return new h(com.google.common.util.concurrent.j.d(this, dVar, executor));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        return this.f11651a.cancel(z9);
    }

    @Override // com.google.common.util.concurrent.p
    public void e(Runnable runnable, Executor executor) {
        this.f11651a.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f11651a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f11651a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f11651a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f11651a.get(j10, timeUnit);
    }
}
