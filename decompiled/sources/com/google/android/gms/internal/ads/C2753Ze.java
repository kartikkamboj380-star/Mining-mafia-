package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2753Ze implements Comparator {
    C2753Ze(C3007bf c3007bf) {
        Objects.requireNonNull(c3007bf);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C3383ef c3383ef = (C3383ef) obj;
        C3383ef c3383ef2 = (C3383ef) obj2;
        int i10 = c3383ef.f28030c - c3383ef2.f28030c;
        return i10 != 0 ? i10 : Long.compare(c3383ef.f28028a, c3383ef2.f28028a);
    }
}
