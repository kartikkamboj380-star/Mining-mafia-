package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class V3 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24174c;

    /* synthetic */ V3(long j10, long j11, long j12, byte[] bArr) {
        this.f24172a = j10;
        this.f24173b = j11;
        this.f24174c = j12;
    }

    final /* synthetic */ long c() {
        return this.f24172a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f24172a, ((V3) obj).f24172a);
    }

    final /* synthetic */ long d() {
        return this.f24173b;
    }

    final /* synthetic */ long e() {
        return this.f24174c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V3)) {
            return false;
        }
        V3 v10 = (V3) obj;
        return this.f24172a == v10.f24172a && this.f24173b == v10.f24173b && this.f24174c == v10.f24174c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f24172a), Long.valueOf(this.f24173b), Long.valueOf(this.f24174c));
    }
}
