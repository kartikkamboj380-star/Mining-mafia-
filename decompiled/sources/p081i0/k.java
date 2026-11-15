package p081i0;

import androidx.fragment.app.ComponentCallbacksC1144o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f44995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ComponentCallbacksC1144o fragment, boolean z9) {
        super(fragment, "Attempting to set user visible hint to " + z9 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f44995b = z9;
    }
}
