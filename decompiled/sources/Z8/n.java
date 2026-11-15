package Z8;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X8.e f7200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7201b;

    /* synthetic */ class a extends kotlin.jvm.internal.k implements Function2 {
        a(Object obj) {
            super(2, obj, n.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean b(V8.d p10, int i10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return Boolean.valueOf(((n) this.receiver).e(p10, i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((V8.d) obj, ((Number) obj2).intValue());
        }
    }

    public n(V8.d descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f7200a = new X8.e(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(V8.d dVar, int i10) {
        boolean z9 = !dVar.i(i10) && dVar.g(i10).b();
        this.f7201b = z9;
        return z9;
    }

    public final boolean b() {
        return this.f7201b;
    }

    public final void c(int i10) {
        this.f7200a.a(i10);
    }

    public final int d() {
        return this.f7200a.d();
    }
}
