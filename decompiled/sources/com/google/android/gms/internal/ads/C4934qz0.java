package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4934qz0 extends AbstractC2482Ty0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32757c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4808pz0 f32758d;

    /* synthetic */ C4934qz0(int i10, int i11, int i12, C4808pz0 c4808pz0, byte[] bArr) {
        this.f32755a = i10;
        this.f32756b = i11;
        this.f32758d = c4808pz0;
    }

    public static C4682oz0 b() {
        return new C4682oz0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f32758d != C4808pz0.f32530d;
    }

    public final int c() {
        return this.f32755a;
    }

    public final int d() {
        return this.f32756b;
    }

    public final C4808pz0 e() {
        return this.f32758d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4934qz0)) {
            return false;
        }
        C4934qz0 c4934qz0 = (C4934qz0) obj;
        return c4934qz0.f32755a == this.f32755a && c4934qz0.f32756b == this.f32756b && c4934qz0.f32758d == this.f32758d;
    }

    public final int hashCode() {
        return Objects.hash(C4934qz0.class, Integer.valueOf(this.f32755a), Integer.valueOf(this.f32756b), 16, this.f32758d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f32758d);
        int length = strValueOf.length();
        int i10 = this.f32756b;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(16).length();
        int i11 = this.f32755a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i11).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i10);
        sb.append("-byte IV, ");
        sb.append(16);
        sb.append("-byte tag, and ");
        sb.append(i11);
        sb.append("-byte key)");
        return sb.toString();
    }
}
