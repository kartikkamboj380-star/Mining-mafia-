package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1645Dv0 extends AbstractC1853Hv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f18312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f18313b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1645Dv0(Set set, Set set2) {
        super(null);
        this.f18312a = set;
        this.f18313b = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC2112Mv0 iterator() {
        return new C1593Cv0(this, this.f18312a, this.f18313b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1853Hv0
    final int b() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f18312a.contains(obj) && this.f18313b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f18312a.containsAll(collection) && this.f18313b.containsAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1853Hv0
    final int d() {
        return Math.min(AbstractC1853Hv0.e(this.f18312a), AbstractC1853Hv0.e(this.f18313b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f18313b, this.f18312a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f18312a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f18313b.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
