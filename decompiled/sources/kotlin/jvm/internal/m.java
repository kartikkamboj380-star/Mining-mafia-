package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements InterfaceC7039i, Serializable {
    private final int arity;

    public m(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC7039i
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String strJ = F.j(this);
        Intrinsics.checkNotNullExpressionValue(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
