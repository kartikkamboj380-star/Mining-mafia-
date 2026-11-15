package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class T extends S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35969a;

    T(Object obj) {
        this.f35969a = obj;
    }

    @Override // com.google.android.gms.internal.auth.S
    public final Object a() {
        return this.f35969a;
    }

    @Override // com.google.android.gms.internal.auth.S
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            return this.f35969a.equals(((T) obj).f35969a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35969a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f35969a.toString() + ")";
    }
}
