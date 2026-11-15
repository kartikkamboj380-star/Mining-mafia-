package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2784Zt0 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3414eu0 f26332a;

    /* synthetic */ C2784Zt0(C3414eu0 c3414eu0, byte[] bArr) {
        Objects.requireNonNull(c3414eu0);
        this.f26332a = c3414eu0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f26332a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C3414eu0 c3414eu0 = this.f26332a;
        Map mapG = c3414eu0.g();
        if (mapG != null) {
            return mapG.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iM = c3414eu0.m(entry.getKey());
            if (iM != -1 && Objects.equals(c3414eu0.t(iM), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C3414eu0 c3414eu0 = this.f26332a;
        Map mapG = c3414eu0.g();
        return mapG != null ? mapG.entrySet().iterator() : new C2680Xt0(c3414eu0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iL;
        int iE;
        C3414eu0 c3414eu0 = this.f26332a;
        Map mapG = c3414eu0.g();
        if (mapG != null) {
            return mapG.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (c3414eu0.f() || (iE = AbstractC3540fu0.e(entry.getKey(), entry.getValue(), (iL = c3414eu0.l()), c3414eu0.o(), c3414eu0.p(), c3414eu0.q(), c3414eu0.r())) == -1) {
            return false;
        }
        c3414eu0.i(iE, iL);
        c3414eu0.y(c3414eu0.x() - 1);
        c3414eu0.h();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26332a.size();
    }
}
