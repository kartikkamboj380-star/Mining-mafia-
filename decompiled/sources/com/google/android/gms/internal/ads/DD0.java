package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class DD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f18110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f18111b;

    /* synthetic */ DD0(Class cls, Class cls2, byte[] bArr) {
        this.f18110a = cls;
        this.f18111b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DD0)) {
            return false;
        }
        DD0 dd0 = (DD0) obj;
        return dd0.f18110a.equals(this.f18110a) && dd0.f18111b.equals(this.f18111b);
    }

    public final int hashCode() {
        return Objects.hash(this.f18110a, this.f18111b);
    }

    public final String toString() {
        Class cls = this.f18111b;
        String simpleName = this.f18110a.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb = new StringBuilder(simpleName.length() + 26 + simpleName2.length());
        sb.append(simpleName);
        sb.append(" with serialization type: ");
        sb.append(simpleName2);
        return sb.toString();
    }
}
