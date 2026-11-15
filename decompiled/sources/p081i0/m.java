package p081i0;

import androidx.fragment.app.ComponentCallbacksC1144o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentCallbacksC1144o f44996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ComponentCallbacksC1144o fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f44996a = fragment;
    }

    public final ComponentCallbacksC1144o a() {
        return this.f44996a;
    }
}
