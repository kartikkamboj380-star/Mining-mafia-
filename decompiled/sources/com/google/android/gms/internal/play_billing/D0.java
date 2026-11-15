package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class D0 extends B implements RandomAccess, E0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final D0 f37074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E0 f37075d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f37076b;

    static {
        D0 d10 = new D0(false);
        f37074c = d10;
        f37075d = d10;
    }

    public D0(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.f37076b = arrayList;
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof Q ? ((Q) obj).p(AbstractC6480y0.f37347b) : AbstractC6480y0.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        a();
        this.f37076b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof E0) {
            collection = ((E0) collection).c();
        }
        boolean zAddAll = this.f37076b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f37076b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Q) {
            Q q10 = (Q) obj;
            String strP = q10.p(AbstractC6480y0.f37347b);
            if (q10.k()) {
                this.f37076b.set(i10, strP);
            }
            return strP;
        }
        byte[] bArr = (byte[]) obj;
        String strD = AbstractC6480y0.d(bArr);
        if (M1.d(bArr)) {
            this.f37076b.set(i10, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.play_billing.E0
    public final List c() {
        return Collections.unmodifiableList(this.f37076b);
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f37076b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.E0
    public final Object n(int i10) {
        return this.f37076b.get(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        Object objRemove = this.f37076b.remove(i10);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        a();
        return d(this.f37076b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37076b.size();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6472w0
    public final /* bridge */ /* synthetic */ InterfaceC6472w0 zzd(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f37076b);
        return new D0(arrayList);
    }

    @Override // com.google.android.gms.internal.play_billing.E0
    public final E0 zze() {
        return zzc() ? new C1(this) : this;
    }

    private D0(ArrayList arrayList) {
        super(true);
        this.f37076b = arrayList;
    }

    private D0(boolean z9) {
        super(false);
        this.f37076b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
