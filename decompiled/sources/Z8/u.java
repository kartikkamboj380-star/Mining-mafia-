package Z8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static final void a(Y8.b json, l writer, T8.e serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new y(writer, json, D.OBJ, new Y8.e[D.d().size()]).e(serializer, obj);
    }
}
