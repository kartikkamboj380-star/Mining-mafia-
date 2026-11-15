package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1555Cc0 implements InterfaceC1451Ac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17915a;

    public C1555Cc0(String str) {
        this.f17915a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1555Cc0) {
            return this.f17915a.equals(((C1555Cc0) obj).f17915a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17915a.hashCode();
    }

    public final String toString() {
        return this.f17915a;
    }
}
