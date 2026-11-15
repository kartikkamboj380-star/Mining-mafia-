package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class S4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f36487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36488b;

    S4(Object obj, int i10) {
        this.f36487a = obj;
        this.f36488b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S4)) {
            return false;
        }
        S4 s10 = (S4) obj;
        return this.f36487a == s10.f36487a && this.f36488b == s10.f36488b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f36487a) * 65535) + this.f36488b;
    }
}
