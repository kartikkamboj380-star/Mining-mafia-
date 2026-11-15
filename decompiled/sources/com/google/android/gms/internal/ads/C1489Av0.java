package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Av0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1489Av0 extends AbstractC5051rv0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C1489Av0 f17433a = new C1489Av0();

    private C1489Av0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5051rv0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
