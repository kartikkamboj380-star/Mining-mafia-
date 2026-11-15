package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ku0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2007Ku0 extends AbstractC1903Iu0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient C2058Lu0 f20294c;

    C2007Ku0(C2058Lu0 c2058Lu0) {
        this.f20294c = c2058Lu0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0, com.google.android.gms.internal.ads.AbstractC5427uu0
    public final AbstractC2112Mv0 a() {
        return new C1591Cu0(this.f20294c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            C2058Lu0 c2058Lu0 = this.f20294c;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) c2058Lu0.zzu().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C1591Cu0(this.f20294c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20294c.f19160e;
    }
}
