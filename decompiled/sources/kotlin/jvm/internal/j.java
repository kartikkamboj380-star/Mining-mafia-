package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends AbstractC7034d implements InterfaceC7039i, F8.e {
    private final int arity;
    private final int flags;

    public j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC7034d
    protected F8.b computeReflected() {
        return F.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && this.flags == jVar.flags && this.arity == jVar.arity && Intrinsics.b(getBoundReceiver(), jVar.getBoundReceiver()) && Intrinsics.b(getOwner(), jVar.getOwner());
        }
        if (obj instanceof F8.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7039i
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // F8.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // F8.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // F8.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // F8.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC7034d, F8.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        F8.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC7034d
    public F8.e getReflected() {
        return (F8.e) super.getReflected();
    }
}
