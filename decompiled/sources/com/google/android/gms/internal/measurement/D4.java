package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class D4 extends E4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ K4 f36264c;

    D4(K4 k10) {
        Objects.requireNonNull(k10);
        this.f36264c = k10;
        this.f36262a = 0;
        this.f36263b = k10.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36262a < this.f36263b;
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final byte zza() {
        int i10 = this.f36262a;
        if (i10 >= this.f36263b) {
            throw new NoSuchElementException();
        }
        this.f36262a = i10 + 1;
        return this.f36264c.b(i10);
    }
}
