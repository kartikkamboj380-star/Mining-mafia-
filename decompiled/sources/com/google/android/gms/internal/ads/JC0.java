package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class JC0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JC0 f19805b = new IC0().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19806a;

    public final boolean a() {
        return this.f19806a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof JC0) {
            return this.f19806a.equals(((JC0) obj).f19806a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19806a.hashCode();
    }

    public final String toString() {
        return this.f19806a.toString();
    }
}
