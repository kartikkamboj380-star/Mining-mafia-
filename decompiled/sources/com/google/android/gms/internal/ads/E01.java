package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class E01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18331b;

    public E01(long j10, long j11) {
        this.f18330a = j10;
        this.f18331b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E01)) {
            return false;
        }
        E01 e01 = (E01) obj;
        return this.f18330a == e01.f18330a && this.f18331b == e01.f18331b;
    }

    public final int hashCode() {
        return (((int) this.f18330a) * 31) + ((int) this.f18331b);
    }
}
