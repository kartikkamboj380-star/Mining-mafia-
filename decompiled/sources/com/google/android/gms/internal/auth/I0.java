package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 extends AbstractC6075c0 implements RandomAccess, J0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final I0 f35924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J0 f35925d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f35926b;

    static {
        I0 i10 = new I0(false);
        f35924c = i10;
        f35925d = i10;
    }

    public I0(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.f35926b = arrayList;
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof AbstractC6117q0 ? ((AbstractC6117q0) obj).o(G0.f35912b) : G0.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        a();
        this.f35926b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6075c0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof J0) {
            collection = ((J0) collection).zzg();
        }
        boolean zAddAll = this.f35926b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f35926b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC6117q0) {
            AbstractC6117q0 abstractC6117q0 = (AbstractC6117q0) obj;
            String strO = abstractC6117q0.o(G0.f35912b);
            if (abstractC6117q0.j()) {
                this.f35926b.set(i10, strO);
            }
            return strO;
        }
        byte[] bArr = (byte[]) obj;
        String strD = G0.d(bArr);
        if (E1.b(bArr)) {
            this.f35926b.set(i10, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6075c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f35926b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6075c0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        Object objRemove = this.f35926b.remove(i10);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        a();
        return d(this.f35926b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35926b.size();
    }

    @Override // com.google.android.gms.internal.auth.E0
    public final /* bridge */ /* synthetic */ E0 zzd(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f35926b);
        return new I0(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final J0 zze() {
        return zzc() ? new C6132v1(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final List zzg() {
        return Collections.unmodifiableList(this.f35926b);
    }

    private I0(ArrayList arrayList) {
        super(true);
        this.f35926b = arrayList;
    }

    private I0(boolean z9) {
        super(false);
        this.f35926b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6075c0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
