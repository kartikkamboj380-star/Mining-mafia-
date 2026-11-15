package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2276Pz0 extends AbstractC2482Ty0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2224Oz0 f22264a;

    private C2276Pz0(C2224Oz0 c2224Oz0) {
        this.f22264a = c2224Oz0;
    }

    public static C2276Pz0 b(C2224Oz0 c2224Oz0) {
        return new C2276Pz0(c2224Oz0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f22264a != C2224Oz0.f21990d;
    }

    public final C2224Oz0 c() {
        return this.f22264a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2276Pz0) && ((C2276Pz0) obj).f22264a == this.f22264a;
    }

    public final int hashCode() {
        return Objects.hash(C2276Pz0.class, this.f22264a);
    }

    public final String toString() {
        String string = this.f22264a.toString();
        StringBuilder sb = new StringBuilder(string.length() + 39);
        sb.append("ChaCha20Poly1305 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
