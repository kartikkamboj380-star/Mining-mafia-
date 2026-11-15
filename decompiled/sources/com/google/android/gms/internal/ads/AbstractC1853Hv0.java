package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1853Hv0 extends AbstractSet {
    /* synthetic */ AbstractC1853Hv0(byte[] bArr) {
    }

    static int e(Set set) {
        return set instanceof AbstractC1853Hv0 ? ((AbstractC1853Hv0) set).d() : set.size();
    }

    public abstract AbstractC2112Mv0 a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    abstract int d();

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int iE;
        int size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (iE = e((set = (Set) obj))) < 0) {
            return false;
        }
        if (set instanceof AbstractC1853Hv0) {
            ((AbstractC1853Hv0) set).b();
            size = 0;
        } else {
            size = set.size();
        }
        if (d() < size) {
            return false;
        }
        AbstractC2112Mv0 abstractC2112Mv0A = a();
        int i10 = 0;
        while (abstractC2112Mv0A.hasNext()) {
            try {
                if (!set.contains(abstractC2112Mv0A.next())) {
                    return false;
                }
                i10++;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        if (i10 == iE) {
            return true;
        }
        if (i10 < size) {
            return false;
        }
        Iterator it = set.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            it.next();
            i11++;
            if (i11 > i10) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
