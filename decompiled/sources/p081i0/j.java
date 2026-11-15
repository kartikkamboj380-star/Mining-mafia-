package p081i0;

import androidx.fragment.app.ComponentCallbacksC1144o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentCallbacksC1144o f44993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ComponentCallbacksC1144o fragment, ComponentCallbacksC1144o targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        this.f44993b = targetFragment;
        this.f44994c = i10;
    }
}
