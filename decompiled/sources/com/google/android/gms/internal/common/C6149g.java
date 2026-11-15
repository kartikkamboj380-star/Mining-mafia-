package com.google.android.gms.internal.common;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6149g extends AbstractC6151i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient AbstractC6151i f36218d;

    C6149g(AbstractC6151i abstractC6151i) {
        this.f36218d = abstractC6151i;
    }

    private final int v(int i10) {
        return (this.f36218d.size() - 1) - i10;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6151i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f36218d.contains(obj);
    }

    @Override // com.google.android.gms.internal.common.AbstractC6146d
    final boolean g() {
        return this.f36218d.g();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC6151i abstractC6151i = this.f36218d;
        C.b(i10, abstractC6151i.size(), "index");
        return abstractC6151i.get(v(i10));
    }

    @Override // com.google.android.gms.internal.common.AbstractC6151i, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f36218d.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return v(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6151i
    public final AbstractC6151i j() {
        return this.f36218d;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6151i
    /* JADX INFO: renamed from: k */
    public final AbstractC6151i subList(int i10, int i11) {
        AbstractC6151i abstractC6151i = this.f36218d;
        C.d(i10, i11, abstractC6151i.size());
        return abstractC6151i.subList(abstractC6151i.size() - i11, abstractC6151i.size() - i10).j();
    }

    @Override // com.google.android.gms.internal.common.AbstractC6151i, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f36218d.indexOf(obj);
        if (iIndexOf >= 0) {
            return v(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36218d.size();
    }

    @Override // com.google.android.gms.internal.common.AbstractC6151i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
