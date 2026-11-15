package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4344mI0 extends AbstractC5603wI0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f31477g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigInteger f31479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4218lI0 f31480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4092kI0 f31481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4092kI0 f31482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f31483f;

    /* synthetic */ C4344mI0(int i10, BigInteger bigInteger, C4218lI0 c4218lI0, C4092kI0 c4092kI0, C4092kI0 c4092kI1, int i11, byte[] bArr) {
        this.f31478a = i10;
        this.f31479b = bigInteger;
        this.f31480c = c4218lI0;
        this.f31481d = c4092kI0;
        this.f31482e = c4092kI1;
        this.f31483f = i11;
    }

    public static C3966jI0 b() {
        return new C3966jI0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f31480c != C4218lI0.f31241e;
    }

    public final int c() {
        return this.f31478a;
    }

    public final BigInteger d() {
        return this.f31479b;
    }

    public final C4218lI0 e() {
        return this.f31480c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4344mI0)) {
            return false;
        }
        C4344mI0 c4344mI0 = (C4344mI0) obj;
        return c4344mI0.f31478a == this.f31478a && Objects.equals(c4344mI0.f31479b, this.f31479b) && Objects.equals(c4344mI0.f31480c, this.f31480c) && Objects.equals(c4344mI0.f31481d, this.f31481d) && Objects.equals(c4344mI0.f31482e, this.f31482e) && c4344mI0.f31483f == this.f31483f;
    }

    public final C4092kI0 f() {
        return this.f31481d;
    }

    public final C4092kI0 g() {
        return this.f31482e;
    }

    public final int h() {
        return this.f31483f;
    }

    public final int hashCode() {
        return Objects.hash(C4344mI0.class, Integer.valueOf(this.f31478a), this.f31479b, this.f31480c, this.f31481d, this.f31482e, Integer.valueOf(this.f31483f));
    }

    public final String toString() {
        BigInteger bigInteger = this.f31479b;
        C4092kI0 c4092kI0 = this.f31482e;
        C4092kI0 c4092kI1 = this.f31481d;
        String strValueOf = String.valueOf(this.f31480c);
        String strValueOf2 = String.valueOf(c4092kI1);
        String strValueOf3 = String.valueOf(c4092kI0);
        String strValueOf4 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.f31483f;
        int length4 = String.valueOf(i10).length();
        int length5 = strValueOf4.length();
        int i11 = this.f31478a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i11).length() + 13);
        sb.append("RSA SSA PSS Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", signature hashType: ");
        sb.append(strValueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(strValueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i10);
        sb.append(", publicExponent: ");
        sb.append(strValueOf4);
        sb.append(", and ");
        sb.append(i11);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
