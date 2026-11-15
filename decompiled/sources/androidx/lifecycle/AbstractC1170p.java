package androidx.lifecycle;

import I8.C0666e0;
import I8.W0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1170p {
    public static final AbstractC1165k a(AbstractC1164j abstractC1164j) {
        C1166l c1166l;
        Intrinsics.checkNotNullParameter(abstractC1164j, "<this>");
        do {
            C1166l c1166l2 = (C1166l) abstractC1164j.c().get();
            if (c1166l2 != null) {
                return c1166l2;
            }
            c1166l = new C1166l(abstractC1164j, W0.b(null, 1, null).plus(C0666e0.c().q1()));
        } while (!AbstractC1169o.a(abstractC1164j.c(), null, c1166l));
        c1166l.b();
        return c1166l;
    }
}
