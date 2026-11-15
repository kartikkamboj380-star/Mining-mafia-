package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class r extends AbstractC6436n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient AbstractC6432m f37326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f37327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f37328e;

    r(AbstractC6432m abstractC6432m, Object[] objArr, int i10, int i11) {
        this.f37326c = abstractC6432m;
        this.f37327d = objArr;
        this.f37328e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final int a(Object[] objArr, int i10) {
        return e().a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f37326c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6436n
    final AbstractC6420j j() {
        return new C6448q(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f37328e;
    }
}
