package p194t3;

import kotlin.jvm.internal.Intrinsics;
import p065g4.a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements AutoCloseable {
    public c(String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        a.c(0L, sectionName);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        a.i(0L);
    }
}
