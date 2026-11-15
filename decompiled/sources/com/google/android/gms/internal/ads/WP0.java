package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class WP0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f24760a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ XP0 f24761b;

    WP0(XP0 xp0) {
        this.f24761b = xp0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f24760a;
        XP0 xp0 = this.f24761b;
        return i10 < xp0.f25219a.size() || xp0.f25220b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f24760a;
        XP0 xp0 = this.f24761b;
        List list = xp0.f25219a;
        if (i10 >= list.size()) {
            list.add(xp0.f25220b.next());
            return next();
        }
        int i11 = this.f24760a;
        this.f24760a = i11 + 1;
        return list.get(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
