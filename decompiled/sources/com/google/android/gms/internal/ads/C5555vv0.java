package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5555vv0 extends AbstractC1903Iu0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient AbstractC1539Bu0 f34189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f34190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f34191e;

    C5555vv0(AbstractC1539Bu0 abstractC1539Bu0, Object[] objArr, int i10, int i11) {
        this.f34189c = abstractC1539Bu0;
        this.f34190d = objArr;
        this.f34191e = i11;
    }

    final /* synthetic */ Object[] C() {
        return this.f34190d;
    }

    final /* synthetic */ int D() {
        return this.f34191e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0, com.google.android.gms.internal.ads.AbstractC5427uu0
    public final AbstractC2112Mv0 a() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f34189c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int j(Object[] objArr, int i10) {
        return g().j(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34191e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0
    final AbstractC5931yu0 v() {
        return new C5429uv0(this);
    }
}
