package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3038bu0 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3414eu0 f26955a;

    /* synthetic */ C3038bu0(C3414eu0 c3414eu0, byte[] bArr) {
        Objects.requireNonNull(c3414eu0);
        this.f26955a = c3414eu0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f26955a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f26955a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C3414eu0 c3414eu0 = this.f26955a;
        Map mapG = c3414eu0.g();
        return mapG != null ? mapG.keySet().iterator() : new C2628Wt0(c3414eu0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C3414eu0 c3414eu0 = this.f26955a;
        Map mapG = c3414eu0.g();
        if (mapG != null) {
            return mapG.keySet().remove(obj);
        }
        return c3414eu0.n(obj) != C3414eu0.f28088j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26955a.size();
    }
}
