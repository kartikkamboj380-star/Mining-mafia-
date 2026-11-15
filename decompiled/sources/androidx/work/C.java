package androidx.work;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11164d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f11165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S0.u f11166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f11167c;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f11168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private UUID f11170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private S0.u f11171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set f11172e;

        public a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.f11168a = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            this.f11170c = uuidRandomUUID;
            String string = this.f11170c.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.f11171d = new S0.u(string, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            this.f11172e = M.e(name2);
        }

        public final a a(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f11172e.add(tag);
            return g();
        }

        public final C b() {
            C c10 = c();
            C1188c c1188c = this.f11171d.f5402j;
            boolean z9 = c1188c.e() || c1188c.f() || c1188c.g() || c1188c.h();
            S0.u uVar = this.f11171d;
            if (uVar.f5409q) {
                if (z9) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (uVar.f5399g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            j(uuidRandomUUID);
            return c10;
        }

        public abstract C c();

        public final boolean d() {
            return this.f11169b;
        }

        public final UUID e() {
            return this.f11170c;
        }

        public final Set f() {
            return this.f11172e;
        }

        public abstract a g();

        public final S0.u h() {
            return this.f11171d;
        }

        public final a i(C1188c constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.f11171d.f5402j = constraints;
            return g();
        }

        public final a j(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f11170c = id;
            String string = id.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            this.f11171d = new S0.u(string, this.f11171d);
            return g();
        }

        public a k(long j10, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f11171d.f5399g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f11171d.f5399g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final a l(e inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f11171d.f5397e = inputData;
            return g();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C(UUID id, S0.u workSpec, Set tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f11165a = id;
        this.f11166b = workSpec;
        this.f11167c = tags;
    }

    public UUID a() {
        return this.f11165a;
    }

    public final String b() {
        String string = a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
        return string;
    }

    public final Set c() {
        return this.f11167c;
    }

    public final S0.u d() {
        return this.f11166b;
    }
}
