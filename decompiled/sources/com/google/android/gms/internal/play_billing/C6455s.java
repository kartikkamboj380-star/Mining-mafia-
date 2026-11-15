package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6455s extends AbstractC6436n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient AbstractC6432m f37330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient AbstractC6420j f37331d;

    C6455s(AbstractC6432m abstractC6432m, AbstractC6420j abstractC6420j) {
        this.f37330c = abstractC6432m;
        this.f37331d = abstractC6420j;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final int a(Object[] objArr, int i10) {
        return this.f37331d.a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f37330c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6436n, com.google.android.gms.internal.play_billing.AbstractC6408g
    public final AbstractC6420j e() {
        return this.f37331d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f37331d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f37330c.size();
    }
}
