package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3761hf implements Comparator {
    public C3761hf(C4011jf c4011jf) {
        Objects.requireNonNull(c4011jf);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C2649Xe c2649Xe = (C2649Xe) obj;
        C2649Xe c2649Xe2 = (C2649Xe) obj2;
        if (c2649Xe.b() < c2649Xe2.b()) {
            return -1;
        }
        if (c2649Xe.b() > c2649Xe2.b()) {
            return 1;
        }
        if (c2649Xe.a() < c2649Xe2.a()) {
            return -1;
        }
        if (c2649Xe.a() > c2649Xe2.a()) {
            return 1;
        }
        float fD = (c2649Xe.d() - c2649Xe.b()) * (c2649Xe.c() - c2649Xe.a());
        float fD2 = (c2649Xe2.d() - c2649Xe2.b()) * (c2649Xe2.c() - c2649Xe2.a());
        if (fD > fD2) {
            return -1;
        }
        return fD < fD2 ? 1 : 0;
    }
}
