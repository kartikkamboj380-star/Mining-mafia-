package androidx.work;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s extends C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f11424e = new b(null);

    public static final class a extends C.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            h().f5396d = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.C.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public s c() {
            if (d() && h().f5402j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new s(this);
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

        public final s a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return (s) new a(workerClass).b();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a builder) {
        super(builder.e(), builder.h(), builder.f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    public static final s e(Class cls) {
        return f11424e.a(cls);
    }
}
