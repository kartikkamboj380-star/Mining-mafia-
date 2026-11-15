package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5572w3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f34458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f34459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E3[] f34460g;

    public C5572w3(String str, int i10, int i11, long j10, long j11, E3[] e3Arr) {
        super("CHAP");
        this.f34455b = str;
        this.f34456c = i10;
        this.f34457d = i11;
        this.f34458e = j10;
        this.f34459f = j11;
        this.f34460g = e3Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5572w3.class == obj.getClass()) {
            C5572w3 c5572w3 = (C5572w3) obj;
            if (this.f34456c == c5572w3.f34456c && this.f34457d == c5572w3.f34457d && this.f34458e == c5572w3.f34458e && this.f34459f == c5572w3.f34459f && Objects.equals(this.f34455b, c5572w3.f34455b) && Arrays.equals(this.f34460g, c5572w3.f34460g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f34456c + 527;
        String str = this.f34455b;
        long j10 = this.f34459f;
        return (((((((i10 * 31) + this.f34457d) * 31) + ((int) this.f34458e)) * 31) + ((int) j10)) * 31) + str.hashCode();
    }
}
