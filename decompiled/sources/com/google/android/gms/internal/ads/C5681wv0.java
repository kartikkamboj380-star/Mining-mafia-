package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5681wv0 extends AbstractC1903Iu0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient AbstractC1539Bu0 f34672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient AbstractC5931yu0 f34673d;

    C5681wv0(AbstractC1539Bu0 abstractC1539Bu0, AbstractC5931yu0 abstractC5931yu0) {
        this.f34672c = abstractC1539Bu0;
        this.f34673d = abstractC5931yu0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0, com.google.android.gms.internal.ads.AbstractC5427uu0
    public final AbstractC2112Mv0 a() {
        return this.f34673d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f34672c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0, com.google.android.gms.internal.ads.AbstractC5427uu0
    public final AbstractC5931yu0 g() {
        return this.f34673d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f34673d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int j(Object[] objArr, int i10) {
        return this.f34673d.j(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34672c.size();
    }
}
