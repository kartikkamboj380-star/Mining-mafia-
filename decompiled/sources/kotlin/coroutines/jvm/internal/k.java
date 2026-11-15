package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.F;
import kotlin.jvm.internal.InterfaceC7039i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends j implements InterfaceC7039i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45964a;

    public k(int i10, p169q8.b bVar) {
        super(bVar);
        this.f45964a = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC7039i
    public int getArity() {
        return this.f45964a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strI = F.i(this);
        Intrinsics.checkNotNullExpressionValue(strI, "renderLambdaToString(...)");
        return strI;
    }
}
