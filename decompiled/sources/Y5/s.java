package Y5;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s implements Comparator {
    protected s() {
    }

    public static s a(Comparator comparator) {
        return comparator instanceof s ? (s) comparator : new f(comparator);
    }

    public s b(X5.c cVar) {
        return new c(cVar, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
