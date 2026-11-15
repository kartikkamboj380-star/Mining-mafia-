package p057f6;

import G6.a;
import G6.b;
import java.util.Set;

/* JADX INFO: renamed from: f6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6983d {
    default Object a(Class cls) {
        return e(E.b(cls));
    }

    a b(E e10);

    default Set c(Class cls) {
        return h(E.b(cls));
    }

    b d(E e10);

    default Object e(E e10) {
        b bVarG = g(e10);
        if (bVarG == null) {
            return null;
        }
        return bVarG.get();
    }

    default b f(Class cls) {
        return g(E.b(cls));
    }

    b g(E e10);

    default Set h(E e10) {
        return (Set) d(e10).get();
    }

    default a i(Class cls) {
        return b(E.b(cls));
    }
}
