package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class r implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6324t f36870b;

    r(C6324t c6324t) {
        Objects.requireNonNull(c6324t);
        this.f36870b = c6324t;
        this.f36869a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36869a < this.f36870b.a().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strA = this.f36870b.a();
        int i10 = this.f36869a;
        if (i10 >= strA.length()) {
            throw new NoSuchElementException();
        }
        this.f36869a = i10 + 1;
        return new C6324t(String.valueOf(i10));
    }
}
