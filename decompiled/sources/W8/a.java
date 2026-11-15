package W8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements e, c {
    @Override // W8.c
    public final long c(V8.d descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return g();
    }

    @Override // W8.c
    public final int d(V8.d descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return e();
    }

    @Override // W8.e
    public abstract int e();

    @Override // W8.e
    public abstract long g();

    @Override // W8.c
    public final Object h(V8.d descriptor, int i10, T8.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.a().b() || r()) ? s(deserializer, obj) : f();
    }

    @Override // W8.c
    public boolean i() {
        return c.a.b(this);
    }

    @Override // W8.c
    public int j(V8.d dVar) {
        return c.a.a(this, dVar);
    }

    @Override // W8.e
    public abstract Object m(T8.a aVar);

    @Override // W8.e
    public abstract String o();

    @Override // W8.c
    public Object p(V8.d descriptor, int i10, T8.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return s(deserializer, obj);
    }

    @Override // W8.c
    public final String q(V8.d descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return o();
    }

    public Object s(T8.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return m(deserializer);
    }
}
