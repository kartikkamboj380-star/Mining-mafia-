package com.dooboolab.rniap;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.dooboolab.rniap.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1243a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13657b;

    public C1243a(String code, String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f13656a = code;
        this.f13657b = message;
    }

    public final String a() {
        return this.f13656a;
    }

    public final String b() {
        return this.f13657b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1243a)) {
            return false;
        }
        C1243a c1243a = (C1243a) obj;
        return Intrinsics.b(this.f13656a, c1243a.f13656a) && Intrinsics.b(this.f13657b, c1243a.f13657b);
    }

    public int hashCode() {
        return (this.f13656a.hashCode() * 31) + this.f13657b.hashCode();
    }

    public String toString() {
        return "BillingResponse(code=" + this.f13656a + ", message=" + this.f13657b + ")";
    }
}
