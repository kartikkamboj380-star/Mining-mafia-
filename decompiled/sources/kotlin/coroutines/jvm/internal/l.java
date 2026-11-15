package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.F;
import kotlin.jvm.internal.InterfaceC7039i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends d implements InterfaceC7039i {
    private final int arity;

    public l(int i10, p169q8.b bVar) {
        super(bVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC7039i
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strI = F.i(this);
        Intrinsics.checkNotNullExpressionValue(strI, "renderLambdaToString(...)");
        return strI;
    }
}
