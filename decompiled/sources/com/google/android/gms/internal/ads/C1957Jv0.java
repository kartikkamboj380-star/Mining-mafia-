package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1957Jv0 extends AbstractC1903Iu0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f20023c;

    C1957Jv0(Object obj) {
        obj.getClass();
        this.f20023c = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0, com.google.android.gms.internal.ads.AbstractC5427uu0
    public final AbstractC2112Mv0 a() {
        return new C2318Qu0(this.f20023c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20023c.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0, com.google.android.gms.internal.ads.AbstractC5427uu0
    public final AbstractC5931yu0 g() {
        return AbstractC5931yu0.m(this.f20023c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f20023c.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C2318Qu0(this.f20023c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int j(Object[] objArr, int i10) {
        objArr[i10] = this.f20023c;
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f20023c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append("[");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
