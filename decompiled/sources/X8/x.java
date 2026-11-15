package X8;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements V8.d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V8.d f6818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f6820c;

    public x(V8.d original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f6818a = original;
        this.f6819b = original.h() + '?';
        this.f6820c = n.a(original);
    }

    @Override // X8.c
    public Set a() {
        return this.f6820c;
    }

    @Override // V8.d
    public boolean b() {
        return true;
    }

    @Override // V8.d
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f6818a.c(name);
    }

    @Override // V8.d
    public int d() {
        return this.f6818a.d();
    }

    @Override // V8.d
    public String e(int i10) {
        return this.f6818a.e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.b(this.f6818a, ((x) obj).f6818a);
    }

    @Override // V8.d
    public List f(int i10) {
        return this.f6818a.f(i10);
    }

    @Override // V8.d
    public V8.d g(int i10) {
        return this.f6818a.g(i10);
    }

    @Override // V8.d
    public List getAnnotations() {
        return this.f6818a.getAnnotations();
    }

    @Override // V8.d
    public V8.f getKind() {
        return this.f6818a.getKind();
    }

    @Override // V8.d
    public String h() {
        return this.f6819b;
    }

    public int hashCode() {
        return this.f6818a.hashCode() * 31;
    }

    @Override // V8.d
    public boolean i(int i10) {
        return this.f6818a.i(i10);
    }

    @Override // V8.d
    public boolean isInline() {
        return this.f6818a.isInline();
    }

    public final V8.d j() {
        return this.f6818a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6818a);
        sb.append('?');
        return sb.toString();
    }
}
