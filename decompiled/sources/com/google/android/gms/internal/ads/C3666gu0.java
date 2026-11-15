package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3666gu0 extends AbstractC5051rv0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f28761a;

    C3666gu0(Comparator comparator) {
        this.f28761a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5051rv0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f28761a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3666gu0) {
            return this.f28761a.equals(((C3666gu0) obj).f28761a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28761a.hashCode();
    }

    public final String toString() {
        return this.f28761a.toString();
    }
}
