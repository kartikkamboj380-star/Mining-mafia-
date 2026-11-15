package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Su0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2422Su0 extends AbstractC5051rv0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f23336a;

    C2422Su0(Comparator comparator) {
        this.f23336a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5051rv0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj).iterator();
        Iterator it2 = ((Iterable) obj2).iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f23336a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2422Su0) {
            return this.f23336a.equals(((C2422Su0) obj).f23336a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23336a.hashCode() ^ 2075626741;
    }

    public final String toString() {
        return this.f23336a.toString().concat(".lexicographical()");
    }
}
