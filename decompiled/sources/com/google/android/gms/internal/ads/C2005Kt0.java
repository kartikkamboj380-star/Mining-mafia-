package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2005Kt0 extends C1901It0 implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2056Lt0 f20291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2005Kt0(C2056Lt0 c2056Lt0) {
        super(c2056Lt0);
        Objects.requireNonNull(c2056Lt0);
        this.f20291d = c2056Lt0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C2056Lt0 c2056Lt0 = this.f20291d;
        boolean zIsEmpty = c2056Lt0.isEmpty();
        a();
        ((ListIterator) this.f19681a).add(obj);
        AbstractC2108Mt0 abstractC2108Mt0 = c2056Lt0.f20687f;
        abstractC2108Mt0.r(abstractC2108Mt0.q() + 1);
        if (zIsEmpty) {
            c2056Lt0.b();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f19681a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f19681a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f19681a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f19681a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f19681a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2005Kt0(C2056Lt0 c2056Lt0, int i10) {
        super(c2056Lt0, ((List) c2056Lt0.f20016b).listIterator(i10));
        Objects.requireNonNull(c2056Lt0);
        this.f20291d = c2056Lt0;
    }
}
