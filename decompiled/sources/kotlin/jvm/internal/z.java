package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z extends AbstractC7034d implements F8.i {
    private final boolean syntheticJavaProperty;

    public z() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.AbstractC7034d
    public F8.b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return getOwner().equals(zVar.getOwner()) && getName().equals(zVar.getName()) && getSignature().equals(zVar.getSignature()) && Intrinsics.b(getBoundReceiver(), zVar.getBoundReceiver());
        }
        if (obj instanceof F8.i) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // F8.i
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // F8.i
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        F8.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC7034d
    public F8.i getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (F8.i) super.getReflected();
    }

    public z(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }
}
