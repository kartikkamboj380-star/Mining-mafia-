package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Us0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2522Us0 implements Serializable, InterfaceC2470Ts0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f24121a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2522Us0) {
            return this.f24121a.equals(((C2522Us0) obj).f24121a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24121a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z9 = true;
        for (Object obj : this.f24121a) {
            if (!z9) {
                sb.append(',');
            }
            sb.append(obj);
            z9 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2470Ts0
    public final boolean zza(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f24121a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((InterfaceC2470Ts0) list.get(i10)).zza(obj)) {
                return false;
            }
            i10++;
        }
    }
}
