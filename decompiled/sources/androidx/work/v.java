package androidx.work;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v extends C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f11431e = new b(null);

    public static final class a extends C.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass, long j10, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            h().k(repeatIntervalTimeUnit.toMillis(j10));
        }

        @Override // androidx.work.C.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public v c() {
            if (d() && h().f5402j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (h().f5409q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new v(this);
        }

        @Override // androidx.work.C.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a builder) {
        super(builder.e(), builder.h(), builder.f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }
}
