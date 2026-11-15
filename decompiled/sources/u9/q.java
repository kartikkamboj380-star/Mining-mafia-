package u9;

/* JADX INFO: loaded from: classes3.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f50086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o f50087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f50088c = true;

    q(Object obj, o oVar) {
        this.f50086a = obj;
        this.f50087b = oVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f50086a == qVar.f50086a && this.f50087b.equals(qVar.f50087b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f50086a.hashCode() + this.f50087b.f50073f.hashCode();
    }
}
