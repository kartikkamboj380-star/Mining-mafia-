package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6208g implements InterfaceC6289p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36682a;

    public C6208g(Boolean bool) {
        this.f36682a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p e(String str, C6157a2 c6157a2, List list) {
        if ("toString".equals(str)) {
            return new C6324t(Boolean.toString(this.f36682a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f36682a), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6208g) && this.f36682a == ((C6208g) obj).f36682a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p g() {
        return new C6208g(Boolean.valueOf(this.f36682a));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f36682a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f36682a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final String zzc() {
        return Boolean.toString(this.f36682a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Double zzd() {
        return Double.valueOf(true != this.f36682a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Boolean zze() {
        return Boolean.valueOf(this.f36682a);
    }
}
