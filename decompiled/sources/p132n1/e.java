package p132n1;

import kotlin.jvm.internal.Intrinsics;
import p012b1.n;

/* JADX INFO: loaded from: classes.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f46551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f46552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f46553c;

    public e(n nVar, f fVar, Throwable th) {
        this.f46551a = nVar;
        this.f46552b = fVar;
        this.f46553c = th;
    }

    public n a() {
        return this.f46551a;
    }

    @Override // p132n1.j
    public f b() {
        return this.f46552b;
    }

    public final Throwable c() {
        return this.f46553c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.b(this.f46551a, eVar.f46551a) && Intrinsics.b(this.f46552b, eVar.f46552b) && Intrinsics.b(this.f46553c, eVar.f46553c);
    }

    public int hashCode() {
        n nVar = this.f46551a;
        return ((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.f46552b.hashCode()) * 31) + this.f46553c.hashCode();
    }

    public String toString() {
        return "ErrorResult(image=" + this.f46551a + ", request=" + this.f46552b + ", throwable=" + this.f46553c + ')';
    }
}
