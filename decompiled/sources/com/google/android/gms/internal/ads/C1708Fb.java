package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1708Fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KW0 f18796a;

    public C1708Fb(KW0 kw0) {
        this.f18796a = kw0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1708Fb) {
            return this.f18796a.equals(((C1708Fb) obj).f18796a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18796a.hashCode();
    }
}
