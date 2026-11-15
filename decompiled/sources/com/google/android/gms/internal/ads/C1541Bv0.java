package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1541Bv0 extends AbstractC5051rv0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractC5051rv0 f17742a;

    C1541Bv0(AbstractC5051rv0 abstractC5051rv0) {
        this.f17742a = abstractC5051rv0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5051rv0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f17742a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1541Bv0) {
            return this.f17742a.equals(((C1541Bv0) obj).f17742a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f17742a.hashCode();
    }

    public final String toString() {
        return this.f17742a.toString().concat(".reverse()");
    }
}
