package I8;

import N8.AbstractC0835l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L0 extends K {
    @Override // I8.K
    public K o1(int i10, String str) {
        AbstractC0835l.a(i10);
        return AbstractC0835l.b(this, str);
    }

    public abstract L0 q1();

    protected final String r1() {
        L0 l0Q1;
        L0 l0C = C0666e0.c();
        if (this == l0C) {
            return "Dispatchers.Main";
        }
        try {
            l0Q1 = l0C.q1();
        } catch (UnsupportedOperationException unused) {
            l0Q1 = null;
        }
        if (this == l0Q1) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
