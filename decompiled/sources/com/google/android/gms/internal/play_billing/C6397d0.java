package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6397d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f37200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37201b;

    C6397d0(Object obj, int i10) {
        this.f37200a = obj;
        this.f37201b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6397d0)) {
            return false;
        }
        C6397d0 c6397d0 = (C6397d0) obj;
        return this.f37200a == c6397d0.f37200a && this.f37201b == c6397d0.f37201b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f37200a) * 65535) + this.f37201b;
    }
}
