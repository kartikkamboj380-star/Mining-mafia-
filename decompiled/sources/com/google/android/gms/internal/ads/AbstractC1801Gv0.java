package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1801Gv0 extends AbstractSet {
    AbstractC1801Gv0() {
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return AbstractC1905Iv0.f(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
