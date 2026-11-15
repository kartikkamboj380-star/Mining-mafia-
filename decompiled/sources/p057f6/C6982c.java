package p057f6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: f6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6982c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f43679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f43680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f43681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f43682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f43683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f43684g;

    public static /* synthetic */ Object a(Object obj, InterfaceC6983d interfaceC6983d) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC6983d interfaceC6983d) {
        return obj;
    }

    public static b c(E e10) {
        return new b(e10, new E[0]);
    }

    public static b d(E e10, E... eArr) {
        return new b(e10, eArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static C6982c l(final Object obj, Class cls) {
        return m(cls).f(new g() { // from class: f6.a
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return C6982c.b(obj, interfaceC6983d);
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C6982c q(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new g() { // from class: f6.b
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return C6982c.a(obj, interfaceC6983d);
            }
        }).d();
    }

    public Set g() {
        return this.f43680c;
    }

    public g h() {
        return this.f43683f;
    }

    public String i() {
        return this.f43678a;
    }

    public Set j() {
        return this.f43679b;
    }

    public Set k() {
        return this.f43684g;
    }

    public boolean n() {
        return this.f43681d == 1;
    }

    public boolean o() {
        return this.f43681d == 2;
    }

    public boolean p() {
        return this.f43682e == 0;
    }

    public C6982c r(g gVar) {
        return new C6982c(this.f43678a, this.f43679b, this.f43680c, this.f43681d, this.f43682e, gVar, this.f43684g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f43679b.toArray()) + ">{" + this.f43681d + ", type=" + this.f43682e + ", deps=" + Arrays.toString(this.f43680c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: f6.c$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f43686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f43687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f43688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f43689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g f43690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set f43691g;

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.f43689e = 1;
            return this;
        }

        private b i(int i10) {
            D.d(this.f43688d == 0, "Instantiation type has already been set.");
            this.f43688d = i10;
            return this;
        }

        private void j(E e10) {
            D.a(!this.f43686b.contains(e10), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(q qVar) {
            D.c(qVar, "Null dependency");
            j(qVar.c());
            this.f43687c.add(qVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C6982c d() {
            D.d(this.f43690f != null, "Missing required property: factory.");
            return new C6982c(this.f43685a, new HashSet(this.f43686b), new HashSet(this.f43687c), this.f43688d, this.f43689e, this.f43690f, this.f43691g);
        }

        public b e() {
            return i(2);
        }

        public b f(g gVar) {
            this.f43690f = (g) D.c(gVar, "Null factory");
            return this;
        }

        public b h(String str) {
            this.f43685a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f43685a = null;
            HashSet hashSet = new HashSet();
            this.f43686b = hashSet;
            this.f43687c = new HashSet();
            this.f43688d = 0;
            this.f43689e = 0;
            this.f43691g = new HashSet();
            D.c(cls, "Null interface");
            hashSet.add(E.b(cls));
            for (Class cls2 : clsArr) {
                D.c(cls2, "Null interface");
                this.f43686b.add(E.b(cls2));
            }
        }

        private b(E e10, E... eArr) {
            this.f43685a = null;
            HashSet hashSet = new HashSet();
            this.f43686b = hashSet;
            this.f43687c = new HashSet();
            this.f43688d = 0;
            this.f43689e = 0;
            this.f43691g = new HashSet();
            D.c(e10, "Null interface");
            hashSet.add(e10);
            for (E e11 : eArr) {
                D.c(e11, "Null interface");
            }
            Collections.addAll(this.f43686b, eArr);
        }
    }

    private C6982c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f43678a = str;
        this.f43679b = Collections.unmodifiableSet(set);
        this.f43680c = Collections.unmodifiableSet(set2);
        this.f43681d = i10;
        this.f43682e = i11;
        this.f43683f = gVar;
        this.f43684g = Collections.unmodifiableSet(set3);
    }
}
