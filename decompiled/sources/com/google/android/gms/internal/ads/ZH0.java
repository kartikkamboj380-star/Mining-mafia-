package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ZH0 extends AbstractC5603wI0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f26142e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigInteger f26144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final YH0 f26145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final XH0 f26146d;

    /* synthetic */ ZH0(int i10, BigInteger bigInteger, YH0 yh0, XH0 xh0, byte[] bArr) {
        this.f26143a = i10;
        this.f26144b = bigInteger;
        this.f26145c = yh0;
        this.f26146d = xh0;
    }

    public static WH0 b() {
        return new WH0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f26145c != YH0.f25581e;
    }

    public final int c() {
        return this.f26143a;
    }

    public final BigInteger d() {
        return this.f26144b;
    }

    public final YH0 e() {
        return this.f26145c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ZH0)) {
            return false;
        }
        ZH0 zh0 = (ZH0) obj;
        return zh0.f26143a == this.f26143a && Objects.equals(zh0.f26144b, this.f26144b) && zh0.f26145c == this.f26145c && zh0.f26146d == this.f26146d;
    }

    public final XH0 f() {
        return this.f26146d;
    }

    public final int hashCode() {
        return Objects.hash(ZH0.class, Integer.valueOf(this.f26143a), this.f26144b, this.f26145c, this.f26146d);
    }

    public final String toString() {
        BigInteger bigInteger = this.f26144b;
        XH0 xh0 = this.f26146d;
        String strValueOf = String.valueOf(this.f26145c);
        String strValueOf2 = String.valueOf(xh0);
        String strValueOf3 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.f26143a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i10).length() + 13);
        sb.append("RSA SSA PKCS1 Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i10);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
