package X8;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements V8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V8.d f6791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V8.d f6792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6793d;

    public /* synthetic */ k(String str, V8.d dVar, V8.d dVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dVar, dVar2);
    }

    @Override // V8.d
    public boolean b() {
        return V8.d.a.c(this);
    }

    @Override // V8.d
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // V8.d
    public int d() {
        return this.f6793d;
    }

    @Override // V8.d
    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.b(h(), kVar.h()) && Intrinsics.b(this.f6791b, kVar.f6791b) && Intrinsics.b(this.f6792c, kVar.f6792c);
    }

    @Override // V8.d
    public List f(int i10) {
        if (i10 >= 0) {
            return CollectionsKt.i();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // V8.d
    public V8.d g(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f6791b;
            }
            if (i11 == 1) {
                return this.f6792c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // V8.d
    public List getAnnotations() {
        return V8.d.a.a(this);
    }

    @Override // V8.d
    public V8.f getKind() {
        return V8.g.c.f6154a;
    }

    @Override // V8.d
    public String h() {
        return this.f6790a;
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + this.f6791b.hashCode()) * 31) + this.f6792c.hashCode();
    }

    @Override // V8.d
    public boolean i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // V8.d
    public boolean isInline() {
        return V8.d.a.b(this);
    }

    public String toString() {
        return h() + '(' + this.f6791b + ", " + this.f6792c + ')';
    }

    private k(String str, V8.d dVar, V8.d dVar2) {
        this.f6790a = str;
        this.f6791b = dVar;
        this.f6792c = dVar2;
        this.f6793d = 2;
    }
}
