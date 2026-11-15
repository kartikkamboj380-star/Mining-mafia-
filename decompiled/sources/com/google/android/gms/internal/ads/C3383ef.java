package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3383ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f28028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f28029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f28030c;

    C3383ef(long j10, String str, int i10) {
        this.f28028a = j10;
        this.f28029b = str;
        this.f28030c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3383ef)) {
            return false;
        }
        C3383ef c3383ef = (C3383ef) obj;
        return c3383ef.f28028a == this.f28028a && c3383ef.f28030c == this.f28030c;
    }

    public final int hashCode() {
        return (int) this.f28028a;
    }
}
