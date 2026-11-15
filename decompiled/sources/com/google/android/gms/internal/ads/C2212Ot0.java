package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ot0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2212Ot0 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC2264Pt0 f21700a;

    C2212Ot0(AbstractC2264Pt0 abstractC2264Pt0) {
        Objects.requireNonNull(abstractC2264Pt0);
        this.f21700a = abstractC2264Pt0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f21700a.b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f21700a.f(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f21700a.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f21700a.zzd();
    }
}
