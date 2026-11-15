package W8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements f, d {
    @Override // W8.d
    public void d(V8.d descriptor, int i10, T8.e serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (s(descriptor, i10)) {
            e(serializer, obj);
        }
    }

    @Override // W8.f
    public abstract void e(T8.e eVar, Object obj);

    @Override // W8.d
    public final void g(V8.d descriptor, int i10, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (s(descriptor, i10)) {
            r(value);
        }
    }

    @Override // W8.f
    public abstract void h(long j10);

    @Override // W8.f
    public void k() {
        f.a.b(this);
    }

    @Override // W8.d
    public final void l(V8.d descriptor, int i10, long j10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (s(descriptor, i10)) {
            h(j10);
        }
    }

    @Override // W8.d
    public final void m(V8.d descriptor, int i10, int i11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (s(descriptor, i10)) {
            o(i11);
        }
    }

    @Override // W8.f
    public abstract void o(int i10);

    @Override // W8.f
    public d p(V8.d dVar, int i10) {
        return f.a.a(this, dVar, i10);
    }

    @Override // W8.d
    public void q(V8.d descriptor, int i10, T8.e serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (s(descriptor, i10)) {
            t(serializer, obj);
        }
    }

    @Override // W8.f
    public abstract void r(String str);

    public abstract boolean s(V8.d dVar, int i10);

    public void t(T8.e eVar, Object obj) {
        f.a.c(this, eVar, obj);
    }
}
