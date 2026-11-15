package p129m8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public static final Object a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new m.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof m.b) {
            throw ((m.b) obj).f46452a;
        }
    }
}
