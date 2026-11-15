package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1112h implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1111g f9509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9512d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9513a;

        static {
            int[] iArr = new int[k0.b.values().length];
            f9513a = iArr;
            try {
                iArr[k0.b.f9567j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9513a[k0.b.f9571v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9513a[k0.b.f9560c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9513a[k0.b.f9554G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9513a[k0.b.f9566i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9513a[k0.b.f9565h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9513a[k0.b.f9561d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9513a[k0.b.f9564g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9513a[k0.b.f9562e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9513a[k0.b.f9570m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9513a[k0.b.f9555H.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9513a[k0.b.f9556I.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9513a[k0.b.f9557J.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9513a[k0.b.f9558K.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9513a[k0.b.f9568k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9513a[k0.b.f9572w.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9513a[k0.b.f9563f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C1112h(AbstractC1111g abstractC1111g) {
        AbstractC1111g abstractC1111g2 = (AbstractC1111g) AbstractC1124u.b(abstractC1111g, "input");
        this.f9509a = abstractC1111g2;
        abstractC1111g2.f9484d = this;
    }

    public static C1112h O(AbstractC1111g abstractC1111g) {
        C1112h c1112h = abstractC1111g.f9484d;
        return c1112h != null ? c1112h : new C1112h(abstractC1111g);
    }

    private void P(Object obj, Y y9, C1117m c1117m) {
        int i10 = this.f9511c;
        this.f9511c = k0.c(k0.a(this.f9510b), 4);
        try {
            y9.h(obj, this, c1117m);
            if (this.f9510b != this.f9511c) {
                throw C1125v.h();
            }
            this.f9511c = i10;
        } catch (Throwable th) {
            this.f9511c = i10;
            throw th;
        }
    }

    private void Q(Object obj, Y y9, C1117m c1117m) throws C1125v {
        int iD = this.f9509a.D();
        AbstractC1111g abstractC1111g = this.f9509a;
        if (abstractC1111g.f9481a >= abstractC1111g.f9482b) {
            throw C1125v.i();
        }
        int iM = abstractC1111g.m(iD);
        this.f9509a.f9481a++;
        y9.h(obj, this, c1117m);
        this.f9509a.a(0);
        AbstractC1111g abstractC1111g2 = this.f9509a;
        abstractC1111g2.f9481a--;
        abstractC1111g2.l(iM);
    }

    private Object R(k0.b bVar, Class cls, C1117m c1117m) {
        switch (a.f9513a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(d());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(j());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(a());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(H());
            case 10:
                return U(cls, c1117m);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(e());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(g());
            case 17:
                return Long.valueOf(s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private Object S(Y y9, C1117m c1117m) {
        Object objE = y9.e();
        P(objE, y9, c1117m);
        y9.b(objE);
        return objE;
    }

    private Object T(Y y9, C1117m c1117m) throws C1125v {
        Object objE = y9.e();
        Q(objE, y9, c1117m);
        y9.b(objE);
        return objE;
    }

    private void W(int i10) throws C1125v {
        if (this.f9509a.e() != i10) {
            throw C1125v.m();
        }
    }

    private void X(int i10) throws C1125v.a {
        if (k0.b(this.f9510b) != i10) {
            throw C1125v.e();
        }
    }

    private void Y(int i10) throws C1125v {
        if ((i10 & 3) != 0) {
            throw C1125v.h();
        }
    }

    private void Z(int i10) throws C1125v {
        if ((i10 & 7) != 0) {
            throw C1125v.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int A() {
        int i10 = this.f9512d;
        if (i10 != 0) {
            this.f9510b = i10;
            this.f9512d = 0;
        } else {
            this.f9510b = this.f9509a.C();
        }
        int i11 = this.f9510b;
        return (i11 == 0 || i11 == this.f9511c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : k0.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void B(List list) throws C1125v.a {
        V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void C(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 2) {
            int iD = this.f9509a.D();
            Y(iD);
            int iE = this.f9509a.e() + iD;
            do {
                list.add(Float.valueOf(this.f9509a.t()));
            } while (this.f9509a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C1125v.e();
        }
        do {
            list.add(Float.valueOf(this.f9509a.t()));
            if (this.f9509a.f()) {
                return;
            } else {
                iC = this.f9509a.C();
            }
        } while (iC == this.f9510b);
        this.f9512d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public boolean D() {
        int i10;
        if (this.f9509a.f() || (i10 = this.f9510b) == this.f9511c) {
            return false;
        }
        return this.f9509a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int E() throws C1125v.a {
        X(5);
        return this.f9509a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void F(List list) throws C1125v.a {
        int iC;
        if (k0.b(this.f9510b) != 2) {
            throw C1125v.e();
        }
        do {
            list.add(o());
            if (this.f9509a.f()) {
                return;
            } else {
                iC = this.f9509a.C();
            }
        } while (iC == this.f9510b);
        this.f9512d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void G(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 1) {
            do {
                list.add(Double.valueOf(this.f9509a.p()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iD = this.f9509a.D();
        Z(iD);
        int iE = this.f9509a.e() + iD;
        do {
            list.add(Double.valueOf(this.f9509a.p()));
        } while (this.f9509a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long H() throws C1125v.a {
        X(0);
        return this.f9509a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public String I() throws C1125v.a {
        X(2);
        return this.f9509a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void J(Object obj, Y y9, C1117m c1117m) throws C1125v {
        X(2);
        Q(obj, y9, c1117m);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void K(List list, Y y9, C1117m c1117m) throws C1125v.a {
        int iC;
        if (k0.b(this.f9510b) != 2) {
            throw C1125v.e();
        }
        int i10 = this.f9510b;
        do {
            list.add(T(y9, c1117m));
            if (this.f9509a.f() || this.f9512d != 0) {
                return;
            } else {
                iC = this.f9509a.C();
            }
        } while (iC == i10);
        this.f9512d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void L(Map map, C.a aVar, C1117m c1117m) throws C1125v.a {
        X(2);
        int iM = this.f9509a.m(this.f9509a.D());
        Object objR = aVar.f9393b;
        Object objR2 = aVar.f9395d;
        while (true) {
            try {
                int iA = A();
                if (iA == Integer.MAX_VALUE || this.f9509a.f()) {
                    break;
                }
                if (iA == 1) {
                    objR = R(aVar.f9392a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!D()) {
                            throw new C1125v("Unable to parse map entry.");
                        }
                    } catch (C1125v.a unused) {
                        if (!D()) {
                            throw new C1125v("Unable to parse map entry.");
                        }
                    }
                } else {
                    objR2 = R(aVar.f9394c, aVar.f9395d.getClass(), c1117m);
                }
            } catch (Throwable th) {
                this.f9509a.l(iM);
                throw th;
            }
        }
        map.put(objR, objR2);
        this.f9509a.l(iM);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void M(Object obj, Y y9, C1117m c1117m) throws C1125v.a {
        X(3);
        P(obj, y9, c1117m);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void N(List list, Y y9, C1117m c1117m) throws C1125v.a {
        int iC;
        if (k0.b(this.f9510b) != 3) {
            throw C1125v.e();
        }
        int i10 = this.f9510b;
        do {
            list.add(S(y9, c1117m));
            if (this.f9509a.f() || this.f9512d != 0) {
                return;
            } else {
                iC = this.f9509a.C();
            }
        } while (iC == i10);
        this.f9512d = iC;
    }

    public Object U(Class cls, C1117m c1117m) throws C1125v.a {
        X(2);
        return T(U.a().c(cls), c1117m);
    }

    public void V(List list, boolean z9) throws C1125v.a {
        int iC;
        if (k0.b(this.f9510b) != 2) {
            throw C1125v.e();
        }
        do {
            list.add(z9 ? I() : z());
            if (this.f9509a.f()) {
                return;
            } else {
                iC = this.f9509a.C();
            }
        } while (iC == this.f9510b);
        this.f9512d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long a() throws C1125v.a {
        X(1);
        return this.f9509a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void b(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 2) {
            int iD = this.f9509a.D();
            Y(iD);
            int iE = this.f9509a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f9509a.w()));
            } while (this.f9509a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C1125v.e();
        }
        do {
            list.add(Integer.valueOf(this.f9509a.w()));
            if (this.f9509a.f()) {
                return;
            } else {
                iC = this.f9509a.C();
            }
        } while (iC == this.f9510b);
        this.f9512d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void c(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f9509a.z()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iE = this.f9509a.e() + this.f9509a.D();
        do {
            list.add(Long.valueOf(this.f9509a.z()));
        } while (this.f9509a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public boolean d() throws C1125v.a {
        X(0);
        return this.f9509a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long e() throws C1125v.a {
        X(1);
        return this.f9509a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void f(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f9509a.E()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iE = this.f9509a.e() + this.f9509a.D();
        do {
            list.add(Long.valueOf(this.f9509a.E()));
        } while (this.f9509a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int g() throws C1125v.a {
        X(0);
        return this.f9509a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void h(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f9509a.v()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iE = this.f9509a.e() + this.f9509a.D();
        do {
            list.add(Long.valueOf(this.f9509a.v()));
        } while (this.f9509a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void i(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f9509a.q()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iE = this.f9509a.e() + this.f9509a.D();
        do {
            list.add(Integer.valueOf(this.f9509a.q()));
        } while (this.f9509a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int j() throws C1125v.a {
        X(0);
        return this.f9509a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int k() {
        return this.f9510b;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int l() throws C1125v.a {
        X(0);
        return this.f9509a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void m(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 0) {
            do {
                list.add(Boolean.valueOf(this.f9509a.n()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iE = this.f9509a.e() + this.f9509a.D();
        do {
            list.add(Boolean.valueOf(this.f9509a.n()));
        } while (this.f9509a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void n(List list) throws C1125v.a {
        V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public AbstractC1110f o() throws C1125v.a {
        X(2);
        return this.f9509a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int p() throws C1125v.a {
        X(0);
        return this.f9509a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void q(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f9509a.s()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iD = this.f9509a.D();
        Z(iD);
        int iE = this.f9509a.e() + iD;
        do {
            list.add(Long.valueOf(this.f9509a.s()));
        } while (this.f9509a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void r(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f9509a.y()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iE = this.f9509a.e() + this.f9509a.D();
        do {
            list.add(Integer.valueOf(this.f9509a.y()));
        } while (this.f9509a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public double readDouble() throws C1125v.a {
        X(1);
        return this.f9509a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public float readFloat() throws C1125v.a {
        X(5);
        return this.f9509a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long s() throws C1125v.a {
        X(0);
        return this.f9509a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void t(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f9509a.D()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iE = this.f9509a.e() + this.f9509a.D();
        do {
            list.add(Integer.valueOf(this.f9509a.D()));
        } while (this.f9509a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int u() throws C1125v.a {
        X(5);
        return this.f9509a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void v(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f9509a.x()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iD = this.f9509a.D();
        Z(iD);
        int iE = this.f9509a.e() + iD;
        do {
            list.add(Long.valueOf(this.f9509a.x()));
        } while (this.f9509a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void w(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f9509a.u()));
                if (this.f9509a.f()) {
                    return;
                } else {
                    iC = this.f9509a.C();
                }
            } while (iC == this.f9510b);
            this.f9512d = iC;
            return;
        }
        if (iB != 2) {
            throw C1125v.e();
        }
        int iE = this.f9509a.e() + this.f9509a.D();
        do {
            list.add(Integer.valueOf(this.f9509a.u()));
        } while (this.f9509a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void x(List list) throws C1125v {
        int iC;
        int iB = k0.b(this.f9510b);
        if (iB == 2) {
            int iD = this.f9509a.D();
            Y(iD);
            int iE = this.f9509a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f9509a.r()));
            } while (this.f9509a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C1125v.e();
        }
        do {
            list.add(Integer.valueOf(this.f9509a.r()));
            if (this.f9509a.f()) {
                return;
            } else {
                iC = this.f9509a.C();
            }
        } while (iC == this.f9510b);
        this.f9512d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long y() throws C1125v.a {
        X(0);
        return this.f9509a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public String z() throws C1125v.a {
        X(2);
        return this.f9509a.A();
    }
}
