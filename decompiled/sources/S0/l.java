package S0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final i a(m generationalId, int i10) {
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        return new i(generationalId.b(), generationalId.a(), i10);
    }
}
