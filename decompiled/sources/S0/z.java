package S0;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface z {

    public static final class a {
        public static void a(z zVar, String id, Set tags) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Iterator it = tags.iterator();
            while (it.hasNext()) {
                zVar.c(new y((String) it.next(), id));
            }
        }
    }

    List a(String str);

    void b(String str);

    void c(y yVar);

    void d(String str, Set set);
}
