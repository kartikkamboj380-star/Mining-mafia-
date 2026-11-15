package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class SS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KW0 f23211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f23212b;

    public SS0(KW0 kw0, SparseArray sparseArray) {
        this.f23211a = kw0;
        SparseArray sparseArray2 = new SparseArray(kw0.b());
        for (int i10 = 0; i10 < kw0.b(); i10++) {
            int iC = kw0.c(i10);
            RS0 rs0 = (RS0) sparseArray.get(iC);
            rs0.getClass();
            sparseArray2.append(iC, rs0);
        }
        this.f23212b = sparseArray2;
    }

    public final RS0 a(int i10) {
        RS0 rs0 = (RS0) this.f23212b.get(i10);
        rs0.getClass();
        return rs0;
    }

    public final boolean b(int i10) {
        return this.f23211a.a(i10);
    }

    public final int c() {
        return this.f23211a.b();
    }

    public final int d(int i10) {
        return this.f23211a.c(i10);
    }
}
