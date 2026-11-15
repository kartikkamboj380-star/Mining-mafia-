package p081i0;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1144o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f44992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ComponentCallbacksC1144o fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f44992b = viewGroup;
    }
}
