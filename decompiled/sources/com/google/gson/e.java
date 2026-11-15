package com.google.gson;

import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p108k7.E;
import p108k7.G;
import p108k7.u;
import p108k7.z;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final com.google.gson.d f40745A = com.google.gson.d.f40740d;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final String f40746B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final com.google.gson.c f40747C = com.google.gson.b.f40732a;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    static final r f40748D = q.f40941a;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    static final r f40749E = q.f40942b;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final p f40750z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal f40751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f40752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p108k7.t f40753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.e f40754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List f40755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final u f40756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.gson.c f40757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map f40758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f40759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f40760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f40761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f40762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final com.google.gson.d f40763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final p f40764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f40765o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f40766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final String f40767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f40768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f40769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final n f40770t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final List f40771u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final List f40772v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final r f40773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final r f40774x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final List f40775y;

    class a extends s {
        a() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return Double.valueOf(aVar.W());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
                return;
            }
            double dDoubleValue = number.doubleValue();
            e.d(dDoubleValue);
            cVar.l1(dDoubleValue);
        }
    }

    class b extends s {
        b() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return Float.valueOf((float) aVar.W());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
                return;
            }
            float fFloatValue = number.floatValue();
            e.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            cVar.o1(number);
        }
    }

    class c extends s {
        c() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return Long.valueOf(aVar.a0());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.p1(number.toString());
            }
        }
    }

    class d extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f40778a;

        d(s sVar) {
            this.f40778a = sVar;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(p138n7.a aVar) {
            return new AtomicLong(((Number) this.f40778a.b(aVar)).longValue());
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, AtomicLong atomicLong) {
            this.f40778a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: renamed from: com.google.gson.e$e, reason: collision with other inner class name */
    class C0377e extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f40779a;

        C0377e(s sVar) {
            this.f40779a = sVar;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(p138n7.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.Q()) {
                arrayList.add(Long.valueOf(((Number) this.f40779a.b(aVar)).longValue()));
            }
            aVar.w();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.j();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f40779a.d(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.w();
        }
    }

    static class f extends com.google.gson.internal.bind.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s f40780a = null;

        f() {
        }

        private s f() {
            s sVar = this.f40780a;
            if (sVar != null) {
                return sVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.s
        public Object b(p138n7.a aVar) {
            return f().b(aVar);
        }

        @Override // com.google.gson.s
        public void d(p138n7.c cVar, Object obj) {
            f().d(cVar, obj);
        }

        @Override // com.google.gson.internal.bind.l
        public s e() {
            return f();
        }

        public void g(s sVar) {
            if (this.f40780a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f40780a = sVar;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        u uVar = u.f45659g;
        com.google.gson.c cVar = f40747C;
        Map map = Collections.EMPTY_MAP;
        com.google.gson.d dVar = f40745A;
        p pVar = f40750z;
        n nVar = n.f40929a;
        String str = f40746B;
        List list = Collections.EMPTY_LIST;
        this(uVar, cVar, map, false, false, false, true, dVar, pVar, false, true, nVar, str, 2, 2, list, list, list, f40748D, f40749E, list);
    }

    private static void a(Object obj, p138n7.a aVar) {
        if (obj != null) {
            try {
                if (aVar.n1() == p138n7.b.END_DOCUMENT) {
                } else {
                    throw new m("JSON document was not fully consumed.");
                }
            } catch (p138n7.d e10) {
                throw new m(e10);
            } catch (IOException e11) {
                throw new h(e11);
            }
        }
    }

    private static s b(s sVar) {
        return new d(sVar).a();
    }

    private static s c(s sVar) {
        return new C0377e(sVar).a();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private s e(boolean z9) {
        return z9 ? com.google.gson.internal.bind.n.f40897v : new a();
    }

    private s f(boolean z9) {
        return z9 ? com.google.gson.internal.bind.n.f40896u : new b();
    }

    private static s o(n nVar) {
        return nVar == n.f40929a ? com.google.gson.internal.bind.n.f40895t : new c();
    }

    public Object g(Reader reader, TypeToken typeToken) {
        p138n7.a aVarP = p(reader);
        Object objK = k(aVarP, typeToken);
        a(objK, aVarP);
        return objK;
    }

    public Object h(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        return g(new StringReader(str), typeToken);
    }

    public Object i(String str, Class cls) {
        return h(str, TypeToken.get(cls));
    }

    public Object j(String str, Type type) {
        return h(str, TypeToken.get(type));
    }

    public Object k(p138n7.a aVar, TypeToken typeToken) {
        boolean z9;
        p pVarN = aVar.N();
        p pVar = this.f40764n;
        if (pVar != null) {
            aVar.s1(pVar);
        } else if (aVar.N() == p.LEGACY_STRICT) {
            aVar.s1(p.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        aVar.n1();
                        z9 = false;
                        try {
                            s sVarL = l(typeToken);
                            Object objB = sVarL.b(aVar);
                            Class clsB = E.b(typeToken.getRawType());
                            if (objB != null && !clsB.isInstance(objB)) {
                                throw new ClassCastException("Type adapter '" + sVarL + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            aVar.s1(pVarN);
                            return objB;
                        } catch (EOFException e10) {
                            e = e10;
                            if (!z9) {
                                throw new m(e);
                            }
                            aVar.s1(pVarN);
                            return null;
                        }
                    } catch (EOFException e11) {
                        e = e11;
                        z9 = true;
                    }
                } catch (IOException e12) {
                    throw new m(e12);
                }
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e13.getMessage(), e13);
            } catch (IllegalStateException e14) {
                throw new m(e14);
            }
        } catch (Throwable th) {
            aVar.s1(pVarN);
            throw th;
        }
    }

    public s l(TypeToken typeToken) {
        boolean z9;
        Objects.requireNonNull(typeToken, "type must not be null");
        s sVar = (s) this.f40752b.get(typeToken);
        if (sVar != null) {
            return sVar;
        }
        Map map = (Map) this.f40751a.get();
        if (map == null) {
            map = new HashMap();
            this.f40751a.set(map);
            z9 = true;
        } else {
            s sVar2 = (s) map.get(typeToken);
            if (sVar2 != null) {
                return sVar2;
            }
            z9 = false;
        }
        try {
            f fVar = new f();
            map.put(typeToken, fVar);
            Iterator it = this.f40755e.iterator();
            s sVarB = null;
            while (it.hasNext()) {
                sVarB = ((t) it.next()).b(this, typeToken);
                if (sVarB != null) {
                    fVar.g(sVarB);
                    map.put(typeToken, sVarB);
                    break;
                }
            }
            if (z9) {
                this.f40751a.remove();
            }
            if (sVarB != null) {
                if (z9) {
                    this.f40752b.putAll(map);
                }
                return sVarB;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + typeToken);
        } catch (Throwable th) {
            if (z9) {
                this.f40751a.remove();
            }
            throw th;
        }
    }

    public s m(Class cls) {
        return l(TypeToken.get(cls));
    }

    public s n(t tVar, TypeToken typeToken) {
        Objects.requireNonNull(tVar, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        if (this.f40754d.e(typeToken, tVar)) {
            tVar = this.f40754d;
        }
        boolean z9 = false;
        for (t tVar2 : this.f40755e) {
            if (z9) {
                s sVarB = tVar2.b(this, typeToken);
                if (sVarB != null) {
                    return sVarB;
                }
            } else if (tVar2 == tVar) {
                z9 = true;
            }
        }
        if (!z9) {
            return l(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    public p138n7.a p(Reader reader) {
        p138n7.a aVar = new p138n7.a(reader);
        p pVar = this.f40764n;
        if (pVar == null) {
            pVar = p.LEGACY_STRICT;
        }
        aVar.s1(pVar);
        return aVar;
    }

    public p138n7.c q(Writer writer) throws IOException {
        if (this.f40761k) {
            writer.write(")]}'\n");
        }
        p138n7.c cVar = new p138n7.c(writer);
        cVar.a0(this.f40763m);
        cVar.I0(this.f40762l);
        p pVar = this.f40764n;
        if (pVar == null) {
            pVar = p.LEGACY_STRICT;
        }
        cVar.V0(pVar);
        cVar.R0(this.f40759i);
        return cVar;
    }

    public String r(g gVar) {
        StringWriter stringWriter = new StringWriter();
        u(gVar, stringWriter);
        return stringWriter.toString();
    }

    public String s(Object obj) {
        return obj == null ? r(i.f40782a) : t(obj, obj.getClass());
    }

    public String t(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f40759i + ",factories:" + this.f40755e + ",instanceCreators:" + this.f40753c + "}";
    }

    public void u(g gVar, Appendable appendable) {
        try {
            v(gVar, q(G.b(appendable)));
        } catch (IOException e10) {
            throw new h(e10);
        }
    }

    public void v(g gVar, p138n7.c cVar) {
        p pVarJ = cVar.J();
        boolean zM = cVar.M();
        boolean zG = cVar.G();
        cVar.I0(this.f40762l);
        cVar.R0(this.f40759i);
        p pVar = this.f40764n;
        if (pVar != null) {
            cVar.V0(pVar);
        } else if (cVar.J() == p.LEGACY_STRICT) {
            cVar.V0(p.LENIENT);
        }
        try {
            try {
                G.a(gVar, cVar);
                cVar.V0(pVarJ);
                cVar.I0(zM);
                cVar.R0(zG);
            } catch (IOException e10) {
                throw new h(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e11.getMessage(), e11);
            }
        } catch (Throwable th) {
            cVar.V0(pVarJ);
            cVar.I0(zM);
            cVar.R0(zG);
            throw th;
        }
    }

    public void w(Object obj, Type type, Appendable appendable) {
        try {
            x(obj, type, q(G.b(appendable)));
        } catch (IOException e10) {
            throw new h(e10);
        }
    }

    public void x(Object obj, Type type, p138n7.c cVar) {
        s sVarL = l(TypeToken.get(type));
        p pVarJ = cVar.J();
        p pVar = this.f40764n;
        if (pVar != null) {
            cVar.V0(pVar);
        } else if (cVar.J() == p.LEGACY_STRICT) {
            cVar.V0(p.LENIENT);
        }
        boolean zM = cVar.M();
        boolean zG = cVar.G();
        cVar.I0(this.f40762l);
        cVar.R0(this.f40759i);
        try {
            try {
                try {
                    sVarL.d(cVar, obj);
                    cVar.V0(pVarJ);
                    cVar.I0(zM);
                    cVar.R0(zG);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.13.1): " + e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                throw new h(e11);
            }
        } catch (Throwable th) {
            cVar.V0(pVarJ);
            cVar.I0(zM);
            cVar.R0(zG);
            throw th;
        }
    }

    e(u uVar, com.google.gson.c cVar, Map map, boolean z9, boolean z10, boolean z11, boolean z12, com.google.gson.d dVar, p pVar, boolean z13, boolean z14, n nVar, String str, int i10, int i11, List list, List list2, List list3, r rVar, r rVar2, List list4) {
        this.f40751a = new ThreadLocal();
        this.f40752b = new ConcurrentHashMap();
        this.f40756f = uVar;
        this.f40757g = cVar;
        this.f40758h = map;
        p108k7.t tVar = new p108k7.t(map, z14, list4);
        this.f40753c = tVar;
        this.f40759i = z9;
        this.f40760j = z10;
        this.f40761k = z11;
        this.f40762l = z12;
        this.f40763m = dVar;
        this.f40764n = pVar;
        this.f40765o = z13;
        this.f40766p = z14;
        this.f40770t = nVar;
        this.f40767q = str;
        this.f40768r = i10;
        this.f40769s = i11;
        this.f40771u = list;
        this.f40772v = list2;
        this.f40773w = rVar;
        this.f40774x = rVar2;
        this.f40775y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.n.f40874W);
        arrayList.add(com.google.gson.internal.bind.j.e(rVar));
        arrayList.add(uVar);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.n.f40854C);
        arrayList.add(com.google.gson.internal.bind.n.f40888m);
        arrayList.add(com.google.gson.internal.bind.n.f40882g);
        arrayList.add(com.google.gson.internal.bind.n.f40884i);
        arrayList.add(com.google.gson.internal.bind.n.f40886k);
        s sVarO = o(nVar);
        arrayList.add(com.google.gson.internal.bind.n.b(Long.TYPE, Long.class, sVarO));
        arrayList.add(com.google.gson.internal.bind.n.b(Double.TYPE, Double.class, e(z13)));
        arrayList.add(com.google.gson.internal.bind.n.b(Float.TYPE, Float.class, f(z13)));
        arrayList.add(com.google.gson.internal.bind.i.e(rVar2));
        arrayList.add(com.google.gson.internal.bind.n.f40890o);
        arrayList.add(com.google.gson.internal.bind.n.f40892q);
        arrayList.add(com.google.gson.internal.bind.n.a(AtomicLong.class, b(sVarO)));
        arrayList.add(com.google.gson.internal.bind.n.a(AtomicLongArray.class, c(sVarO)));
        arrayList.add(com.google.gson.internal.bind.n.f40894s);
        arrayList.add(com.google.gson.internal.bind.n.f40899x);
        arrayList.add(com.google.gson.internal.bind.n.f40856E);
        arrayList.add(com.google.gson.internal.bind.n.f40858G);
        arrayList.add(com.google.gson.internal.bind.n.a(BigDecimal.class, com.google.gson.internal.bind.n.f40901z));
        arrayList.add(com.google.gson.internal.bind.n.a(BigInteger.class, com.google.gson.internal.bind.n.f40852A));
        arrayList.add(com.google.gson.internal.bind.n.a(z.class, com.google.gson.internal.bind.n.f40853B));
        arrayList.add(com.google.gson.internal.bind.n.f40860I);
        arrayList.add(com.google.gson.internal.bind.n.f40862K);
        arrayList.add(com.google.gson.internal.bind.n.f40866O);
        arrayList.add(com.google.gson.internal.bind.n.f40868Q);
        arrayList.add(com.google.gson.internal.bind.n.f40872U);
        arrayList.add(com.google.gson.internal.bind.n.f40864M);
        arrayList.add(com.google.gson.internal.bind.n.f40879d);
        arrayList.add(com.google.gson.internal.bind.c.f40789c);
        arrayList.add(com.google.gson.internal.bind.n.f40870S);
        if (com.google.gson.internal.sql.d.f40921a) {
            arrayList.add(com.google.gson.internal.sql.d.f40925e);
            arrayList.add(com.google.gson.internal.sql.d.f40924d);
            arrayList.add(com.google.gson.internal.sql.d.f40926f);
        }
        arrayList.add(com.google.gson.internal.bind.a.f40783c);
        arrayList.add(com.google.gson.internal.bind.n.f40877b);
        arrayList.add(new com.google.gson.internal.bind.b(tVar));
        arrayList.add(new com.google.gson.internal.bind.h(tVar, z10));
        com.google.gson.internal.bind.e eVar = new com.google.gson.internal.bind.e(tVar);
        this.f40754d = eVar;
        arrayList.add(eVar);
        arrayList.add(com.google.gson.internal.bind.n.f40875X);
        arrayList.add(new com.google.gson.internal.bind.k(tVar, cVar, uVar, eVar, list4));
        this.f40755e = Collections.unmodifiableList(arrayList);
    }
}
