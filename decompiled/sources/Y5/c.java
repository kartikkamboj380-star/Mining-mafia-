package Y5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class c extends s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final X5.c f6902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final s f6903b;

    c(X5.c cVar, s sVar) {
        this.f6902a = (X5.c) X5.j.h(cVar);
        this.f6903b = (s) X5.j.h(sVar);
    }

    @Override // Y5.s, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f6903b.compare(this.f6902a.apply(obj), this.f6902a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f6902a.equals(cVar.f6902a) && this.f6903b.equals(cVar.f6903b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return X5.f.b(this.f6902a, this.f6903b);
    }

    public String toString() {
        return this.f6903b + ".onResultOf(" + this.f6902a + ")";
    }
}
