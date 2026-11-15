package G7;

import com.facebook.react.uimanager.EnumC1358g0;
import com.facebook.react.uimanager.InterfaceC1376p0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements InterfaceC1376p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f1041a;

    public g(f fVar) {
        this.f1041a = fVar;
    }

    public final void a(f fVar) {
        this.f1041a = fVar;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376p0
    public EnumC1358g0 getPointerEvents() {
        EnumC1358g0 pointerEvents;
        f fVar = this.f1041a;
        return (fVar == null || (pointerEvents = fVar.getPointerEvents()) == null) ? EnumC1358g0.NONE : pointerEvents;
    }
}
