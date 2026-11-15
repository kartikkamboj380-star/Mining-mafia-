package p215v4;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p245y4.a f50133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f50134b = new HashMap();

        public a a(p125m4.f fVar, b bVar) {
            this.f50134b.put(fVar, bVar);
            return this;
        }

        public f b() {
            if (this.f50133a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f50134b.keySet().size() < p125m4.f.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f50134b;
            this.f50134b = new HashMap();
            return f.d(this.f50133a, map);
        }

        public a c(p245y4.a aVar) {
            this.f50133a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new v4.c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11))));
    }

    public static a b() {
        return new a();
    }

    static f d(p245y4.a aVar, Map map) {
        return new p215v4.b(aVar, map);
    }

    public static f f(p245y4.a aVar) {
        return b().a(p125m4.f.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(p125m4.f.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(p125m4.f.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, p125m4.f fVar, long j10, int i10) {
        builder.setMinimumLatency(g(fVar, j10, i10));
        j(builder, ((b) h().get(fVar)).c());
        return builder;
    }

    abstract p245y4.a e();

    public long g(p125m4.f fVar, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = (b) h().get(fVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    abstract Map h();
}
