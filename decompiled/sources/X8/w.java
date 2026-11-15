package X8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements V8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V8.c f6817b;

    public w(String serialName, V8.c kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f6816a = serialName;
        this.f6817b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // V8.d
    public boolean b() {
        return V8.d.a.c(this);
    }

    @Override // V8.d
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        a();
        throw new p129m8.d();
    }

    @Override // V8.d
    public int d() {
        return 0;
    }

    @Override // V8.d
    public String e(int i10) {
        a();
        throw new p129m8.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.b(h(), wVar.h()) && Intrinsics.b(getKind(), wVar.getKind());
    }

    @Override // V8.d
    public List f(int i10) {
        a();
        throw new p129m8.d();
    }

    @Override // V8.d
    public V8.d g(int i10) {
        a();
        throw new p129m8.d();
    }

    @Override // V8.d
    public List getAnnotations() {
        return V8.d.a.a(this);
    }

    @Override // V8.d
    public String h() {
        return this.f6816a;
    }

    public int hashCode() {
        return h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // V8.d
    public boolean i(int i10) {
        a();
        throw new p129m8.d();
    }

    @Override // V8.d
    public boolean isInline() {
        return V8.d.a.b(this);
    }

    @Override // V8.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public V8.c getKind() {
        return this.f6817b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + h() + ')';
    }
}
