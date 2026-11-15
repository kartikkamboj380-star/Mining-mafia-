package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7031a implements InterfaceC7039i, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C7031a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i11 & 1) == 1;
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7031a)) {
            return false;
        }
        C7031a c7031a = (C7031a) obj;
        return this.isTopLevel == c7031a.isTopLevel && this.arity == c7031a.arity && this.flags == c7031a.flags && Intrinsics.b(this.receiver, c7031a.receiver) && Intrinsics.b(this.owner, c7031a.owner) && this.name.equals(c7031a.name) && this.signature.equals(c7031a.signature);
    }

    @Override // kotlin.jvm.internal.InterfaceC7039i
    public int getArity() {
        return this.arity;
    }

    public F8.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? F.c(cls) : F.b(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return F.i(this);
    }
}
