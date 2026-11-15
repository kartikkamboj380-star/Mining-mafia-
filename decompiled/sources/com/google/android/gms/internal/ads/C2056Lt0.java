package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C2056Lt0 extends AbstractC1953Jt0 implements List {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC2108Mt0 f20687f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2056Lt0(AbstractC2108Mt0 abstractC2108Mt0, Object obj, List list, AbstractC1953Jt0 abstractC1953Jt0) {
        super(abstractC2108Mt0, obj, list, abstractC1953Jt0);
        Objects.requireNonNull(abstractC2108Mt0);
        this.f20687f = abstractC2108Mt0;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        a();
        boolean zIsEmpty = this.f20016b.isEmpty();
        ((List) this.f20016b).add(i10, obj);
        AbstractC2108Mt0 abstractC2108Mt0 = this.f20687f;
        abstractC2108Mt0.r(abstractC2108Mt0.q() + 1);
        if (zIsEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f20016b).addAll(i10, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f20016b.size();
        AbstractC2108Mt0 abstractC2108Mt0 = this.f20687f;
        abstractC2108Mt0.r(abstractC2108Mt0.q() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        b();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a();
        return ((List) this.f20016b).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        return ((List) this.f20016b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        return ((List) this.f20016b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new C2005Kt0(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        a();
        Object objRemove = ((List) this.f20016b).remove(i10);
        AbstractC2108Mt0 abstractC2108Mt0 = this.f20687f;
        abstractC2108Mt0.r(abstractC2108Mt0.q() - 1);
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        a();
        return ((List) this.f20016b).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        a();
        List listSubList = ((List) this.f20016b).subList(i10, i11);
        AbstractC1953Jt0 abstractC1953Jt0 = this.f20017c;
        if (abstractC1953Jt0 == null) {
            abstractC1953Jt0 = this;
        }
        return this.f20687f.l(this.f20015a, listSubList, abstractC1953Jt0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        a();
        return new C2005Kt0(this, i10);
    }
}
