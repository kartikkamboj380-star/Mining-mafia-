package com.google.android.gms.internal.auth;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6107n extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U f36125b;

    C6107n(Context context, U u10) {
        this.f36124a = context;
        this.f36125b = u10;
    }

    @Override // com.google.android.gms.internal.auth.K
    final Context a() {
        return this.f36124a;
    }

    @Override // com.google.android.gms.internal.auth.K
    final U b() {
        return this.f36125b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            K k10 = (K) obj;
            if (this.f36124a.equals(k10.a()) && this.f36125b.equals(k10.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f36124a.hashCode() ^ 1000003) * 1000003) ^ this.f36125b.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f36124a.toString() + ", hermeticFileOverrides=" + this.f36125b.toString() + "}";
    }
}
