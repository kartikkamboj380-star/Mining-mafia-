package X;

import W.C0979d;
import W.InterfaceC0980e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0980e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f6662a;

    public b(Function1 produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f6662a = produceNewData;
    }

    @Override // W.InterfaceC0980e
    public Object a(C0979d c0979d, p169q8.b bVar) {
        return this.f6662a.invoke(c0979d);
    }
}
