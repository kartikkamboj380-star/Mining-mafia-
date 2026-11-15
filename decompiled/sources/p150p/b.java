package p150p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f47721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f47722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f47723c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47724d = 0;

    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p.b.e
        c b(c cVar) {
            return cVar.f47728d;
        }

        @Override // p.b.e
        c c(c cVar) {
            return cVar.f47727c;
        }
    }

    /* JADX INFO: renamed from: p.b$b, reason: collision with other inner class name */
    private static class C0511b extends e {
        C0511b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p.b.e
        c b(c cVar) {
            return cVar.f47727c;
        }

        @Override // p.b.e
        c c(c cVar) {
            return cVar.f47728d;
        }
    }

    static class c implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f47725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f47726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f47727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f47728d;

        c(Object obj, Object obj2) {
            this.f47725a = obj;
            this.f47726b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f47725a.equals(cVar.f47725a) && this.f47726b.equals(cVar.f47726b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f47725a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f47726b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f47725a.hashCode() ^ this.f47726b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f47725a + "=" + this.f47726b;
        }
    }

    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f47729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f47730b = true;

        d() {
        }

        @Override // p.b.f
        void a(c cVar) {
            c cVar2 = this.f47729a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f47728d;
                this.f47729a = cVar3;
                this.f47730b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f47730b) {
                this.f47730b = false;
                this.f47729a = b.this.f47721a;
            } else {
                c cVar = this.f47729a;
                this.f47729a = cVar != null ? cVar.f47727c : null;
            }
            return this.f47729a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f47730b) {
                return b.this.f47721a != null;
            }
            c cVar = this.f47729a;
            return (cVar == null || cVar.f47727c == null) ? false : true;
        }
    }

    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f47732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c f47733b;

        e(c cVar, c cVar2) {
            this.f47732a = cVar2;
            this.f47733b = cVar;
        }

        private c e() {
            c cVar = this.f47733b;
            c cVar2 = this.f47732a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // p.b.f
        public void a(c cVar) {
            if (this.f47732a == cVar && cVar == this.f47733b) {
                this.f47733b = null;
                this.f47732a = null;
            }
            c cVar2 = this.f47732a;
            if (cVar2 == cVar) {
                this.f47732a = b(cVar2);
            }
            if (this.f47733b == cVar) {
                this.f47733b = e();
            }
        }

        abstract c b(c cVar);

        abstract c c(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f47733b;
            this.f47733b = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f47733b != null;
        }
    }

    public static abstract class f {
        abstract void a(c cVar);
    }

    public Map.Entry a() {
        return this.f47721a;
    }

    protected c b(Object obj) {
        c cVar = this.f47721a;
        while (cVar != null && !cVar.f47725a.equals(obj)) {
            cVar = cVar.f47727c;
        }
        return cVar;
    }

    public d d() {
        d dVar = new d();
        this.f47723c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        C0511b c0511b = new C0511b(this.f47722b, this.f47721a);
        this.f47723c.put(c0511b, Boolean.FALSE);
        return c0511b;
    }

    public Map.Entry e() {
        return this.f47722b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    c g(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f47724d++;
        c cVar2 = this.f47722b;
        if (cVar2 == null) {
            this.f47721a = cVar;
            this.f47722b = cVar;
            return cVar;
        }
        cVar2.f47727c = cVar;
        cVar.f47728d = cVar2;
        this.f47722b = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public Object i(Object obj, Object obj2) {
        c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f47726b;
        }
        g(obj, obj2);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f47721a, this.f47722b);
        this.f47723c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object j(Object obj) {
        c cVarB = b(obj);
        if (cVarB == null) {
            return null;
        }
        this.f47724d--;
        if (!this.f47723c.isEmpty()) {
            Iterator it = this.f47723c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarB);
            }
        }
        c cVar = cVarB.f47728d;
        if (cVar != null) {
            cVar.f47727c = cVarB.f47727c;
        } else {
            this.f47721a = cVarB.f47727c;
        }
        c cVar2 = cVarB.f47727c;
        if (cVar2 != null) {
            cVar2.f47728d = cVar;
        } else {
            this.f47722b = cVar;
        }
        cVarB.f47727c = null;
        cVarB.f47728d = null;
        return cVarB.f47726b;
    }

    public int size() {
        return this.f47724d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
