package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6190e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6199f f36666b;

    C6190e(C6199f c6199f) {
        Objects.requireNonNull(c6199f);
        this.f36666b = c6199f;
        this.f36665a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36665a < this.f36666b.l();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C6199f c6199f = this.f36666b;
        if (this.f36665a < c6199f.l()) {
            int i10 = this.f36665a;
            this.f36665a = i10 + 1;
            return c6199f.o(i10);
        }
        int i11 = this.f36665a;
        StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i11);
        throw new NoSuchElementException(sb.toString());
    }
}
