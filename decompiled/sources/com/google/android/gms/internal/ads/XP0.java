package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class XP0 extends AbstractList {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final YP0 f25218c = YP0.b(XP0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f25219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterator f25220b;

    public XP0(List list, Iterator it) {
        this.f25219a = list;
        this.f25220b = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.f25219a;
        if (list.size() > i10) {
            return list.get(i10);
        }
        Iterator it = this.f25220b;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new WP0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        YP0 yp0 = f25218c;
        yp0.a("potentially expensive size() call");
        yp0.a("blowup running");
        while (true) {
            Iterator it = this.f25220b;
            if (!it.hasNext()) {
                return this.f25219a.size();
            }
            this.f25219a.add(it.next());
        }
    }
}
