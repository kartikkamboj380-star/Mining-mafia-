package p057f6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class p {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6982c f43717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f43718b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f43719c = new HashSet();

        b(C6982c c6982c) {
            this.f43717a = c6982c;
        }

        void a(b bVar) {
            this.f43718b.add(bVar);
        }

        void b(b bVar) {
            this.f43719c.add(bVar);
        }

        C6982c c() {
            return this.f43717a;
        }

        Set d() {
            return this.f43718b;
        }

        boolean e() {
            return this.f43718b.isEmpty();
        }

        boolean f() {
            return this.f43719c.isEmpty();
        }

        void g(b bVar) {
            this.f43719c.remove(bVar);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final E f43720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f43721b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f43720a.equals(this.f43720a) && cVar.f43721b == this.f43721b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f43720a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f43721b).hashCode();
        }

        private c(E e10, boolean z9) {
            this.f43720a = e10;
            this.f43721b = z9;
        }
    }

    static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new r(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.e() && (set = (Set) map.get(new c(qVar.c(), qVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C6982c c6982c = (C6982c) it.next();
            b bVar3 = new b(c6982c);
            for (E e10 : c6982c.j()) {
                c cVar = new c(e10, !c6982c.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f43721b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", e10));
                }
                set2.add(bVar3);
            }
        }
    }
}
