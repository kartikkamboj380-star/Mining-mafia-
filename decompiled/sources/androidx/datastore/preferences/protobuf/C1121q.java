package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1121q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C1121q f9597d = new C1121q(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f9598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9600c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f9602b;

        static {
            int[] iArr = new int[k0.b.values().length];
            f9602b = iArr;
            try {
                iArr[k0.b.f9560c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9602b[k0.b.f9561d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9602b[k0.b.f9562e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9602b[k0.b.f9563f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9602b[k0.b.f9564g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9602b[k0.b.f9565h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9602b[k0.b.f9566i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9602b[k0.b.f9567j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9602b[k0.b.f9569l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9602b[k0.b.f9570m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9602b[k0.b.f9568k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9602b[k0.b.f9571v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9602b[k0.b.f9572w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9602b[k0.b.f9555H.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9602b[k0.b.f9556I.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9602b[k0.b.f9557J.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9602b[k0.b.f9558K.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9602b[k0.b.f9554G.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[k0.c.values().length];
            f9601a = iArr2;
            try {
                iArr2[k0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9601a[k0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9601a[k0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9601a[k0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9601a[k0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9601a[k0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9601a[k0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9601a[k0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9601a[k0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$b */
    public interface b extends Comparable {
        k0.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private C1121q() {
        this.f9598a = b0.r();
    }

    static int b(k0.b bVar, int i10, Object obj) {
        int iO = AbstractC1113i.O(i10);
        if (bVar == k0.b.f9569l) {
            iO *= 2;
        }
        return iO + c(bVar, obj);
    }

    static int c(k0.b bVar, Object obj) {
        switch (a.f9602b[bVar.ordinal()]) {
            case 1:
                return AbstractC1113i.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC1113i.q(((Float) obj).floatValue());
            case 3:
                return AbstractC1113i.x(((Long) obj).longValue());
            case 4:
                return AbstractC1113i.S(((Long) obj).longValue());
            case 5:
                return AbstractC1113i.v(((Integer) obj).intValue());
            case 6:
                return AbstractC1113i.o(((Long) obj).longValue());
            case 7:
                return AbstractC1113i.m(((Integer) obj).intValue());
            case 8:
                return AbstractC1113i.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC1113i.s((J) obj);
            case 10:
                return AbstractC1113i.A((J) obj);
            case 11:
                return obj instanceof AbstractC1110f ? AbstractC1113i.g((AbstractC1110f) obj) : AbstractC1113i.N((String) obj);
            case 12:
                return obj instanceof AbstractC1110f ? AbstractC1113i.g((AbstractC1110f) obj) : AbstractC1113i.e((byte[]) obj);
            case 13:
                return AbstractC1113i.Q(((Integer) obj).intValue());
            case 14:
                return AbstractC1113i.F(((Integer) obj).intValue());
            case 15:
                return AbstractC1113i.H(((Long) obj).longValue());
            case 16:
                return AbstractC1113i.J(((Integer) obj).intValue());
            case 17:
                return AbstractC1113i.L(((Long) obj).longValue());
            case 18:
                return AbstractC1113i.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        k0.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return b(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.isPacked()) {
            int iB = 0;
            while (i10 < size) {
                iB += b(liteType, number, list.get(i10));
                i10++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i10 < size) {
            iC += c(liteType, list.get(i10));
            i10++;
        }
        return AbstractC1113i.O(number) + iC + AbstractC1113i.Q(iC);
    }

    private int g(Map.Entry entry) {
        p070h.w.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(k0.b bVar, boolean z9) {
        if (z9) {
            return 2;
        }
        return bVar.d();
    }

    private static boolean l(Map.Entry entry) {
        p070h.w.a(entry.getKey());
        throw null;
    }

    private static boolean m(k0.b bVar, Object obj) {
        AbstractC1124u.a(obj);
        switch (a.f9601a[bVar.c().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC1110f) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof J;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        p070h.w.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static C1121q r() {
        return new C1121q();
    }

    private void t(b bVar, Object obj) {
        if (!m(bVar.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.getNumber()), bVar.getLiteType().c(), obj.getClass().getName()));
        }
    }

    static void u(AbstractC1113i abstractC1113i, k0.b bVar, int i10, Object obj) {
        if (bVar == k0.b.f9569l) {
            abstractC1113i.q0(i10, (J) obj);
        } else {
            abstractC1113i.M0(i10, i(bVar, false));
            v(abstractC1113i, bVar, obj);
        }
    }

    static void v(AbstractC1113i abstractC1113i, k0.b bVar, Object obj) {
        switch (a.f9602b[bVar.ordinal()]) {
            case 1:
                abstractC1113i.h0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC1113i.p0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC1113i.x0(((Long) obj).longValue());
                break;
            case 4:
                abstractC1113i.Q0(((Long) obj).longValue());
                break;
            case 5:
                abstractC1113i.v0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC1113i.n0(((Long) obj).longValue());
                break;
            case 7:
                abstractC1113i.l0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC1113i.b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC1113i.s0((J) obj);
                break;
            case 10:
                abstractC1113i.z0((J) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC1110f)) {
                    abstractC1113i.L0((String) obj);
                } else {
                    abstractC1113i.f0((AbstractC1110f) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC1110f)) {
                    abstractC1113i.c0((byte[]) obj);
                } else {
                    abstractC1113i.f0((AbstractC1110f) obj);
                }
                break;
            case 13:
                abstractC1113i.O0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC1113i.D0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC1113i.F0(((Long) obj).longValue());
                break;
            case 16:
                abstractC1113i.H0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC1113i.J0(((Long) obj).longValue());
                break;
            case 18:
                abstractC1113i.j0(((Integer) obj).intValue());
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1121q clone() {
        C1121q c1121qR = r();
        int iL = this.f9598a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry entryK = this.f9598a.k(i10);
            p070h.w.a(entryK.getKey());
            c1121qR.s(null, entryK.getValue());
        }
        for (Map.Entry entry : this.f9598a.n()) {
            p070h.w.a(entry.getKey());
            c1121qR.s(null, entry.getValue());
        }
        c1121qR.f9600c = this.f9600c;
        return c1121qR;
    }

    Iterator e() {
        if (j()) {
            return Collections.emptyIterator();
        }
        return this.f9600c ? new C1127x(this.f9598a.i().iterator()) : this.f9598a.i().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1121q) {
            return this.f9598a.equals(((C1121q) obj).f9598a);
        }
        return false;
    }

    public int f() {
        int iL = this.f9598a.l();
        int iG = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iG += g(this.f9598a.k(i10));
        }
        Iterator it = this.f9598a.n().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public int h() {
        int iL = this.f9598a.l();
        int iD = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry entryK = this.f9598a.k(i10);
            p070h.w.a(entryK.getKey());
            iD += d(null, entryK.getValue());
        }
        for (Map.Entry entry : this.f9598a.n()) {
            p070h.w.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f9598a.hashCode();
    }

    boolean j() {
        return this.f9598a.isEmpty();
    }

    public boolean k() {
        int iL = this.f9598a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            if (!l(this.f9598a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f9598a.n().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        if (j()) {
            return Collections.emptyIterator();
        }
        return this.f9600c ? new C1127x(this.f9598a.entrySet().iterator()) : this.f9598a.entrySet().iterator();
    }

    public void o() {
        if (this.f9599b) {
            return;
        }
        int iL = this.f9598a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry entryK = this.f9598a.k(i10);
            if (entryK.getValue() instanceof AbstractC1123t) {
                ((AbstractC1123t) entryK.getValue()).z();
            }
        }
        this.f9598a.q();
        this.f9599b = true;
    }

    public void p(C1121q c1121q) {
        int iL = c1121q.f9598a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            q(c1121q.f9598a.k(i10));
        }
        Iterator it = c1121q.f9598a.n().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.isRepeated()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                t(bVar, obj2);
            }
            obj = arrayList;
        }
        this.f9598a.s(bVar, obj);
    }

    private C1121q(boolean z9) {
        this(b0.r());
        o();
    }

    private C1121q(b0 b0Var) {
        this.f9598a = b0Var;
        o();
    }
}
