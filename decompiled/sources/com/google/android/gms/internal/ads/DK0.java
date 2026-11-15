package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class DK0 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JK0 f18147a;

    DK0(JK0 jk0) {
        Objects.requireNonNull(jk0);
        this.f18147a = jk0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f18147a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f18147a.c((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new CK0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        JK0 jk0;
        IK0 ik0C;
        if (!(obj instanceof Map.Entry) || (ik0C = (jk0 = this.f18147a).c((Map.Entry) obj)) == null) {
            return false;
        }
        jk0.e(ik0C, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18147a.f19837d;
    }
}
