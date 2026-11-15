package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class F implements E {
    F() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        D d10 = (D) obj;
        C c10 = (C) obj2;
        int iA = 0;
        if (d10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : d10.entrySet()) {
            iA += c10.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static D j(Object obj, Object obj2) {
        D dN = (D) obj;
        D d10 = (D) obj2;
        if (!d10.isEmpty()) {
            if (!dN.k()) {
                dN = dN.n();
            }
            dN.m(d10);
        }
        return dN;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public C.a b(Object obj) {
        return ((C) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Map c(Object obj) {
        return (D) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object d(Object obj) {
        return D.f().n();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Map e(Object obj) {
        return (D) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object f(Object obj) {
        ((D) obj).l();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public boolean h(Object obj) {
        return !((D) obj).k();
    }
}
