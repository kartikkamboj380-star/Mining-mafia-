package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class a implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private N.d f10596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f10597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f10598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0166a f10599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f10600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f10601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final h f10602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10603h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0166a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.D f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10607d;

        b(int i10, int i11, int i12, Object obj) {
            this.f10604a = i10;
            this.f10605b = i11;
            this.f10607d = i12;
            this.f10606c = obj;
        }

        String a() {
            int i10 = this.f10604a;
            if (i10 == 1) {
                return "add";
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 != 4) {
                return i10 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f10604a;
            if (i10 != bVar.f10604a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f10607d - this.f10605b) == 1 && this.f10607d == bVar.f10605b && this.f10605b == bVar.f10607d) {
                return true;
            }
            if (this.f10607d != bVar.f10607d || this.f10605b != bVar.f10605b) {
                return false;
            }
            Object obj2 = this.f10606c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f10606c)) {
                    return false;
                }
            } else if (bVar.f10606c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f10604a * 31) + this.f10605b) * 31) + this.f10607d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f10605b + "c:" + this.f10607d + ",p:" + this.f10606c + "]";
        }
    }

    a(InterfaceC0166a interfaceC0166a) {
        this(interfaceC0166a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z9;
        byte b10;
        int i10 = bVar.f10605b;
        int i11 = bVar.f10607d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f10599d.f(i12) != null || h(i12)) {
                if (b11 == 0) {
                    k(a(2, i10, i13, null));
                    z9 = true;
                } else {
                    z9 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    v(a(2, i10, i13, null));
                    z9 = true;
                } else {
                    z9 = false;
                }
                b10 = 0;
            }
            if (z9) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f10607d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f10605b;
        int i11 = bVar.f10607d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f10599d.f(i10) != null || h(i10)) {
                if (b10 == 0) {
                    k(a(4, i13, i12, bVar.f10606c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    v(a(4, i13, i12, bVar.f10606c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f10607d) {
            Object obj = bVar.f10606c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f10598c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f10598c.get(i11);
            int i12 = bVar.f10604a;
            if (i12 == 8) {
                if (n(bVar.f10607d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f10605b;
                int i14 = bVar.f10607d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f10604a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f10605b, i11);
        int i12 = bVar.f10605b;
        int i13 = bVar.f10604a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f10607d; i15++) {
            int iZ2 = z(bVar.f10605b + (i10 * i15), bVar.f10604a);
            int i16 = bVar.f10604a;
            if (i16 == 2 ? iZ2 != iZ : !(i16 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i16, iZ, i14, bVar.f10606c);
                l(bVarA, i12);
                b(bVarA);
                if (bVar.f10604a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iZ = iZ2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f10606c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f10604a, iZ, i14, obj);
            l(bVarA2, i12);
            b(bVarA2);
        }
    }

    private void v(b bVar) {
        this.f10598c.add(bVar);
        int i10 = bVar.f10604a;
        if (i10 == 1) {
            this.f10599d.g(bVar.f10605b, bVar.f10607d);
            return;
        }
        if (i10 == 2) {
            this.f10599d.d(bVar.f10605b, bVar.f10607d);
            return;
        }
        if (i10 == 4) {
            this.f10599d.e(bVar.f10605b, bVar.f10607d, bVar.f10606c);
        } else {
            if (i10 == 8) {
                this.f10599d.a(bVar.f10605b, bVar.f10607d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f10598c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f10598c.get(size);
            int i14 = bVar.f10604a;
            if (i14 == 8) {
                int i15 = bVar.f10605b;
                int i16 = bVar.f10607d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f10605b = i15 + 1;
                            bVar.f10607d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f10605b = i15 - 1;
                            bVar.f10607d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f10607d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f10607d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f10605b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f10605b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f10605b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f10607d;
                    } else if (i14 == 2) {
                        i10 += bVar.f10607d;
                    }
                } else if (i11 == 1) {
                    bVar.f10605b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f10605b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f10598c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f10598c.get(size2);
            if (bVar2.f10604a == 8) {
                int i18 = bVar2.f10607d;
                if (i18 == bVar2.f10605b || i18 < 0) {
                    this.f10598c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f10607d <= 0) {
                this.f10598c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.h.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f10596a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f10604a = i10;
        bVar.f10605b = i11;
        bVar.f10607d = i12;
        bVar.f10606c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void b(b bVar) {
        if (this.f10601f) {
            return;
        }
        bVar.f10606c = null;
        this.f10596a.a(bVar);
    }

    public int e(int i10) {
        int size = this.f10597b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f10597b.get(i11);
            int i12 = bVar.f10604a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f10605b;
                    if (i13 <= i10) {
                        int i14 = bVar.f10607d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f10605b;
                    if (i15 == i10) {
                        i10 = bVar.f10607d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f10607d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f10605b <= i10) {
                i10 += bVar.f10607d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f10598c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f10599d.c((b) this.f10598c.get(i10));
        }
        x(this.f10598c);
        this.f10603h = 0;
    }

    void j() {
        i();
        int size = this.f10597b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f10597b.get(i10);
            int i11 = bVar.f10604a;
            if (i11 == 1) {
                this.f10599d.c(bVar);
                this.f10599d.g(bVar.f10605b, bVar.f10607d);
            } else if (i11 == 2) {
                this.f10599d.c(bVar);
                this.f10599d.h(bVar.f10605b, bVar.f10607d);
            } else if (i11 == 4) {
                this.f10599d.c(bVar);
                this.f10599d.e(bVar.f10605b, bVar.f10607d, bVar.f10606c);
            } else if (i11 == 8) {
                this.f10599d.c(bVar);
                this.f10599d.a(bVar.f10605b, bVar.f10607d);
            }
            Runnable runnable = this.f10600e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f10597b);
        this.f10603h = 0;
    }

    void l(b bVar, int i10) {
        this.f10599d.b(bVar);
        int i11 = bVar.f10604a;
        if (i11 == 2) {
            this.f10599d.h(i10, bVar.f10607d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f10599d.e(i10, bVar.f10607d, bVar.f10606c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f10598c.size();
        while (i11 < size) {
            b bVar = (b) this.f10598c.get(i11);
            int i12 = bVar.f10604a;
            if (i12 == 8) {
                int i13 = bVar.f10605b;
                if (i13 == i10) {
                    i10 = bVar.f10607d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f10607d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f10605b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f10607d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f10607d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f10603h) != 0;
    }

    boolean p() {
        return this.f10597b.size() > 0;
    }

    boolean q() {
        return (this.f10598c.isEmpty() || this.f10597b.isEmpty()) ? false : true;
    }

    boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f10597b.add(a(4, i10, i11, obj));
        this.f10603h |= 4;
        return this.f10597b.size() == 1;
    }

    boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f10597b.add(a(1, i10, i11, null));
        this.f10603h |= 1;
        return this.f10597b.size() == 1;
    }

    boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f10597b.add(a(8, i10, i11, null));
        this.f10603h |= 8;
        return this.f10597b.size() == 1;
    }

    boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f10597b.add(a(2, i10, i11, null));
        this.f10603h |= 2;
        return this.f10597b.size() == 1;
    }

    void w() {
        this.f10602g.b(this.f10597b);
        int size = this.f10597b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f10597b.get(i10);
            int i11 = bVar.f10604a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f10600e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f10597b.clear();
    }

    void x(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((b) list.get(i10));
        }
        list.clear();
    }

    void y() {
        x(this.f10597b);
        x(this.f10598c);
        this.f10603h = 0;
    }

    a(InterfaceC0166a interfaceC0166a, boolean z9) {
        this.f10596a = new Pools$SimplePool(30);
        this.f10597b = new ArrayList();
        this.f10598c = new ArrayList();
        this.f10603h = 0;
        this.f10599d = interfaceC0166a;
        this.f10601f = z9;
        this.f10602g = new h(this);
    }
}
