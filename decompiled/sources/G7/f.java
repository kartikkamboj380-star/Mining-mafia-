package G7;

import com.facebook.react.uimanager.EnumC1358g0;
import com.facebook.react.uimanager.InterfaceC1376p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements InterfaceC1376p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f1040a;

    public f(b dimmingView) {
        Intrinsics.checkNotNullParameter(dimmingView, "dimmingView");
        this.f1040a = dimmingView;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376p0
    public EnumC1358g0 getPointerEvents() {
        return this.f1040a.getBlockGestures$react_native_screens_release() ? EnumC1358g0.AUTO : EnumC1358g0.NONE;
    }
}
