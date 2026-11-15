package p081i0;

import androidx.fragment.app.ComponentCallbacksC1144o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ComponentCallbacksC1144o fragment) {
        super(fragment, "Attempting to set retain instance for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }
}
