package p121m0;

import F8.c;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import kotlin.jvm.internal.Intrinsics;
import p249y8.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final T a(U.c factory, c modelClass, a extras) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                return factory.b(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.c(a.a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.a(a.a(modelClass), extras);
        }
    }
}
