package p081i0;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1144o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f44997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ComponentCallbacksC1144o fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        this.f44997b = container;
    }
}
