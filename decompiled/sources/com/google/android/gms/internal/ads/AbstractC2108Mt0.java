package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2108Mt0 extends AbstractC2264Pt0 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Map f20944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f20945e;

    protected AbstractC2108Mt0(Map map) {
        AbstractC2418Ss0.a(map.isEmpty());
        this.f20944d = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3668gv0
    public final void b() {
        Map map = this.f20944d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f20945e = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2264Pt0
    final Collection c() {
        return new C2212Ot0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2264Pt0
    final Iterator d() {
        return new C5677wt0(this);
    }

    abstract Collection i(Collection collection);

    abstract Collection j(Object obj, Collection collection);

    abstract Collection k();

    final List l(Object obj, List list, AbstractC1953Jt0 abstractC1953Jt0) {
        return list instanceof RandomAccess ? new C1745Ft0(this, obj, list, abstractC1953Jt0) : new C2056Lt0(this, obj, list, abstractC1953Jt0);
    }

    final Set m() {
        Map map = this.f20944d;
        if (map instanceof NavigableMap) {
            return new C1693Et0(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C1849Ht0(this, (SortedMap) map) : new C1589Ct0(this, map);
    }

    final Map n() {
        Map map = this.f20944d;
        if (map instanceof NavigableMap) {
            return new C1641Dt0(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C1797Gt0(this, (SortedMap) map) : new C6055zt0(this, map);
    }

    final /* synthetic */ void o(Object obj) {
        Object objRemove;
        try {
            objRemove = this.f20944d.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f20945e -= size;
        }
    }

    final /* synthetic */ Map p() {
        return this.f20944d;
    }

    final /* synthetic */ int q() {
        return this.f20945e;
    }

    final /* synthetic */ void r(int i10) {
        this.f20945e = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3668gv0
    public final int zzd() {
        return this.f20945e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3668gv0
    public final boolean zze(Object obj, Object obj2) {
        Map map = this.f20944d;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f20945e++;
            return true;
        }
        Collection collectionK = k();
        if (!collectionK.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f20945e++;
        map.put(obj, collectionK);
        return true;
    }
}
