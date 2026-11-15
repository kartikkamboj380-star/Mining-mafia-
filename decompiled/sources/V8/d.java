package V8;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public interface d {

    public static final class a {
        public static List a(d dVar) {
            return CollectionsKt.i();
        }

        public static boolean b(d dVar) {
            return false;
        }

        public static boolean c(d dVar) {
            return false;
        }
    }

    boolean b();

    int c(String str);

    int d();

    String e(int i10);

    List f(int i10);

    d g(int i10);

    List getAnnotations();

    f getKind();

    String h();

    boolean i(int i10);

    boolean isInline();
}
