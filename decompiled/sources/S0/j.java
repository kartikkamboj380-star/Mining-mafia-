package S0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    public static final class a {
        public static i a(j jVar, m id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return jVar.b(id.b(), id.a());
        }

        public static void b(j jVar, m id) {
            Intrinsics.checkNotNullParameter(id, "id");
            jVar.e(id.b(), id.a());
        }
    }

    i a(m mVar);

    i b(String str, int i10);

    List c();

    void d(m mVar);

    void e(String str, int i10);

    void f(String str);

    void g(i iVar);
}
