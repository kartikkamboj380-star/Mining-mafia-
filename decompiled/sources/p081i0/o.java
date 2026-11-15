package p081i0;

import androidx.fragment.app.ComponentCallbacksC1144o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentCallbacksC1144o f44998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ComponentCallbacksC1144o fragment, ComponentCallbacksC1144o expectedParentFragment, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i10 + " without using parent's childFragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        this.f44998b = expectedParentFragment;
        this.f44999c = i10;
    }
}
