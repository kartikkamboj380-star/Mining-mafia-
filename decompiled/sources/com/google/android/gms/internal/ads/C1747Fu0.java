package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1747Fu0 extends AbstractC5427uu0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient AbstractC1799Gu0 f18865b;

    C1747Fu0(AbstractC1799Gu0 abstractC1799Gu0) {
        this.f18865b = abstractC1799Gu0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    public final AbstractC2112Mv0 a() {
        return new C1643Du0(this.f18865b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18865b.f(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C1643Du0(this.f18865b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int j(Object[] objArr, int i10) {
        AbstractC2164Nv0 abstractC2164Nv0ListIterator = ((AbstractC5931yu0) this.f18865b.f19159d.values()).listIterator(0);
        while (abstractC2164Nv0ListIterator.hasNext()) {
            i10 = ((AbstractC5427uu0) abstractC2164Nv0ListIterator.next()).j(objArr, i10);
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f18865b.f19160e;
    }
}
