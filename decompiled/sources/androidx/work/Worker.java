package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f11181a;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f11181a.p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f11181a.q(th);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f11183a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f11183a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11183a.p(Worker.this.getForegroundInfo());
            } catch (Throwable th) {
                this.f11183a.q(th);
            }
        }
    }

    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract p.a doWork();

    @NonNull
    public i getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.p
    @NonNull
    public com.google.common.util.concurrent.p getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
        getBackgroundExecutor().execute(new b(cVarT));
        return cVarT;
    }

    @Override // androidx.work.p
    @NonNull
    public final com.google.common.util.concurrent.p startWork() {
        this.f11181a = androidx.work.impl.utils.futures.c.t();
        getBackgroundExecutor().execute(new a());
        return this.f11181a;
    }
}
