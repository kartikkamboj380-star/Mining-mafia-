package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class GL0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19032b;

    GL0(Object obj, int i10) {
        this.f19031a = obj;
        this.f19032b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GL0)) {
            return false;
        }
        GL0 gl0 = (GL0) obj;
        return this.f19031a == gl0.f19031a && this.f19032b == gl0.f19032b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f19031a) * 65535) + this.f19032b;
    }
}
