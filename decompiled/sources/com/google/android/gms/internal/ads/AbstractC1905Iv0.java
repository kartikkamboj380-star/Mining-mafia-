package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Iv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1905Iv0 {
    public static AbstractC1853Hv0 a(Set set, Set set2) {
        AbstractC2418Ss0.k(set, "set1");
        AbstractC2418Ss0.k(set2, "set2");
        return new C1645Dv0(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set b(Set set, InterfaceC2470Ts0 interfaceC2470Ts0) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C1697Ev0)) {
                set.getClass();
                return new C1697Ev0(set, interfaceC2470Ts0);
            }
            C1697Ev0 c1697Ev0 = (C1697Ev0) set;
            return new C1697Ev0((Set) c1697Ev0.f24123a, AbstractC2626Ws0.b(c1697Ev0.f24124b, interfaceC2470Ts0));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof C1697Ev0)) {
            sortedSet.getClass();
            return new C1749Fv0(sortedSet, interfaceC2470Ts0);
        }
        C1697Ev0 c1697Ev1 = (C1697Ev0) sortedSet;
        return new C1749Fv0((SortedSet) c1697Ev1.f24123a, AbstractC2626Ws0.b(c1697Ev1.f24124b, interfaceC2470Ts0));
    }

    static int c(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean e(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean f(Set set, Collection collection) {
        collection.getClass();
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return e(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }
}
