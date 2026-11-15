package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6244k implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f36730a;

    C6244k(Iterator it) {
        this.f36730a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36730a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C6324t((String) this.f36730a.next());
    }
}
