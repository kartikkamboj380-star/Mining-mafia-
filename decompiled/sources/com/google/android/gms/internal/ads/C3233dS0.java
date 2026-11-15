package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3233dS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27420c;

    /* synthetic */ C3233dS0(C3107cS0 c3107cS0, byte[] bArr) {
        this.f27418a = c3107cS0.e();
        this.f27419b = c3107cS0.f();
        this.f27420c = c3107cS0.g();
    }

    public final C3107cS0 a() {
        return new C3107cS0(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3233dS0)) {
            return false;
        }
        C3233dS0 c3233dS0 = (C3233dS0) obj;
        return this.f27418a == c3233dS0.f27418a && this.f27419b == c3233dS0.f27419b && this.f27420c == c3233dS0.f27420c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f27418a), Float.valueOf(this.f27419b), Long.valueOf(this.f27420c));
    }
}
