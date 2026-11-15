package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5053rw0 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C5053rw0 f33048c = new C5053rw0(new int[0], 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f33049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33050b;

    private C5053rw0(int[] iArr, int i10, int i11) {
        this.f33049a = iArr;
        this.f33050b = i11;
    }

    public static C5053rw0 a() {
        return f33048c;
    }

    public static C5053rw0 b(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new C5053rw0(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final int c() {
        return this.f33050b;
    }

    public final int d(int i10) {
        AbstractC2418Ss0.m(i10, this.f33050b, "index");
        return this.f33049a[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5053rw0)) {
            return false;
        }
        C5053rw0 c5053rw0 = (C5053rw0) obj;
        int i10 = this.f33050b;
        if (i10 != c5053rw0.f33050b) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (d(i11) != c5053rw0.d(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = 0; i10 < this.f33050b; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f33049a[i10]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.f33050b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i10 * 5);
        sb.append('[');
        int[] iArr = this.f33049a;
        sb.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb.append(", ");
            sb.append(iArr[i11]);
        }
        sb.append(']');
        return sb.toString();
    }
}
