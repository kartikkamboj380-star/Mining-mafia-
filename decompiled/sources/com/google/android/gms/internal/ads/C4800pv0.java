package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4800pv0 extends AbstractC5051rv0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C4800pv0 f32502a = new C4800pv0();

    private C4800pv0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5051rv0
    public final AbstractC5051rv0 a() {
        return C1489Av0.f17433a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5051rv0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
