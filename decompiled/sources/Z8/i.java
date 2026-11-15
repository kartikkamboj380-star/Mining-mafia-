package Z8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final g a(l sb, Y8.b json) {
        Intrinsics.checkNotNullParameter(sb, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        return json.c().m() ? new h(sb, json) : new g(sb);
    }
}
