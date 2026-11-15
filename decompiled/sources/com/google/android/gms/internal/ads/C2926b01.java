package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2926b01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26692b;

    public C2926b01(int i10, boolean z9) {
        this.f26691a = i10;
        this.f26692b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2926b01.class == obj.getClass()) {
            C2926b01 c2926b01 = (C2926b01) obj;
            if (this.f26691a == c2926b01.f26691a && this.f26692b == c2926b01.f26692b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26691a * 31) + (this.f26692b ? 1 : 0);
    }
}
