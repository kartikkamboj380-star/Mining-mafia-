package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    @NonNull
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.p$a$a, reason: collision with other inner class name */
        public static final class C0186a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e f11411a;

            public C0186a() {
                this(e.f11252c);
            }

            public e e() {
                return this.f11411a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0186a.class != obj.getClass()) {
                    return false;
                }
                return this.f11411a.equals(((C0186a) obj).f11411a);
            }

            public int hashCode() {
                return (C0186a.class.getName().hashCode() * 31) + this.f11411a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f11411a + '}';
            }

            public C0186a(e eVar) {
                this.f11411a = eVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e f11412a;

            public c() {
                this(e.f11252c);
            }

            public e e() {
                return this.f11412a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f11412a.equals(((c) obj).f11412a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f11412a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f11412a + '}';
            }

            public c(e eVar) {
                this.f11412a = eVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0186a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(e eVar) {
            return new c(eVar);
        }
    }

    public p(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public com.google.common.util.concurrent.p getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
        cVarT.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVarT;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    @NonNull
    public final e getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    @NonNull
    public U0.b getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    @NonNull
    public D getWorkerFactory() {
        return this.mWorkerParams.l();
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final com.google.common.util.concurrent.p setForegroundAsync(@NonNull i iVar) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), iVar);
    }

    @NonNull
    public com.google.common.util.concurrent.p setProgressAsync(@NonNull e eVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), eVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract com.google.common.util.concurrent.p startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
