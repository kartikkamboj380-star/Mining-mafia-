package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6181d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f36652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f36653b;

    C6181d(C6199f c6199f, Iterator it, Iterator it2) {
        this.f36652a = it;
        this.f36653b = it2;
        Objects.requireNonNull(c6199f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f36652a.hasNext()) {
            return true;
        }
        return this.f36653b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f36652a;
        if (it.hasNext()) {
            return new C6324t(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f36653b;
        if (it2.hasNext()) {
            return new C6324t((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
