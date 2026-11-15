package Y5;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class f extends s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f6904a;

    f(Comparator comparator) {
        this.f6904a = (Comparator) X5.j.h(comparator);
    }

    @Override // Y5.s, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f6904a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f6904a.equals(((f) obj).f6904a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6904a.hashCode();
    }

    public String toString() {
        return this.f6904a.toString();
    }
}
