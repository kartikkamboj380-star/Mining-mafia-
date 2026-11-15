package J7;

import androidx.fragment.app.AbstractC1152x;
import androidx.fragment.app.ComponentCallbacksC1144o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC1152x {
    @Override // androidx.fragment.app.AbstractC1152x
    public ComponentCallbacksC1144o a(ClassLoader classLoader, String className) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(className, "className");
        if (StringsKt.J(className, "com.swmansion.rnscreens", false, 2, null)) {
            return new a();
        }
        ComponentCallbacksC1144o componentCallbacksC1144oA = super.a(classLoader, className);
        Intrinsics.c(componentCallbacksC1144oA);
        return componentCallbacksC1144oA;
    }
}
