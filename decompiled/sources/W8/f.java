package W8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface f {
    d a(V8.d dVar);

    void c(double d10);

    void e(T8.e eVar, Object obj);

    void h(long j10);

    void i();

    void j(boolean z9);

    void k();

    void o(int i10);

    d p(V8.d dVar, int i10);

    void r(String str);

    public static final class a {
        public static d a(f fVar, V8.d descriptor, int i10) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return fVar.a(descriptor);
        }

        public static void c(f fVar, T8.e serializer, Object obj) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.a().b()) {
                fVar.e(serializer, obj);
            } else if (obj == null) {
                fVar.i();
            } else {
                fVar.k();
                fVar.e(serializer, obj);
            }
        }

        public static void b(f fVar) {
        }
    }
}
