package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3802hz0 extends AbstractC2482Ty0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3676gz0 f29169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3550fz0 f29170f;

    /* synthetic */ C3802hz0(int i10, int i11, int i12, int i13, C3676gz0 c3676gz0, C3550fz0 c3550fz0, byte[] bArr) {
        this.f29165a = i10;
        this.f29166b = i11;
        this.f29167c = i12;
        this.f29168d = i13;
        this.f29169e = c3676gz0;
        this.f29170f = c3550fz0;
    }

    public static C3424ez0 b() {
        return new C3424ez0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f29169e != C3676gz0.f28773d;
    }

    public final int c() {
        return this.f29165a;
    }

    public final int d() {
        return this.f29166b;
    }

    public final int e() {
        return this.f29168d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3802hz0)) {
            return false;
        }
        C3802hz0 c3802hz0 = (C3802hz0) obj;
        return c3802hz0.f29165a == this.f29165a && c3802hz0.f29166b == this.f29166b && c3802hz0.f29167c == this.f29167c && c3802hz0.f29168d == this.f29168d && c3802hz0.f29169e == this.f29169e && c3802hz0.f29170f == this.f29170f;
    }

    public final int f() {
        return this.f29167c;
    }

    public final C3676gz0 g() {
        return this.f29169e;
    }

    public final C3550fz0 h() {
        return this.f29170f;
    }

    public final int hashCode() {
        return Objects.hash(C3802hz0.class, Integer.valueOf(this.f29165a), Integer.valueOf(this.f29166b), Integer.valueOf(this.f29167c), Integer.valueOf(this.f29168d), this.f29169e, this.f29170f);
    }

    public final String toString() {
        C3550fz0 c3550fz0 = this.f29170f;
        String strValueOf = String.valueOf(this.f29169e);
        String strValueOf2 = String.valueOf(c3550fz0);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.f29167c;
        int length3 = String.valueOf(i10).length();
        int i11 = this.f29168d;
        int length4 = String.valueOf(i11).length();
        int i12 = this.f29165a;
        int length5 = String.valueOf(i12).length();
        int i13 = this.f29166b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i13).length() + 15);
        sb.append("AesCtrHmacAead Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(i10);
        sb.append("-byte IV, and ");
        sb.append(i11);
        sb.append("-byte tags, and ");
        sb.append(i12);
        sb.append("-byte AES key, and ");
        sb.append(i13);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
