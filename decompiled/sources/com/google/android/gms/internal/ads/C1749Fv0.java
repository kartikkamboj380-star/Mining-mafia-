package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1749Fv0 extends C1697Ev0 implements SortedSet {
    C1749Fv0(SortedSet sortedSet, InterfaceC2470Ts0 interfaceC2470Ts0) {
        super(sortedSet, interfaceC2470Ts0);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f24123a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f24123a.iterator();
        it.getClass();
        InterfaceC2470Ts0 interfaceC2470Ts0 = this.f24124b;
        interfaceC2470Ts0.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC2470Ts0.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C1749Fv0(((SortedSet) this.f24123a).headSet(obj), this.f24124b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f24123a;
        while (true) {
            InterfaceC2470Ts0 interfaceC2470Ts0 = this.f24124b;
            Object objLast = sortedSetHeadSet.last();
            if (interfaceC2470Ts0.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C1749Fv0(((SortedSet) this.f24123a).subSet(obj, obj2), this.f24124b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C1749Fv0(((SortedSet) this.f24123a).tailSet(obj), this.f24124b);
    }
}
