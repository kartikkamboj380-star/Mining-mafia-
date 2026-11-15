package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3918iv0 extends AbstractC4422mv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f30118a;

    C3918iv0(Comparator comparator) {
        this.f30118a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4422mv0
    final Map a() {
        return new TreeMap(this.f30118a);
    }
}
