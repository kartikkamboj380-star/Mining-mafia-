package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6315s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6324t f36879b;

    C6315s(C6324t c6324t) {
        Objects.requireNonNull(c6324t);
        this.f36879b = c6324t;
        this.f36878a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36878a < this.f36879b.a().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C6324t c6324t = this.f36879b;
        String strA = c6324t.a();
        int i10 = this.f36878a;
        if (i10 >= strA.length()) {
            throw new NoSuchElementException();
        }
        this.f36878a = i10 + 1;
        return new C6324t(String.valueOf(c6324t.a().charAt(i10)));
    }
}
