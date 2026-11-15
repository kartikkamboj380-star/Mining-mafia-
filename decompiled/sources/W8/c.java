package W8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a {
        public static int a(c cVar, V8.d descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, V8.d dVar, int i10, T8.a aVar, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return cVar.p(dVar, i10, aVar, obj);
        }
    }

    void b(V8.d dVar);

    long c(V8.d dVar, int i10);

    int d(V8.d dVar, int i10);

    Object h(V8.d dVar, int i10, T8.a aVar, Object obj);

    boolean i();

    int j(V8.d dVar);

    int n(V8.d dVar);

    Object p(V8.d dVar, int i10, T8.a aVar, Object obj);

    String q(V8.d dVar, int i10);
}
