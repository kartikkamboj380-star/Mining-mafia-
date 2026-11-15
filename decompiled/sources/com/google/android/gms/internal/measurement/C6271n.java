package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6271n implements InterfaceC6289p {
    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p e(String str, C6157a2 c6157a2, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C6271n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p g() {
        return InterfaceC6289p.f36809y;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final String zzc() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Double zzd() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Boolean zze() {
        return Boolean.FALSE;
    }
}
