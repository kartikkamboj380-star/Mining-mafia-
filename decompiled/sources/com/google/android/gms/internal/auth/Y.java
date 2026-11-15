package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class Y implements Serializable, U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f35989a;

    Y(Object obj) {
        this.f35989a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Object obj2 = this.f35989a;
        Object obj3 = ((Y) obj).f35989a;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35989a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f35989a.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        return this.f35989a;
    }
}
